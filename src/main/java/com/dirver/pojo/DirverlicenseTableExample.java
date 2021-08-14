package com.dirver.pojo;

import java.util.ArrayList;
import java.util.List;

public class DirverlicenseTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirverlicenseTableExample() {
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

        public Criteria andLicenseIdIsNull() {
            addCriterion("license_id is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIsNotNull() {
            addCriterion("license_id is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdEqualTo(Integer value) {
            addCriterion("license_id =", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotEqualTo(Integer value) {
            addCriterion("license_id <>", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThan(Integer value) {
            addCriterion("license_id >", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("license_id >=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThan(Integer value) {
            addCriterion("license_id <", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("license_id <=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIn(List<Integer> values) {
            addCriterion("license_id in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotIn(List<Integer> values) {
            addCriterion("license_id not in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdBetween(Integer value1, Integer value2) {
            addCriterion("license_id between", value1, value2, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("license_id not between", value1, value2, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameIsNull() {
            addCriterion("license_userName is null");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameIsNotNull() {
            addCriterion("license_userName is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameEqualTo(String value) {
            addCriterion("license_userName =", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameNotEqualTo(String value) {
            addCriterion("license_userName <>", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameGreaterThan(String value) {
            addCriterion("license_userName >", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("license_userName >=", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameLessThan(String value) {
            addCriterion("license_userName <", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameLessThanOrEqualTo(String value) {
            addCriterion("license_userName <=", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameLike(String value) {
            addCriterion("license_userName like", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameNotLike(String value) {
            addCriterion("license_userName not like", value, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameIn(List<String> values) {
            addCriterion("license_userName in", values, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameNotIn(List<String> values) {
            addCriterion("license_userName not in", values, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameBetween(String value1, String value2) {
            addCriterion("license_userName between", value1, value2, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicenseUsernameNotBetween(String value1, String value2) {
            addCriterion("license_userName not between", value1, value2, "licenseUsername");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneIsNull() {
            addCriterion("license_phone is null");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneIsNotNull() {
            addCriterion("license_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneEqualTo(String value) {
            addCriterion("license_phone =", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneNotEqualTo(String value) {
            addCriterion("license_phone <>", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneGreaterThan(String value) {
            addCriterion("license_phone >", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("license_phone >=", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneLessThan(String value) {
            addCriterion("license_phone <", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneLessThanOrEqualTo(String value) {
            addCriterion("license_phone <=", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneLike(String value) {
            addCriterion("license_phone like", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneNotLike(String value) {
            addCriterion("license_phone not like", value, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneIn(List<String> values) {
            addCriterion("license_phone in", values, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneNotIn(List<String> values) {
            addCriterion("license_phone not in", values, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneBetween(String value1, String value2) {
            addCriterion("license_phone between", value1, value2, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicensePhoneNotBetween(String value1, String value2) {
            addCriterion("license_phone not between", value1, value2, "licensePhone");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridIsNull() {
            addCriterion("license_userID is null");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridIsNotNull() {
            addCriterion("license_userID is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridEqualTo(String value) {
            addCriterion("license_userID =", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridNotEqualTo(String value) {
            addCriterion("license_userID <>", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridGreaterThan(String value) {
            addCriterion("license_userID >", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridGreaterThanOrEqualTo(String value) {
            addCriterion("license_userID >=", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridLessThan(String value) {
            addCriterion("license_userID <", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridLessThanOrEqualTo(String value) {
            addCriterion("license_userID <=", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridLike(String value) {
            addCriterion("license_userID like", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridNotLike(String value) {
            addCriterion("license_userID not like", value, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridIn(List<String> values) {
            addCriterion("license_userID in", values, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridNotIn(List<String> values) {
            addCriterion("license_userID not in", values, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridBetween(String value1, String value2) {
            addCriterion("license_userID between", value1, value2, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseUseridNotBetween(String value1, String value2) {
            addCriterion("license_userID not between", value1, value2, "licenseUserid");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeIsNull() {
            addCriterion("license_carType is null");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeIsNotNull() {
            addCriterion("license_carType is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeEqualTo(String value) {
            addCriterion("license_carType =", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeNotEqualTo(String value) {
            addCriterion("license_carType <>", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeGreaterThan(String value) {
            addCriterion("license_carType >", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_carType >=", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeLessThan(String value) {
            addCriterion("license_carType <", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeLessThanOrEqualTo(String value) {
            addCriterion("license_carType <=", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeLike(String value) {
            addCriterion("license_carType like", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeNotLike(String value) {
            addCriterion("license_carType not like", value, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeIn(List<String> values) {
            addCriterion("license_carType in", values, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeNotIn(List<String> values) {
            addCriterion("license_carType not in", values, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeBetween(String value1, String value2) {
            addCriterion("license_carType between", value1, value2, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseCartypeNotBetween(String value1, String value2) {
            addCriterion("license_carType not between", value1, value2, "licenseCartype");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeIsNull() {
            addCriterion("license_time is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeIsNotNull() {
            addCriterion("license_time is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeEqualTo(String value) {
            addCriterion("license_time =", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeNotEqualTo(String value) {
            addCriterion("license_time <>", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeGreaterThan(String value) {
            addCriterion("license_time >", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("license_time >=", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeLessThan(String value) {
            addCriterion("license_time <", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeLessThanOrEqualTo(String value) {
            addCriterion("license_time <=", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeLike(String value) {
            addCriterion("license_time like", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeNotLike(String value) {
            addCriterion("license_time not like", value, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeIn(List<String> values) {
            addCriterion("license_time in", values, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeNotIn(List<String> values) {
            addCriterion("license_time not in", values, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeBetween(String value1, String value2) {
            addCriterion("license_time between", value1, value2, "licenseTime");
            return (Criteria) this;
        }

        public Criteria andLicenseTimeNotBetween(String value1, String value2) {
            addCriterion("license_time not between", value1, value2, "licenseTime");
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