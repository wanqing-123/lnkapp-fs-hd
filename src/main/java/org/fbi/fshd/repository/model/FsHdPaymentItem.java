package org.fbi.fshd.repository.model;

import java.math.BigDecimal;

public class FsHdPaymentItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String pkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_CODE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String prjCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_NAME
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String prjName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.MEASURE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String measure;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.HANDLE_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String handleNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.TXN_AMT
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private BigDecimal txnAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.MAIN_PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String mainPkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.VCH_CLASS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String vchClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.VCH_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String vchNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIS.FS_HD_PAYMENT_ITEM.VCH_STS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    private String vchSts;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.PKID
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getPkid() {
        return pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.PKID
     *
     * @param pkid the value for FIS.FS_HD_PAYMENT_ITEM.PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setPkid(String pkid) {
        this.pkid = pkid == null ? null : pkid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_CODE
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.PRJ_CODE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getPrjCode() {
        return prjCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_CODE
     *
     * @param prjCode the value for FIS.FS_HD_PAYMENT_ITEM.PRJ_CODE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setPrjCode(String prjCode) {
        this.prjCode = prjCode == null ? null : prjCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_NAME
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.PRJ_NAME
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getPrjName() {
        return prjName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.PRJ_NAME
     *
     * @param prjName the value for FIS.FS_HD_PAYMENT_ITEM.PRJ_NAME
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setPrjName(String prjName) {
        this.prjName = prjName == null ? null : prjName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.MEASURE
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.MEASURE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.MEASURE
     *
     * @param measure the value for FIS.FS_HD_PAYMENT_ITEM.MEASURE
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.HANDLE_NUM
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.HANDLE_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getHandleNum() {
        return handleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.HANDLE_NUM
     *
     * @param handleNum the value for FIS.FS_HD_PAYMENT_ITEM.HANDLE_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setHandleNum(String handleNum) {
        this.handleNum = handleNum == null ? null : handleNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.TXN_AMT
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.TXN_AMT
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public BigDecimal getTxnAmt() {
        return txnAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.TXN_AMT
     *
     * @param txnAmt the value for FIS.FS_HD_PAYMENT_ITEM.TXN_AMT
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setTxnAmt(BigDecimal txnAmt) {
        this.txnAmt = txnAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.MAIN_PKID
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.MAIN_PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getMainPkid() {
        return mainPkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.MAIN_PKID
     *
     * @param mainPkid the value for FIS.FS_HD_PAYMENT_ITEM.MAIN_PKID
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setMainPkid(String mainPkid) {
        this.mainPkid = mainPkid == null ? null : mainPkid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_CLASS
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.VCH_CLASS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getVchClass() {
        return vchClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_CLASS
     *
     * @param vchClass the value for FIS.FS_HD_PAYMENT_ITEM.VCH_CLASS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setVchClass(String vchClass) {
        this.vchClass = vchClass == null ? null : vchClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_NUM
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.VCH_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getVchNum() {
        return vchNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_NUM
     *
     * @param vchNum the value for FIS.FS_HD_PAYMENT_ITEM.VCH_NUM
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setVchNum(String vchNum) {
        this.vchNum = vchNum == null ? null : vchNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_STS
     *
     * @return the value of FIS.FS_HD_PAYMENT_ITEM.VCH_STS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public String getVchSts() {
        return vchSts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIS.FS_HD_PAYMENT_ITEM.VCH_STS
     *
     * @param vchSts the value for FIS.FS_HD_PAYMENT_ITEM.VCH_STS
     *
     * @mbggenerated Wed Jan 22 09:39:38 CST 2014
     */
    public void setVchSts(String vchSts) {
        this.vchSts = vchSts == null ? null : vchSts.trim();
    }
}