package com.example.yikeerp.entity.RecordQueryEntity.InventoryChange;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InventoryChangeInfo {
    private String ENo;
    private String Time;
    private String Content;

    @JsonProperty("ENo")
    public String getENo() {
        return ENo;
    }

    public void setENo(String ENo) {
        this.ENo = ENo;
    }
    @JsonProperty("Time")
    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
    @JsonProperty("Content")
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
