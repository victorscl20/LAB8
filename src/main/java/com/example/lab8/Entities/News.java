package com.example.lab8.Entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
@Getter
@Setter
public class News implements Serializable {
    private String id;
    private String title;
    private String description;
    private String link;
    private Date feedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
    }
}
