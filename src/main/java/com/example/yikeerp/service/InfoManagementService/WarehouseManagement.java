package com.example.yikeerp.service.InfoManagementService;

import com.example.yikeerp.dao.InfoManagementDao.WarehouseManagementDao;
import com.example.yikeerp.entity.InfoManagementEntity.warehouse.WarehouseInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class WarehouseManagement {
    @Resource
    private WarehouseManagementDao WarehouseManagementDao;

    public Collection<WarehouseInfo> generalView(){
        return WarehouseManagementDao.generalView();
    }
}
