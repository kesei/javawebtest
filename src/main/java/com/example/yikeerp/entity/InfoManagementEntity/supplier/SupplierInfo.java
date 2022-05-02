package com.example.yikeerp.entity.InfoManagementEntity.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplierInfo {
    private String SNo;
    private String SName;

    public SupplierInfo(){
    }
    public SupplierInfo(String SNo, String SName) {
        SNo = SNo;
        SName = SName;
    }

    @JsonProperty("SNo")
    public String getSNo() {
        return SNo;
    }
    public void setSNo(String SNo) {
        this.SNo = SNo;
    }
    @JsonProperty("SName")
    public String getSName() {
        return SName;
    }
    public void setSName(String SName) {
        this.SName = SName;
    }
}
