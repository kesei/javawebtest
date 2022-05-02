package com.example.yikeerp.service.RecordQueryService;

import com.example.yikeerp.dao.RecordQueryDao.InventoryChangeQueryDao;
import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.InventoryChange.InventoryChangeInfo;
import com.example.yikeerp.entity.RecordQueryEntity.InventoryChange.InventoryChangeQueryInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class InventoryChangeQuery {
    @Resource
    private InventoryChangeQueryDao inventoryChangeQueryDao;

    public int init(){
        return inventoryChangeQueryDao.init();
    }
    public Collection<InventoryChangeInfo> view(InventoryChangeQueryInfo info){
        return inventoryChangeQueryDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<InventoryChangeInfo> search(InventoryChangeQueryInfo info){
        return inventoryChangeQueryDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
