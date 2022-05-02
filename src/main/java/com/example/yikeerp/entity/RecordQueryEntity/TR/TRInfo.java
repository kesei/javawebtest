package com.example.yikeerp.entity.RecordQueryEntity.TR;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TRInfo {
    private String GNo;
    private String ENo;
    private String fromWNo;
    private String toWNo;
    private int TNum;
    private String TTime;

    @JsonProperty("GNo")
    public String getGNo() {
        return GNo;
    }

    public void setGNo(String GNo) {
        this.GNo = GNo;
    }
    @JsonProperty("ENo")
    public String getENo() {
        return ENo;
    }

    public void setENo(String ENo) {
        this.ENo = ENo;
    }

    @JsonProperty("fromWNo")
    public String getFromWNo() {
        return fromWNo;
    }

    public void setFromWNo(String fromWNo) {
        this.fromWNo = fromWNo;
    }
    @JsonProperty("toWNo")
    public String getToWNo() {
        return toWNo;
    }

    public void setToWNo(String toWNo) {
        this.toWNo = toWNo;
    }
    @JsonProperty("Num")
    public int getTNum() {
        return TNum;
    }

    public void setTNum(int TNum) {
        this.TNum = TNum;
    }
    @JsonProperty("TTime")
    public String getTTime() {
        return TTime;
    }

    public void setTTime(String TTime) {
        this.TTime = TTime;
    }
}
