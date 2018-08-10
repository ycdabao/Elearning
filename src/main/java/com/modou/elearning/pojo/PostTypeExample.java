package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PostTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostTypeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyIsNull() {
            addCriterion("type_createby is null");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyIsNotNull() {
            addCriterion("type_createby is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyEqualTo(String value) {
            addCriterion("type_createby =", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyNotEqualTo(String value) {
            addCriterion("type_createby <>", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyGreaterThan(String value) {
            addCriterion("type_createby >", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("type_createby >=", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyLessThan(String value) {
            addCriterion("type_createby <", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyLessThanOrEqualTo(String value) {
            addCriterion("type_createby <=", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyLike(String value) {
            addCriterion("type_createby like", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyNotLike(String value) {
            addCriterion("type_createby not like", value, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyIn(List<String> values) {
            addCriterion("type_createby in", values, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyNotIn(List<String> values) {
            addCriterion("type_createby not in", values, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyBetween(String value1, String value2) {
            addCriterion("type_createby between", value1, value2, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatebyNotBetween(String value1, String value2) {
            addCriterion("type_createby not between", value1, value2, "typeCreateby");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateIsNull() {
            addCriterion("type_createdate is null");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateIsNotNull() {
            addCriterion("type_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("type_createdate =", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("type_createdate <>", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("type_createdate >", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_createdate >=", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("type_createdate <", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_createdate <=", value, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("type_createdate in", values, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("type_createdate not in", values, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_createdate between", value1, value2, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_createdate not between", value1, value2, "typeCreatedate");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyIsNull() {
            addCriterion("type_modifyby is null");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyIsNotNull() {
            addCriterion("type_modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyEqualTo(String value) {
            addCriterion("type_modifyby =", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyNotEqualTo(String value) {
            addCriterion("type_modifyby <>", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyGreaterThan(String value) {
            addCriterion("type_modifyby >", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyGreaterThanOrEqualTo(String value) {
            addCriterion("type_modifyby >=", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyLessThan(String value) {
            addCriterion("type_modifyby <", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyLessThanOrEqualTo(String value) {
            addCriterion("type_modifyby <=", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyLike(String value) {
            addCriterion("type_modifyby like", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyNotLike(String value) {
            addCriterion("type_modifyby not like", value, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyIn(List<String> values) {
            addCriterion("type_modifyby in", values, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyNotIn(List<String> values) {
            addCriterion("type_modifyby not in", values, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyBetween(String value1, String value2) {
            addCriterion("type_modifyby between", value1, value2, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifybyNotBetween(String value1, String value2) {
            addCriterion("type_modifyby not between", value1, value2, "typeModifyby");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateIsNull() {
            addCriterion("type_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateIsNotNull() {
            addCriterion("type_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("type_modifydate =", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("type_modifydate <>", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("type_modifydate >", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_modifydate >=", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateLessThan(Date value) {
            addCriterionForJDBCDate("type_modifydate <", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_modifydate <=", value, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("type_modifydate in", values, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("type_modifydate not in", values, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_modifydate between", value1, value2, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_modifydate not between", value1, value2, "typeModifydate");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNull() {
            addCriterion("type_status is null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNotNull() {
            addCriterion("type_status is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusEqualTo(String value) {
            addCriterion("type_status =", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotEqualTo(String value) {
            addCriterion("type_status <>", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThan(String value) {
            addCriterion("type_status >", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("type_status >=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThan(String value) {
            addCriterion("type_status <", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThanOrEqualTo(String value) {
            addCriterion("type_status <=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLike(String value) {
            addCriterion("type_status like", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotLike(String value) {
            addCriterion("type_status not like", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIn(List<String> values) {
            addCriterion("type_status in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotIn(List<String> values) {
            addCriterion("type_status not in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusBetween(String value1, String value2) {
            addCriterion("type_status between", value1, value2, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotBetween(String value1, String value2) {
            addCriterion("type_status not between", value1, value2, "typeStatus");
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