package com.zichen.bootstrap.base;

public class HousingInformationWithBLOBs extends HousingInformation {
    private String visitors;

    private String like;

    private String comment;

    public String getVisitors() {
        return visitors;
    }

    public void setVisitors(String visitors) {
        this.visitors = visitors == null ? null : visitors.trim();
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like == null ? null : like.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}