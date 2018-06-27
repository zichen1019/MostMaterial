package com.zichen.bootstrap.base;

import java.util.Date;

public class Comment extends Base {
    private String annalid;

    private Date createtime;

    private String author;

    private String commentOn;

    private String parentid;

    public String getAnnalid() {
        return annalid;
    }

    public void setAnnalid(String annalid) {
        this.annalid = annalid == null ? null : annalid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCommentOn() {
        return commentOn;
    }

    public void setCommentOn(String commentOn) {
        this.commentOn = commentOn == null ? null : commentOn.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }
}