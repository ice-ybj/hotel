package org.spring.springboot.domain;

import java.util.Date;

public class OrderCheck {
    private Long OCIN;
    private Long OBIN;
    private Long CSIN;
    private Date orderTime;
    private Date checkInTime;
    private Date checkOutTime;
    private String roomTypeTitle;
    private String roomPlate;
    private Double roomPrice;
    private Long VIP;
    private Long vipLevel;
    private Double discount;
    private Double finalPrice;

    public Long getOCIN() {
        return OCIN;
    }

    public void setOCIN(Long OCIN) {
        this.OCIN = OCIN;
    }

    public Long getOBIN() {
        return OBIN;
    }

    public void setOBIN(Long OBIN) {
        this.OBIN = OBIN;
    }

    public Long getCSIN() {
        return CSIN;
    }

    public void setCSIN(Long CSIN) {
        this.CSIN = CSIN;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
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

    public String getRoomTypeTitle() {
        return roomTypeTitle;
    }

    public void setRoomTypeTitle(String roomTypeTitle) {
        this.roomTypeTitle = roomTypeTitle;
    }

    public String getRoomPlate() {
        return roomPlate;
    }

    public void setRoomPlate(String roomPlate) {
        this.roomPlate = roomPlate;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Long getVIP() {
        return VIP;
    }

    public void setVIP(Long VIP) {
        this.VIP = VIP;
    }

    public Long getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Long vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
}