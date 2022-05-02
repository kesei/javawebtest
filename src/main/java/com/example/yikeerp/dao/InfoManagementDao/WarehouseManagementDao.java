package com.example.yikeerp.dao.InfoManagementDao;

import com.example.yikeerp.entity.InfoManagementEntity.warehouse.WarehouseInfo;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface WarehouseManagementDao {
    @Select("SELECT * FROM Winfo")
    public Collection<WarehouseInfo> generalView();
}
