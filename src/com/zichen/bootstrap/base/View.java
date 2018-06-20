package com.zichen.bootstrap.base;

import java.util.Date;

public class View extends base {
    private String id;

    private Date createdate;

    private Date modifydate;

    private String viewname;

    private String viewpath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getViewname() {
        return viewname;
    }

    public void setViewname(String viewname) {
        this.viewname = viewname == null ? null : viewname.trim();
    }

    public String getViewpath() {
        return viewpath;
    }

    public void setViewpath(String viewpath) {
        this.viewpath = viewpath == null ? null : viewpath.trim();
    }
}