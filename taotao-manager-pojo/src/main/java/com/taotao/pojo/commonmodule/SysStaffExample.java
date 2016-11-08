package com.taotao.pojo.commonmodule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStaffExample() {
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

        public Criteria andStaffNameIsNull() {
            addCriterion("STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("STAFF_NAME =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("STAFF_NAME <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("STAFF_NAME >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("STAFF_NAME <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("STAFF_NAME like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("STAFF_NAME not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("STAFF_NAME in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("STAFF_NAME not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("STAFF_NAME between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("STAFF_NAME not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("DEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("DEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(String value) {
            addCriterion("DEP_ID =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(String value) {
            addCriterion("DEP_ID <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(String value) {
            addCriterion("DEP_ID >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_ID >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(String value) {
            addCriterion("DEP_ID <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(String value) {
            addCriterion("DEP_ID <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLike(String value) {
            addCriterion("DEP_ID like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotLike(String value) {
            addCriterion("DEP_ID not like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<String> values) {
            addCriterion("DEP_ID in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<String> values) {
            addCriterion("DEP_ID not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(String value1, String value2) {
            addCriterion("DEP_ID between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(String value1, String value2) {
            addCriterion("DEP_ID not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("VALID like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("VALID not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andSysTemplateIsNull() {
            addCriterion("SYS_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andSysTemplateIsNotNull() {
            addCriterion("SYS_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTemplateEqualTo(String value) {
            addCriterion("SYS_TEMPLATE =", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateNotEqualTo(String value) {
            addCriterion("SYS_TEMPLATE <>", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateGreaterThan(String value) {
            addCriterion("SYS_TEMPLATE >", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_TEMPLATE >=", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateLessThan(String value) {
            addCriterion("SYS_TEMPLATE <", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateLessThanOrEqualTo(String value) {
            addCriterion("SYS_TEMPLATE <=", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateLike(String value) {
            addCriterion("SYS_TEMPLATE like", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateNotLike(String value) {
            addCriterion("SYS_TEMPLATE not like", value, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateIn(List<String> values) {
            addCriterion("SYS_TEMPLATE in", values, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateNotIn(List<String> values) {
            addCriterion("SYS_TEMPLATE not in", values, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateBetween(String value1, String value2) {
            addCriterion("SYS_TEMPLATE between", value1, value2, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andSysTemplateNotBetween(String value1, String value2) {
            addCriterion("SYS_TEMPLATE not between", value1, value2, "sysTemplate");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("IN_DATE =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("IN_DATE <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("IN_DATE >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IN_DATE >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("IN_DATE <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("IN_DATE <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("IN_DATE in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("IN_DATE not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("IN_DATE between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("IN_DATE not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNull() {
            addCriterion("EXIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNotNull() {
            addCriterion("EXIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExitDateEqualTo(Date value) {
            addCriterion("EXIT_DATE =", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotEqualTo(Date value) {
            addCriterion("EXIT_DATE <>", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThan(Date value) {
            addCriterion("EXIT_DATE >", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXIT_DATE >=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThan(Date value) {
            addCriterion("EXIT_DATE <", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThanOrEqualTo(Date value) {
            addCriterion("EXIT_DATE <=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateIn(List<Date> values) {
            addCriterion("EXIT_DATE in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotIn(List<Date> values) {
            addCriterion("EXIT_DATE not in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateBetween(Date value1, Date value2) {
            addCriterion("EXIT_DATE between", value1, value2, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotBetween(Date value1, Date value2) {
            addCriterion("EXIT_DATE not between", value1, value2, "exitDate");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNull() {
            addCriterion("ID_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNotNull() {
            addCriterion("ID_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumEqualTo(String value) {
            addCriterion("ID_NUM =", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotEqualTo(String value) {
            addCriterion("ID_NUM <>", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThan(String value) {
            addCriterion("ID_NUM >", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUM >=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThan(String value) {
            addCriterion("ID_NUM <", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThanOrEqualTo(String value) {
            addCriterion("ID_NUM <=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLike(String value) {
            addCriterion("ID_NUM like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotLike(String value) {
            addCriterion("ID_NUM not like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIn(List<String> values) {
            addCriterion("ID_NUM in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotIn(List<String> values) {
            addCriterion("ID_NUM not in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumBetween(String value1, String value2) {
            addCriterion("ID_NUM between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotBetween(String value1, String value2) {
            addCriterion("ID_NUM not between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("ROOM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("ROOM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(String value) {
            addCriterion("ROOM_NUM =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(String value) {
            addCriterion("ROOM_NUM <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(String value) {
            addCriterion("ROOM_NUM >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NUM >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(String value) {
            addCriterion("ROOM_NUM <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NUM <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLike(String value) {
            addCriterion("ROOM_NUM like", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotLike(String value) {
            addCriterion("ROOM_NUM not like", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<String> values) {
            addCriterion("ROOM_NUM in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<String> values) {
            addCriterion("ROOM_NUM not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(String value1, String value2) {
            addCriterion("ROOM_NUM between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(String value1, String value2) {
            addCriterion("ROOM_NUM not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNull() {
            addCriterion("STAFF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNotNull() {
            addCriterion("STAFF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeEqualTo(String value) {
            addCriterion("STAFF_TYPE =", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotEqualTo(String value) {
            addCriterion("STAFF_TYPE <>", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThan(String value) {
            addCriterion("STAFF_TYPE >", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_TYPE >=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThan(String value) {
            addCriterion("STAFF_TYPE <", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThanOrEqualTo(String value) {
            addCriterion("STAFF_TYPE <=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLike(String value) {
            addCriterion("STAFF_TYPE like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotLike(String value) {
            addCriterion("STAFF_TYPE not like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIn(List<String> values) {
            addCriterion("STAFF_TYPE in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotIn(List<String> values) {
            addCriterion("STAFF_TYPE not in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeBetween(String value1, String value2) {
            addCriterion("STAFF_TYPE between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotBetween(String value1, String value2) {
            addCriterion("STAFF_TYPE not between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNull() {
            addCriterion("IS_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNotNull() {
            addCriterion("IS_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginEqualTo(String value) {
            addCriterion("IS_LOGIN =", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotEqualTo(String value) {
            addCriterion("IS_LOGIN <>", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThan(String value) {
            addCriterion("IS_LOGIN >", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN >=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThan(String value) {
            addCriterion("IS_LOGIN <", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN <=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLike(String value) {
            addCriterion("IS_LOGIN like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotLike(String value) {
            addCriterion("IS_LOGIN not like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginIn(List<String> values) {
            addCriterion("IS_LOGIN in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotIn(List<String> values) {
            addCriterion("IS_LOGIN not in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginBetween(String value1, String value2) {
            addCriterion("IS_LOGIN between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotBetween(String value1, String value2) {
            addCriterion("IS_LOGIN not between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("POLITICS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("POLITICS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(String value) {
            addCriterion("POLITICS =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(String value) {
            addCriterion("POLITICS <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(String value) {
            addCriterion("POLITICS >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICS >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(String value) {
            addCriterion("POLITICS <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(String value) {
            addCriterion("POLITICS <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLike(String value) {
            addCriterion("POLITICS like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotLike(String value) {
            addCriterion("POLITICS not like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<String> values) {
            addCriterion("POLITICS in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<String> values) {
            addCriterion("POLITICS not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(String value1, String value2) {
            addCriterion("POLITICS between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(String value1, String value2) {
            addCriterion("POLITICS not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelIsNull() {
            addCriterion("TREATMENT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelIsNotNull() {
            addCriterion("TREATMENT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelEqualTo(String value) {
            addCriterion("TREATMENT_LEVEL =", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelNotEqualTo(String value) {
            addCriterion("TREATMENT_LEVEL <>", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelGreaterThan(String value) {
            addCriterion("TREATMENT_LEVEL >", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_LEVEL >=", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelLessThan(String value) {
            addCriterion("TREATMENT_LEVEL <", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_LEVEL <=", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelLike(String value) {
            addCriterion("TREATMENT_LEVEL like", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelNotLike(String value) {
            addCriterion("TREATMENT_LEVEL not like", value, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelIn(List<String> values) {
            addCriterion("TREATMENT_LEVEL in", values, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelNotIn(List<String> values) {
            addCriterion("TREATMENT_LEVEL not in", values, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelBetween(String value1, String value2) {
            addCriterion("TREATMENT_LEVEL between", value1, value2, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentLevelNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_LEVEL not between", value1, value2, "treatmentLevel");
            return (Criteria) this;
        }

        public Criteria andPartyDateIsNull() {
            addCriterion("PARTY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPartyDateIsNotNull() {
            addCriterion("PARTY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPartyDateEqualTo(Date value) {
            addCriterion("PARTY_DATE =", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateNotEqualTo(Date value) {
            addCriterion("PARTY_DATE <>", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateGreaterThan(Date value) {
            addCriterion("PARTY_DATE >", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PARTY_DATE >=", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateLessThan(Date value) {
            addCriterion("PARTY_DATE <", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateLessThanOrEqualTo(Date value) {
            addCriterion("PARTY_DATE <=", value, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateIn(List<Date> values) {
            addCriterion("PARTY_DATE in", values, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateNotIn(List<Date> values) {
            addCriterion("PARTY_DATE not in", values, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateBetween(Date value1, Date value2) {
            addCriterion("PARTY_DATE between", value1, value2, "partyDate");
            return (Criteria) this;
        }

        public Criteria andPartyDateNotBetween(Date value1, Date value2) {
            addCriterion("PARTY_DATE not between", value1, value2, "partyDate");
            return (Criteria) this;
        }

        public Criteria andEditDateIsNull() {
            addCriterion("EDIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEditDateIsNotNull() {
            addCriterion("EDIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEditDateEqualTo(Date value) {
            addCriterion("EDIT_DATE =", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotEqualTo(Date value) {
            addCriterion("EDIT_DATE <>", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThan(Date value) {
            addCriterion("EDIT_DATE >", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EDIT_DATE >=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThan(Date value) {
            addCriterion("EDIT_DATE <", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThanOrEqualTo(Date value) {
            addCriterion("EDIT_DATE <=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateIn(List<Date> values) {
            addCriterion("EDIT_DATE in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotIn(List<Date> values) {
            addCriterion("EDIT_DATE not in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateBetween(Date value1, Date value2) {
            addCriterion("EDIT_DATE between", value1, value2, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotBetween(Date value1, Date value2) {
            addCriterion("EDIT_DATE not between", value1, value2, "editDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("REGISTER_DATE =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("REGISTER_DATE <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("REGISTER_DATE >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("REGISTER_DATE <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("REGISTER_DATE in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("REGISTER_DATE not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andTryDateIsNull() {
            addCriterion("TRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTryDateIsNotNull() {
            addCriterion("TRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTryDateEqualTo(String value) {
            addCriterion("TRY_DATE =", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotEqualTo(String value) {
            addCriterion("TRY_DATE <>", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateGreaterThan(String value) {
            addCriterion("TRY_DATE >", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRY_DATE >=", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateLessThan(String value) {
            addCriterion("TRY_DATE <", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateLessThanOrEqualTo(String value) {
            addCriterion("TRY_DATE <=", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateLike(String value) {
            addCriterion("TRY_DATE like", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotLike(String value) {
            addCriterion("TRY_DATE not like", value, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateIn(List<String> values) {
            addCriterion("TRY_DATE in", values, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotIn(List<String> values) {
            addCriterion("TRY_DATE not in", values, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateBetween(String value1, String value2) {
            addCriterion("TRY_DATE between", value1, value2, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTryDateNotBetween(String value1, String value2) {
            addCriterion("TRY_DATE not between", value1, value2, "tryDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateIsNull() {
            addCriterion("TURN_LEVEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateIsNotNull() {
            addCriterion("TURN_LEVEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateEqualTo(Date value) {
            addCriterion("TURN_LEVEL_DATE =", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateNotEqualTo(Date value) {
            addCriterion("TURN_LEVEL_DATE <>", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateGreaterThan(Date value) {
            addCriterion("TURN_LEVEL_DATE >", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TURN_LEVEL_DATE >=", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateLessThan(Date value) {
            addCriterion("TURN_LEVEL_DATE <", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateLessThanOrEqualTo(Date value) {
            addCriterion("TURN_LEVEL_DATE <=", value, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateIn(List<Date> values) {
            addCriterion("TURN_LEVEL_DATE in", values, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateNotIn(List<Date> values) {
            addCriterion("TURN_LEVEL_DATE not in", values, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateBetween(Date value1, Date value2) {
            addCriterion("TURN_LEVEL_DATE between", value1, value2, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTurnLevelDateNotBetween(Date value1, Date value2) {
            addCriterion("TURN_LEVEL_DATE not between", value1, value2, "turnLevelDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNull() {
            addCriterion("TRANSFER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNotNull() {
            addCriterion("TRANSFER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDateEqualTo(Date value) {
            addCriterion("TRANSFER_DATE =", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotEqualTo(Date value) {
            addCriterion("TRANSFER_DATE <>", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThan(Date value) {
            addCriterion("TRANSFER_DATE >", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSFER_DATE >=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThan(Date value) {
            addCriterion("TRANSFER_DATE <", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSFER_DATE <=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateIn(List<Date> values) {
            addCriterion("TRANSFER_DATE in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotIn(List<Date> values) {
            addCriterion("TRANSFER_DATE not in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateBetween(Date value1, Date value2) {
            addCriterion("TRANSFER_DATE between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSFER_DATE not between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIsNull() {
            addCriterion("CURRENT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIsNotNull() {
            addCriterion("CURRENT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumEqualTo(String value) {
            addCriterion("CURRENT_NUM =", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotEqualTo(String value) {
            addCriterion("CURRENT_NUM <>", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumGreaterThan(String value) {
            addCriterion("CURRENT_NUM >", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_NUM >=", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumLessThan(String value) {
            addCriterion("CURRENT_NUM <", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_NUM <=", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumLike(String value) {
            addCriterion("CURRENT_NUM like", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotLike(String value) {
            addCriterion("CURRENT_NUM not like", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIn(List<String> values) {
            addCriterion("CURRENT_NUM in", values, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotIn(List<String> values) {
            addCriterion("CURRENT_NUM not in", values, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumBetween(String value1, String value2) {
            addCriterion("CURRENT_NUM between", value1, value2, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotBetween(String value1, String value2) {
            addCriterion("CURRENT_NUM not between", value1, value2, "currentNum");
            return (Criteria) this;
        }

        public Criteria andYearsGradeIsNull() {
            addCriterion("YEARS_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andYearsGradeIsNotNull() {
            addCriterion("YEARS_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andYearsGradeEqualTo(String value) {
            addCriterion("YEARS_GRADE =", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeNotEqualTo(String value) {
            addCriterion("YEARS_GRADE <>", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeGreaterThan(String value) {
            addCriterion("YEARS_GRADE >", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeGreaterThanOrEqualTo(String value) {
            addCriterion("YEARS_GRADE >=", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeLessThan(String value) {
            addCriterion("YEARS_GRADE <", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeLessThanOrEqualTo(String value) {
            addCriterion("YEARS_GRADE <=", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeLike(String value) {
            addCriterion("YEARS_GRADE like", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeNotLike(String value) {
            addCriterion("YEARS_GRADE not like", value, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeIn(List<String> values) {
            addCriterion("YEARS_GRADE in", values, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeNotIn(List<String> values) {
            addCriterion("YEARS_GRADE not in", values, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeBetween(String value1, String value2) {
            addCriterion("YEARS_GRADE between", value1, value2, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andYearsGradeNotBetween(String value1, String value2) {
            addCriterion("YEARS_GRADE not between", value1, value2, "yearsGrade");
            return (Criteria) this;
        }

        public Criteria andRetireDateIsNull() {
            addCriterion("RETIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRetireDateIsNotNull() {
            addCriterion("RETIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRetireDateEqualTo(Date value) {
            addCriterion("RETIRE_DATE =", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateNotEqualTo(Date value) {
            addCriterion("RETIRE_DATE <>", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateGreaterThan(Date value) {
            addCriterion("RETIRE_DATE >", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETIRE_DATE >=", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateLessThan(Date value) {
            addCriterion("RETIRE_DATE <", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateLessThanOrEqualTo(Date value) {
            addCriterion("RETIRE_DATE <=", value, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateIn(List<Date> values) {
            addCriterion("RETIRE_DATE in", values, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateNotIn(List<Date> values) {
            addCriterion("RETIRE_DATE not in", values, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateBetween(Date value1, Date value2) {
            addCriterion("RETIRE_DATE between", value1, value2, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDateNotBetween(Date value1, Date value2) {
            addCriterion("RETIRE_DATE not between", value1, value2, "retireDate");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelIsNull() {
            addCriterion("RETIRE_DUTY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelIsNotNull() {
            addCriterion("RETIRE_DUTY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelEqualTo(String value) {
            addCriterion("RETIRE_DUTY_LEVEL =", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelNotEqualTo(String value) {
            addCriterion("RETIRE_DUTY_LEVEL <>", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelGreaterThan(String value) {
            addCriterion("RETIRE_DUTY_LEVEL >", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RETIRE_DUTY_LEVEL >=", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelLessThan(String value) {
            addCriterion("RETIRE_DUTY_LEVEL <", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelLessThanOrEqualTo(String value) {
            addCriterion("RETIRE_DUTY_LEVEL <=", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelLike(String value) {
            addCriterion("RETIRE_DUTY_LEVEL like", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelNotLike(String value) {
            addCriterion("RETIRE_DUTY_LEVEL not like", value, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelIn(List<String> values) {
            addCriterion("RETIRE_DUTY_LEVEL in", values, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelNotIn(List<String> values) {
            addCriterion("RETIRE_DUTY_LEVEL not in", values, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelBetween(String value1, String value2) {
            addCriterion("RETIRE_DUTY_LEVEL between", value1, value2, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andRetireDutyLevelNotBetween(String value1, String value2) {
            addCriterion("RETIRE_DUTY_LEVEL not between", value1, value2, "retireDutyLevel");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNull() {
            addCriterion("CONTRACT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNotNull() {
            addCriterion("CONTRACT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodEqualTo(String value) {
            addCriterion("CONTRACT_PERIOD =", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotEqualTo(String value) {
            addCriterion("CONTRACT_PERIOD <>", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThan(String value) {
            addCriterion("CONTRACT_PERIOD >", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PERIOD >=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThan(String value) {
            addCriterion("CONTRACT_PERIOD <", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PERIOD <=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLike(String value) {
            addCriterion("CONTRACT_PERIOD like", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotLike(String value) {
            addCriterion("CONTRACT_PERIOD not like", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIn(List<String> values) {
            addCriterion("CONTRACT_PERIOD in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotIn(List<String> values) {
            addCriterion("CONTRACT_PERIOD not in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodBetween(String value1, String value2) {
            addCriterion("CONTRACT_PERIOD between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_PERIOD not between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andInsuredIsNull() {
            addCriterion("INSURED is null");
            return (Criteria) this;
        }

        public Criteria andInsuredIsNotNull() {
            addCriterion("INSURED is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredEqualTo(String value) {
            addCriterion("INSURED =", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredNotEqualTo(String value) {
            addCriterion("INSURED <>", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredGreaterThan(String value) {
            addCriterion("INSURED >", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredGreaterThanOrEqualTo(String value) {
            addCriterion("INSURED >=", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredLessThan(String value) {
            addCriterion("INSURED <", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredLessThanOrEqualTo(String value) {
            addCriterion("INSURED <=", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredLike(String value) {
            addCriterion("INSURED like", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredNotLike(String value) {
            addCriterion("INSURED not like", value, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredIn(List<String> values) {
            addCriterion("INSURED in", values, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredNotIn(List<String> values) {
            addCriterion("INSURED not in", values, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredBetween(String value1, String value2) {
            addCriterion("INSURED between", value1, value2, "insured");
            return (Criteria) this;
        }

        public Criteria andInsuredNotBetween(String value1, String value2) {
            addCriterion("INSURED not between", value1, value2, "insured");
            return (Criteria) this;
        }

        public Criteria andHireDutyIsNull() {
            addCriterion("HIRE_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andHireDutyIsNotNull() {
            addCriterion("HIRE_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andHireDutyEqualTo(String value) {
            addCriterion("HIRE_DUTY =", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyNotEqualTo(String value) {
            addCriterion("HIRE_DUTY <>", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyGreaterThan(String value) {
            addCriterion("HIRE_DUTY >", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyGreaterThanOrEqualTo(String value) {
            addCriterion("HIRE_DUTY >=", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyLessThan(String value) {
            addCriterion("HIRE_DUTY <", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyLessThanOrEqualTo(String value) {
            addCriterion("HIRE_DUTY <=", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyLike(String value) {
            addCriterion("HIRE_DUTY like", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyNotLike(String value) {
            addCriterion("HIRE_DUTY not like", value, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyIn(List<String> values) {
            addCriterion("HIRE_DUTY in", values, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyNotIn(List<String> values) {
            addCriterion("HIRE_DUTY not in", values, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyBetween(String value1, String value2) {
            addCriterion("HIRE_DUTY between", value1, value2, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDutyNotBetween(String value1, String value2) {
            addCriterion("HIRE_DUTY not between", value1, value2, "hireDuty");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNull() {
            addCriterion("HIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNotNull() {
            addCriterion("HIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHireDateEqualTo(Date value) {
            addCriterion("HIRE_DATE =", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotEqualTo(Date value) {
            addCriterion("HIRE_DATE <>", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThan(Date value) {
            addCriterion("HIRE_DATE >", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HIRE_DATE >=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThan(Date value) {
            addCriterion("HIRE_DATE <", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThanOrEqualTo(Date value) {
            addCriterion("HIRE_DATE <=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateIn(List<Date> values) {
            addCriterion("HIRE_DATE in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotIn(List<Date> values) {
            addCriterion("HIRE_DATE not in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateBetween(Date value1, Date value2) {
            addCriterion("HIRE_DATE between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotBetween(Date value1, Date value2) {
            addCriterion("HIRE_DATE not between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedIsNull() {
            addCriterion("CURRENT_DATED is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedIsNotNull() {
            addCriterion("CURRENT_DATED is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedEqualTo(Date value) {
            addCriterion("CURRENT_DATED =", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedNotEqualTo(Date value) {
            addCriterion("CURRENT_DATED <>", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedGreaterThan(Date value) {
            addCriterion("CURRENT_DATED >", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRENT_DATED >=", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedLessThan(Date value) {
            addCriterion("CURRENT_DATED <", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedLessThanOrEqualTo(Date value) {
            addCriterion("CURRENT_DATED <=", value, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedIn(List<Date> values) {
            addCriterion("CURRENT_DATED in", values, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedNotIn(List<Date> values) {
            addCriterion("CURRENT_DATED not in", values, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedBetween(Date value1, Date value2) {
            addCriterion("CURRENT_DATED between", value1, value2, "currentDated");
            return (Criteria) this;
        }

        public Criteria andCurrentDatedNotBetween(Date value1, Date value2) {
            addCriterion("CURRENT_DATED not between", value1, value2, "currentDated");
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