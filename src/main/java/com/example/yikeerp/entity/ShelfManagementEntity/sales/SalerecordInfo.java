package com.example.yikeerp.entity.ShelfManagementEntity.sales;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalerecordInfo {
    private String OrderID;
    private String GNo;
    private String GName;
    private String CNo;
    private String CName;
    private String ENo;
    private String EName;
    private String BNo;
    private String STime;
    private int SNum;
    private float SPrice;
    private String GUnit;
    private float money;

    @JsonProperty("OrderID")
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
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
    @JsonProperty("BNo")
    public String getBNo() {
        return BNo;
    }

    public void setBNo(String BNo) {
        this.BNo = BNo;
    }
    @JsonProperty("Time")
    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }
    @JsonProperty("Num")
    public String getSNum() {
        return SNum+GUnit;
    }

    public void setSNum(int SNum) {
        this.SNum = SNum;
    }
    @JsonProperty("Price")
    public String getSPrice() {
        return SPrice+"元";
    }

    public void setSPrice(float SPrice) {
        this.SPrice = SPrice;
    }
    @JsonProperty("GUnit")
    public String getGUnit() {
        return GUnit;
    }

    public void setGUnit(String GUnit) {
        this.GUnit = GUnit;
    }
    @JsonProperty("Money")
    public float getMoney() {
        return SNum*SPrice;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
