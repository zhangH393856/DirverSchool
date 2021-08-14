package com.dirver.pojo;

import java.util.ArrayList;
import java.util.List;

public class SignupTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignupTableExample() {
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

        public Criteria andSignupIdIsNull() {
            addCriterion("signup_id is null");
            return (Criteria) this;
        }

        public Criteria andSignupIdIsNotNull() {
            addCriterion("signup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignupIdEqualTo(Integer value) {
            addCriterion("signup_id =", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdNotEqualTo(Integer value) {
            addCriterion("signup_id <>", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdGreaterThan(Integer value) {
            addCriterion("signup_id >", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("signup_id >=", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdLessThan(Integer value) {
            addCriterion("signup_id <", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdLessThanOrEqualTo(Integer value) {
            addCriterion("signup_id <=", value, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdIn(List<Integer> values) {
            addCriterion("signup_id in", values, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdNotIn(List<Integer> values) {
            addCriterion("signup_id not in", values, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdBetween(Integer value1, Integer value2) {
            addCriterion("signup_id between", value1, value2, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("signup_id not between", value1, value2, "signupId");
            return (Criteria) this;
        }

        public Criteria andSignupNameIsNull() {
            addCriterion("signup_name is null");
            return (Criteria) this;
        }

        public Criteria andSignupNameIsNotNull() {
            addCriterion("signup_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignupNameEqualTo(String value) {
            addCriterion("signup_name =", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameNotEqualTo(String value) {
            addCriterion("signup_name <>", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameGreaterThan(String value) {
            addCriterion("signup_name >", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameGreaterThanOrEqualTo(String value) {
            addCriterion("signup_name >=", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameLessThan(String value) {
            addCriterion("signup_name <", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameLessThanOrEqualTo(String value) {
            addCriterion("signup_name <=", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameLike(String value) {
            addCriterion("signup_name like", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameNotLike(String value) {
            addCriterion("signup_name not like", value, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameIn(List<String> values) {
            addCriterion("signup_name in", values, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameNotIn(List<String> values) {
            addCriterion("signup_name not in", values, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameBetween(String value1, String value2) {
            addCriterion("signup_name between", value1, value2, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupNameNotBetween(String value1, String value2) {
            addCriterion("signup_name not between", value1, value2, "signupName");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeIsNull() {
            addCriterion("signup_carType is null");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeIsNotNull() {
            addCriterion("signup_carType is not null");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeEqualTo(String value) {
            addCriterion("signup_carType =", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeNotEqualTo(String value) {
            addCriterion("signup_carType <>", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeGreaterThan(String value) {
            addCriterion("signup_carType >", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("signup_carType >=", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeLessThan(String value) {
            addCriterion("signup_carType <", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeLessThanOrEqualTo(String value) {
            addCriterion("signup_carType <=", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeLike(String value) {
            addCriterion("signup_carType like", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeNotLike(String value) {
            addCriterion("signup_carType not like", value, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeIn(List<String> values) {
            addCriterion("signup_carType in", values, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeNotIn(List<String> values) {
            addCriterion("signup_carType not in", values, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeBetween(String value1, String value2) {
            addCriterion("signup_carType between", value1, value2, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCartypeNotBetween(String value1, String value2) {
            addCriterion("signup_carType not between", value1, value2, "signupCartype");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameIsNull() {
            addCriterion("signup_coachName is null");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameIsNotNull() {
            addCriterion("signup_coachName is not null");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameEqualTo(String value) {
            addCriterion("signup_coachName =", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameNotEqualTo(String value) {
            addCriterion("signup_coachName <>", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameGreaterThan(String value) {
            addCriterion("signup_coachName >", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameGreaterThanOrEqualTo(String value) {
            addCriterion("signup_coachName >=", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameLessThan(String value) {
            addCriterion("signup_coachName <", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameLessThanOrEqualTo(String value) {
            addCriterion("signup_coachName <=", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameLike(String value) {
            addCriterion("signup_coachName like", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameNotLike(String value) {
            addCriterion("signup_coachName not like", value, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameIn(List<String> values) {
            addCriterion("signup_coachName in", values, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameNotIn(List<String> values) {
            addCriterion("signup_coachName not in", values, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameBetween(String value1, String value2) {
            addCriterion("signup_coachName between", value1, value2, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachnameNotBetween(String value1, String value2) {
            addCriterion("signup_coachName not between", value1, value2, "signupCoachname");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneIsNull() {
            addCriterion("signup_coachPhone is null");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneIsNotNull() {
            addCriterion("signup_coachPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneEqualTo(String value) {
            addCriterion("signup_coachPhone =", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneNotEqualTo(String value) {
            addCriterion("signup_coachPhone <>", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneGreaterThan(String value) {
            addCriterion("signup_coachPhone >", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneGreaterThanOrEqualTo(String value) {
            addCriterion("signup_coachPhone >=", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneLessThan(String value) {
            addCriterion("signup_coachPhone <", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneLessThanOrEqualTo(String value) {
            addCriterion("signup_coachPhone <=", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneLike(String value) {
            addCriterion("signup_coachPhone like", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneNotLike(String value) {
            addCriterion("signup_coachPhone not like", value, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneIn(List<String> values) {
            addCriterion("signup_coachPhone in", values, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneNotIn(List<String> values) {
            addCriterion("signup_coachPhone not in", values, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneBetween(String value1, String value2) {
            addCriterion("signup_coachPhone between", value1, value2, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupCoachphoneNotBetween(String value1, String value2) {
            addCriterion("signup_coachPhone not between", value1, value2, "signupCoachphone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneIsNull() {
            addCriterion("signup_phone is null");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneIsNotNull() {
            addCriterion("signup_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneEqualTo(String value) {
            addCriterion("signup_phone =", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneNotEqualTo(String value) {
            addCriterion("signup_phone <>", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneGreaterThan(String value) {
            addCriterion("signup_phone >", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("signup_phone >=", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneLessThan(String value) {
            addCriterion("signup_phone <", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneLessThanOrEqualTo(String value) {
            addCriterion("signup_phone <=", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneLike(String value) {
            addCriterion("signup_phone like", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneNotLike(String value) {
            addCriterion("signup_phone not like", value, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneIn(List<String> values) {
            addCriterion("signup_phone in", values, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneNotIn(List<String> values) {
            addCriterion("signup_phone not in", values, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneBetween(String value1, String value2) {
            addCriterion("signup_phone between", value1, value2, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupPhoneNotBetween(String value1, String value2) {
            addCriterion("signup_phone not between", value1, value2, "signupPhone");
            return (Criteria) this;
        }

        public Criteria andSignupTimeIsNull() {
            addCriterion("signup_time is null");
            return (Criteria) this;
        }

        public Criteria andSignupTimeIsNotNull() {
            addCriterion("signup_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignupTimeEqualTo(String value) {
            addCriterion("signup_time =", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeNotEqualTo(String value) {
            addCriterion("signup_time <>", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeGreaterThan(String value) {
            addCriterion("signup_time >", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeGreaterThanOrEqualTo(String value) {
            addCriterion("signup_time >=", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeLessThan(String value) {
            addCriterion("signup_time <", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeLessThanOrEqualTo(String value) {
            addCriterion("signup_time <=", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeLike(String value) {
            addCriterion("signup_time like", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeNotLike(String value) {
            addCriterion("signup_time not like", value, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeIn(List<String> values) {
            addCriterion("signup_time in", values, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeNotIn(List<String> values) {
            addCriterion("signup_time not in", values, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeBetween(String value1, String value2) {
            addCriterion("signup_time between", value1, value2, "signupTime");
            return (Criteria) this;
        }

        public Criteria andSignupTimeNotBetween(String value1, String value2) {
            addCriterion("signup_time not between", value1, value2, "signupTime");
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