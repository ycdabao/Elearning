package com.modou.elearning.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilesExample() {
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

        public Criteria andFileCreatebyIsNull() {
            addCriterion("file_createby is null");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyIsNotNull() {
            addCriterion("file_createby is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyEqualTo(String value) {
            addCriterion("file_createby =", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyNotEqualTo(String value) {
            addCriterion("file_createby <>", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyGreaterThan(String value) {
            addCriterion("file_createby >", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("file_createby >=", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyLessThan(String value) {
            addCriterion("file_createby <", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyLessThanOrEqualTo(String value) {
            addCriterion("file_createby <=", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyLike(String value) {
            addCriterion("file_createby like", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyNotLike(String value) {
            addCriterion("file_createby not like", value, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyIn(List<String> values) {
            addCriterion("file_createby in", values, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyNotIn(List<String> values) {
            addCriterion("file_createby not in", values, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyBetween(String value1, String value2) {
            addCriterion("file_createby between", value1, value2, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatebyNotBetween(String value1, String value2) {
            addCriterion("file_createby not between", value1, value2, "fileCreateby");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateIsNull() {
            addCriterion("file_createdate is null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateIsNotNull() {
            addCriterion("file_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateEqualTo(Date value) {
            addCriterion("file_createdate =", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateNotEqualTo(Date value) {
            addCriterion("file_createdate <>", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateGreaterThan(Date value) {
            addCriterion("file_createdate >", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_createdate >=", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateLessThan(Date value) {
            addCriterion("file_createdate <", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("file_createdate <=", value, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateIn(List<Date> values) {
            addCriterion("file_createdate in", values, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateNotIn(List<Date> values) {
            addCriterion("file_createdate not in", values, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateBetween(Date value1, Date value2) {
            addCriterion("file_createdate between", value1, value2, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("file_createdate not between", value1, value2, "fileCreatedate");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("fileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("fileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("fileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("fileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("fileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("fileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("fileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("fileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("fileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("fileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("fileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("fileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("fileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFileCoverIsNull() {
            addCriterion("file_cover is null");
            return (Criteria) this;
        }

        public Criteria andFileCoverIsNotNull() {
            addCriterion("file_cover is not null");
            return (Criteria) this;
        }

        public Criteria andFileCoverEqualTo(String value) {
            addCriterion("file_cover =", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotEqualTo(String value) {
            addCriterion("file_cover <>", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverGreaterThan(String value) {
            addCriterion("file_cover >", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverGreaterThanOrEqualTo(String value) {
            addCriterion("file_cover >=", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLessThan(String value) {
            addCriterion("file_cover <", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLessThanOrEqualTo(String value) {
            addCriterion("file_cover <=", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLike(String value) {
            addCriterion("file_cover like", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotLike(String value) {
            addCriterion("file_cover not like", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverIn(List<String> values) {
            addCriterion("file_cover in", values, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotIn(List<String> values) {
            addCriterion("file_cover not in", values, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverBetween(String value1, String value2) {
            addCriterion("file_cover between", value1, value2, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotBetween(String value1, String value2) {
            addCriterion("file_cover not between", value1, value2, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileWidthIsNull() {
            addCriterion("file_width is null");
            return (Criteria) this;
        }

        public Criteria andFileWidthIsNotNull() {
            addCriterion("file_width is not null");
            return (Criteria) this;
        }

        public Criteria andFileWidthEqualTo(Integer value) {
            addCriterion("file_width =", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotEqualTo(Integer value) {
            addCriterion("file_width <>", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthGreaterThan(Integer value) {
            addCriterion("file_width >", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_width >=", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthLessThan(Integer value) {
            addCriterion("file_width <", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthLessThanOrEqualTo(Integer value) {
            addCriterion("file_width <=", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthIn(List<Integer> values) {
            addCriterion("file_width in", values, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotIn(List<Integer> values) {
            addCriterion("file_width not in", values, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthBetween(Integer value1, Integer value2) {
            addCriterion("file_width between", value1, value2, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("file_width not between", value1, value2, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileHeightIsNull() {
            addCriterion("file_height is null");
            return (Criteria) this;
        }

        public Criteria andFileHeightIsNotNull() {
            addCriterion("file_height is not null");
            return (Criteria) this;
        }

        public Criteria andFileHeightEqualTo(Integer value) {
            addCriterion("file_height =", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotEqualTo(Integer value) {
            addCriterion("file_height <>", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightGreaterThan(Integer value) {
            addCriterion("file_height >", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_height >=", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightLessThan(Integer value) {
            addCriterion("file_height <", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightLessThanOrEqualTo(Integer value) {
            addCriterion("file_height <=", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightIn(List<Integer> values) {
            addCriterion("file_height in", values, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotIn(List<Integer> values) {
            addCriterion("file_height not in", values, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightBetween(Integer value1, Integer value2) {
            addCriterion("file_height between", value1, value2, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("file_height not between", value1, value2, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileFolderIsNull() {
            addCriterion("file_folder is null");
            return (Criteria) this;
        }

        public Criteria andFileFolderIsNotNull() {
            addCriterion("file_folder is not null");
            return (Criteria) this;
        }

        public Criteria andFileFolderEqualTo(String value) {
            addCriterion("file_folder =", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderNotEqualTo(String value) {
            addCriterion("file_folder <>", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderGreaterThan(String value) {
            addCriterion("file_folder >", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderGreaterThanOrEqualTo(String value) {
            addCriterion("file_folder >=", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderLessThan(String value) {
            addCriterion("file_folder <", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderLessThanOrEqualTo(String value) {
            addCriterion("file_folder <=", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderLike(String value) {
            addCriterion("file_folder like", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderNotLike(String value) {
            addCriterion("file_folder not like", value, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderIn(List<String> values) {
            addCriterion("file_folder in", values, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderNotIn(List<String> values) {
            addCriterion("file_folder not in", values, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderBetween(String value1, String value2) {
            addCriterion("file_folder between", value1, value2, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileFolderNotBetween(String value1, String value2) {
            addCriterion("file_folder not between", value1, value2, "fileFolder");
            return (Criteria) this;
        }

        public Criteria andFileDurationIsNull() {
            addCriterion("file_duration is null");
            return (Criteria) this;
        }

        public Criteria andFileDurationIsNotNull() {
            addCriterion("file_duration is not null");
            return (Criteria) this;
        }

        public Criteria andFileDurationEqualTo(Long value) {
            addCriterion("file_duration =", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationNotEqualTo(Long value) {
            addCriterion("file_duration <>", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationGreaterThan(Long value) {
            addCriterion("file_duration >", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("file_duration >=", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationLessThan(Long value) {
            addCriterion("file_duration <", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationLessThanOrEqualTo(Long value) {
            addCriterion("file_duration <=", value, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationIn(List<Long> values) {
            addCriterion("file_duration in", values, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationNotIn(List<Long> values) {
            addCriterion("file_duration not in", values, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationBetween(Long value1, Long value2) {
            addCriterion("file_duration between", value1, value2, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileDurationNotBetween(Long value1, Long value2) {
            addCriterion("file_duration not between", value1, value2, "fileDuration");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Long value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Long value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Long value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Long value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Long value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Long> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Long> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Long value1, Long value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Long value1, Long value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileCountIsNull() {
            addCriterion("file_count is null");
            return (Criteria) this;
        }

        public Criteria andFileCountIsNotNull() {
            addCriterion("file_count is not null");
            return (Criteria) this;
        }

        public Criteria andFileCountEqualTo(Integer value) {
            addCriterion("file_count =", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountNotEqualTo(Integer value) {
            addCriterion("file_count <>", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountGreaterThan(Integer value) {
            addCriterion("file_count >", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_count >=", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountLessThan(Integer value) {
            addCriterion("file_count <", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountLessThanOrEqualTo(Integer value) {
            addCriterion("file_count <=", value, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountIn(List<Integer> values) {
            addCriterion("file_count in", values, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountNotIn(List<Integer> values) {
            addCriterion("file_count not in", values, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountBetween(Integer value1, Integer value2) {
            addCriterion("file_count between", value1, value2, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileCountNotBetween(Integer value1, Integer value2) {
            addCriterion("file_count not between", value1, value2, "fileCount");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesIsNull() {
            addCriterion("file_favorites is null");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesIsNotNull() {
            addCriterion("file_favorites is not null");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesEqualTo(Integer value) {
            addCriterion("file_favorites =", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesNotEqualTo(Integer value) {
            addCriterion("file_favorites <>", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesGreaterThan(Integer value) {
            addCriterion("file_favorites >", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_favorites >=", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesLessThan(Integer value) {
            addCriterion("file_favorites <", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesLessThanOrEqualTo(Integer value) {
            addCriterion("file_favorites <=", value, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesIn(List<Integer> values) {
            addCriterion("file_favorites in", values, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesNotIn(List<Integer> values) {
            addCriterion("file_favorites not in", values, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesBetween(Integer value1, Integer value2) {
            addCriterion("file_favorites between", value1, value2, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileFavoritesNotBetween(Integer value1, Integer value2) {
            addCriterion("file_favorites not between", value1, value2, "fileFavorites");
            return (Criteria) this;
        }

        public Criteria andFileShareIsNull() {
            addCriterion("file_share is null");
            return (Criteria) this;
        }

        public Criteria andFileShareIsNotNull() {
            addCriterion("file_share is not null");
            return (Criteria) this;
        }

        public Criteria andFileShareEqualTo(Integer value) {
            addCriterion("file_share =", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareNotEqualTo(Integer value) {
            addCriterion("file_share <>", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareGreaterThan(Integer value) {
            addCriterion("file_share >", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_share >=", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareLessThan(Integer value) {
            addCriterion("file_share <", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareLessThanOrEqualTo(Integer value) {
            addCriterion("file_share <=", value, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareIn(List<Integer> values) {
            addCriterion("file_share in", values, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareNotIn(List<Integer> values) {
            addCriterion("file_share not in", values, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareBetween(Integer value1, Integer value2) {
            addCriterion("file_share between", value1, value2, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileShareNotBetween(Integer value1, Integer value2) {
            addCriterion("file_share not between", value1, value2, "fileShare");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNull() {
            addCriterion("file_status is null");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNotNull() {
            addCriterion("file_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileStatusEqualTo(String value) {
            addCriterion("file_status =", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotEqualTo(String value) {
            addCriterion("file_status <>", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThan(String value) {
            addCriterion("file_status >", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThanOrEqualTo(String value) {
            addCriterion("file_status >=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThan(String value) {
            addCriterion("file_status <", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThanOrEqualTo(String value) {
            addCriterion("file_status <=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLike(String value) {
            addCriterion("file_status like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotLike(String value) {
            addCriterion("file_status not like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusIn(List<String> values) {
            addCriterion("file_status in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotIn(List<String> values) {
            addCriterion("file_status not in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusBetween(String value1, String value2) {
            addCriterion("file_status between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotBetween(String value1, String value2) {
            addCriterion("file_status not between", value1, value2, "fileStatus");
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