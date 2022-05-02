package com.example.yikeerp.entity.InventoryManagementEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InventoryInfo {
    private String BNo;
    private String WNo;
    private String WName;
    private String GNo;
    private String GName;
    private String SNo;
    private String SName;
    private String INum;
    private String IWUnit;
    private String ISpecs;
    private String GUnit;
    private String WNum;
    private String WR;

    @JsonProperty("BNo")
    public String getBNo() {
        return BNo;
    }

    public void setBNo(String BNo) {
        this.BNo = BNo;
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
    @JsonProperty("GNo")
    public String getGNo() {
        return GNo;
    }

    public void setGNo(String GNo) {
        this.GNo = GNo;
    }
    @JsonProperty("GName")
    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
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
    @JsonProperty("INum")
    public String getINum() {
        return INum;
    }

    public void setINum(String INum) {
        this.INum = INum;
    }
    @JsonProperty("IWUnit")
    public String getIWUnit() {
        return IWUnit;
    }

    public void setIWUnit(String IWUnit) {
        this.IWUnit = IWUnit;
    }
    @JsonProperty("ISpecs")
    public String getISpecs() {
        return ISpecs;
    }

    public void setISpecs(String ISpecs) {
        this.ISpecs = ISpecs;
    }
    @JsonProperty("IRUnit")
    public String getGUnit() {
        return GUnit;
    }

    public void setGUnit(String GUnit) {
        this.GUnit = GUnit;
    }
    @JsonProperty("WNum")
    public String getWNum() {
        return INum+IWUnit;
    }

    public void setWNum(String WNum) {
        this.WNum = WNum;
    }
    @JsonProperty("WR")
    public String getWR() {
        return ISpecs+GUnit+"/"+IWUnit;
    }

    public void setWR(String WR) {
        this.WR = WR;
    }
}
