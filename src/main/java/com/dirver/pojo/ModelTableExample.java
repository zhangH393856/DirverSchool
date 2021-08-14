package com.dirver.pojo;

import java.util.ArrayList;
import java.util.List;

public class ModelTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelTableExample() {
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelA1costIsNull() {
            addCriterion("model_A1cost is null");
            return (Criteria) this;
        }

        public Criteria andModelA1costIsNotNull() {
            addCriterion("model_A1cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelA1costEqualTo(Double value) {
            addCriterion("model_A1cost =", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costNotEqualTo(Double value) {
            addCriterion("model_A1cost <>", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costGreaterThan(Double value) {
            addCriterion("model_A1cost >", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_A1cost >=", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costLessThan(Double value) {
            addCriterion("model_A1cost <", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costLessThanOrEqualTo(Double value) {
            addCriterion("model_A1cost <=", value, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costIn(List<Double> values) {
            addCriterion("model_A1cost in", values, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costNotIn(List<Double> values) {
            addCriterion("model_A1cost not in", values, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costBetween(Double value1, Double value2) {
            addCriterion("model_A1cost between", value1, value2, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA1costNotBetween(Double value1, Double value2) {
            addCriterion("model_A1cost not between", value1, value2, "modelA1cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costIsNull() {
            addCriterion("model_A2cost is null");
            return (Criteria) this;
        }

        public Criteria andModelA2costIsNotNull() {
            addCriterion("model_A2cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelA2costEqualTo(Double value) {
            addCriterion("model_A2cost =", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costNotEqualTo(Double value) {
            addCriterion("model_A2cost <>", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costGreaterThan(Double value) {
            addCriterion("model_A2cost >", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_A2cost >=", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costLessThan(Double value) {
            addCriterion("model_A2cost <", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costLessThanOrEqualTo(Double value) {
            addCriterion("model_A2cost <=", value, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costIn(List<Double> values) {
            addCriterion("model_A2cost in", values, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costNotIn(List<Double> values) {
            addCriterion("model_A2cost not in", values, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costBetween(Double value1, Double value2) {
            addCriterion("model_A2cost between", value1, value2, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA2costNotBetween(Double value1, Double value2) {
            addCriterion("model_A2cost not between", value1, value2, "modelA2cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costIsNull() {
            addCriterion("model_A3cost is null");
            return (Criteria) this;
        }

        public Criteria andModelA3costIsNotNull() {
            addCriterion("model_A3cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelA3costEqualTo(Double value) {
            addCriterion("model_A3cost =", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costNotEqualTo(Double value) {
            addCriterion("model_A3cost <>", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costGreaterThan(Double value) {
            addCriterion("model_A3cost >", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_A3cost >=", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costLessThan(Double value) {
            addCriterion("model_A3cost <", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costLessThanOrEqualTo(Double value) {
            addCriterion("model_A3cost <=", value, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costIn(List<Double> values) {
            addCriterion("model_A3cost in", values, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costNotIn(List<Double> values) {
            addCriterion("model_A3cost not in", values, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costBetween(Double value1, Double value2) {
            addCriterion("model_A3cost between", value1, value2, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelA3costNotBetween(Double value1, Double value2) {
            addCriterion("model_A3cost not between", value1, value2, "modelA3cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costIsNull() {
            addCriterion("model_B1cost is null");
            return (Criteria) this;
        }

        public Criteria andModelB1costIsNotNull() {
            addCriterion("model_B1cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelB1costEqualTo(Double value) {
            addCriterion("model_B1cost =", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costNotEqualTo(Double value) {
            addCriterion("model_B1cost <>", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costGreaterThan(Double value) {
            addCriterion("model_B1cost >", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_B1cost >=", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costLessThan(Double value) {
            addCriterion("model_B1cost <", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costLessThanOrEqualTo(Double value) {
            addCriterion("model_B1cost <=", value, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costIn(List<Double> values) {
            addCriterion("model_B1cost in", values, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costNotIn(List<Double> values) {
            addCriterion("model_B1cost not in", values, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costBetween(Double value1, Double value2) {
            addCriterion("model_B1cost between", value1, value2, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB1costNotBetween(Double value1, Double value2) {
            addCriterion("model_B1cost not between", value1, value2, "modelB1cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costIsNull() {
            addCriterion("model_B2cost is null");
            return (Criteria) this;
        }

        public Criteria andModelB2costIsNotNull() {
            addCriterion("model_B2cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelB2costEqualTo(Double value) {
            addCriterion("model_B2cost =", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costNotEqualTo(Double value) {
            addCriterion("model_B2cost <>", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costGreaterThan(Double value) {
            addCriterion("model_B2cost >", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_B2cost >=", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costLessThan(Double value) {
            addCriterion("model_B2cost <", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costLessThanOrEqualTo(Double value) {
            addCriterion("model_B2cost <=", value, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costIn(List<Double> values) {
            addCriterion("model_B2cost in", values, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costNotIn(List<Double> values) {
            addCriterion("model_B2cost not in", values, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costBetween(Double value1, Double value2) {
            addCriterion("model_B2cost between", value1, value2, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelB2costNotBetween(Double value1, Double value2) {
            addCriterion("model_B2cost not between", value1, value2, "modelB2cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costIsNull() {
            addCriterion("model_C1cost is null");
            return (Criteria) this;
        }

        public Criteria andModelC1costIsNotNull() {
            addCriterion("model_C1cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelC1costEqualTo(Double value) {
            addCriterion("model_C1cost =", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costNotEqualTo(Double value) {
            addCriterion("model_C1cost <>", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costGreaterThan(Double value) {
            addCriterion("model_C1cost >", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_C1cost >=", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costLessThan(Double value) {
            addCriterion("model_C1cost <", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costLessThanOrEqualTo(Double value) {
            addCriterion("model_C1cost <=", value, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costIn(List<Double> values) {
            addCriterion("model_C1cost in", values, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costNotIn(List<Double> values) {
            addCriterion("model_C1cost not in", values, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costBetween(Double value1, Double value2) {
            addCriterion("model_C1cost between", value1, value2, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC1costNotBetween(Double value1, Double value2) {
            addCriterion("model_C1cost not between", value1, value2, "modelC1cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costIsNull() {
            addCriterion("model_C2cost is null");
            return (Criteria) this;
        }

        public Criteria andModelC2costIsNotNull() {
            addCriterion("model_C2cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelC2costEqualTo(Double value) {
            addCriterion("model_C2cost =", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costNotEqualTo(Double value) {
            addCriterion("model_C2cost <>", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costGreaterThan(Double value) {
            addCriterion("model_C2cost >", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_C2cost >=", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costLessThan(Double value) {
            addCriterion("model_C2cost <", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costLessThanOrEqualTo(Double value) {
            addCriterion("model_C2cost <=", value, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costIn(List<Double> values) {
            addCriterion("model_C2cost in", values, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costNotIn(List<Double> values) {
            addCriterion("model_C2cost not in", values, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costBetween(Double value1, Double value2) {
            addCriterion("model_C2cost between", value1, value2, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC2costNotBetween(Double value1, Double value2) {
            addCriterion("model_C2cost not between", value1, value2, "modelC2cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costIsNull() {
            addCriterion("model_C3cost is null");
            return (Criteria) this;
        }

        public Criteria andModelC3costIsNotNull() {
            addCriterion("model_C3cost is not null");
            return (Criteria) this;
        }

        public Criteria andModelC3costEqualTo(Double value) {
            addCriterion("model_C3cost =", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costNotEqualTo(Double value) {
            addCriterion("model_C3cost <>", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costGreaterThan(Double value) {
            addCriterion("model_C3cost >", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costGreaterThanOrEqualTo(Double value) {
            addCriterion("model_C3cost >=", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costLessThan(Double value) {
            addCriterion("model_C3cost <", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costLessThanOrEqualTo(Double value) {
            addCriterion("model_C3cost <=", value, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costIn(List<Double> values) {
            addCriterion("model_C3cost in", values, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costNotIn(List<Double> values) {
            addCriterion("model_C3cost not in", values, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costBetween(Double value1, Double value2) {
            addCriterion("model_C3cost between", value1, value2, "modelC3cost");
            return (Criteria) this;
        }

        public Criteria andModelC3costNotBetween(Double value1, Double value2) {
            addCriterion("model_C3cost not between", value1, value2, "modelC3cost");
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