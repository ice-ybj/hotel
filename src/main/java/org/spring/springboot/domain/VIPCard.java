package org.spring.springboot.domain;

public class VIPCard {
    private Long VIP;
    private Long ID;
    private Long LV;
    private String name;
    private Double points;

    public Long getVIP() {
        return VIP;
    }

    public void setVIP(Long VIP) {
        this.VIP = VIP;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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
}
