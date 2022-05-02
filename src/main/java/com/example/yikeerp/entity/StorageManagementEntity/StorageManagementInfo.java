package com.example.yikeerp.entity.StorageManagementEntity;

import java.util.List;

public class StorageManagementInfo{
    private String text;
    private int limit;
    private int offset;
    private int length;
    private List<String> list;

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
}
