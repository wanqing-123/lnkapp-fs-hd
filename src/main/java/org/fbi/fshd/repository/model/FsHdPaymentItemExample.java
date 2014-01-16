package org.fbi.fshd.repository.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FsHdPaymentItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public FsHdPaymentItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkidIsNull() {
            addCriterion("PKID is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("PKID is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(String value) {
            addCriterion("PKID =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(String value) {
            addCriterion("PKID <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(String value) {
            addCriterion("PKID >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(String value) {
            addCriterion("PKID >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(String value) {
            addCriterion("PKID <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(String value) {
            addCriterion("PKID <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLike(String value) {
            addCriterion("PKID like", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotLike(String value) {
            addCriterion("PKID not like", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<String> values) {
            addCriterion("PKID in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<String> values) {
            addCriterion("PKID not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(String value1, String value2) {
            addCriterion("PKID between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(String value1, String value2) {
            addCriterion("PKID not between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIsNull() {
            addCriterion("PRJ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIsNotNull() {
            addCriterion("PRJ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrjCodeEqualTo(String value) {
            addCriterion("PRJ_CODE =", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotEqualTo(String value) {
            addCriterion("PRJ_CODE <>", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeGreaterThan(String value) {
            addCriterion("PRJ_CODE >", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_CODE >=", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLessThan(String value) {
            addCriterion("PRJ_CODE <", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLessThanOrEqualTo(String value) {
            addCriterion("PRJ_CODE <=", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLike(String value) {
            addCriterion("PRJ_CODE like", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotLike(String value) {
            addCriterion("PRJ_CODE not like", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIn(List<String> values) {
            addCriterion("PRJ_CODE in", values, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotIn(List<String> values) {
            addCriterion("PRJ_CODE not in", values, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeBetween(String value1, String value2) {
            addCriterion("PRJ_CODE between", value1, value2, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotBetween(String value1, String value2) {
            addCriterion("PRJ_CODE not between", value1, value2, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjNameIsNull() {
            addCriterion("PRJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrjNameIsNotNull() {
            addCriterion("PRJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrjNameEqualTo(String value) {
            addCriterion("PRJ_NAME =", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotEqualTo(String value) {
            addCriterion("PRJ_NAME <>", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameGreaterThan(String value) {
            addCriterion("PRJ_NAME >", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_NAME >=", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLessThan(String value) {
            addCriterion("PRJ_NAME <", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLessThanOrEqualTo(String value) {
            addCriterion("PRJ_NAME <=", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLike(String value) {
            addCriterion("PRJ_NAME like", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotLike(String value) {
            addCriterion("PRJ_NAME not like", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameIn(List<String> values) {
            addCriterion("PRJ_NAME in", values, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotIn(List<String> values) {
            addCriterion("PRJ_NAME not in", values, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameBetween(String value1, String value2) {
            addCriterion("PRJ_NAME between", value1, value2, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotBetween(String value1, String value2) {
            addCriterion("PRJ_NAME not between", value1, value2, "prjName");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNull() {
            addCriterion("MEASURE is null");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNotNull() {
            addCriterion("MEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureEqualTo(String value) {
            addCriterion("MEASURE =", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotEqualTo(String value) {
            addCriterion("MEASURE <>", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThan(String value) {
            addCriterion("MEASURE >", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("MEASURE >=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThan(String value) {
            addCriterion("MEASURE <", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThanOrEqualTo(String value) {
            addCriterion("MEASURE <=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLike(String value) {
            addCriterion("MEASURE like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotLike(String value) {
            addCriterion("MEASURE not like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureIn(List<String> values) {
            addCriterion("MEASURE in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotIn(List<String> values) {
            addCriterion("MEASURE not in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureBetween(String value1, String value2) {
            addCriterion("MEASURE between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotBetween(String value1, String value2) {
            addCriterion("MEASURE not between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andHandleNumIsNull() {
            addCriterion("HANDLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andHandleNumIsNotNull() {
            addCriterion("HANDLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andHandleNumEqualTo(String value) {
            addCriterion("HANDLE_NUM =", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumNotEqualTo(String value) {
            addCriterion("HANDLE_NUM <>", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumGreaterThan(String value) {
            addCriterion("HANDLE_NUM >", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_NUM >=", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumLessThan(String value) {
            addCriterion("HANDLE_NUM <", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_NUM <=", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumLike(String value) {
            addCriterion("HANDLE_NUM like", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumNotLike(String value) {
            addCriterion("HANDLE_NUM not like", value, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumIn(List<String> values) {
            addCriterion("HANDLE_NUM in", values, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumNotIn(List<String> values) {
            addCriterion("HANDLE_NUM not in", values, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumBetween(String value1, String value2) {
            addCriterion("HANDLE_NUM between", value1, value2, "handleNum");
            return (Criteria) this;
        }

        public Criteria andHandleNumNotBetween(String value1, String value2) {
            addCriterion("HANDLE_NUM not between", value1, value2, "handleNum");
            return (Criteria) this;
        }

        public Criteria andTxnAmtIsNull() {
            addCriterion("TXN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTxnAmtIsNotNull() {
            addCriterion("TXN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTxnAmtEqualTo(BigDecimal value) {
            addCriterion("TXN_AMT =", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtNotEqualTo(BigDecimal value) {
            addCriterion("TXN_AMT <>", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtGreaterThan(BigDecimal value) {
            addCriterion("TXN_AMT >", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TXN_AMT >=", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtLessThan(BigDecimal value) {
            addCriterion("TXN_AMT <", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TXN_AMT <=", value, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtIn(List<BigDecimal> values) {
            addCriterion("TXN_AMT in", values, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtNotIn(List<BigDecimal> values) {
            addCriterion("TXN_AMT not in", values, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TXN_AMT between", value1, value2, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andTxnAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TXN_AMT not between", value1, value2, "txnAmt");
            return (Criteria) this;
        }

        public Criteria andMainPkidIsNull() {
            addCriterion("MAIN_PKID is null");
            return (Criteria) this;
        }

        public Criteria andMainPkidIsNotNull() {
            addCriterion("MAIN_PKID is not null");
            return (Criteria) this;
        }

        public Criteria andMainPkidEqualTo(String value) {
            addCriterion("MAIN_PKID =", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidNotEqualTo(String value) {
            addCriterion("MAIN_PKID <>", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidGreaterThan(String value) {
            addCriterion("MAIN_PKID >", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_PKID >=", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidLessThan(String value) {
            addCriterion("MAIN_PKID <", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidLessThanOrEqualTo(String value) {
            addCriterion("MAIN_PKID <=", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidLike(String value) {
            addCriterion("MAIN_PKID like", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidNotLike(String value) {
            addCriterion("MAIN_PKID not like", value, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidIn(List<String> values) {
            addCriterion("MAIN_PKID in", values, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidNotIn(List<String> values) {
            addCriterion("MAIN_PKID not in", values, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidBetween(String value1, String value2) {
            addCriterion("MAIN_PKID between", value1, value2, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andMainPkidNotBetween(String value1, String value2) {
            addCriterion("MAIN_PKID not between", value1, value2, "mainPkid");
            return (Criteria) this;
        }

        public Criteria andVchClassIsNull() {
            addCriterion("VCH_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andVchClassIsNotNull() {
            addCriterion("VCH_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andVchClassEqualTo(String value) {
            addCriterion("VCH_CLASS =", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassNotEqualTo(String value) {
            addCriterion("VCH_CLASS <>", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassGreaterThan(String value) {
            addCriterion("VCH_CLASS >", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassGreaterThanOrEqualTo(String value) {
            addCriterion("VCH_CLASS >=", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassLessThan(String value) {
            addCriterion("VCH_CLASS <", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassLessThanOrEqualTo(String value) {
            addCriterion("VCH_CLASS <=", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassLike(String value) {
            addCriterion("VCH_CLASS like", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassNotLike(String value) {
            addCriterion("VCH_CLASS not like", value, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassIn(List<String> values) {
            addCriterion("VCH_CLASS in", values, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassNotIn(List<String> values) {
            addCriterion("VCH_CLASS not in", values, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassBetween(String value1, String value2) {
            addCriterion("VCH_CLASS between", value1, value2, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchClassNotBetween(String value1, String value2) {
            addCriterion("VCH_CLASS not between", value1, value2, "vchClass");
            return (Criteria) this;
        }

        public Criteria andVchNumIsNull() {
            addCriterion("VCH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVchNumIsNotNull() {
            addCriterion("VCH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVchNumEqualTo(String value) {
            addCriterion("VCH_NUM =", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumNotEqualTo(String value) {
            addCriterion("VCH_NUM <>", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumGreaterThan(String value) {
            addCriterion("VCH_NUM >", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumGreaterThanOrEqualTo(String value) {
            addCriterion("VCH_NUM >=", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumLessThan(String value) {
            addCriterion("VCH_NUM <", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumLessThanOrEqualTo(String value) {
            addCriterion("VCH_NUM <=", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumLike(String value) {
            addCriterion("VCH_NUM like", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumNotLike(String value) {
            addCriterion("VCH_NUM not like", value, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumIn(List<String> values) {
            addCriterion("VCH_NUM in", values, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumNotIn(List<String> values) {
            addCriterion("VCH_NUM not in", values, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumBetween(String value1, String value2) {
            addCriterion("VCH_NUM between", value1, value2, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchNumNotBetween(String value1, String value2) {
            addCriterion("VCH_NUM not between", value1, value2, "vchNum");
            return (Criteria) this;
        }

        public Criteria andVchStsIsNull() {
            addCriterion("VCH_STS is null");
            return (Criteria) this;
        }

        public Criteria andVchStsIsNotNull() {
            addCriterion("VCH_STS is not null");
            return (Criteria) this;
        }

        public Criteria andVchStsEqualTo(String value) {
            addCriterion("VCH_STS =", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsNotEqualTo(String value) {
            addCriterion("VCH_STS <>", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsGreaterThan(String value) {
            addCriterion("VCH_STS >", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsGreaterThanOrEqualTo(String value) {
            addCriterion("VCH_STS >=", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsLessThan(String value) {
            addCriterion("VCH_STS <", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsLessThanOrEqualTo(String value) {
            addCriterion("VCH_STS <=", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsLike(String value) {
            addCriterion("VCH_STS like", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsNotLike(String value) {
            addCriterion("VCH_STS not like", value, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsIn(List<String> values) {
            addCriterion("VCH_STS in", values, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsNotIn(List<String> values) {
            addCriterion("VCH_STS not in", values, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsBetween(String value1, String value2) {
            addCriterion("VCH_STS between", value1, value2, "vchSts");
            return (Criteria) this;
        }

        public Criteria andVchStsNotBetween(String value1, String value2) {
            addCriterion("VCH_STS not between", value1, value2, "vchSts");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 16 16:58:30 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIS.FS_HD_PAYMENT_ITEM
     *
     * @mbggenerated Thu Jan 16 16:58:30 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}