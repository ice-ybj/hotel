package org.spring.springboot.domain;

public class VIPLevel {
    private Long LV;
    private Long discount;
    private Long limitPoints;
    private String title;

    public Long getLV() {
        return LV;
    }

    public void setLV(Long LV) {
        this.LV = LV;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getLimitPoints() {
        return limitPoints;
    }

    public void setLimitPoints(Long limitPoints) {
        this.limitPoints = limitPoints;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
