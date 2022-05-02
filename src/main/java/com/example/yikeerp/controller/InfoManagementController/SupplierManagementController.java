package com.example.yikeerp.controller.InfoManagementController;

import com.example.yikeerp.entity.InfoManagementEntity.supplier.SupplierInfo;
import com.example.yikeerp.entity.InfoManagementEntity.supplier.SuppliermanageInfo;
import com.example.yikeerp.service.InfoManagementService.SupplierManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/supplierManagement")
public class SupplierManagementController {
    @Resource
    private SupplierManagement supplierManagement;

    @RequestMapping("/init")
    public int init(){
        return supplierManagement.init();
    }
    @RequestMapping("/view")
    public Collection<SupplierInfo> view(@RequestBody SuppliermanageInfo info){
        return supplierManagement.view(info);
    }
    @RequestMapping("/add")
    public boolean add(@RequestBody SuppliermanageInfo info){
        return supplierManagement.add(info);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody SuppliermanageInfo info){
        return supplierManagement.sub(info);
    }
    @RequestMapping("/mod")
    public boolean mod(@RequestBody SuppliermanageInfo info){
        return supplierManagement.mod(info);
    }
    @RequestMapping("/search")
    public Collection<SupplierInfo> search(@RequestBody SuppliermanageInfo info){
        return supplierManagement.search(info);
    }
}
