package org.spring.springboot.domain;

public class RoomerRecord {
    private Long OCIN;
    private String roomerID;
    private String roomerName;

    public Long getOCIN() {
        return OCIN;
    }

    public void setOCIN(Long OCIN) {
        this.OCIN = OCIN;
    }

    public String getRoomerID() {
        return roomerID;
    }

    public void setRoomerID(String roomerID) {
        this.roomerID = roomerID;
    }

    public String getRoomerName() {
        return roomerName;
    }

    public void setRoomerName(String roomerName) {
        this.roomerName = roomerName;
    }
}
