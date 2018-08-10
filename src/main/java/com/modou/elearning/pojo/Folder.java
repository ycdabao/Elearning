package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class Folder implements Serializable {
    private String id;

    private String folderName;

    private String folderCreateby;

    private Date folderCreatedate;

    private String folderModifyby;

    private Date folderModifydate;

    private String folderDesc;

    private String folderStatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    public String getFolderCreateby() {
        return folderCreateby;
    }

    public void setFolderCreateby(String folderCreateby) {
        this.folderCreateby = folderCreateby == null ? null : folderCreateby.trim();
    }

    public Date getFolderCreatedate() {
        return folderCreatedate;
    }

    public void setFolderCreatedate(Date folderCreatedate) {
        this.folderCreatedate = folderCreatedate;
    }

    public String getFolderModifyby() {
        return folderModifyby;
    }

    public void setFolderModifyby(String folderModifyby) {
        this.folderModifyby = folderModifyby == null ? null : folderModifyby.trim();
    }

    public Date getFolderModifydate() {
        return folderModifydate;
    }

    public void setFolderModifydate(Date folderModifydate) {
        this.folderModifydate = folderModifydate;
    }

    public String getFolderDesc() {
        return folderDesc;
    }

    public void setFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc == null ? null : folderDesc.trim();
    }

    public String getFolderStatus() {
        return folderStatus;
    }

    public void setFolderStatus(String folderStatus) {
        this.folderStatus = folderStatus == null ? null : folderStatus.trim();
    }
}