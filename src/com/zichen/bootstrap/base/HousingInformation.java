package com.zichen.bootstrap.base;

import java.util.Date;

public class HousingInformation extends Base {
    private String annalid;

    private Date createdate;

    private Date modifydate;

    private String title;

    private Integer price;

    private String publisher;

    private String publisherContact;

    private String photo;

    private String detailedInformation;

    private Boolean leasedState;

    private String dicdataid;

    private String comment;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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
        this.publisherContact = publisherContact == null ? null : publisherContact.trim();
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

    public String getDicdataid() {
        return dicdataid;
    }

    public void setDicdataid(String dicdataid) {
        this.dicdataid = dicdataid == null ? null : dicdataid.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}