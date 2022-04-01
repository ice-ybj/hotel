package org.spring.springboot.domain;

public class Room {
    private Long RIN;
    private String building;
    private String floor;
    private String plate;
    private Long TIN;
    private Long RSIN;

    public Long getRIN() {
        return RIN;
    }

    public void setRIN(Long RIN) {
        this.RIN = RIN;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Long getRSIN() {
        return RSIN;
    }

    public void setRSIN(Long RSIN) {
        this.RSIN = RSIN;
    }

    public Long getTIN() {
        return TIN;
    }

    public void setTIN(Long TIN) {
        this.TIN = TIN;
    }

}
