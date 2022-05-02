package com.example.yikeerp.entity.InfoManagementEntity.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarehouseInfo {
    private String WNo;
    private String WName;
    private String WStatus;
    private int percentage;

    public WarehouseInfo() {
    }
    public WarehouseInfo(String WNo, String WName, String WStatus, int percentage) {
        this.WNo = WNo;
        this.WName = WName;
        this.WStatus = WStatus;
        this.percentage = percentage;
    }

    @JsonProperty("WNo")
    public String getWNo() {
        return WNo;
    }
    public void setWNo(String WNo) {
        this.WNo = WNo;
    }
    @JsonProperty("WName")
    public String getWName() {
        return WName;
    }
    public void setWName(String WName) {
        this.WName = WName;
    }
    @JsonProperty("WStatus")
    public String getWStatus() {
        return WStatus;
    }
    public void setWStatus(String WStatus) {
        this.WStatus = WStatus;
    }
    public int getPercentage() {
        return percentage;
    }
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "WarehouseInfo{" +
                "WNo='" + WNo + '\'' +
                ", WName='" + WName + '\'' +
                ", WStatus='" + WStatus + '\'' +
                '}';
    }
}
