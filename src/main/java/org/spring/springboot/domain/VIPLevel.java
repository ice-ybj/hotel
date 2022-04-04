package org.spring.springboot.domain;

public class VIPLevel {
    private Long LV;
    private Double discount;
    private Double limitPoints;
    private String title;

    public Long getLV() {
        return LV;
    }

    public void setLV(Long LV) {
        this.LV = LV;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getLimitPoints() {
        return limitPoints;
    }

    public void setLimitPoints(Double limitPoints) {
        this.limitPoints = limitPoints;
    }
}
