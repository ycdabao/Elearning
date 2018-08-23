package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class ChapterContent implements Serializable {
    private String id;

    private String chapterId;

    private String fileId;

    private String free;

    private Integer chapterContentOrder;

    private Date chapterContentCreatedate;

    private Date chapterContentModifydate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public Integer getChapterContentOrder() {
        return chapterContentOrder;
    }

    public void setChapterContentOrder(Integer chapterContentOrder) {
        this.chapterContentOrder = chapterContentOrder;
    }

    public Date getChapterContentCreatedate() {
        return chapterContentCreatedate;
    }

    public void setChapterContentCreatedate(Date chapterContentCreatedate) {
        this.chapterContentCreatedate = chapterContentCreatedate;
    }

    public Date getChapterContentModifydate() {
        return chapterContentModifydate;
    }

    public void setChapterContentModifydate(Date chapterContentModifydate) {
        this.chapterContentModifydate = chapterContentModifydate;
    }
}