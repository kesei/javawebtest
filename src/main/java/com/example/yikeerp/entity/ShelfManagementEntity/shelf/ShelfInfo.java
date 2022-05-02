package com.example.yikeerp.entity.ShelfManagementEntity.shelf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShelfInfo {
    private String BNo;
    private String GNo;
    private String GName;
    private String GFCategory;
    private String GSCategory;
    private String GMCategory;
    private int GNum;
    private String RUnit;
    private String Num;
    private float SPrice;
    private String No;
    private String type;
    private String text;

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
    @JsonProperty("GName")
    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
    }
    @JsonProperty("GFCategory")
    public String getGFCategory() {
        return GFCategory;
    }

    public void setGFCategory(String GFCategory) {
        this.GFCategory = GFCategory;
    }
    @JsonProperty("GSCategory")
    public String getGSCategory() {
        return GSCategory;
    }

    public void setGSCategory(String GSCategory) {
        this.GSCategory = GSCategory;
    }

    @JsonProperty("GMCategory")
    public String getGMCategory() {
        return GMCategory;
    }
    public void setGMCategory(String GMCategory) {
        this.GMCategory = GMCategory;
    }

    @JsonProperty("GNum")
    public int getGNum() {
        return GNum;
    }

    public void setGNum(int GNum) {
        this.GNum = GNum;
    }
    @JsonProperty("RUnit")
    public String getRUnit() {
        return RUnit;
    }
    @JsonProperty("Num")
    public String getNum() {
        return GNum+RUnit;
    }

    public void setNum(String num) {
        Num = num;
    }

    public void setRUnit(String RUnit) {
        this.RUnit = RUnit;
    }
    @JsonProperty("Price")
    public float getSPrice() {
        return SPrice;
    }

    public void setSPrice(float SPrice) {
        this.SPrice = SPrice;
    }
    @JsonProperty("No")
    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }
}
