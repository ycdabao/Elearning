package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Courses implements Serializable {
    private String id;

    private String courseName;

    private Integer courseType1;

    private Integer courseType2;

    private Integer courseType3;

    private String courseDifficulty;

    private String courseSummary;

    private String courseCrowd;

    private String courseDetails;

    private String courseLabel;

    private String courseCover;

    private String coursePriceType;

    private Float coursePrice;

    private String courseStatus;

    private String courseCreateby;

    private Date courseCreatedate;

    private String courseModifyby;

    private Date courseModifydate;

    private String courseCheckStatus;

    private Integer courseStudentNumber;

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    private List<Chapter> chapterList = new ArrayList<Chapter>();

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseType1() {
        return courseType1;
    }

    public void setCourseType1(Integer courseType1) {
        this.courseType1 = courseType1;
    }

    public Integer getCourseType2() {
        return courseType2;
    }

    public void setCourseType2(Integer courseType2) {
        this.courseType2 = courseType2;
    }

    public Integer getCourseType3() {
        return courseType3;
    }

    public void setCourseType3(Integer courseType3) {
        this.courseType3 = courseType3;
    }

    public String getCourseDifficulty() {
        return courseDifficulty;
    }

    public void setCourseDifficulty(String courseDifficulty) {
        this.courseDifficulty = courseDifficulty == null ? null : courseDifficulty.trim();
    }

    public String getCourseSummary() {
        return courseSummary;
    }

    public void setCourseSummary(String courseSummary) {
        this.courseSummary = courseSummary == null ? null : courseSummary.trim();
    }

    public String getCourseCrowd() {
        return courseCrowd;
    }

    public void setCourseCrowd(String courseCrowd) {
        this.courseCrowd = courseCrowd == null ? null : courseCrowd.trim();
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails == null ? null : courseDetails.trim();
    }

    public String getCourseLabel() {
        return courseLabel;
    }

    public void setCourseLabel(String courseLabel) {
        this.courseLabel = courseLabel == null ? null : courseLabel.trim();
    }

    public String getCourseCover() {
        return courseCover;
    }

    public void setCourseCover(String courseCover) {
        this.courseCover = courseCover == null ? null : courseCover.trim();
    }

    public String getCoursePriceType() {
        return coursePriceType;
    }

    public void setCoursePriceType(String coursePriceType) {
        this.coursePriceType = coursePriceType == null ? null : coursePriceType.trim();
    }

    public Float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Float coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus == null ? null : courseStatus.trim();
    }

    public String getCourseCreateby() {
        return courseCreateby;
    }

    public void setCourseCreateby(String courseCreateby) {
        this.courseCreateby = courseCreateby == null ? null : courseCreateby.trim();
    }

    public Date getCourseCreatedate() {
        return courseCreatedate;
    }

    public void setCourseCreatedate(Date courseCreatedate) {
        this.courseCreatedate = courseCreatedate;
    }

    public String getCourseModifyby() {
        return courseModifyby;
    }

    public void setCourseModifyby(String courseModifyby) {
        this.courseModifyby = courseModifyby == null ? null : courseModifyby.trim();
    }

    public Date getCourseModifydate() {
        return courseModifydate;
    }

    public void setCourseModifydate(Date courseModifydate) {
        this.courseModifydate = courseModifydate;
    }

    public String getCourseCheckStatus() {
        return courseCheckStatus;
    }

    public void setCourseCheckStatus(String courseCheckStatus) {
        this.courseCheckStatus = courseCheckStatus == null ? null : courseCheckStatus.trim();
    }

    public Integer getCourseStudentNumber() {
        return courseStudentNumber;
    }

    public void setCourseStudentNumber(Integer courseStudentNumber) {
        this.courseStudentNumber = courseStudentNumber;
    }
}