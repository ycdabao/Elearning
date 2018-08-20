package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class Types implements Serializable {
    private Integer id;

    private String typeName;

    private String typeCreateby;

    private Date typeCreatedate;

    private Integer parentid;

    private String typeModifyby;

    private Date typeModifydate;

    private String typeStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeCreateby() {
        return typeCreateby;
    }

    public void setTypeCreateby(String typeCreateby) {
        this.typeCreateby = typeCreateby == null ? null : typeCreateby.trim();
    }

    public Date getTypeCreatedate() {
        return typeCreatedate;
    }

    public void setTypeCreatedate(Date typeCreatedate) {
        this.typeCreatedate = typeCreatedate;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getTypeModifyby() {
        return typeModifyby;
    }

    public void setTypeModifyby(String typeModifyby) {
        this.typeModifyby = typeModifyby == null ? null : typeModifyby.trim();
    }

    public Date getTypeModifydate() {
        return typeModifydate;
    }

    public void setTypeModifydate(Date typeModifydate) {
        this.typeModifydate = typeModifydate;
    }

    public String getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(String typeStatus) {
        this.typeStatus = typeStatus == null ? null : typeStatus.trim();
    }
}