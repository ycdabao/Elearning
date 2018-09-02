package com.modou.elearning.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comments implements Serializable {
    private String id;

    private String commentPostId;

    private Date commentDate;

    private String commentContent;

    private String userId;

    private String commentsStatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(String commentPostId) {
        this.commentPostId = commentPostId == null ? null : commentPostId.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCommentsStatus() {
        return commentsStatus;
    }

    public void setCommentsStatus(String commentsStatus) {
        this.commentsStatus = commentsStatus == null ? null : commentsStatus.trim();
    }
}