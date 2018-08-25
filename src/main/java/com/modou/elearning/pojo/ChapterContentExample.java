package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChapterContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterContentExample() {
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

        public Criteria andChapterIdIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(String value) {
            addCriterion("chapter_id =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(String value) {
            addCriterion("chapter_id <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(String value) {
            addCriterion("chapter_id >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_id >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(String value) {
            addCriterion("chapter_id <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(String value) {
            addCriterion("chapter_id <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLike(String value) {
            addCriterion("chapter_id like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotLike(String value) {
            addCriterion("chapter_id not like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<String> values) {
            addCriterion("chapter_id in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<String> values) {
            addCriterion("chapter_id not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(String value1, String value2) {
            addCriterion("chapter_id between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(String value1, String value2) {
            addCriterion("chapter_id not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameIsNull() {
            addCriterion("chapter_content_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameIsNotNull() {
            addCriterion("chapter_content_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameEqualTo(String value) {
            addCriterion("chapter_content_name =", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameNotEqualTo(String value) {
            addCriterion("chapter_content_name <>", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameGreaterThan(String value) {
            addCriterion("chapter_content_name >", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_content_name >=", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameLessThan(String value) {
            addCriterion("chapter_content_name <", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_content_name <=", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameLike(String value) {
            addCriterion("chapter_content_name like", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameNotLike(String value) {
            addCriterion("chapter_content_name not like", value, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameIn(List<String> values) {
            addCriterion("chapter_content_name in", values, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameNotIn(List<String> values) {
            addCriterion("chapter_content_name not in", values, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameBetween(String value1, String value2) {
            addCriterion("chapter_content_name between", value1, value2, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andChapterContentNameNotBetween(String value1, String value2) {
            addCriterion("chapter_content_name not between", value1, value2, "chapterContentName");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(String value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(String value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(String value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(String value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(String value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(String value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLike(String value) {
            addCriterion("free like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotLike(String value) {
            addCriterion("free not like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<String> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<String> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(String value1, String value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(String value1, String value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderIsNull() {
            addCriterion("chapter_content_order is null");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderIsNotNull() {
            addCriterion("chapter_content_order is not null");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderEqualTo(Integer value) {
            addCriterion("chapter_content_order =", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderNotEqualTo(Integer value) {
            addCriterion("chapter_content_order <>", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderGreaterThan(Integer value) {
            addCriterion("chapter_content_order >", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_content_order >=", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderLessThan(Integer value) {
            addCriterion("chapter_content_order <", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_content_order <=", value, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderIn(List<Integer> values) {
            addCriterion("chapter_content_order in", values, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderNotIn(List<Integer> values) {
            addCriterion("chapter_content_order not in", values, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderBetween(Integer value1, Integer value2) {
            addCriterion("chapter_content_order between", value1, value2, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_content_order not between", value1, value2, "chapterContentOrder");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateIsNull() {
            addCriterion("chapter_content_createdate is null");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateIsNotNull() {
            addCriterion("chapter_content_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateEqualTo(Date value) {
            addCriterion("chapter_content_createdate =", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateNotEqualTo(Date value) {
            addCriterion("chapter_content_createdate <>", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateGreaterThan(Date value) {
            addCriterion("chapter_content_createdate >", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("chapter_content_createdate >=", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateLessThan(Date value) {
            addCriterion("chapter_content_createdate <", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("chapter_content_createdate <=", value, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateIn(List<Date> values) {
            addCriterion("chapter_content_createdate in", values, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateNotIn(List<Date> values) {
            addCriterion("chapter_content_createdate not in", values, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateBetween(Date value1, Date value2) {
            addCriterion("chapter_content_createdate between", value1, value2, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("chapter_content_createdate not between", value1, value2, "chapterContentCreatedate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateIsNull() {
            addCriterion("chapter_content_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateIsNotNull() {
            addCriterion("chapter_content_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateEqualTo(Date value) {
            addCriterion("chapter_content_modifydate =", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateNotEqualTo(Date value) {
            addCriterion("chapter_content_modifydate <>", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateGreaterThan(Date value) {
            addCriterion("chapter_content_modifydate >", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("chapter_content_modifydate >=", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateLessThan(Date value) {
            addCriterion("chapter_content_modifydate <", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateLessThanOrEqualTo(Date value) {
            addCriterion("chapter_content_modifydate <=", value, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateIn(List<Date> values) {
            addCriterion("chapter_content_modifydate in", values, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateNotIn(List<Date> values) {
            addCriterion("chapter_content_modifydate not in", values, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateBetween(Date value1, Date value2) {
            addCriterion("chapter_content_modifydate between", value1, value2, "chapterContentModifydate");
            return (Criteria) this;
        }

        public Criteria andChapterContentModifydateNotBetween(Date value1, Date value2) {
            addCriterion("chapter_content_modifydate not between", value1, value2, "chapterContentModifydate");
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