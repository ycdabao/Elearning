package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Chapter implements Serializable {
    private String id;

    private String chapterCourseid;

    private String chapterName;

    private Integer chapterOrder;

    private Date chapterCreatedate;

    private Date chapterModifydate;

    public List<ChapterContent> getChapterContentList() {
        return chapterContentList;
    }

    public void setChapterContentList(List<ChapterContent> chapterContentList) {
        this.chapterContentList = chapterContentList;
    }

    private List<ChapterContent> chapterContentList = new ArrayList<ChapterContent>();

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChapterCourseid() {
        return chapterCourseid;
    }

    public void setChapterCourseid(String chapterCourseid) {
        this.chapterCourseid = chapterCourseid == null ? null : chapterCourseid.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public Integer getChapterOrder() {
        return chapterOrder;
    }

    public void setChapterOrder(Integer chapterOrder) {
        this.chapterOrder = chapterOrder;
    }

    public Date getChapterCreatedate() {
        return chapterCreatedate;
    }

    public void setChapterCreatedate(Date chapterCreatedate) {
        this.chapterCreatedate = chapterCreatedate;
    }

    public Date getChapterModifydate() {
        return chapterModifydate;
    }

    public void setChapterModifydate(Date chapterModifydate) {
        this.chapterModifydate = chapterModifydate;
    }
}