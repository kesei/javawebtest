package com.example.yikeerp.entity.StorageManagementEntity;

import java.util.Collection;

public class StorageNames {
    private Collection<String> names;
    private String uploader_no;

    public Collection<String> getNames() {
        return names;
    }

    public void setNames(Collection<String> names) {
        this.names = names;
    }

    public String getUploader_no() {
        return uploader_no;
    }

    public void setUploader_no(String uploader_no) {
        this.uploader_no = uploader_no;
    }

    @Override
    public String toString() {
        return "StorageNames{" +
                "names=" + names +
                ", uploader_no='" + uploader_no + '\'' +
                '}';
    }
}
