package com.greenfox.reddit.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    long id;
    String title;
    String url;
    int likeCounter;
    @Temporal(TemporalType.DATE)
    Date date;

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.likeCounter = 0;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int n) {
        this.likeCounter += n;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
