package com.example.yikeerp.entity.InfoManagementEntity.customer;

import java.util.List;

public class CustomermanageInfo {
    private String No;
    private String Name;
    private String Gender;
    private String Tel;
    private String Expiry;
    private String type;
    private String text;
    private int limit;
    private int offset;
    private int length;
    private List<String> list;
    private String target;

    public CustomermanageInfo() {
    }

    public CustomermanageInfo(String no, String name, String gender, String tel, String expiry, String type, String text, int limit, int offset, int length, List<String> list, String target) {
        No = no;
        Name = name;
        Gender = gender;
        Tel = tel;
        Expiry = expiry;
        this.type = type;
        this.text = text;
        this.limit = limit;
        this.offset = offset;
        this.length = length;
        this.list = list;
        this.target = target;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getExpiry() {
        return Expiry;
    }

    public void setExpiry(String expiry) {
        Expiry = expiry;
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
        return "CustomermanageInfo{" +
                "No='" + No + '\'' +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Expiry='" + Expiry + '\'' +
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
