package org.spring.springboot.domain;

public class RoomType {
    private Long TIN;
    private String facility;
    private Double price;
    private String title;


    public Long getTIN() {
        return TIN;
    }

    public void setTIN(Long TIN) {
        this.TIN = TIN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
