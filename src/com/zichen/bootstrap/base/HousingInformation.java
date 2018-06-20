package com.zichen.bootstrap.base;

import java.util.Date;

public class HousingInformation extends base {
    private String annalid;

    private Date createdate;

    private Date modifydate;

    private String title;

    private int price;

    private String publisher;

    private String publisherContact;

    private String photo;

    private String detailedInformation;

    private Boolean leasedState;

    public String getAnnalid() {
        return annalid;
    }

    public void setAnnalid(String annalid) {
        this.annalid = annalid == null ? null : annalid.trim();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getPublisherContact() {
        return publisherContact;
    }

    public void setPublisherContact(String publisherContact) {
        this.publisherContact = publisherContact;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getDetailedInformation() {
        return detailedInformation;
    }

    public void setDetailedInformation(String detailedInformation) {
        this.detailedInformation = detailedInformation == null ? null : detailedInformation.trim();
    }

    public Boolean getLeasedState() {
        return leasedState;
    }

    public void setLeasedState(Boolean leasedState) {
        this.leasedState = leasedState;
    }
}