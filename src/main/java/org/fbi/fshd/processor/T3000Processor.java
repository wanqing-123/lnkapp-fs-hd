package org.fbi.fshd.processor;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.fbi.fshd.domain.cbs.T3000Request.CbsTia3000;
import org.fbi.fshd.domain.cbs.T3000Response.CbsToa3000;
import org.fbi.fshd.domain.cbs.T3000Response.CbsToa3000Item;
import org.fbi.fshd.domain.tps.T3000Request.TpsTia3000;
import org.fbi.fshd.domain.tps.T3000Response.TpsToa3000;
import org.fbi.fshd.domain.tps.T3000Response.TpsToa3000Item;
import org.fbi.fshd.enums.BillStatus;
import org.fbi.fshd.enums.TxnRtnCode;
import org.fbi.fshd.helper.FbiBeanUtils;
import org.fbi.fshd.helper.MybatisFactory;
import org.fbi.fshd.helper.ProjectConfigManager;
import org.fbi.fshd.repository.dao.FsHdPaymentInfoMapper;
import org.fbi.fshd.repository.dao.FsHdPaymentItemMapper;
import org.fbi.fshd.repository.model.FsHdPaymentInfo;
import org.fbi.fshd.repository.model.FsHdPaymentInfoExample;
import org.fbi.fshd.repository.model.FsHdPaymentItem;
import org.fbi.fshd.repository.model.FsHdPaymentItemExample;
import org.fbi.linking.codec.dataformat.FixedLengthTextDataFormat;
import org.fbi.linking.codec.dataformat.SeperatedTextDataFormat;
import org.fbi.linking.processor.ProcessorException;
import org.fbi.linking.processor.standprotocol10.Stdp10ProcessorRequest;
import org.fbi.linking.processor.standprotocol10.Stdp10ProcessorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhanrui on 14-1-20.
 * ����֪ͨ�����ģʽ ��ѯ����
 */
public class T3000Processor extends AbstractTxnProcessor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void doRequest(Stdp10ProcessorRequest request, Stdp10ProcessorResponse response) throws ProcessorException, IOException {
        CbsTia3000 cbsTia;
        try {
            cbsTia = unmarshalCbsRequestMsg(request.getRequestBody());
        } catch (Exception e) {
            logger.error("��ɫҵ��ƽ̨�����Ľ�������.", e);
            marshalAbnormalCbsResponse(TxnRtnCode.CBSMSG_UNMARSHAL_FAILED, null, response);
            return;
        }

        //��鱾�����ݿ���Ϣ
        FsHdPaymentInfo paymentInfo_db = selectNotCanceledPaymentInfoFromDB(cbsTia.getBillId());
        if (paymentInfo_db != null) {
            String billStatus = paymentInfo_db.getLnkBillStatus();
            if (billStatus.equals(BillStatus.INIT.getCode())) { //δ�ɿ�������Ѵ�����Ϣ
                List<FsHdPaymentItem> paymentItems = selectPaymentItemsFromDB(paymentInfo_db);
                String cbsRespMsg = generateCbsRespMsgByLocalDbInfo(paymentInfo_db, paymentItems);
                response.setHeader("rtnCode", TxnRtnCode.TXN_EXECUTE_SECCESS.getCode());
                response.setResponseBody(cbsRespMsg.getBytes(response.getCharacterEncoding()));
                return;
            }

            if (billStatus.equals(BillStatus.PAYOFF.getCode())) { //�ѽɿ�
                marshalAbnormalCbsResponse(TxnRtnCode.TXN_PAY_REPEATED, null, response);
                logger.info("===�˱ʽɿ�ѽɿ�.");
                return;
            }
        }

        //������ͨѶ����
        TpsTia3000 tpsTia = new TpsTia3000();
        TpsToa3000 tpsToa;

        try {
            FbiBeanUtils.copyProperties(cbsTia, tpsTia);
            tpsTia.setFisCode(ProjectConfigManager.getInstance().getProperty("tps.fis.fiscode"));
            tpsTia.setTxnHdlCode("E");   //������ ���ݣ�E����ʾ������֤
            tpsTia.setFisActno(ProjectConfigManager.getInstance().getProperty("tps.fis.actno"));
            //tpsTia.setVoucherType("01");     //֪ͨ������
            //tpsTia.setFisBatchSn("000001");   //���κ�����Ϣ
            tpsTia.setOutModeFlag("O"); //���ģʽ��ʶ
            byte[] recvTpsBuf = processThirdPartyServer(marshalTpsRequestMsg(tpsTia), "3000");
            tpsToa = unmarshalTpsResponseMsg(recvTpsBuf);
        } catch (SocketTimeoutException e) {
            logger.error("�������������ͨѶ������ʱ.", e);
            marshalAbnormalCbsResponse(TxnRtnCode.MSG_RECV_TIMEOUT, "�������������ͨѶ������ʱ", response);
            return;
        } catch (Exception e) {
            logger.error("�������������ͨѶ�����쳣.", e);
            marshalAbnormalCbsResponse(TxnRtnCode.MSG_COMM_ERROR, "�������������ͨѶ�����쳣", response);
            return;
        }

        //��ɫƽ̨��Ӧ
        if ("0".equals(tpsToa.getRtnCode())) { //���׳ɹ�
            try {
                processTxn(tpsToa, request);
                String cbsRespMsg = marshalCbsResponseMsg(tpsToa);
                response.setHeader("rtnCode", TxnRtnCode.TXN_EXECUTE_SECCESS.getCode());
                response.setResponseBody(cbsRespMsg.getBytes(response.getCharacterEncoding()));
            } catch (Exception e) {
                marshalAbnormalCbsResponse(TxnRtnCode.TXN_EXECUTE_FAILED, e.getMessage(), response);
                logger.error("ҵ����ʧ��.", e);
            }
        } else {  //����TPS���ش�����
            String errmsg = getTpsRtnErrorMsg(tpsToa.getRtnCode());
            marshalAbnormalCbsResponse(TxnRtnCode.TXN_EXECUTE_FAILED, errmsg, response);
        }
    }

    //�������CBS������BEAN
    private CbsTia3000 unmarshalCbsRequestMsg(byte[] body) throws Exception {
        CbsTia3000 tia = new CbsTia3000();
        SeperatedTextDataFormat dataFormat = new SeperatedTextDataFormat(tia.getClass().getPackage().getName());
        tia = (CbsTia3000) dataFormat.fromMessage(new String(body, "GBK"), "CbsTia3000");
        return tia;
    }

    //���ݱ������ݿ��е��ѱ�����Ϣ����CBS��Ӧ����
    private String generateCbsRespMsgByLocalDbInfo(FsHdPaymentInfo paymentInfo, List<FsHdPaymentItem> paymentItems) {
        CbsToa3000 cbsToa = new CbsToa3000();
        FbiBeanUtils.copyProperties(paymentInfo, cbsToa);

        List<CbsToa3000Item> cbsToaItems = new ArrayList<>();
        for (FsHdPaymentItem paymentItem : paymentItems) {
            CbsToa3000Item cbsToaItem = new CbsToa3000Item();
            FbiBeanUtils.copyProperties(paymentItem, cbsToaItem);
            cbsToaItems.add(cbsToaItem);
        }
        cbsToa.setItems(cbsToaItems);
        cbsToa.setItemNum("" + cbsToaItems.size());

        String cbsRespMsg = "";
        Map<String, Object> modelObjectsMap = new HashMap<String, Object>();
        modelObjectsMap.put(cbsToa.getClass().getName(), cbsToa);
        SeperatedTextDataFormat cbsDataFormat = new SeperatedTextDataFormat(cbsToa.getClass().getPackage().getName());
        try {
            cbsRespMsg = (String) cbsDataFormat.toMessage(modelObjectsMap);
        } catch (Exception e) {
            throw new RuntimeException("��ɫƽ̨����ת��ʧ��.", e);
        }
        return cbsRespMsg;
    }


    //�������������������
    private byte[] marshalTpsRequestMsg(TpsTia3000 tpsTia) {
        Map<String, Object> modelObjectsMap = new HashMap<String, Object>();
        modelObjectsMap.put(tpsTia.getClass().getName(), tpsTia);
        FixedLengthTextDataFormat dataFormat = new FixedLengthTextDataFormat(tpsTia.getClass().getPackage().getName());
        byte[] buf;
        try {
            String sendMsg = (String) dataFormat.toMessage(modelObjectsMap);
            buf = generateTpsRequestHeader(sendMsg).getBytes(TPS_ENCODING);
        } catch (Exception e) {
            throw new RuntimeException("�����������Ĵ�������");
        }

        return buf;
    }

    //������ɵ�������Ӧ����BEAN
    private TpsToa3000 unmarshalTpsResponseMsg(byte[] response) throws Exception {
        TpsToa3000 toa = new TpsToa3000();
        FixedLengthTextDataFormat dataFormat = new FixedLengthTextDataFormat(toa.getClass().getPackage().getName());
        toa = (TpsToa3000) dataFormat.fromMessage(response, "TpsToa3000");

        return toa;
    }

    //���ݵ�������������Ӧ����������ɫƽ̨��Ӧ����
    private String marshalCbsResponseMsg(TpsToa3000 tpsToa) {
        CbsToa3000 cbsToa = new CbsToa3000();
        FbiBeanUtils.copyProperties(tpsToa, cbsToa);
        List<CbsToa3000Item> cbsToa3000Items = new ArrayList<>();
        for (TpsToa3000Item tpstoaItem : tpsToa.getItems()) {
            CbsToa3000Item cbsToaItem = new CbsToa3000Item();
            FbiBeanUtils.copyProperties(tpstoaItem, cbsToaItem);
            cbsToa3000Items.add(cbsToaItem);
        }
        cbsToa.setItems(cbsToa3000Items);

        String cbsRespMsg = "";
        Map<String, Object> modelObjectsMap = new HashMap<String, Object>();
        modelObjectsMap.put(cbsToa.getClass().getName(), cbsToa);
        SeperatedTextDataFormat cbsDataFormat = new SeperatedTextDataFormat(cbsToa.getClass().getPackage().getName());
        try {
            cbsRespMsg = (String) cbsDataFormat.toMessage(modelObjectsMap);
        } catch (Exception e) {
            throw new RuntimeException("��ɫƽ̨����ת��ʧ��.", e);
        }
        return cbsRespMsg;
    }

    //=======���ݿ⴦��=================================================
    //����δ�����Ľɿ��¼
    private FsHdPaymentInfo selectNotCanceledPaymentInfoFromDB(String billId) {
        SqlSessionFactory sqlSessionFactory = MybatisFactory.ORACLE.getInstance();
        FsHdPaymentInfoMapper mapper;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            mapper = session.getMapper(FsHdPaymentInfoMapper.class);
            FsHdPaymentInfoExample example = new FsHdPaymentInfoExample();
            example.createCriteria()
                    .andBillIdEqualTo(billId)
                    .andLnkBillStatusNotEqualTo(BillStatus.CANCELED.getCode());
            List<FsHdPaymentInfo> infos = mapper.selectByExample(example);
            if (infos.size() == 0) {
                return null;
            }
            if (infos.size() != 1) { //ͬһ���ɿ�ţ�δ�������ڱ���ֻ�ܴ���һ����¼
                throw new RuntimeException("��¼״̬����.");
            }
            return infos.get(0);
        }
    }

    private List<FsHdPaymentItem> selectPaymentItemsFromDB(FsHdPaymentInfo paymentInfo) {
        SqlSessionFactory sqlSessionFactory = MybatisFactory.ORACLE.getInstance();
        try (SqlSession session = sqlSessionFactory.openSession()) {
            FsHdPaymentItemExample example = new FsHdPaymentItemExample();
            example.createCriteria().andMainPkidEqualTo(paymentInfo.getPkid());
            FsHdPaymentItemMapper infoMapper = session.getMapper(FsHdPaymentItemMapper.class);
            return infoMapper.selectByExample(example);
        }
    }


    private void processTxn(TpsToa3000 tpsToa, Stdp10ProcessorRequest request) {
        FsHdPaymentInfo paymentInfo = new FsHdPaymentInfo();
        FbiBeanUtils.copyProperties(tpsToa, paymentInfo);

        SqlSessionFactory sqlSessionFactory = MybatisFactory.ORACLE.getInstance();
        SqlSession session = sqlSessionFactory.openSession();
        try {
            paymentInfo.setPkid(UUID.randomUUID().toString());
            paymentInfo.setOperInitBankid(request.getHeader("branchId"));
            paymentInfo.setOperInitTlrid(request.getHeader("tellerId"));
            paymentInfo.setOperInitDate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
            paymentInfo.setOperInitTime(new SimpleDateFormat("HHmmss").format(new Date()));
            paymentInfo.setOperInitHostsn(request.getHeader("serialNo"));

            paymentInfo.setArchiveFlag("0");

            paymentInfo.setHostBookFlag("0");
            paymentInfo.setHostChkFlag("0");
            paymentInfo.setFbBookFlag("0");
            paymentInfo.setFbChkFlag("0");

            paymentInfo.setAreaCode("HuangDao-FeiShui");
            paymentInfo.setHostAckFlag("0");
            paymentInfo.setLnkBillStatus("0"); //��ʼ��
            paymentInfo.setManualFlag("0"); //���ֹ�Ʊ

            FsHdPaymentInfoMapper infoMapper = session.getMapper(FsHdPaymentInfoMapper.class);
            infoMapper.insert(paymentInfo);

            FsHdPaymentItemMapper itemMapper = session.getMapper(FsHdPaymentItemMapper.class);
            int i = 0;
            for (TpsToa3000Item toaItem : tpsToa.getItems()) {
                i++;
                FsHdPaymentItem paymentItem = new FsHdPaymentItem();
                FbiBeanUtils.copyProperties(toaItem, paymentItem);
                paymentItem.setMainPkid(paymentInfo.getPkid());
                itemMapper.insert(paymentItem);
            }
            session.commit();
        } catch (Exception e) {
            session.rollback();
            throw new RuntimeException("ҵ���߼�����ʧ�ܡ�", e);
        } finally {
            session.close();
        }
    }
}