package com.zichen.bootstrap.base;

public class HousingInformationWithBLOBs extends HousingInformation {
    private String visitors;

    private String likesPeople;


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

}