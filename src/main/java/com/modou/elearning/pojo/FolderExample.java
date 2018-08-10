package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FolderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FolderExample() {
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

        public Criteria andFolderNameIsNull() {
            addCriterion("folder_name is null");
            return (Criteria) this;
        }

        public Criteria andFolderNameIsNotNull() {
            addCriterion("folder_name is not null");
            return (Criteria) this;
        }

        public Criteria andFolderNameEqualTo(String value) {
            addCriterion("folder_name =", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameNotEqualTo(String value) {
            addCriterion("folder_name <>", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameGreaterThan(String value) {
            addCriterion("folder_name >", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameGreaterThanOrEqualTo(String value) {
            addCriterion("folder_name >=", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameLessThan(String value) {
            addCriterion("folder_name <", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameLessThanOrEqualTo(String value) {
            addCriterion("folder_name <=", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameLike(String value) {
            addCriterion("folder_name like", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameNotLike(String value) {
            addCriterion("folder_name not like", value, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameIn(List<String> values) {
            addCriterion("folder_name in", values, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameNotIn(List<String> values) {
            addCriterion("folder_name not in", values, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameBetween(String value1, String value2) {
            addCriterion("folder_name between", value1, value2, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderNameNotBetween(String value1, String value2) {
            addCriterion("folder_name not between", value1, value2, "folderName");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyIsNull() {
            addCriterion("folder_createby is null");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyIsNotNull() {
            addCriterion("folder_createby is not null");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyEqualTo(String value) {
            addCriterion("folder_createby =", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyNotEqualTo(String value) {
            addCriterion("folder_createby <>", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyGreaterThan(String value) {
            addCriterion("folder_createby >", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("folder_createby >=", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyLessThan(String value) {
            addCriterion("folder_createby <", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyLessThanOrEqualTo(String value) {
            addCriterion("folder_createby <=", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyLike(String value) {
            addCriterion("folder_createby like", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyNotLike(String value) {
            addCriterion("folder_createby not like", value, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyIn(List<String> values) {
            addCriterion("folder_createby in", values, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyNotIn(List<String> values) {
            addCriterion("folder_createby not in", values, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyBetween(String value1, String value2) {
            addCriterion("folder_createby between", value1, value2, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatebyNotBetween(String value1, String value2) {
            addCriterion("folder_createby not between", value1, value2, "folderCreateby");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateIsNull() {
            addCriterion("folder_createdate is null");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateIsNotNull() {
            addCriterion("folder_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("folder_createdate =", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("folder_createdate <>", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("folder_createdate >", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("folder_createdate >=", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("folder_createdate <", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("folder_createdate <=", value, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("folder_createdate in", values, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("folder_createdate not in", values, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("folder_createdate between", value1, value2, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("folder_createdate not between", value1, value2, "folderCreatedate");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyIsNull() {
            addCriterion("folder_modifyby is null");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyIsNotNull() {
            addCriterion("folder_modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyEqualTo(String value) {
            addCriterion("folder_modifyby =", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyNotEqualTo(String value) {
            addCriterion("folder_modifyby <>", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyGreaterThan(String value) {
            addCriterion("folder_modifyby >", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyGreaterThanOrEqualTo(String value) {
            addCriterion("folder_modifyby >=", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyLessThan(String value) {
            addCriterion("folder_modifyby <", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyLessThanOrEqualTo(String value) {
            addCriterion("folder_modifyby <=", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyLike(String value) {
            addCriterion("folder_modifyby like", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyNotLike(String value) {
            addCriterion("folder_modifyby not like", value, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyIn(List<String> values) {
            addCriterion("folder_modifyby in", values, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyNotIn(List<String> values) {
            addCriterion("folder_modifyby not in", values, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyBetween(String value1, String value2) {
            addCriterion("folder_modifyby between", value1, value2, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifybyNotBetween(String value1, String value2) {
            addCriterion("folder_modifyby not between", value1, value2, "folderModifyby");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateIsNull() {
            addCriterion("folder_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateIsNotNull() {
            addCriterion("folder_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("folder_modifydate =", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("folder_modifydate <>", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("folder_modifydate >", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("folder_modifydate >=", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateLessThan(Date value) {
            addCriterionForJDBCDate("folder_modifydate <", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("folder_modifydate <=", value, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("folder_modifydate in", values, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("folder_modifydate not in", values, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("folder_modifydate between", value1, value2, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("folder_modifydate not between", value1, value2, "folderModifydate");
            return (Criteria) this;
        }

        public Criteria andFolderDescIsNull() {
            addCriterion("folder_desc is null");
            return (Criteria) this;
        }

        public Criteria andFolderDescIsNotNull() {
            addCriterion("folder_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFolderDescEqualTo(String value) {
            addCriterion("folder_desc =", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescNotEqualTo(String value) {
            addCriterion("folder_desc <>", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescGreaterThan(String value) {
            addCriterion("folder_desc >", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescGreaterThanOrEqualTo(String value) {
            addCriterion("folder_desc >=", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescLessThan(String value) {
            addCriterion("folder_desc <", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescLessThanOrEqualTo(String value) {
            addCriterion("folder_desc <=", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescLike(String value) {
            addCriterion("folder_desc like", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescNotLike(String value) {
            addCriterion("folder_desc not like", value, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescIn(List<String> values) {
            addCriterion("folder_desc in", values, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescNotIn(List<String> values) {
            addCriterion("folder_desc not in", values, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescBetween(String value1, String value2) {
            addCriterion("folder_desc between", value1, value2, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderDescNotBetween(String value1, String value2) {
            addCriterion("folder_desc not between", value1, value2, "folderDesc");
            return (Criteria) this;
        }

        public Criteria andFolderStatusIsNull() {
            addCriterion("folder_status is null");
            return (Criteria) this;
        }

        public Criteria andFolderStatusIsNotNull() {
            addCriterion("folder_status is not null");
            return (Criteria) this;
        }

        public Criteria andFolderStatusEqualTo(String value) {
            addCriterion("folder_status =", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusNotEqualTo(String value) {
            addCriterion("folder_status <>", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusGreaterThan(String value) {
            addCriterion("folder_status >", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("folder_status >=", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusLessThan(String value) {
            addCriterion("folder_status <", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusLessThanOrEqualTo(String value) {
            addCriterion("folder_status <=", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusLike(String value) {
            addCriterion("folder_status like", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusNotLike(String value) {
            addCriterion("folder_status not like", value, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusIn(List<String> values) {
            addCriterion("folder_status in", values, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusNotIn(List<String> values) {
            addCriterion("folder_status not in", values, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusBetween(String value1, String value2) {
            addCriterion("folder_status between", value1, value2, "folderStatus");
            return (Criteria) this;
        }

        public Criteria andFolderStatusNotBetween(String value1, String value2) {
            addCriterion("folder_status not between", value1, value2, "folderStatus");
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