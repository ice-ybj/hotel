package org.spring.springboot.domain;

import java.util.Date;

public class OrderRestock {
    private Long ORIN;
    private Long amount;
    private Long goodPrice;
    private String goodTitle;
    private Date orderTime;
    private Long totalPrice;

    public Long getORIN() {
        return ORIN;
    }

    public void setORIN(Long ORIN) {
        this.ORIN = ORIN;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Long goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodTitle() {
        return goodTitle;
    }

    public void setGoodTitle(String goodTitle) {
        this.goodTitle = goodTitle;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
