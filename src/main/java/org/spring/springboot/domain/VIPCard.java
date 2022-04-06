package org.spring.springboot.domain;

public class VIPCard {
    private Long VIP;
    private String ID;
    private Long LV;
    private String name;
    private Double points;

    public Long getVIP() {
        return VIP;
    }

    public void setVIP(Long VIP) {
        this.VIP = VIP;
    }

    public Long getLV() {
        return LV;
    }

    public void setLV(Long LV) {
        this.LV = LV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
