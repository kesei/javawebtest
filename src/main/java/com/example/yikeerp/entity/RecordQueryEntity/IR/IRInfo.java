package com.example.yikeerp.entity.RecordQueryEntity.IR;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IRInfo {
    private String BNo;
    private String GNo;
    private String ENo;
    private String SNo;
    private String WNo;
    private int IRNum;
    private String IRTime;

    @JsonProperty("BNo")
    public String getBNo() {
        return BNo;
    }

    public void setBNo(String BNo) {
        this.BNo = BNo;
    }
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
    @JsonProperty("SNo")
    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }
    @JsonProperty("WNo")
    public String getWNo() {
        return WNo;
    }

    public void setWNo(String WNo) {
        this.WNo = WNo;
    }
    @JsonProperty("Num")
    public int getIRNum() {
        return IRNum;
    }

    public void setIRNum(int IRNum) {
        this.IRNum = IRNum;
    }
    @JsonProperty("Time")
    public String getIRTime() {
        return IRTime;
    }

    public void setIRTime(String IRTime) {
        this.IRTime = IRTime;
    }
}
