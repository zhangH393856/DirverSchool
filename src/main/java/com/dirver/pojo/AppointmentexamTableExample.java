package com.dirver.pojo;

import java.util.ArrayList;
import java.util.List;

public class AppointmentexamTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentexamTableExample() {
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

        public Criteria andAppointmentIdIsNull() {
            addCriterion("appointment_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNotNull() {
            addCriterion("appointment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdEqualTo(Integer value) {
            addCriterion("appointment_id =", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotEqualTo(Integer value) {
            addCriterion("appointment_id <>", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThan(Integer value) {
            addCriterion("appointment_id >", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointment_id >=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThan(Integer value) {
            addCriterion("appointment_id <", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("appointment_id <=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIn(List<Integer> values) {
            addCriterion("appointment_id in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotIn(List<Integer> values) {
            addCriterion("appointment_id not in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdBetween(Integer value1, Integer value2) {
            addCriterion("appointment_id between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appointment_id not between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameIsNull() {
            addCriterion("appointment_userName is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameIsNotNull() {
            addCriterion("appointment_userName is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameEqualTo(String value) {
            addCriterion("appointment_userName =", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameNotEqualTo(String value) {
            addCriterion("appointment_userName <>", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameGreaterThan(String value) {
            addCriterion("appointment_userName >", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_userName >=", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameLessThan(String value) {
            addCriterion("appointment_userName <", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameLessThanOrEqualTo(String value) {
            addCriterion("appointment_userName <=", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameLike(String value) {
            addCriterion("appointment_userName like", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameNotLike(String value) {
            addCriterion("appointment_userName not like", value, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameIn(List<String> values) {
            addCriterion("appointment_userName in", values, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameNotIn(List<String> values) {
            addCriterion("appointment_userName not in", values, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameBetween(String value1, String value2) {
            addCriterion("appointment_userName between", value1, value2, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentUsernameNotBetween(String value1, String value2) {
            addCriterion("appointment_userName not between", value1, value2, "appointmentUsername");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeIsNull() {
            addCriterion("appointment_carType is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeIsNotNull() {
            addCriterion("appointment_carType is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeEqualTo(String value) {
            addCriterion("appointment_carType =", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeNotEqualTo(String value) {
            addCriterion("appointment_carType <>", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeGreaterThan(String value) {
            addCriterion("appointment_carType >", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_carType >=", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeLessThan(String value) {
            addCriterion("appointment_carType <", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeLessThanOrEqualTo(String value) {
            addCriterion("appointment_carType <=", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeLike(String value) {
            addCriterion("appointment_carType like", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeNotLike(String value) {
            addCriterion("appointment_carType not like", value, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeIn(List<String> values) {
            addCriterion("appointment_carType in", values, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeNotIn(List<String> values) {
            addCriterion("appointment_carType not in", values, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeBetween(String value1, String value2) {
            addCriterion("appointment_carType between", value1, value2, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentCartypeNotBetween(String value1, String value2) {
            addCriterion("appointment_carType not between", value1, value2, "appointmentCartype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeIsNull() {
            addCriterion("appointment_projectType is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeIsNotNull() {
            addCriterion("appointment_projectType is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeEqualTo(String value) {
            addCriterion("appointment_projectType =", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeNotEqualTo(String value) {
            addCriterion("appointment_projectType <>", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeGreaterThan(String value) {
            addCriterion("appointment_projectType >", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_projectType >=", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeLessThan(String value) {
            addCriterion("appointment_projectType <", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("appointment_projectType <=", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeLike(String value) {
            addCriterion("appointment_projectType like", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeNotLike(String value) {
            addCriterion("appointment_projectType not like", value, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeIn(List<String> values) {
            addCriterion("appointment_projectType in", values, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeNotIn(List<String> values) {
            addCriterion("appointment_projectType not in", values, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeBetween(String value1, String value2) {
            addCriterion("appointment_projectType between", value1, value2, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentProjecttypeNotBetween(String value1, String value2) {
            addCriterion("appointment_projectType not between", value1, value2, "appointmentProjecttype");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_Time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(String value) {
            addCriterion("appointment_Time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(String value) {
            addCriterion("appointment_Time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(String value) {
            addCriterion("appointment_Time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_Time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(String value) {
            addCriterion("appointment_Time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(String value) {
            addCriterion("appointment_Time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLike(String value) {
            addCriterion("appointment_Time like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotLike(String value) {
            addCriterion("appointment_Time not like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<String> values) {
            addCriterion("appointment_Time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<String> values) {
            addCriterion("appointment_Time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(String value1, String value2) {
            addCriterion("appointment_Time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(String value1, String value2) {
            addCriterion("appointment_Time not between", value1, value2, "appointmentTime");
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