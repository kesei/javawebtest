package com.example.yikeerp.controller.InventoryManagementController;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.InventoryManagementEntity.InventoryManagementInfo;
import com.example.yikeerp.service.InventoryManagementService.InventoryManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/inventoryManagement")
public class InventoryManagementController {
    @Resource
    private InventoryManagement inventoryManagement;

    @RequestMapping("/init")
    public int init(){
        return inventoryManagement.init();
    }
    @RequestMapping("/view")
    public Collection<InventoryInfo> view(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.view(info);
    }
    @RequestMapping("/add")
    public boolean add(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.add(info);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.sub(info);
    }
    @RequestMapping("/mod")
    public boolean mod(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.mod(info);
    }
    @RequestMapping("/trans")
    public boolean trans(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.trans(info);
    }
    @RequestMapping("/search")
    public Collection<InventoryInfo> search(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.search(info);
    }
    @RequestMapping("/match")
    public String match(@RequestBody InventoryManagementInfo info){
        return inventoryManagement.infomatch(info);
    }
}
