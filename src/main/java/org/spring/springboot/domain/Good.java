package org.spring.springboot.domain;

public class Good {
    private Long GIN;
    private Long inventory;
    private Double price;
    private String title;

    public Long getGIN() {
        return GIN;
    }

    public void setGIN(Long GIN) {
        this.GIN = GIN;
    }

    public Long getInventory() {
        return inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
