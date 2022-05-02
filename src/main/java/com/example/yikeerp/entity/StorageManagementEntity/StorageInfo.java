package com.example.yikeerp.entity.StorageManagementEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StorageInfo {
    private String filename;
    private String uploader_no;
    private String EName;
    private String filepath;
    private String time;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUploader_no() {
        return uploader_no;
    }

    public void setUploader_no(String uploader_no) {
        this.uploader_no = uploader_no;
    }
    @JsonProperty("EName")
    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
