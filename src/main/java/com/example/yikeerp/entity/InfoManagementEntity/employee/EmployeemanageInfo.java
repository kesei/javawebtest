package com.example.yikeerp.entity.InfoManagementEntity.employee;

public class EmployeemanageInfo {
    private String No;
    private String Name;
    private String Gender;
    private String Title;
    private String type;
    private String text;
    private int limit;
    private int offset;

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

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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

    @Override
    public String toString() {
        return "EmployeemanageInfo{" +
                "No='" + No + '\'' +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Title='" + Title + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
