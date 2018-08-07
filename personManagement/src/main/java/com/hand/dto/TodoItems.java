package com.hand.dto;

import java.io.Serializable;
import java.util.Date;

public class TodoItems extends BaseDTO implements Serializable {
    private Integer toDoItemId;
    private String userId;
    private String toDoItemTitle;
    private String toDoItemContent;
    private String priority;
    private Date creationDate;
    private Date lastUpdateDate;
    private String comments;


    public Integer getToDoItemId() {
        return toDoItemId;
    }

    public void setToDoItemId(Integer toDoItemId) {
        this.toDoItemId = toDoItemId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToDoItemTitle() {
        return toDoItemTitle;
    }

    public void setToDoItemTitle(String toDoItemTitle) {
        this.toDoItemTitle = toDoItemTitle;
    }

    public String getToDoItemContent() {
        return toDoItemContent;
    }

    public void setToDoItemContent(String toDoItemContent) {
        this.toDoItemContent = toDoItemContent;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}

