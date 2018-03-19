package com.wode.stock.model;

/**
 * Created by piguanghua on 9/22/17.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsActivityHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsActivityHistoryExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andActivityPictureIsNull() {
            addCriterion("activity_picture is null");
            return (Criteria) this;
        }

        public Criteria andActivityPictureIsNotNull() {
            addCriterion("activity_picture is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPictureEqualTo(String value) {
            addCriterion("activity_picture =", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureNotEqualTo(String value) {
            addCriterion("activity_picture <>", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureGreaterThan(String value) {
            addCriterion("activity_picture >", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureGreaterThanOrEqualTo(String value) {
            addCriterion("activity_picture >=", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureLessThan(String value) {
            addCriterion("activity_picture <", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureLessThanOrEqualTo(String value) {
            addCriterion("activity_picture <=", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureLike(String value) {
            addCriterion("activity_picture like", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureNotLike(String value) {
            addCriterion("activity_picture not like", value, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureIn(List<String> values) {
            addCriterion("activity_picture in", values, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureNotIn(List<String> values) {
            addCriterion("activity_picture not in", values, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureBetween(String value1, String value2) {
            addCriterion("activity_picture between", value1, value2, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityPictureNotBetween(String value1, String value2) {
            addCriterion("activity_picture not between", value1, value2, "activityPicture");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNull() {
            addCriterion("activity_end_date is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNotNull() {
            addCriterion("activity_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateEqualTo(Date value) {
            addCriterion("activity_end_date =", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotEqualTo(Date value) {
            addCriterion("activity_end_date <>", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThan(Date value) {
            addCriterion("activity_end_date >", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end_date >=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThan(Date value) {
            addCriterion("activity_end_date <", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThanOrEqualTo(Date value) {
            addCriterion("activity_end_date <=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIn(List<Date> values) {
            addCriterion("activity_end_date in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotIn(List<Date> values) {
            addCriterion("activity_end_date not in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateBetween(Date value1, Date value2) {
            addCriterion("activity_end_date between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotBetween(Date value1, Date value2) {
            addCriterion("activity_end_date not between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIsNull() {
            addCriterion("activity_start_date is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIsNotNull() {
            addCriterion("activity_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateEqualTo(Date value) {
            addCriterion("activity_start_date =", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotEqualTo(Date value) {
            addCriterion("activity_start_date <>", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateGreaterThan(Date value) {
            addCriterion("activity_start_date >", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_date >=", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateLessThan(Date value) {
            addCriterion("activity_start_date <", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_date <=", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIn(List<Date> values) {
            addCriterion("activity_start_date in", values, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotIn(List<Date> values) {
            addCriterion("activity_start_date not in", values, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateBetween(Date value1, Date value2) {
            addCriterion("activity_start_date between", value1, value2, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_date not between", value1, value2, "activityStartDate");
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

        public Criteria andSysUpdateDateIsNull() {
            addCriterion("sys_update_date is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateIsNotNull() {
            addCriterion("sys_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateEqualTo(Date value) {
            addCriterion("sys_update_date =", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateNotEqualTo(Date value) {
            addCriterion("sys_update_date <>", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateGreaterThan(Date value) {
            addCriterion("sys_update_date >", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_update_date >=", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateLessThan(Date value) {
            addCriterion("sys_update_date <", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("sys_update_date <=", value, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateIn(List<Date> values) {
            addCriterion("sys_update_date in", values, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateNotIn(List<Date> values) {
            addCriterion("sys_update_date not in", values, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateBetween(Date value1, Date value2) {
            addCriterion("sys_update_date between", value1, value2, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andSysUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("sys_update_date not between", value1, value2, "sysUpdateDate");
            return (Criteria) this;
        }

        public Criteria andActivityUrlIsNull() {
            addCriterion("activity_url is null");
            return (Criteria) this;
        }

        public Criteria andActivityUrlIsNotNull() {
            addCriterion("activity_url is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUrlEqualTo(String value) {
            addCriterion("activity_url =", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlNotEqualTo(String value) {
            addCriterion("activity_url <>", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlGreaterThan(String value) {
            addCriterion("activity_url >", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("activity_url >=", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlLessThan(String value) {
            addCriterion("activity_url <", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlLessThanOrEqualTo(String value) {
            addCriterion("activity_url <=", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlLike(String value) {
            addCriterion("activity_url like", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlNotLike(String value) {
            addCriterion("activity_url not like", value, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlIn(List<String> values) {
            addCriterion("activity_url in", values, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlNotIn(List<String> values) {
            addCriterion("activity_url not in", values, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlBetween(String value1, String value2) {
            addCriterion("activity_url between", value1, value2, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andActivityUrlNotBetween(String value1, String value2) {
            addCriterion("activity_url not between", value1, value2, "activityUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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