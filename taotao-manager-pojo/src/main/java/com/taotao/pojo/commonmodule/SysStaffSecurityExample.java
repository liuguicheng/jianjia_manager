package com.taotao.pojo.commonmodule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysStaffSecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStaffSecurityExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("SSID is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("SSID is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(String value) {
            addCriterion("SSID =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(String value) {
            addCriterion("SSID <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(String value) {
            addCriterion("SSID >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(String value) {
            addCriterion("SSID >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(String value) {
            addCriterion("SSID <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(String value) {
            addCriterion("SSID <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLike(String value) {
            addCriterion("SSID like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotLike(String value) {
            addCriterion("SSID not like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<String> values) {
            addCriterion("SSID in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<String> values) {
            addCriterion("SSID not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(String value1, String value2) {
            addCriterion("SSID between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(String value1, String value2) {
            addCriterion("SSID not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("CHANGE_TIME =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("CHANGE_TIME <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("CHANGE_TIME >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGE_TIME >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("CHANGE_TIME <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHANGE_TIME <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("CHANGE_TIME in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("CHANGE_TIME not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("CHANGE_TIME between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHANGE_TIME not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andFailedTimesIsNull() {
            addCriterion("FAILED_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andFailedTimesIsNotNull() {
            addCriterion("FAILED_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andFailedTimesEqualTo(Integer value) {
            addCriterion("FAILED_TIMES =", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesNotEqualTo(Integer value) {
            addCriterion("FAILED_TIMES <>", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesGreaterThan(Integer value) {
            addCriterion("FAILED_TIMES >", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAILED_TIMES >=", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesLessThan(Integer value) {
            addCriterion("FAILED_TIMES <", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesLessThanOrEqualTo(Integer value) {
            addCriterion("FAILED_TIMES <=", value, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesIn(List<Integer> values) {
            addCriterion("FAILED_TIMES in", values, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesNotIn(List<Integer> values) {
            addCriterion("FAILED_TIMES not in", values, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_TIMES between", value1, value2, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andFailedTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_TIMES not between", value1, value2, "failedTimes");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("TIMES =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("TIMES <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("TIMES >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIMES >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("TIMES <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("TIMES <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("TIMES in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("TIMES not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("TIMES between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("TIMES not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeIsNull() {
            addCriterion("FAILED_RECORD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeIsNotNull() {
            addCriterion("FAILED_RECORD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeEqualTo(Date value) {
            addCriterion("FAILED_RECORD_TIME =", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeNotEqualTo(Date value) {
            addCriterion("FAILED_RECORD_TIME <>", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeGreaterThan(Date value) {
            addCriterion("FAILED_RECORD_TIME >", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FAILED_RECORD_TIME >=", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeLessThan(Date value) {
            addCriterion("FAILED_RECORD_TIME <", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("FAILED_RECORD_TIME <=", value, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeIn(List<Date> values) {
            addCriterion("FAILED_RECORD_TIME in", values, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeNotIn(List<Date> values) {
            addCriterion("FAILED_RECORD_TIME not in", values, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeBetween(Date value1, Date value2) {
            addCriterion("FAILED_RECORD_TIME between", value1, value2, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andFailedRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("FAILED_RECORD_TIME not between", value1, value2, "failedRecordTime");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("IS_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("IS_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(String value) {
            addCriterion("IS_LOCK =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(String value) {
            addCriterion("IS_LOCK <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(String value) {
            addCriterion("IS_LOCK >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOCK >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(String value) {
            addCriterion("IS_LOCK <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(String value) {
            addCriterion("IS_LOCK <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLike(String value) {
            addCriterion("IS_LOCK like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotLike(String value) {
            addCriterion("IS_LOCK not like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<String> values) {
            addCriterion("IS_LOCK in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<String> values) {
            addCriterion("IS_LOCK not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(String value1, String value2) {
            addCriterion("IS_LOCK between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(String value1, String value2) {
            addCriterion("IS_LOCK not between", value1, value2, "isLock");
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