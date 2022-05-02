package com.example.yikeerp.entity.InfoManagementEntity.goods;

import java.util.List;

public class GoodsmanageInfo {
    private String No;
    private String Name;
    private String FCategory;
    private String SCategory;
    private String MCategory;
    private String Unit;
    private String Price;
    private String type;
    private String text;
    private int limit;
    private int offset;
    private int length;
    private List<String> list;
    private String target;

    public GoodsmanageInfo() {
    }

    public GoodsmanageInfo(String No, String Name, String FCategory, String SCategory, String MCategory, String Unit, String Price) {
        this.No = No;
        this.Name = Name;
        this.FCategory = FCategory;
        this.SCategory = SCategory;
        this.MCategory = MCategory;
        this.Unit = Unit;
        this.Price = Price;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        this.No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getFCategory() {
        return FCategory;
    }

    public void setFCategory(String FCategory) {
        this.FCategory = FCategory;
    }

    public String getSCategory() {
        return SCategory;
    }

    public void setSCategory(String SCategory) {
        this.SCategory = SCategory;
    }

    public String getMCategory() {
        return MCategory;
    }

    public void setMCategory(String MCategory) {
        this.MCategory = MCategory;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        this.Unit = unit;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "No='" + No + '\'' +
                ", Name='" + Name + '\'' +
                ", FCategory='" + FCategory + '\'' +
                ", SCategory='" + SCategory + '\'' +
                ", MCategory='" + MCategory + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Price='" + Price + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", length=" + length +
                ", list=" + list +
                ", target='" + target + '\'' +
                '}';
    }
}
