package com.example.yikeerp.controller.ShelfManagementController;

import com.example.yikeerp.entity.ShelfManagementEntity.sales.SalerecordInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.sales.SalerecordmanageInfo;
import com.example.yikeerp.service.ShelfManagementService.SalerecordManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/salesrecordManagement")
public class SalesrecordManagementController {
    @Resource
    private SalerecordManagement salerecordManagement;

    @RequestMapping("/init")
    public int init(){
        return salerecordManagement.init();
    }
    @RequestMapping("/view")
    public Collection<SalerecordInfo> view(@RequestBody SalerecordmanageInfo info){
        return salerecordManagement.view(info);
    }
    @RequestMapping("/search")
    public Collection<SalerecordInfo> search(@RequestBody SalerecordmanageInfo info){
        return salerecordManagement.search(info);
    }
}
