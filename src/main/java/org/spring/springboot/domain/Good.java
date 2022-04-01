package org.spring.springboot.domain;

public class Good {
    private Long GIN;
    private Long inventory;
    private Long price;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
