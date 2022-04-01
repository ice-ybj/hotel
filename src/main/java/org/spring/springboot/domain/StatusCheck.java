package org.spring.springboot.domain;

public class StatusCheck {
    private Long CSIN;
    private String check_status_en;
    private String check_status_zh;

    public Long getCSIN() {
        return CSIN;
    }

    public void setCSIN(Long CSIN) {
        this.CSIN = CSIN;
    }

    public String getCheck_status_en() {
        return check_status_en;
    }

    public void setCheck_status_en(String check_status_en) {
        this.check_status_en = check_status_en;
    }

    public String getCheck_status_zh() {
        return check_status_zh;
    }

    public void setCheck_status_zh(String check_status_zh) {
        this.check_status_zh = check_status_zh;
    }
}
