package com.example.yikeerp.entity.InfoManagementEntity.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeInfo {
    private String ENo;
    private String EName;
    private String EGender;
    private String ETitle;

    @JsonProperty("ENo")
    public String getENo() {
        return ENo;
    }

    public void setENo(String ENo) {
        this.ENo = ENo;
    }
    @JsonProperty("EName")
    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }
    @JsonProperty("EGender")
    public String getEGender() {
        return EGender;
    }

    public void setEGender(String EGender) {
        this.EGender = EGender;
    }
    @JsonProperty("ETitle")
    public String getETitle() {
        return ETitle;
    }

    public void setETitle(String ETitle) {
        this.ETitle = ETitle;
    }
}
