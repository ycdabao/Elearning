package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyIsNull() {
            addCriterion("subject_createby is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyIsNotNull() {
            addCriterion("subject_createby is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyEqualTo(String value) {
            addCriterion("subject_createby =", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyNotEqualTo(String value) {
            addCriterion("subject_createby <>", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyGreaterThan(String value) {
            addCriterion("subject_createby >", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("subject_createby >=", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyLessThan(String value) {
            addCriterion("subject_createby <", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyLessThanOrEqualTo(String value) {
            addCriterion("subject_createby <=", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyLike(String value) {
            addCriterion("subject_createby like", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyNotLike(String value) {
            addCriterion("subject_createby not like", value, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyIn(List<String> values) {
            addCriterion("subject_createby in", values, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyNotIn(List<String> values) {
            addCriterion("subject_createby not in", values, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyBetween(String value1, String value2) {
            addCriterion("subject_createby between", value1, value2, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatebyNotBetween(String value1, String value2) {
            addCriterion("subject_createby not between", value1, value2, "subjectCreateby");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateIsNull() {
            addCriterion("subject_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateIsNotNull() {
            addCriterion("subject_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateEqualTo(Date value) {
            addCriterion("subject_createdate =", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateNotEqualTo(Date value) {
            addCriterion("subject_createdate <>", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateGreaterThan(Date value) {
            addCriterion("subject_createdate >", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("subject_createdate >=", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateLessThan(Date value) {
            addCriterion("subject_createdate <", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("subject_createdate <=", value, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateIn(List<Date> values) {
            addCriterion("subject_createdate in", values, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateNotIn(List<Date> values) {
            addCriterion("subject_createdate not in", values, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateBetween(Date value1, Date value2) {
            addCriterion("subject_createdate between", value1, value2, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andSubjectCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("subject_createdate not between", value1, value2, "subjectCreatedate");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyIsNull() {
            addCriterion("subject_modifyby is null");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyIsNotNull() {
            addCriterion("subject_modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyEqualTo(String value) {
            addCriterion("subject_modifyby =", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyNotEqualTo(String value) {
            addCriterion("subject_modifyby <>", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyGreaterThan(String value) {
            addCriterion("subject_modifyby >", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyGreaterThanOrEqualTo(String value) {
            addCriterion("subject_modifyby >=", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyLessThan(String value) {
            addCriterion("subject_modifyby <", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyLessThanOrEqualTo(String value) {
            addCriterion("subject_modifyby <=", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyLike(String value) {
            addCriterion("subject_modifyby like", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyNotLike(String value) {
            addCriterion("subject_modifyby not like", value, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyIn(List<String> values) {
            addCriterion("subject_modifyby in", values, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyNotIn(List<String> values) {
            addCriterion("subject_modifyby not in", values, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyBetween(String value1, String value2) {
            addCriterion("subject_modifyby between", value1, value2, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifybyNotBetween(String value1, String value2) {
            addCriterion("subject_modifyby not between", value1, value2, "subjectModifyby");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateIsNull() {
            addCriterion("subject_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateIsNotNull() {
            addCriterion("subject_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateEqualTo(Date value) {
            addCriterion("subject_modifydate =", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateNotEqualTo(Date value) {
            addCriterion("subject_modifydate <>", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateGreaterThan(Date value) {
            addCriterion("subject_modifydate >", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("subject_modifydate >=", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateLessThan(Date value) {
            addCriterion("subject_modifydate <", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateLessThanOrEqualTo(Date value) {
            addCriterion("subject_modifydate <=", value, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateIn(List<Date> values) {
            addCriterion("subject_modifydate in", values, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateNotIn(List<Date> values) {
            addCriterion("subject_modifydate not in", values, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateBetween(Date value1, Date value2) {
            addCriterion("subject_modifydate between", value1, value2, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectModifydateNotBetween(Date value1, Date value2) {
            addCriterion("subject_modifydate not between", value1, value2, "subjectModifydate");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNull() {
            addCriterion("subject_status is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIsNotNull() {
            addCriterion("subject_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusEqualTo(String value) {
            addCriterion("subject_status =", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotEqualTo(String value) {
            addCriterion("subject_status <>", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThan(String value) {
            addCriterion("subject_status >", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("subject_status >=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThan(String value) {
            addCriterion("subject_status <", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLessThanOrEqualTo(String value) {
            addCriterion("subject_status <=", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusLike(String value) {
            addCriterion("subject_status like", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotLike(String value) {
            addCriterion("subject_status not like", value, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusIn(List<String> values) {
            addCriterion("subject_status in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotIn(List<String> values) {
            addCriterion("subject_status not in", values, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusBetween(String value1, String value2) {
            addCriterion("subject_status between", value1, value2, "subjectStatus");
            return (Criteria) this;
        }

        public Criteria andSubjectStatusNotBetween(String value1, String value2) {
            addCriterion("subject_status not between", value1, value2, "subjectStatus");
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