package com.example.yikeerp.entity.InfoManagementEntity.goods;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsInfo {
    private String GNo;
    private String GName;
    private String GFCategory;
    private String GSCategory;
    private String GMCategory;
    private String GUnit;
    private String GPrice;

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
    @JsonProperty("GUnit")
    public String getGUnit() {
        return GUnit;
    }

    public void setGUnit(String GUnit) {
        this.GUnit = GUnit;
    }
    @JsonProperty("GPrice")
    public String getGPrice() {
        return GPrice;
    }

    public void setGPrice(String GPrice) {
        this.GPrice = GPrice;
    }
}
