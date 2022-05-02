package com.example.yikeerp.entity.RecordQueryEntity;

public class SearchOnly {
    private String type;
    private String text;
    private int limit;
    private int offset;

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
        return "SearchOnly{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
