package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class Files implements Serializable {
    private String id;

    private String fileCreateby;

    private Date fileCreatedate;

    private String filename;

    private String fileCover;

    private String fileType;

    private String fileFolder;

    private Long fileDuration;

    private Long fileSize;

    private Integer fileCount;

    private Integer fileFavorites;

    private Integer fileShare;

    private String fileStatus;

    private String fileContent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFileCreateby() {
        return fileCreateby;
    }

    public void setFileCreateby(String fileCreateby) {
        this.fileCreateby = fileCreateby == null ? null : fileCreateby.trim();
    }

    public Date getFileCreatedate() {
        return fileCreatedate;
    }

    public void setFileCreatedate(Date fileCreatedate) {
        this.fileCreatedate = fileCreatedate;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFileCover() {
        return fileCover;
    }

    public void setFileCover(String fileCover) {
        this.fileCover = fileCover == null ? null : fileCover.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileFolder() {
        return fileFolder;
    }

    public void setFileFolder(String fileFolder) {
        this.fileFolder = fileFolder == null ? null : fileFolder.trim();
    }

    public Long getFileDuration() {
        return fileDuration;
    }

    public void setFileDuration(Long fileDuration) {
        this.fileDuration = fileDuration;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Integer getFileFavorites() {
        return fileFavorites;
    }

    public void setFileFavorites(Integer fileFavorites) {
        this.fileFavorites = fileFavorites;
    }

    public Integer getFileShare() {
        return fileShare;
    }

    public void setFileShare(Integer fileShare) {
        this.fileShare = fileShare;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus == null ? null : fileStatus.trim();
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent == null ? null : fileContent.trim();
    }
}