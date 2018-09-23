package com.zichen.bootstrap.base;

import java.util.Date;

public class Comment {
    private String annalid;

    private Date createtime;

    private String authorid;

    private String remark;

    private String parentid;

    private String housingid;

    private String respondentid;

    private User user;

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

    public String getAuthorid() {
        return authorid;
    }

    public void setAuthorid(String authorid) {
        this.authorid = authorid == null ? null : authorid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getHousingid() {
        return housingid;
    }

    public void setHousingid(String housingid) {
        this.housingid = housingid == null ? null : housingid.trim();
    }

    public String getRespondentid() {
        return respondentid;
    }

    public void setRespondentid(String respondentid) {
        this.respondentid = respondentid == null ? null : respondentid.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}