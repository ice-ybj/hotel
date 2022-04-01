package org.spring.springboot.domain;

public class StatusBook {
    private Long BSIN;
    private String book_status_en;
    private String book_status_zh;

    public Long getBSIN() {
        return BSIN;
    }

    public void setBSIN(Long BSIN) {
        this.BSIN = BSIN;
    }

    public String getBook_status_en() {
        return book_status_en;
    }

    public void setBook_status_en(String book_status_en) {
        this.book_status_en = book_status_en;
    }

    public String getBook_status_zh() {
        return book_status_zh;
    }

    public void setBook_status_zh(String book_status_zh) {
        this.book_status_zh = book_status_zh;
    }
}
