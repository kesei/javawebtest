package com.example.yikeerp.entity.InfoManagementEntity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerInfo {
    private String CNo;
    private String CName;
    private String CGender;
    private String CTel;
    private String CExpiry;

    @JsonProperty("CNo")
    public String getCNo() {
        return CNo;
    }

    public void setCNo(String CNo) {
        this.CNo = CNo;
    }
    @JsonProperty("CName")
    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }
    @JsonProperty("CGender")
    public String getCGender() {
        return CGender;
    }

    public void setCGender(String CGender) {
        this.CGender = CGender;
    }
    @JsonProperty("CTel")
    public String getCTel() {
        return CTel;
    }

    public void setCTel(String CTel) {
        this.CTel = CTel;
    }
    @JsonProperty("CExpiry")
    public String getCExpiry() {
        return CExpiry;
    }

    public void setCExpiry(String CExpiry) {
        this.CExpiry = CExpiry;
    }
}
