package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable {
    private Integer id;

    private String subjectName;

    private String subjectCreateby;

    private Date subjectCreatedate;

    private Integer parentid;

    private String subjectModifyby;

    private Date subjectModifydate;

    private String subjectStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getSubjectCreateby() {
        return subjectCreateby;
    }

    public void setSubjectCreateby(String subjectCreateby) {
        this.subjectCreateby = subjectCreateby == null ? null : subjectCreateby.trim();
    }

    public Date getSubjectCreatedate() {
        return subjectCreatedate;
    }

    public void setSubjectCreatedate(Date subjectCreatedate) {
        this.subjectCreatedate = subjectCreatedate;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getSubjectModifyby() {
        return subjectModifyby;
    }

    public void setSubjectModifyby(String subjectModifyby) {
        this.subjectModifyby = subjectModifyby == null ? null : subjectModifyby.trim();
    }

    public Date getSubjectModifydate() {
        return subjectModifydate;
    }

    public void setSubjectModifydate(Date subjectModifydate) {
        this.subjectModifydate = subjectModifydate;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus == null ? null : subjectStatus.trim();
    }
}