package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoursesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursesExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseType1IsNull() {
            addCriterion("course_type1 is null");
            return (Criteria) this;
        }

        public Criteria andCourseType1IsNotNull() {
            addCriterion("course_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseType1EqualTo(Integer value) {
            addCriterion("course_type1 =", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1NotEqualTo(Integer value) {
            addCriterion("course_type1 <>", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1GreaterThan(Integer value) {
            addCriterion("course_type1 >", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1GreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type1 >=", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1LessThan(Integer value) {
            addCriterion("course_type1 <", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1LessThanOrEqualTo(Integer value) {
            addCriterion("course_type1 <=", value, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1In(List<Integer> values) {
            addCriterion("course_type1 in", values, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1NotIn(List<Integer> values) {
            addCriterion("course_type1 not in", values, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1Between(Integer value1, Integer value2) {
            addCriterion("course_type1 between", value1, value2, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType1NotBetween(Integer value1, Integer value2) {
            addCriterion("course_type1 not between", value1, value2, "courseType1");
            return (Criteria) this;
        }

        public Criteria andCourseType2IsNull() {
            addCriterion("course_type2 is null");
            return (Criteria) this;
        }

        public Criteria andCourseType2IsNotNull() {
            addCriterion("course_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseType2EqualTo(Integer value) {
            addCriterion("course_type2 =", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2NotEqualTo(Integer value) {
            addCriterion("course_type2 <>", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2GreaterThan(Integer value) {
            addCriterion("course_type2 >", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2GreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type2 >=", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2LessThan(Integer value) {
            addCriterion("course_type2 <", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2LessThanOrEqualTo(Integer value) {
            addCriterion("course_type2 <=", value, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2In(List<Integer> values) {
            addCriterion("course_type2 in", values, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2NotIn(List<Integer> values) {
            addCriterion("course_type2 not in", values, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2Between(Integer value1, Integer value2) {
            addCriterion("course_type2 between", value1, value2, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType2NotBetween(Integer value1, Integer value2) {
            addCriterion("course_type2 not between", value1, value2, "courseType2");
            return (Criteria) this;
        }

        public Criteria andCourseType3IsNull() {
            addCriterion("course_type3 is null");
            return (Criteria) this;
        }

        public Criteria andCourseType3IsNotNull() {
            addCriterion("course_type3 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseType3EqualTo(Integer value) {
            addCriterion("course_type3 =", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3NotEqualTo(Integer value) {
            addCriterion("course_type3 <>", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3GreaterThan(Integer value) {
            addCriterion("course_type3 >", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3GreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type3 >=", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3LessThan(Integer value) {
            addCriterion("course_type3 <", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3LessThanOrEqualTo(Integer value) {
            addCriterion("course_type3 <=", value, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3In(List<Integer> values) {
            addCriterion("course_type3 in", values, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3NotIn(List<Integer> values) {
            addCriterion("course_type3 not in", values, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3Between(Integer value1, Integer value2) {
            addCriterion("course_type3 between", value1, value2, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseType3NotBetween(Integer value1, Integer value2) {
            addCriterion("course_type3 not between", value1, value2, "courseType3");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIsNull() {
            addCriterion("course_difficulty is null");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIsNotNull() {
            addCriterion("course_difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyEqualTo(String value) {
            addCriterion("course_difficulty =", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotEqualTo(String value) {
            addCriterion("course_difficulty <>", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyGreaterThan(String value) {
            addCriterion("course_difficulty >", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("course_difficulty >=", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyLessThan(String value) {
            addCriterion("course_difficulty <", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyLessThanOrEqualTo(String value) {
            addCriterion("course_difficulty <=", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyLike(String value) {
            addCriterion("course_difficulty like", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotLike(String value) {
            addCriterion("course_difficulty not like", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIn(List<String> values) {
            addCriterion("course_difficulty in", values, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotIn(List<String> values) {
            addCriterion("course_difficulty not in", values, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyBetween(String value1, String value2) {
            addCriterion("course_difficulty between", value1, value2, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotBetween(String value1, String value2) {
            addCriterion("course_difficulty not between", value1, value2, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryIsNull() {
            addCriterion("course_summary is null");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryIsNotNull() {
            addCriterion("course_summary is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryEqualTo(String value) {
            addCriterion("course_summary =", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryNotEqualTo(String value) {
            addCriterion("course_summary <>", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryGreaterThan(String value) {
            addCriterion("course_summary >", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("course_summary >=", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryLessThan(String value) {
            addCriterion("course_summary <", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryLessThanOrEqualTo(String value) {
            addCriterion("course_summary <=", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryLike(String value) {
            addCriterion("course_summary like", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryNotLike(String value) {
            addCriterion("course_summary not like", value, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryIn(List<String> values) {
            addCriterion("course_summary in", values, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryNotIn(List<String> values) {
            addCriterion("course_summary not in", values, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryBetween(String value1, String value2) {
            addCriterion("course_summary between", value1, value2, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseSummaryNotBetween(String value1, String value2) {
            addCriterion("course_summary not between", value1, value2, "courseSummary");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdIsNull() {
            addCriterion("course_crowd is null");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdIsNotNull() {
            addCriterion("course_crowd is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdEqualTo(String value) {
            addCriterion("course_crowd =", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdNotEqualTo(String value) {
            addCriterion("course_crowd <>", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdGreaterThan(String value) {
            addCriterion("course_crowd >", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdGreaterThanOrEqualTo(String value) {
            addCriterion("course_crowd >=", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdLessThan(String value) {
            addCriterion("course_crowd <", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdLessThanOrEqualTo(String value) {
            addCriterion("course_crowd <=", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdLike(String value) {
            addCriterion("course_crowd like", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdNotLike(String value) {
            addCriterion("course_crowd not like", value, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdIn(List<String> values) {
            addCriterion("course_crowd in", values, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdNotIn(List<String> values) {
            addCriterion("course_crowd not in", values, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdBetween(String value1, String value2) {
            addCriterion("course_crowd between", value1, value2, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseCrowdNotBetween(String value1, String value2) {
            addCriterion("course_crowd not between", value1, value2, "courseCrowd");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsIsNull() {
            addCriterion("course_details is null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsIsNotNull() {
            addCriterion("course_details is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsEqualTo(String value) {
            addCriterion("course_details =", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsNotEqualTo(String value) {
            addCriterion("course_details <>", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsGreaterThan(String value) {
            addCriterion("course_details >", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("course_details >=", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsLessThan(String value) {
            addCriterion("course_details <", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsLessThanOrEqualTo(String value) {
            addCriterion("course_details <=", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsLike(String value) {
            addCriterion("course_details like", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsNotLike(String value) {
            addCriterion("course_details not like", value, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsIn(List<String> values) {
            addCriterion("course_details in", values, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsNotIn(List<String> values) {
            addCriterion("course_details not in", values, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsBetween(String value1, String value2) {
            addCriterion("course_details between", value1, value2, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseDetailsNotBetween(String value1, String value2) {
            addCriterion("course_details not between", value1, value2, "courseDetails");
            return (Criteria) this;
        }

        public Criteria andCourseLabelIsNull() {
            addCriterion("course_label is null");
            return (Criteria) this;
        }

        public Criteria andCourseLabelIsNotNull() {
            addCriterion("course_label is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLabelEqualTo(String value) {
            addCriterion("course_label =", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelNotEqualTo(String value) {
            addCriterion("course_label <>", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelGreaterThan(String value) {
            addCriterion("course_label >", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelGreaterThanOrEqualTo(String value) {
            addCriterion("course_label >=", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelLessThan(String value) {
            addCriterion("course_label <", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelLessThanOrEqualTo(String value) {
            addCriterion("course_label <=", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelLike(String value) {
            addCriterion("course_label like", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelNotLike(String value) {
            addCriterion("course_label not like", value, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelIn(List<String> values) {
            addCriterion("course_label in", values, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelNotIn(List<String> values) {
            addCriterion("course_label not in", values, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelBetween(String value1, String value2) {
            addCriterion("course_label between", value1, value2, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseLabelNotBetween(String value1, String value2) {
            addCriterion("course_label not between", value1, value2, "courseLabel");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNull() {
            addCriterion("course_cover is null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNotNull() {
            addCriterion("course_cover is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverEqualTo(String value) {
            addCriterion("course_cover =", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotEqualTo(String value) {
            addCriterion("course_cover <>", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThan(String value) {
            addCriterion("course_cover >", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThanOrEqualTo(String value) {
            addCriterion("course_cover >=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThan(String value) {
            addCriterion("course_cover <", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThanOrEqualTo(String value) {
            addCriterion("course_cover <=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLike(String value) {
            addCriterion("course_cover like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotLike(String value) {
            addCriterion("course_cover not like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIn(List<String> values) {
            addCriterion("course_cover in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotIn(List<String> values) {
            addCriterion("course_cover not in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverBetween(String value1, String value2) {
            addCriterion("course_cover between", value1, value2, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotBetween(String value1, String value2) {
            addCriterion("course_cover not between", value1, value2, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeIsNull() {
            addCriterion("course_price_type is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeIsNotNull() {
            addCriterion("course_price_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeEqualTo(String value) {
            addCriterion("course_price_type =", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeNotEqualTo(String value) {
            addCriterion("course_price_type <>", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeGreaterThan(String value) {
            addCriterion("course_price_type >", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_price_type >=", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeLessThan(String value) {
            addCriterion("course_price_type <", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeLessThanOrEqualTo(String value) {
            addCriterion("course_price_type <=", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeLike(String value) {
            addCriterion("course_price_type like", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeNotLike(String value) {
            addCriterion("course_price_type not like", value, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeIn(List<String> values) {
            addCriterion("course_price_type in", values, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeNotIn(List<String> values) {
            addCriterion("course_price_type not in", values, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeBetween(String value1, String value2) {
            addCriterion("course_price_type between", value1, value2, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceTypeNotBetween(String value1, String value2) {
            addCriterion("course_price_type not between", value1, value2, "coursePriceType");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(Float value) {
            addCriterion("course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(Float value) {
            addCriterion("course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(Float value) {
            addCriterion("course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(Float value) {
            addCriterion("course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(Float value) {
            addCriterion("course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<Float> values) {
            addCriterion("course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<Float> values) {
            addCriterion("course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(Float value1, Float value2) {
            addCriterion("course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(Float value1, Float value2) {
            addCriterion("course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNull() {
            addCriterion("course_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNotNull() {
            addCriterion("course_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusEqualTo(String value) {
            addCriterion("course_status =", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotEqualTo(String value) {
            addCriterion("course_status <>", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThan(String value) {
            addCriterion("course_status >", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("course_status >=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThan(String value) {
            addCriterion("course_status <", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThanOrEqualTo(String value) {
            addCriterion("course_status <=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLike(String value) {
            addCriterion("course_status like", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotLike(String value) {
            addCriterion("course_status not like", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIn(List<String> values) {
            addCriterion("course_status in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotIn(List<String> values) {
            addCriterion("course_status not in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusBetween(String value1, String value2) {
            addCriterion("course_status between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotBetween(String value1, String value2) {
            addCriterion("course_status not between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyIsNull() {
            addCriterion("course_createby is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyIsNotNull() {
            addCriterion("course_createby is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyEqualTo(String value) {
            addCriterion("course_createby =", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyNotEqualTo(String value) {
            addCriterion("course_createby <>", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyGreaterThan(String value) {
            addCriterion("course_createby >", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("course_createby >=", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyLessThan(String value) {
            addCriterion("course_createby <", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyLessThanOrEqualTo(String value) {
            addCriterion("course_createby <=", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyLike(String value) {
            addCriterion("course_createby like", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyNotLike(String value) {
            addCriterion("course_createby not like", value, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyIn(List<String> values) {
            addCriterion("course_createby in", values, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyNotIn(List<String> values) {
            addCriterion("course_createby not in", values, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyBetween(String value1, String value2) {
            addCriterion("course_createby between", value1, value2, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatebyNotBetween(String value1, String value2) {
            addCriterion("course_createby not between", value1, value2, "courseCreateby");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateIsNull() {
            addCriterion("course_createdate is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateIsNotNull() {
            addCriterion("course_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateEqualTo(Date value) {
            addCriterion("course_createdate =", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateNotEqualTo(Date value) {
            addCriterion("course_createdate <>", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateGreaterThan(Date value) {
            addCriterion("course_createdate >", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_createdate >=", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateLessThan(Date value) {
            addCriterion("course_createdate <", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("course_createdate <=", value, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateIn(List<Date> values) {
            addCriterion("course_createdate in", values, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateNotIn(List<Date> values) {
            addCriterion("course_createdate not in", values, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateBetween(Date value1, Date value2) {
            addCriterion("course_createdate between", value1, value2, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("course_createdate not between", value1, value2, "courseCreatedate");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyIsNull() {
            addCriterion("course_modifyby is null");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyIsNotNull() {
            addCriterion("course_modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyEqualTo(String value) {
            addCriterion("course_modifyby =", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyNotEqualTo(String value) {
            addCriterion("course_modifyby <>", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyGreaterThan(String value) {
            addCriterion("course_modifyby >", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyGreaterThanOrEqualTo(String value) {
            addCriterion("course_modifyby >=", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyLessThan(String value) {
            addCriterion("course_modifyby <", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyLessThanOrEqualTo(String value) {
            addCriterion("course_modifyby <=", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyLike(String value) {
            addCriterion("course_modifyby like", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyNotLike(String value) {
            addCriterion("course_modifyby not like", value, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyIn(List<String> values) {
            addCriterion("course_modifyby in", values, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyNotIn(List<String> values) {
            addCriterion("course_modifyby not in", values, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyBetween(String value1, String value2) {
            addCriterion("course_modifyby between", value1, value2, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifybyNotBetween(String value1, String value2) {
            addCriterion("course_modifyby not between", value1, value2, "courseModifyby");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateIsNull() {
            addCriterion("course_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateIsNotNull() {
            addCriterion("course_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateEqualTo(Date value) {
            addCriterion("course_modifydate =", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateNotEqualTo(Date value) {
            addCriterion("course_modifydate <>", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateGreaterThan(Date value) {
            addCriterion("course_modifydate >", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_modifydate >=", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateLessThan(Date value) {
            addCriterion("course_modifydate <", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateLessThanOrEqualTo(Date value) {
            addCriterion("course_modifydate <=", value, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateIn(List<Date> values) {
            addCriterion("course_modifydate in", values, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateNotIn(List<Date> values) {
            addCriterion("course_modifydate not in", values, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateBetween(Date value1, Date value2) {
            addCriterion("course_modifydate between", value1, value2, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseModifydateNotBetween(Date value1, Date value2) {
            addCriterion("course_modifydate not between", value1, value2, "courseModifydate");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusIsNull() {
            addCriterion("course_check_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusIsNotNull() {
            addCriterion("course_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusEqualTo(String value) {
            addCriterion("course_check_status =", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusNotEqualTo(String value) {
            addCriterion("course_check_status <>", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusGreaterThan(String value) {
            addCriterion("course_check_status >", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("course_check_status >=", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusLessThan(String value) {
            addCriterion("course_check_status <", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("course_check_status <=", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusLike(String value) {
            addCriterion("course_check_status like", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusNotLike(String value) {
            addCriterion("course_check_status not like", value, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusIn(List<String> values) {
            addCriterion("course_check_status in", values, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusNotIn(List<String> values) {
            addCriterion("course_check_status not in", values, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusBetween(String value1, String value2) {
            addCriterion("course_check_status between", value1, value2, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseCheckStatusNotBetween(String value1, String value2) {
            addCriterion("course_check_status not between", value1, value2, "courseCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberIsNull() {
            addCriterion("course_student_number is null");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberIsNotNull() {
            addCriterion("course_student_number is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberEqualTo(Integer value) {
            addCriterion("course_student_number =", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberNotEqualTo(Integer value) {
            addCriterion("course_student_number <>", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberGreaterThan(Integer value) {
            addCriterion("course_student_number >", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_student_number >=", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberLessThan(Integer value) {
            addCriterion("course_student_number <", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("course_student_number <=", value, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberIn(List<Integer> values) {
            addCriterion("course_student_number in", values, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberNotIn(List<Integer> values) {
            addCriterion("course_student_number not in", values, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberBetween(Integer value1, Integer value2) {
            addCriterion("course_student_number between", value1, value2, "courseStudentNumber");
            return (Criteria) this;
        }

        public Criteria andCourseStudentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("course_student_number not between", value1, value2, "courseStudentNumber");
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