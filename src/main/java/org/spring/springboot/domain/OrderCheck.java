package org.spring.springboot.domain;

import java.util.Date;

public class OrderCheck {
    private Long OCIN;
    private Long CSIN;
    private Date orderTime;
    private Date checkInTime;
    private Date checkOutTime;
    private String roomTypeTitle;
    private String roomPlate;
    private Long roomPrice;
    private Long VIP;
    private Long vipLevel;
    private Long discount;
    private Long finalPrice;
    private String paymentMethod;

    public Long getOCIN() {
        return OCIN;
    }

    public void setOCIN(Long OCIN) {
        this.OCIN = OCIN;
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

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long roomPrice) {
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}