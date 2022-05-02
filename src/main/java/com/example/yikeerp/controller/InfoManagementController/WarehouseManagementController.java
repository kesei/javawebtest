package com.example.yikeerp.controller.InfoManagementController;

import com.example.yikeerp.entity.InfoManagementEntity.warehouse.WarehouseInfo;
import com.example.yikeerp.service.InfoManagementService.WarehouseManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/warehouseManagement")
public class WarehouseManagementController {
    @Resource
    private WarehouseManagement WarehouseManagement;

    @RequestMapping("/generalView")
    public Collection<WarehouseInfo> generalView(){
        return WarehouseManagement.generalView();
    }
}
