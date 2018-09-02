package com.modou.elearning.pojo;

import java.io.Serializable;

public class AuthFunction implements Serializable {
    private String id;

    private String functionName;

    private String functionCode;

    private String functionDescription;

    private String functionUrl;

    private String functionGeneratemenu;

    private Integer functionZindex;

    private String functionPid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
    }

    public String getFunctionDescription() {
        return functionDescription;
    }

    public void setFunctionDescription(String functionDescription) {
        this.functionDescription = functionDescription == null ? null : functionDescription.trim();
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    public String getFunctionGeneratemenu() {
        return functionGeneratemenu;
    }

    public void setFunctionGeneratemenu(String functionGeneratemenu) {
        this.functionGeneratemenu = functionGeneratemenu == null ? null : functionGeneratemenu.trim();
    }

    public Integer getFunctionZindex() {
        return functionZindex;
    }

    public void setFunctionZindex(Integer functionZindex) {
        this.functionZindex = functionZindex;
    }

    public String getFunctionPid() {
        return functionPid;
    }

    public void setFunctionPid(String functionPid) {
        this.functionPid = functionPid == null ? null : functionPid.trim();
    }
}