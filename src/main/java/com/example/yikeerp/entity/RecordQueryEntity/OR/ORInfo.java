package com.example.yikeerp.entity.RecordQueryEntity.OR;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ORInfo {
    private String GNo;
    private String ENo;
    private String WNo;
    private int ONum;
    private String OUnit;
    private String OTime;

    @JsonProperty("GNo")
    public String getGNo() {
        return GNo;
    }

    public void setGNo(String GNo) {
        this.GNo = GNo;
    }
    @JsonProperty("ENo")
    public String getENo() {
        return ENo;
    }

    public void setENo(String ENo) {
        this.ENo = ENo;
    }
    @JsonProperty("WNo")
    public String getWNo() {
        return WNo;
    }

    public void setWNo(String WNo) {
        this.WNo = WNo;
    }
    @JsonProperty("Num")
    public int getONum() {
        return ONum;
    }

    public void setONum(int ONum) {
        this.ONum = ONum;
    }
    @JsonProperty("Unit")
    public String getOUnit() {
        return OUnit;
    }

    public void setOUnit(String OUnit) {
        this.OUnit = OUnit;
    }
    @JsonProperty("Time")
    public String getOTime() {
        return OTime;
    }

    public void setOTime(String OTime) {
        this.OTime = OTime;
    }
}
