package com.wode.stock.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FavorStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavorStockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("stock_type is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(Integer value) {
            addCriterion("stock_type =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(Integer value) {
            addCriterion("stock_type <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(Integer value) {
            addCriterion("stock_type >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_type >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(Integer value) {
            addCriterion("stock_type <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(Integer value) {
            addCriterion("stock_type <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<Integer> values) {
            addCriterion("stock_type in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<Integer> values) {
            addCriterion("stock_type not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(Integer value1, Integer value2) {
            addCriterion("stock_type between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_type not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeIsNull() {
            addCriterion("favor_type is null");
            return (Criteria) this;
        }

        public Criteria andFavorTypeIsNotNull() {
            addCriterion("favor_type is not null");
            return (Criteria) this;
        }

        public Criteria andFavorTypeEqualTo(Integer value) {
            addCriterion("favor_type =", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeNotEqualTo(Integer value) {
            addCriterion("favor_type <>", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeGreaterThan(Integer value) {
            addCriterion("favor_type >", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("favor_type >=", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeLessThan(Integer value) {
            addCriterion("favor_type <", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("favor_type <=", value, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeIn(List<Integer> values) {
            addCriterion("favor_type in", values, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeNotIn(List<Integer> values) {
            addCriterion("favor_type not in", values, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeBetween(Integer value1, Integer value2) {
            addCriterion("favor_type between", value1, value2, "favorType");
            return (Criteria) this;
        }

        public Criteria andFavorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("favor_type not between", value1, value2, "favorType");
            return (Criteria) this;
        }

        public Criteria andWdEnableIsNull() {
            addCriterion("wd_enable is null");
            return (Criteria) this;
        }

        public Criteria andWdEnableIsNotNull() {
            addCriterion("wd_enable is not null");
            return (Criteria) this;
        }

        public Criteria andWdEnableEqualTo(Integer value) {
            addCriterion("wd_enable =", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotEqualTo(Integer value) {
            addCriterion("wd_enable <>", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableGreaterThan(Integer value) {
            addCriterion("wd_enable >", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_enable >=", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableLessThan(Integer value) {
            addCriterion("wd_enable <", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableLessThanOrEqualTo(Integer value) {
            addCriterion("wd_enable <=", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableIn(List<Integer> values) {
            addCriterion("wd_enable in", values, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotIn(List<Integer> values) {
            addCriterion("wd_enable not in", values, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableBetween(Integer value1, Integer value2) {
            addCriterion("wd_enable between", value1, value2, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_enable not between", value1, value2, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andPriceUpIsNull() {
            addCriterion("price_up is null");
            return (Criteria) this;
        }

        public Criteria andPriceUpIsNotNull() {
            addCriterion("price_up is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUpEqualTo(Float value) {
            addCriterion("price_up =", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpNotEqualTo(Float value) {
            addCriterion("price_up <>", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpGreaterThan(Float value) {
            addCriterion("price_up >", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpGreaterThanOrEqualTo(Float value) {
            addCriterion("price_up >=", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpLessThan(Float value) {
            addCriterion("price_up <", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpLessThanOrEqualTo(Float value) {
            addCriterion("price_up <=", value, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpIn(List<Float> values) {
            addCriterion("price_up in", values, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpNotIn(List<Float> values) {
            addCriterion("price_up not in", values, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpBetween(Float value1, Float value2) {
            addCriterion("price_up between", value1, value2, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceUpNotBetween(Float value1, Float value2) {
            addCriterion("price_up not between", value1, value2, "priceUp");
            return (Criteria) this;
        }

        public Criteria andPriceDownIsNull() {
            addCriterion("price_down is null");
            return (Criteria) this;
        }

        public Criteria andPriceDownIsNotNull() {
            addCriterion("price_down is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDownEqualTo(Float value) {
            addCriterion("price_down =", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownNotEqualTo(Float value) {
            addCriterion("price_down <>", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownGreaterThan(Float value) {
            addCriterion("price_down >", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownGreaterThanOrEqualTo(Float value) {
            addCriterion("price_down >=", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownLessThan(Float value) {
            addCriterion("price_down <", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownLessThanOrEqualTo(Float value) {
            addCriterion("price_down <=", value, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownIn(List<Float> values) {
            addCriterion("price_down in", values, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownNotIn(List<Float> values) {
            addCriterion("price_down not in", values, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownBetween(Float value1, Float value2) {
            addCriterion("price_down between", value1, value2, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPriceDownNotBetween(Float value1, Float value2) {
            addCriterion("price_down not between", value1, value2, "priceDown");
            return (Criteria) this;
        }

        public Criteria andPricePercentIsNull() {
            addCriterion("price_percent is null");
            return (Criteria) this;
        }

        public Criteria andPricePercentIsNotNull() {
            addCriterion("price_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPricePercentEqualTo(Float value) {
            addCriterion("price_percent =", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentNotEqualTo(Float value) {
            addCriterion("price_percent <>", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentGreaterThan(Float value) {
            addCriterion("price_percent >", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentGreaterThanOrEqualTo(Float value) {
            addCriterion("price_percent >=", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentLessThan(Float value) {
            addCriterion("price_percent <", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentLessThanOrEqualTo(Float value) {
            addCriterion("price_percent <=", value, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentIn(List<Float> values) {
            addCriterion("price_percent in", values, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentNotIn(List<Float> values) {
            addCriterion("price_percent not in", values, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentBetween(Float value1, Float value2) {
            addCriterion("price_percent between", value1, value2, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andPricePercentNotBetween(Float value1, Float value2) {
            addCriterion("price_percent not between", value1, value2, "pricePercent");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateIsNull() {
            addCriterion("sys_create_date is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateIsNotNull() {
            addCriterion("sys_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateEqualTo(Date value) {
            addCriterion("sys_create_date =", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateNotEqualTo(Date value) {
            addCriterion("sys_create_date <>", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateGreaterThan(Date value) {
            addCriterion("sys_create_date >", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_create_date >=", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateLessThan(Date value) {
            addCriterion("sys_create_date <", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("sys_create_date <=", value, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateIn(List<Date> values) {
            addCriterion("sys_create_date in", values, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateNotIn(List<Date> values) {
            addCriterion("sys_create_date not in", values, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateBetween(Date value1, Date value2) {
            addCriterion("sys_create_date between", value1, value2, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("sys_create_date not between", value1, value2, "sysCreateDate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateIsNull() {
            addCriterion("sys_last_update is null");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateIsNotNull() {
            addCriterion("sys_last_update is not null");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateEqualTo(Date value) {
            addCriterion("sys_last_update =", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateNotEqualTo(Date value) {
            addCriterion("sys_last_update <>", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateGreaterThan(Date value) {
            addCriterion("sys_last_update >", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_last_update >=", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateLessThan(Date value) {
            addCriterion("sys_last_update <", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("sys_last_update <=", value, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateIn(List<Date> values) {
            addCriterion("sys_last_update in", values, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateNotIn(List<Date> values) {
            addCriterion("sys_last_update not in", values, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateBetween(Date value1, Date value2) {
            addCriterion("sys_last_update between", value1, value2, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andSysLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("sys_last_update not between", value1, value2, "sysLastUpdate");
            return (Criteria) this;
        }

        public Criteria andAbnormalIsNull() {
            addCriterion("abnormal is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalIsNotNull() {
            addCriterion("abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalEqualTo(Boolean value) {
            addCriterion("abnormal =", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotEqualTo(Boolean value) {
            addCriterion("abnormal <>", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalGreaterThan(Boolean value) {
            addCriterion("abnormal >", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("abnormal >=", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalLessThan(Boolean value) {
            addCriterion("abnormal <", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalLessThanOrEqualTo(Boolean value) {
            addCriterion("abnormal <=", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalIn(List<Boolean> values) {
            addCriterion("abnormal in", values, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotIn(List<Boolean> values) {
            addCriterion("abnormal not in", values, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalBetween(Boolean value1, Boolean value2) {
            addCriterion("abnormal between", value1, value2, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("abnormal not between", value1, value2, "abnormal");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIsNull() {
            addCriterion("daily_limit is null");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIsNotNull() {
            addCriterion("daily_limit is not null");
            return (Criteria) this;
        }

        public Criteria andDailyLimitEqualTo(Boolean value) {
            addCriterion("daily_limit =", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotEqualTo(Boolean value) {
            addCriterion("daily_limit <>", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitGreaterThan(Boolean value) {
            addCriterion("daily_limit >", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("daily_limit >=", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitLessThan(Boolean value) {
            addCriterion("daily_limit <", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitLessThanOrEqualTo(Boolean value) {
            addCriterion("daily_limit <=", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIn(List<Boolean> values) {
            addCriterion("daily_limit in", values, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotIn(List<Boolean> values) {
            addCriterion("daily_limit not in", values, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitBetween(Boolean value1, Boolean value2) {
            addCriterion("daily_limit between", value1, value2, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("daily_limit not between", value1, value2, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andPercentDownIsNull() {
            addCriterion("percent_down is null");
            return (Criteria) this;
        }

        public Criteria andPercentDownIsNotNull() {
            addCriterion("percent_down is not null");
            return (Criteria) this;
        }

        public Criteria andPercentDownEqualTo(Float value) {
            addCriterion("percent_down =", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownNotEqualTo(Float value) {
            addCriterion("percent_down <>", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownGreaterThan(Float value) {
            addCriterion("percent_down >", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownGreaterThanOrEqualTo(Float value) {
            addCriterion("percent_down >=", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownLessThan(Float value) {
            addCriterion("percent_down <", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownLessThanOrEqualTo(Float value) {
            addCriterion("percent_down <=", value, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownIn(List<Float> values) {
            addCriterion("percent_down in", values, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownNotIn(List<Float> values) {
            addCriterion("percent_down not in", values, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownBetween(Float value1, Float value2) {
            addCriterion("percent_down between", value1, value2, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentDownNotBetween(Float value1, Float value2) {
            addCriterion("percent_down not between", value1, value2, "percentDown");
            return (Criteria) this;
        }

        public Criteria andPercentUpIsNull() {
            addCriterion("percent_up is null");
            return (Criteria) this;
        }

        public Criteria andPercentUpIsNotNull() {
            addCriterion("percent_up is not null");
            return (Criteria) this;
        }

        public Criteria andPercentUpEqualTo(Float value) {
            addCriterion("percent_up =", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpNotEqualTo(Float value) {
            addCriterion("percent_up <>", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpGreaterThan(Float value) {
            addCriterion("percent_up >", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpGreaterThanOrEqualTo(Float value) {
            addCriterion("percent_up >=", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpLessThan(Float value) {
            addCriterion("percent_up <", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpLessThanOrEqualTo(Float value) {
            addCriterion("percent_up <=", value, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpIn(List<Float> values) {
            addCriterion("percent_up in", values, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpNotIn(List<Float> values) {
            addCriterion("percent_up not in", values, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpBetween(Float value1, Float value2) {
            addCriterion("percent_up between", value1, value2, "percentUp");
            return (Criteria) this;
        }

        public Criteria andPercentUpNotBetween(Float value1, Float value2) {
            addCriterion("percent_up not between", value1, value2, "percentUp");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andFrancoIsNull() {
            addCriterion("franco is null");
            return (Criteria) this;
        }

        public Criteria andFrancoIsNotNull() {
            addCriterion("franco is not null");
            return (Criteria) this;
        }

        public Criteria andFrancoEqualTo(Boolean value) {
            addCriterion("franco =", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoNotEqualTo(Boolean value) {
            addCriterion("franco <>", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoGreaterThan(Boolean value) {
            addCriterion("franco >", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("franco >=", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoLessThan(Boolean value) {
            addCriterion("franco <", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoLessThanOrEqualTo(Boolean value) {
            addCriterion("franco <=", value, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoIn(List<Boolean> values) {
            addCriterion("franco in", values, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoNotIn(List<Boolean> values) {
            addCriterion("franco not in", values, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoBetween(Boolean value1, Boolean value2) {
            addCriterion("franco between", value1, value2, "franco");
            return (Criteria) this;
        }

        public Criteria andFrancoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("franco not between", value1, value2, "franco");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisIsNull() {
            addCriterion("stock_code_redis is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisIsNotNull() {
            addCriterion("stock_code_redis is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisEqualTo(String value) {
            addCriterion("stock_code_redis =", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisNotEqualTo(String value) {
            addCriterion("stock_code_redis <>", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisGreaterThan(String value) {
            addCriterion("stock_code_redis >", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code_redis >=", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisLessThan(String value) {
            addCriterion("stock_code_redis <", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisLessThanOrEqualTo(String value) {
            addCriterion("stock_code_redis <=", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisLike(String value) {
            addCriterion("stock_code_redis like", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisNotLike(String value) {
            addCriterion("stock_code_redis not like", value, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisIn(List<String> values) {
            addCriterion("stock_code_redis in", values, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisNotIn(List<String> values) {
            addCriterion("stock_code_redis not in", values, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisBetween(String value1, String value2) {
            addCriterion("stock_code_redis between", value1, value2, "stockCodeRedis");
            return (Criteria) this;
        }

        public Criteria andStockCodeRedisNotBetween(String value1, String value2) {
            addCriterion("stock_code_redis not between", value1, value2, "stockCodeRedis");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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