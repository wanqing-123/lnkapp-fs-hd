package org.fbi.fshd.domain.tps.T1000Request;

import org.fbi.linking.codec.dataformat.annotation.DataField;
import org.fbi.linking.codec.dataformat.annotation.FixedLengthTextMessage;

@FixedLengthTextMessage(mainClass = true)
public class TpsTia1000 {
    @DataField(seq = 1, length = 1)
    private String fisCode;               //财政局编码 4
    @DataField(seq = 2, length = 1)
    private String txnHdlCode;            //交易处理码
    @DataField(seq = 3, length = 2)
    private String voucherType;           //票据类型
    @DataField(seq = 4, length = 6)
    private String fisBatchSn;            //批次号码信息
    @DataField(seq = 5, length = 12)
    private String billId;                //缴款通知书号
//    @DataField(seq = 6, length = 25)
//    private String fisActno;              //财政专户帐号
    @DataField(seq = 6, length = 1)
    private String outModeFlag;           //输出模式标识


    public String getFisCode() {
        return fisCode;
    }

    public void setFisCode(String fisCode) {
        this.fisCode = fisCode;
    }

    public String getTxnHdlCode() {
        return txnHdlCode;
    }

    public void setTxnHdlCode(String txnHdlCode) {
        this.txnHdlCode = txnHdlCode;
    }

    public String getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public String getFisBatchSn() {
        return fisBatchSn;
    }

    public void setFisBatchSn(String fisBatchSn) {
        this.fisBatchSn = fisBatchSn;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

/*    public String getFisActno() {
        return fisActno;
    }

    public void setFisActno(String fisActno) {
        this.fisActno = fisActno;
    }*/

    public String getOutModeFlag() {
        return outModeFlag;
    }

    public void setOutModeFlag(String outModeFlag) {
        this.outModeFlag = outModeFlag;
    }

    @Override
    public String toString() {
        return "TpsTia1000{" +
                "fisCode='" + fisCode + '\'' +
                ", txnHdlCode='" + txnHdlCode + '\'' +
                ", voucherType='" + voucherType + '\'' +
                ", fisBatchSn='" + fisBatchSn + '\'' +
                ", billId='" + billId + '\'' +
//                ", fisActno='" + fisActno + '\'' +
                ", outModeFlag='" + outModeFlag + '\'' +
                '}';
    }
}