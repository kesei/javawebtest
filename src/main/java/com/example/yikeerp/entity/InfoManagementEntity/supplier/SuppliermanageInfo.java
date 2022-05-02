package com.example.yikeerp.entity.InfoManagementEntity.supplier;

import java.util.List;

public class SuppliermanageInfo {
    private String SNo;
    private String SName;
    private String target;
    private String stype;
    private String stext;
    private int limit;
    private int offset;
    private List<String> list;
    private int length;

    public SuppliermanageInfo() {
    }

    public SuppliermanageInfo(String SNo, String SName, String target, String stype, String stext, int limit, int offset,List<String>list,int length) {
        this.SNo = SNo;
        this.SName = SName;
        this.target = target;
        this.stype = stype;
        this.stext = stext;
        this.limit = limit;
        this.offset = offset;
        this.list=list;
        this.length=length;
    }

    public String getSNo() {
        return SNo;
    }
    public void setSNo(String SNo) {
        this.SNo = SNo;
    }
    public String getSName() {
        return SName;
    }
    public void setSName(String SName) {
        this.SName = SName;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getStype() {
        return stype;
    }
    public void setStype(String stype) {
        this.stype = stype;
    }
    public String getStext() {
        return stext;
    }
    public void setStext(String stext) {
        this.stext = stext;
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
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SuppliermanageInfo{" +
                "SNo='" + SNo + '\'' +
                ", SName='" + SName + '\'' +
                ", target='" + target + '\'' +
                ", stype='" + stype + '\'' +
                ", stext='" + stext + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", list=" + list +
                ", length=" + length +
                '}';
    }
}
