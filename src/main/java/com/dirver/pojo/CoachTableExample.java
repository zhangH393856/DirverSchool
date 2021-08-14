package com.dirver.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoachTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoachTableExample() {
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

        public Criteria andCoachIdIsNull() {
            addCriterion("coach_id is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("coach_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(Integer value) {
            addCriterion("coach_id =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(Integer value) {
            addCriterion("coach_id <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(Integer value) {
            addCriterion("coach_id >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coach_id >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(Integer value) {
            addCriterion("coach_id <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(Integer value) {
            addCriterion("coach_id <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<Integer> values) {
            addCriterion("coach_id in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<Integer> values) {
            addCriterion("coach_id not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(Integer value1, Integer value2) {
            addCriterion("coach_id between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coach_id not between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNull() {
            addCriterion("coach_name is null");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNotNull() {
            addCriterion("coach_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoachNameEqualTo(String value) {
            addCriterion("coach_name =", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotEqualTo(String value) {
            addCriterion("coach_name <>", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThan(String value) {
            addCriterion("coach_name >", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThanOrEqualTo(String value) {
            addCriterion("coach_name >=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThan(String value) {
            addCriterion("coach_name <", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThanOrEqualTo(String value) {
            addCriterion("coach_name <=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLike(String value) {
            addCriterion("coach_name like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotLike(String value) {
            addCriterion("coach_name not like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameIn(List<String> values) {
            addCriterion("coach_name in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotIn(List<String> values) {
            addCriterion("coach_name not in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameBetween(String value1, String value2) {
            addCriterion("coach_name between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotBetween(String value1, String value2) {
            addCriterion("coach_name not between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileIsNull() {
            addCriterion("coach_myfile is null");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileIsNotNull() {
            addCriterion("coach_myfile is not null");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileEqualTo(String value) {
            addCriterion("coach_myfile =", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileNotEqualTo(String value) {
            addCriterion("coach_myfile <>", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileGreaterThan(String value) {
            addCriterion("coach_myfile >", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileGreaterThanOrEqualTo(String value) {
            addCriterion("coach_myfile >=", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileLessThan(String value) {
            addCriterion("coach_myfile <", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileLessThanOrEqualTo(String value) {
            addCriterion("coach_myfile <=", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileLike(String value) {
            addCriterion("coach_myfile like", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileNotLike(String value) {
            addCriterion("coach_myfile not like", value, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileIn(List<String> values) {
            addCriterion("coach_myfile in", values, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileNotIn(List<String> values) {
            addCriterion("coach_myfile not in", values, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileBetween(String value1, String value2) {
            addCriterion("coach_myfile between", value1, value2, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachMyfileNotBetween(String value1, String value2) {
            addCriterion("coach_myfile not between", value1, value2, "coachMyfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileIsNull() {
            addCriterion("coach_carfile is null");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileIsNotNull() {
            addCriterion("coach_carfile is not null");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileEqualTo(String value) {
            addCriterion("coach_carfile =", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileNotEqualTo(String value) {
            addCriterion("coach_carfile <>", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileGreaterThan(String value) {
            addCriterion("coach_carfile >", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileGreaterThanOrEqualTo(String value) {
            addCriterion("coach_carfile >=", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileLessThan(String value) {
            addCriterion("coach_carfile <", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileLessThanOrEqualTo(String value) {
            addCriterion("coach_carfile <=", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileLike(String value) {
            addCriterion("coach_carfile like", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileNotLike(String value) {
            addCriterion("coach_carfile not like", value, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileIn(List<String> values) {
            addCriterion("coach_carfile in", values, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileNotIn(List<String> values) {
            addCriterion("coach_carfile not in", values, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileBetween(String value1, String value2) {
            addCriterion("coach_carfile between", value1, value2, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCarfileNotBetween(String value1, String value2) {
            addCriterion("coach_carfile not between", value1, value2, "coachCarfile");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeIsNull() {
            addCriterion("coach_cartype is null");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeIsNotNull() {
            addCriterion("coach_cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeEqualTo(String value) {
            addCriterion("coach_cartype =", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeNotEqualTo(String value) {
            addCriterion("coach_cartype <>", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeGreaterThan(String value) {
            addCriterion("coach_cartype >", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("coach_cartype >=", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeLessThan(String value) {
            addCriterion("coach_cartype <", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeLessThanOrEqualTo(String value) {
            addCriterion("coach_cartype <=", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeLike(String value) {
            addCriterion("coach_cartype like", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeNotLike(String value) {
            addCriterion("coach_cartype not like", value, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeIn(List<String> values) {
            addCriterion("coach_cartype in", values, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeNotIn(List<String> values) {
            addCriterion("coach_cartype not in", values, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeBetween(String value1, String value2) {
            addCriterion("coach_cartype between", value1, value2, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachCartypeNotBetween(String value1, String value2) {
            addCriterion("coach_cartype not between", value1, value2, "coachCartype");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneIsNull() {
            addCriterion("coach_phone is null");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneIsNotNull() {
            addCriterion("coach_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneEqualTo(String value) {
            addCriterion("coach_phone =", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneNotEqualTo(String value) {
            addCriterion("coach_phone <>", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneGreaterThan(String value) {
            addCriterion("coach_phone >", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("coach_phone >=", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneLessThan(String value) {
            addCriterion("coach_phone <", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneLessThanOrEqualTo(String value) {
            addCriterion("coach_phone <=", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneLike(String value) {
            addCriterion("coach_phone like", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneNotLike(String value) {
            addCriterion("coach_phone not like", value, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneIn(List<String> values) {
            addCriterion("coach_phone in", values, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneNotIn(List<String> values) {
            addCriterion("coach_phone not in", values, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneBetween(String value1, String value2) {
            addCriterion("coach_phone between", value1, value2, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachPhoneNotBetween(String value1, String value2) {
            addCriterion("coach_phone not between", value1, value2, "coachPhone");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeIsNull() {
            addCriterion("coach_starTime is null");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeIsNotNull() {
            addCriterion("coach_starTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeEqualTo(String value) {
            addCriterion("coach_starTime =", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeNotEqualTo(String value) {
            addCriterion("coach_starTime <>", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeGreaterThan(String value) {
            addCriterion("coach_starTime >", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeGreaterThanOrEqualTo(String value) {
            addCriterion("coach_starTime >=", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeLessThan(String value) {
            addCriterion("coach_starTime <", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeLessThanOrEqualTo(String value) {
            addCriterion("coach_starTime <=", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeLike(String value) {
            addCriterion("coach_starTime like", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeNotLike(String value) {
            addCriterion("coach_starTime not like", value, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeIn(List<String> values) {
            addCriterion("coach_starTime in", values, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeNotIn(List<String> values) {
            addCriterion("coach_starTime not in", values, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeBetween(String value1, String value2) {
            addCriterion("coach_starTime between", value1, value2, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachStartimeNotBetween(String value1, String value2) {
            addCriterion("coach_starTime not between", value1, value2, "coachStartime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeIsNull() {
            addCriterion("coach_endTime is null");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeIsNotNull() {
            addCriterion("coach_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeEqualTo(String value) {
            addCriterion("coach_endTime =", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeNotEqualTo(String value) {
            addCriterion("coach_endTime <>", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeGreaterThan(String value) {
            addCriterion("coach_endTime >", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("coach_endTime >=", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeLessThan(String value) {
            addCriterion("coach_endTime <", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeLessThanOrEqualTo(String value) {
            addCriterion("coach_endTime <=", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeLike(String value) {
            addCriterion("coach_endTime like", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeNotLike(String value) {
            addCriterion("coach_endTime not like", value, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeIn(List<String> values) {
            addCriterion("coach_endTime in", values, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeNotIn(List<String> values) {
            addCriterion("coach_endTime not in", values, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeBetween(String value1, String value2) {
            addCriterion("coach_endTime between", value1, value2, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachEndtimeNotBetween(String value1, String value2) {
            addCriterion("coach_endTime not between", value1, value2, "coachEndtime");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryIsNull() {
            addCriterion("coach_salary is null");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryIsNotNull() {
            addCriterion("coach_salary is not null");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryEqualTo(BigDecimal value) {
            addCriterion("coach_salary =", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryNotEqualTo(BigDecimal value) {
            addCriterion("coach_salary <>", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryGreaterThan(BigDecimal value) {
            addCriterion("coach_salary >", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coach_salary >=", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryLessThan(BigDecimal value) {
            addCriterion("coach_salary <", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coach_salary <=", value, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryIn(List<BigDecimal> values) {
            addCriterion("coach_salary in", values, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryNotIn(List<BigDecimal> values) {
            addCriterion("coach_salary not in", values, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coach_salary between", value1, value2, "coachSalary");
            return (Criteria) this;
        }

        public Criteria andCoachSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coach_salary not between", value1, value2, "coachSalary");
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