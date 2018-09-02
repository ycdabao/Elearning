package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthFunctionExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionIsNull() {
            addCriterion("function_description is null");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionIsNotNull() {
            addCriterion("function_description is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionEqualTo(String value) {
            addCriterion("function_description =", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionNotEqualTo(String value) {
            addCriterion("function_description <>", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionGreaterThan(String value) {
            addCriterion("function_description >", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("function_description >=", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionLessThan(String value) {
            addCriterion("function_description <", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("function_description <=", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionLike(String value) {
            addCriterion("function_description like", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionNotLike(String value) {
            addCriterion("function_description not like", value, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionIn(List<String> values) {
            addCriterion("function_description in", values, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionNotIn(List<String> values) {
            addCriterion("function_description not in", values, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionBetween(String value1, String value2) {
            addCriterion("function_description between", value1, value2, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionDescriptionNotBetween(String value1, String value2) {
            addCriterion("function_description not between", value1, value2, "functionDescription");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNull() {
            addCriterion("function_url is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNotNull() {
            addCriterion("function_url is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlEqualTo(String value) {
            addCriterion("function_url =", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotEqualTo(String value) {
            addCriterion("function_url <>", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThan(String value) {
            addCriterion("function_url >", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("function_url >=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThan(String value) {
            addCriterion("function_url <", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThanOrEqualTo(String value) {
            addCriterion("function_url <=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLike(String value) {
            addCriterion("function_url like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotLike(String value) {
            addCriterion("function_url not like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIn(List<String> values) {
            addCriterion("function_url in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotIn(List<String> values) {
            addCriterion("function_url not in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlBetween(String value1, String value2) {
            addCriterion("function_url between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotBetween(String value1, String value2) {
            addCriterion("function_url not between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuIsNull() {
            addCriterion("function_generatemenu is null");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuIsNotNull() {
            addCriterion("function_generatemenu is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuEqualTo(String value) {
            addCriterion("function_generatemenu =", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuNotEqualTo(String value) {
            addCriterion("function_generatemenu <>", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuGreaterThan(String value) {
            addCriterion("function_generatemenu >", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuGreaterThanOrEqualTo(String value) {
            addCriterion("function_generatemenu >=", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuLessThan(String value) {
            addCriterion("function_generatemenu <", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuLessThanOrEqualTo(String value) {
            addCriterion("function_generatemenu <=", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuLike(String value) {
            addCriterion("function_generatemenu like", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuNotLike(String value) {
            addCriterion("function_generatemenu not like", value, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuIn(List<String> values) {
            addCriterion("function_generatemenu in", values, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuNotIn(List<String> values) {
            addCriterion("function_generatemenu not in", values, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuBetween(String value1, String value2) {
            addCriterion("function_generatemenu between", value1, value2, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionGeneratemenuNotBetween(String value1, String value2) {
            addCriterion("function_generatemenu not between", value1, value2, "functionGeneratemenu");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexIsNull() {
            addCriterion("function_zindex is null");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexIsNotNull() {
            addCriterion("function_zindex is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexEqualTo(Integer value) {
            addCriterion("function_zindex =", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexNotEqualTo(Integer value) {
            addCriterion("function_zindex <>", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexGreaterThan(Integer value) {
            addCriterion("function_zindex >", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("function_zindex >=", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexLessThan(Integer value) {
            addCriterion("function_zindex <", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexLessThanOrEqualTo(Integer value) {
            addCriterion("function_zindex <=", value, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexIn(List<Integer> values) {
            addCriterion("function_zindex in", values, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexNotIn(List<Integer> values) {
            addCriterion("function_zindex not in", values, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexBetween(Integer value1, Integer value2) {
            addCriterion("function_zindex between", value1, value2, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionZindexNotBetween(Integer value1, Integer value2) {
            addCriterion("function_zindex not between", value1, value2, "functionZindex");
            return (Criteria) this;
        }

        public Criteria andFunctionPidIsNull() {
            addCriterion("function_pid is null");
            return (Criteria) this;
        }

        public Criteria andFunctionPidIsNotNull() {
            addCriterion("function_pid is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionPidEqualTo(String value) {
            addCriterion("function_pid =", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidNotEqualTo(String value) {
            addCriterion("function_pid <>", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidGreaterThan(String value) {
            addCriterion("function_pid >", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidGreaterThanOrEqualTo(String value) {
            addCriterion("function_pid >=", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidLessThan(String value) {
            addCriterion("function_pid <", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidLessThanOrEqualTo(String value) {
            addCriterion("function_pid <=", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidLike(String value) {
            addCriterion("function_pid like", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidNotLike(String value) {
            addCriterion("function_pid not like", value, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidIn(List<String> values) {
            addCriterion("function_pid in", values, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidNotIn(List<String> values) {
            addCriterion("function_pid not in", values, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidBetween(String value1, String value2) {
            addCriterion("function_pid between", value1, value2, "functionPid");
            return (Criteria) this;
        }

        public Criteria andFunctionPidNotBetween(String value1, String value2) {
            addCriterion("function_pid not between", value1, value2, "functionPid");
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