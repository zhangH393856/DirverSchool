package com.dirver.pojo;

import java.util.ArrayList;
import java.util.List;

public class DirveruserTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirveruserTableExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNull() {
            addCriterion("user_loginName is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNotNull() {
            addCriterion("user_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameEqualTo(String value) {
            addCriterion("user_loginName =", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotEqualTo(String value) {
            addCriterion("user_loginName <>", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThan(String value) {
            addCriterion("user_loginName >", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginName >=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThan(String value) {
            addCriterion("user_loginName <", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThanOrEqualTo(String value) {
            addCriterion("user_loginName <=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLike(String value) {
            addCriterion("user_loginName like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotLike(String value) {
            addCriterion("user_loginName not like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIn(List<String> values) {
            addCriterion("user_loginName in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotIn(List<String> values) {
            addCriterion("user_loginName not in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameBetween(String value1, String value2) {
            addCriterion("user_loginName between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotBetween(String value1, String value2) {
            addCriterion("user_loginName not between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIsNull() {
            addCriterion("user_loginPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIsNotNull() {
            addCriterion("user_loginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdEqualTo(String value) {
            addCriterion("user_loginPwd =", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotEqualTo(String value) {
            addCriterion("user_loginPwd <>", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdGreaterThan(String value) {
            addCriterion("user_loginPwd >", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginPwd >=", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLessThan(String value) {
            addCriterion("user_loginPwd <", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("user_loginPwd <=", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLike(String value) {
            addCriterion("user_loginPwd like", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotLike(String value) {
            addCriterion("user_loginPwd not like", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIn(List<String> values) {
            addCriterion("user_loginPwd in", values, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotIn(List<String> values) {
            addCriterion("user_loginPwd not in", values, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdBetween(String value1, String value2) {
            addCriterion("user_loginPwd between", value1, value2, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotBetween(String value1, String value2) {
            addCriterion("user_loginPwd not between", value1, value2, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserCartypeIsNull() {
            addCriterion("user_carType is null");
            return (Criteria) this;
        }

        public Criteria andUserCartypeIsNotNull() {
            addCriterion("user_carType is not null");
            return (Criteria) this;
        }

        public Criteria andUserCartypeEqualTo(String value) {
            addCriterion("user_carType =", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeNotEqualTo(String value) {
            addCriterion("user_carType <>", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeGreaterThan(String value) {
            addCriterion("user_carType >", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_carType >=", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeLessThan(String value) {
            addCriterion("user_carType <", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeLessThanOrEqualTo(String value) {
            addCriterion("user_carType <=", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeLike(String value) {
            addCriterion("user_carType like", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeNotLike(String value) {
            addCriterion("user_carType not like", value, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeIn(List<String> values) {
            addCriterion("user_carType in", values, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeNotIn(List<String> values) {
            addCriterion("user_carType not in", values, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeBetween(String value1, String value2) {
            addCriterion("user_carType between", value1, value2, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCartypeNotBetween(String value1, String value2) {
            addCriterion("user_carType not between", value1, value2, "userCartype");
            return (Criteria) this;
        }

        public Criteria andUserCostIsNull() {
            addCriterion("user_cost is null");
            return (Criteria) this;
        }

        public Criteria andUserCostIsNotNull() {
            addCriterion("user_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUserCostEqualTo(Double value) {
            addCriterion("user_cost =", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotEqualTo(Double value) {
            addCriterion("user_cost <>", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostGreaterThan(Double value) {
            addCriterion("user_cost >", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostGreaterThanOrEqualTo(Double value) {
            addCriterion("user_cost >=", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostLessThan(Double value) {
            addCriterion("user_cost <", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostLessThanOrEqualTo(Double value) {
            addCriterion("user_cost <=", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostIn(List<Double> values) {
            addCriterion("user_cost in", values, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotIn(List<Double> values) {
            addCriterion("user_cost not in", values, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostBetween(Double value1, Double value2) {
            addCriterion("user_cost between", value1, value2, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotBetween(Double value1, Double value2) {
            addCriterion("user_cost not between", value1, value2, "userCost");
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