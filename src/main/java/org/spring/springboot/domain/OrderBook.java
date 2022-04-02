package org.spring.springboot.domain;

import java.util.Date;

public class OrderBook {
    private Long OBIN;
    private Long BSIN;
    private Date checkInTime;
    private Date checkOutTime;
    private Long discount;
    private Long finalPrice;
    private Date orderTime;
    private Long roomPrice;
    private String roomTypeTitle;
    private String roomerID;
    private String roomerName;
    private String roomerPhone;
    private Long vipLevel;


    public Long getOBIN() {
        return OBIN;
    }

    public void setOBIN(Long OBIN) {
        this.OBIN = OBIN;
    }

    public Long getBSIN() {
        return BSIN;
    }

    public void setBSIN(Long BSIN) {
        this.BSIN = BSIN;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Long finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomTypeTitle() {
        return roomTypeTitle;
    }

    public void setRoomTypeTitle(String roomTypeTitle) {
        this.roomTypeTitle = roomTypeTitle;
    }

    public String getRoomerID() {
        return roomerID;
    }

    public void setRoomerID(String roomerID) {
        this.roomerID = roomerID;
    }

    public String getRoomerName() {
        return roomerName;
    }

    public void setRoomerName(String roomerName) {
        this.roomerName = roomerName;
    }

    public String getRoomerPhone() {
        return roomerPhone;
    }

    public void setRoomerPhone(String roomerPhone) {
        this.roomerPhone = roomerPhone;
    }

    public Long getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Long vipLevel) {
        this.vipLevel = vipLevel;
    }
}
