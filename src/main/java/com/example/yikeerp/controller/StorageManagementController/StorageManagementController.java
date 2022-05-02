package com.example.yikeerp.controller.StorageManagementController;

import com.example.yikeerp.entity.StorageManagementEntity.StorageInfo;
import com.example.yikeerp.entity.StorageManagementEntity.StorageManagementInfo;
import com.example.yikeerp.entity.StorageManagementEntity.StorageNames;
import com.example.yikeerp.service.StorageManagementService.StorageManagementService;
import com.fasterxml.jackson.core.JsonToken;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Collection;

@RestController
@RequestMapping("/storage")
public class StorageManagementController {
    @Resource
    private StorageManagementService storageManagementService;

    @RequestMapping("/init")
    public int init(){
        return storageManagementService.init();
    }
    @RequestMapping("/view")
    public Collection<StorageInfo> view(@RequestBody StorageManagementInfo info){
        return storageManagementService.view(info);
    }
    @RequestMapping("/upload")
    public boolean upload(MultipartFile file)  {
        return storageManagementService.upload(file);
    }
    @RequestMapping("/record")
    public boolean record(@RequestBody StorageNames names){
        return storageManagementService.record(names);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody StorageManagementInfo info){
        return storageManagementService.sub(info);
    }
    @RequestMapping("/search")
    public Collection<StorageInfo> search(@RequestBody StorageManagementInfo info){
        return storageManagementService.search(info);
    }
}
