package com.taotao.pojo.commonmodule;

import java.util.ArrayList;
import java.util.List;

public class SysPowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("POWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("POWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(String value) {
            addCriterion("POWER_ID =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(String value) {
            addCriterion("POWER_ID <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(String value) {
            addCriterion("POWER_ID >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_ID >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(String value) {
            addCriterion("POWER_ID <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(String value) {
            addCriterion("POWER_ID <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLike(String value) {
            addCriterion("POWER_ID like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotLike(String value) {
            addCriterion("POWER_ID not like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<String> values) {
            addCriterion("POWER_ID in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<String> values) {
            addCriterion("POWER_ID not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(String value1, String value2) {
            addCriterion("POWER_ID between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(String value1, String value2) {
            addCriterion("POWER_ID not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNull() {
            addCriterion("POWER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("POWER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("POWER_NAME =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("POWER_NAME <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("POWER_NAME >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_NAME >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("POWER_NAME <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("POWER_NAME <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("POWER_NAME like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("POWER_NAME not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("POWER_NAME in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("POWER_NAME not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("POWER_NAME between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("POWER_NAME not between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("IMGURL is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("IMGURL is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("IMGURL =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("IMGURL <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("IMGURL >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("IMGURL <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("IMGURL <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("IMGURL like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("IMGURL not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("IMGURL in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("IMGURL not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("IMGURL between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("IMGURL not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("MODULE_NAME =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("MODULE_NAME <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("MODULE_NAME >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("MODULE_NAME <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("MODULE_NAME like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("MODULE_NAME not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("MODULE_NAME in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("MODULE_NAME not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("MODULE_NAME between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("MODULE_NAME not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIsNull() {
            addCriterion("POWER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIsNotNull() {
            addCriterion("POWER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCodeEqualTo(String value) {
            addCriterion("POWER_CODE =", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotEqualTo(String value) {
            addCriterion("POWER_CODE <>", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeGreaterThan(String value) {
            addCriterion("POWER_CODE >", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_CODE >=", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLessThan(String value) {
            addCriterion("POWER_CODE <", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLessThanOrEqualTo(String value) {
            addCriterion("POWER_CODE <=", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLike(String value) {
            addCriterion("POWER_CODE like", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotLike(String value) {
            addCriterion("POWER_CODE not like", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIn(List<String> values) {
            addCriterion("POWER_CODE in", values, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotIn(List<String> values) {
            addCriterion("POWER_CODE not in", values, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeBetween(String value1, String value2) {
            addCriterion("POWER_CODE between", value1, value2, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotBetween(String value1, String value2) {
            addCriterion("POWER_CODE not between", value1, value2, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagIsNull() {
            addCriterion("POWER_TYPE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagIsNotNull() {
            addCriterion("POWER_TYPE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagEqualTo(String value) {
            addCriterion("POWER_TYPE_FLAG =", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagNotEqualTo(String value) {
            addCriterion("POWER_TYPE_FLAG <>", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagGreaterThan(String value) {
            addCriterion("POWER_TYPE_FLAG >", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_TYPE_FLAG >=", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagLessThan(String value) {
            addCriterion("POWER_TYPE_FLAG <", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagLessThanOrEqualTo(String value) {
            addCriterion("POWER_TYPE_FLAG <=", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagLike(String value) {
            addCriterion("POWER_TYPE_FLAG like", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagNotLike(String value) {
            addCriterion("POWER_TYPE_FLAG not like", value, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagIn(List<String> values) {
            addCriterion("POWER_TYPE_FLAG in", values, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagNotIn(List<String> values) {
            addCriterion("POWER_TYPE_FLAG not in", values, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagBetween(String value1, String value2) {
            addCriterion("POWER_TYPE_FLAG between", value1, value2, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPowerTypeFlagNotBetween(String value1, String value2) {
            addCriterion("POWER_TYPE_FLAG not between", value1, value2, "powerTypeFlag");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelIsNull() {
            addCriterion("passwordLevel is null");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelIsNotNull() {
            addCriterion("passwordLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelEqualTo(Integer value) {
            addCriterion("passwordLevel =", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelNotEqualTo(Integer value) {
            addCriterion("passwordLevel <>", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelGreaterThan(Integer value) {
            addCriterion("passwordLevel >", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("passwordLevel >=", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelLessThan(Integer value) {
            addCriterion("passwordLevel <", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelLessThanOrEqualTo(Integer value) {
            addCriterion("passwordLevel <=", value, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelIn(List<Integer> values) {
            addCriterion("passwordLevel in", values, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelNotIn(List<Integer> values) {
            addCriterion("passwordLevel not in", values, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelBetween(Integer value1, Integer value2) {
            addCriterion("passwordLevel between", value1, value2, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPasswordlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("passwordLevel not between", value1, value2, "passwordlevel");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdIsNull() {
            addCriterion("POWER_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdIsNotNull() {
            addCriterion("POWER_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdEqualTo(String value) {
            addCriterion("POWER_PARENT_ID =", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdNotEqualTo(String value) {
            addCriterion("POWER_PARENT_ID <>", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdGreaterThan(String value) {
            addCriterion("POWER_PARENT_ID >", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_PARENT_ID >=", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdLessThan(String value) {
            addCriterion("POWER_PARENT_ID <", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdLessThanOrEqualTo(String value) {
            addCriterion("POWER_PARENT_ID <=", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdLike(String value) {
            addCriterion("POWER_PARENT_ID like", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdNotLike(String value) {
            addCriterion("POWER_PARENT_ID not like", value, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdIn(List<String> values) {
            addCriterion("POWER_PARENT_ID in", values, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdNotIn(List<String> values) {
            addCriterion("POWER_PARENT_ID not in", values, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdBetween(String value1, String value2) {
            addCriterion("POWER_PARENT_ID between", value1, value2, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andPowerParentIdNotBetween(String value1, String value2) {
            addCriterion("POWER_PARENT_ID not between", value1, value2, "powerParentId");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNull() {
            addCriterion("is_parent is null");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNotNull() {
            addCriterion("is_parent is not null");
            return (Criteria) this;
        }

        public Criteria andIsParentEqualTo(Boolean value) {
            addCriterion("is_parent =", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotEqualTo(Boolean value) {
            addCriterion("is_parent <>", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThan(Boolean value) {
            addCriterion("is_parent >", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_parent >=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThan(Boolean value) {
            addCriterion("is_parent <", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_parent <=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentIn(List<Boolean> values) {
            addCriterion("is_parent in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotIn(List<Boolean> values) {
            addCriterion("is_parent not in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_parent between", value1, value2, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_parent not between", value1, value2, "isParent");
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