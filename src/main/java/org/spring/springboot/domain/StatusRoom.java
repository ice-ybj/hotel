package org.spring.springboot.domain;

public class StatusRoom {
    private Long RSIN;
    private String room_status_en;
    private String room_status_zh;

    public Long getRSIN() {
        return RSIN;
    }

    public void setRSIN(Long RSIN) {
        this.RSIN = RSIN;
    }

    public String getRoom_status_en() {
        return room_status_en;
    }

    public void setRoom_status_en(String room_status_en) {
        this.room_status_en = room_status_en;
    }

    public String getRoom_status_zh() {
        return room_status_zh;
    }

    public void setRoom_status_zh(String room_status_zh) {
        this.room_status_zh = room_status_zh;
    }

}
