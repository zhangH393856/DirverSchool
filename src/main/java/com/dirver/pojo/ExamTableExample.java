package com.dirver.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamTableExample() {
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

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamUsernameIsNull() {
            addCriterion("exam_userName is null");
            return (Criteria) this;
        }

        public Criteria andExamUsernameIsNotNull() {
            addCriterion("exam_userName is not null");
            return (Criteria) this;
        }

        public Criteria andExamUsernameEqualTo(String value) {
            addCriterion("exam_userName =", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameNotEqualTo(String value) {
            addCriterion("exam_userName <>", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameGreaterThan(String value) {
            addCriterion("exam_userName >", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_userName >=", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameLessThan(String value) {
            addCriterion("exam_userName <", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameLessThanOrEqualTo(String value) {
            addCriterion("exam_userName <=", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameLike(String value) {
            addCriterion("exam_userName like", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameNotLike(String value) {
            addCriterion("exam_userName not like", value, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameIn(List<String> values) {
            addCriterion("exam_userName in", values, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameNotIn(List<String> values) {
            addCriterion("exam_userName not in", values, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameBetween(String value1, String value2) {
            addCriterion("exam_userName between", value1, value2, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUsernameNotBetween(String value1, String value2) {
            addCriterion("exam_userName not between", value1, value2, "examUsername");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneIsNull() {
            addCriterion("exam_userPhone is null");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneIsNotNull() {
            addCriterion("exam_userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneEqualTo(String value) {
            addCriterion("exam_userPhone =", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneNotEqualTo(String value) {
            addCriterion("exam_userPhone <>", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneGreaterThan(String value) {
            addCriterion("exam_userPhone >", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("exam_userPhone >=", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneLessThan(String value) {
            addCriterion("exam_userPhone <", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneLessThanOrEqualTo(String value) {
            addCriterion("exam_userPhone <=", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneLike(String value) {
            addCriterion("exam_userPhone like", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneNotLike(String value) {
            addCriterion("exam_userPhone not like", value, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneIn(List<String> values) {
            addCriterion("exam_userPhone in", values, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneNotIn(List<String> values) {
            addCriterion("exam_userPhone not in", values, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneBetween(String value1, String value2) {
            addCriterion("exam_userPhone between", value1, value2, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamUserphoneNotBetween(String value1, String value2) {
            addCriterion("exam_userPhone not between", value1, value2, "examUserphone");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeIsNull() {
            addCriterion("exam_projectType is null");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeIsNotNull() {
            addCriterion("exam_projectType is not null");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeEqualTo(String value) {
            addCriterion("exam_projectType =", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeNotEqualTo(String value) {
            addCriterion("exam_projectType <>", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeGreaterThan(String value) {
            addCriterion("exam_projectType >", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_projectType >=", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeLessThan(String value) {
            addCriterion("exam_projectType <", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("exam_projectType <=", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeLike(String value) {
            addCriterion("exam_projectType like", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeNotLike(String value) {
            addCriterion("exam_projectType not like", value, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeIn(List<String> values) {
            addCriterion("exam_projectType in", values, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeNotIn(List<String> values) {
            addCriterion("exam_projectType not in", values, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeBetween(String value1, String value2) {
            addCriterion("exam_projectType between", value1, value2, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamProjecttypeNotBetween(String value1, String value2) {
            addCriterion("exam_projectType not between", value1, value2, "examProjecttype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeIsNull() {
            addCriterion("exam_carType is null");
            return (Criteria) this;
        }

        public Criteria andExamCartypeIsNotNull() {
            addCriterion("exam_carType is not null");
            return (Criteria) this;
        }

        public Criteria andExamCartypeEqualTo(String value) {
            addCriterion("exam_carType =", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeNotEqualTo(String value) {
            addCriterion("exam_carType <>", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeGreaterThan(String value) {
            addCriterion("exam_carType >", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_carType >=", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeLessThan(String value) {
            addCriterion("exam_carType <", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeLessThanOrEqualTo(String value) {
            addCriterion("exam_carType <=", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeLike(String value) {
            addCriterion("exam_carType like", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeNotLike(String value) {
            addCriterion("exam_carType not like", value, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeIn(List<String> values) {
            addCriterion("exam_carType in", values, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeNotIn(List<String> values) {
            addCriterion("exam_carType not in", values, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeBetween(String value1, String value2) {
            addCriterion("exam_carType between", value1, value2, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamCartypeNotBetween(String value1, String value2) {
            addCriterion("exam_carType not between", value1, value2, "examCartype");
            return (Criteria) this;
        }

        public Criteria andExamAchievementIsNull() {
            addCriterion("exam_achievement is null");
            return (Criteria) this;
        }

        public Criteria andExamAchievementIsNotNull() {
            addCriterion("exam_achievement is not null");
            return (Criteria) this;
        }

        public Criteria andExamAchievementEqualTo(Integer value) {
            addCriterion("exam_achievement =", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementNotEqualTo(Integer value) {
            addCriterion("exam_achievement <>", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementGreaterThan(Integer value) {
            addCriterion("exam_achievement >", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_achievement >=", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementLessThan(Integer value) {
            addCriterion("exam_achievement <", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementLessThanOrEqualTo(Integer value) {
            addCriterion("exam_achievement <=", value, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementIn(List<Integer> values) {
            addCriterion("exam_achievement in", values, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementNotIn(List<Integer> values) {
            addCriterion("exam_achievement not in", values, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementBetween(Integer value1, Integer value2) {
            addCriterion("exam_achievement between", value1, value2, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamAchievementNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_achievement not between", value1, value2, "examAchievement");
            return (Criteria) this;
        }

        public Criteria andExamFiedIsNull() {
            addCriterion("exam_fied is null");
            return (Criteria) this;
        }

        public Criteria andExamFiedIsNotNull() {
            addCriterion("exam_fied is not null");
            return (Criteria) this;
        }

        public Criteria andExamFiedEqualTo(Integer value) {
            addCriterion("exam_fied =", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedNotEqualTo(Integer value) {
            addCriterion("exam_fied <>", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedGreaterThan(Integer value) {
            addCriterion("exam_fied >", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_fied >=", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedLessThan(Integer value) {
            addCriterion("exam_fied <", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedLessThanOrEqualTo(Integer value) {
            addCriterion("exam_fied <=", value, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedIn(List<Integer> values) {
            addCriterion("exam_fied in", values, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedNotIn(List<Integer> values) {
            addCriterion("exam_fied not in", values, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedBetween(Integer value1, Integer value2) {
            addCriterion("exam_fied between", value1, value2, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamFiedNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_fied not between", value1, value2, "examFied");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("exam_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(String value) {
            addCriterion("exam_time =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(String value) {
            addCriterion("exam_time <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(String value) {
            addCriterion("exam_time >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_time >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(String value) {
            addCriterion("exam_time <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(String value) {
            addCriterion("exam_time <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLike(String value) {
            addCriterion("exam_time like", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotLike(String value) {
            addCriterion("exam_time not like", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<String> values) {
            addCriterion("exam_time in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<String> values) {
            addCriterion("exam_time not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(String value1, String value2) {
            addCriterion("exam_time between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(String value1, String value2) {
            addCriterion("exam_time not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamCostIsNull() {
            addCriterion("exam_cost is null");
            return (Criteria) this;
        }

        public Criteria andExamCostIsNotNull() {
            addCriterion("exam_cost is not null");
            return (Criteria) this;
        }

        public Criteria andExamCostEqualTo(BigDecimal value) {
            addCriterion("exam_cost =", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostNotEqualTo(BigDecimal value) {
            addCriterion("exam_cost <>", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostGreaterThan(BigDecimal value) {
            addCriterion("exam_cost >", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_cost >=", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostLessThan(BigDecimal value) {
            addCriterion("exam_cost <", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_cost <=", value, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostIn(List<BigDecimal> values) {
            addCriterion("exam_cost in", values, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostNotIn(List<BigDecimal> values) {
            addCriterion("exam_cost not in", values, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_cost between", value1, value2, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_cost not between", value1, value2, "examCost");
            return (Criteria) this;
        }

        public Criteria andExamCoststateIsNull() {
            addCriterion("exam_costState is null");
            return (Criteria) this;
        }

        public Criteria andExamCoststateIsNotNull() {
            addCriterion("exam_costState is not null");
            return (Criteria) this;
        }

        public Criteria andExamCoststateEqualTo(String value) {
            addCriterion("exam_costState =", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateNotEqualTo(String value) {
            addCriterion("exam_costState <>", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateGreaterThan(String value) {
            addCriterion("exam_costState >", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateGreaterThanOrEqualTo(String value) {
            addCriterion("exam_costState >=", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateLessThan(String value) {
            addCriterion("exam_costState <", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateLessThanOrEqualTo(String value) {
            addCriterion("exam_costState <=", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateLike(String value) {
            addCriterion("exam_costState like", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateNotLike(String value) {
            addCriterion("exam_costState not like", value, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateIn(List<String> values) {
            addCriterion("exam_costState in", values, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateNotIn(List<String> values) {
            addCriterion("exam_costState not in", values, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateBetween(String value1, String value2) {
            addCriterion("exam_costState between", value1, value2, "examCoststate");
            return (Criteria) this;
        }

        public Criteria andExamCoststateNotBetween(String value1, String value2) {
            addCriterion("exam_costState not between", value1, value2, "examCoststate");
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