package com.zichen.bootstrap.base;

public class HousingInformationWithBLOBs extends HousingInformation {
    private String visitors;

    private String likesPeople;

    private String comment;

    public String getVisitors() {
        return visitors;
    }

    public void setVisitors(String visitors) {
        this.visitors = visitors == null ? null : visitors.trim();
    }

    public String getLikesPeople() {
        return likesPeople;
    }

    public void setLikesPeople(String likesPeople) {
        this.likesPeople = likesPeople == null ? null : likesPeople.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}