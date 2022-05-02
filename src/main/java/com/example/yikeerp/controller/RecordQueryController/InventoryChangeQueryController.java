package com.example.yikeerp.controller.RecordQueryController;

import com.example.yikeerp.entity.RecordQueryEntity.InventoryChange.InventoryChangeInfo;
import com.example.yikeerp.entity.RecordQueryEntity.InventoryChange.InventoryChangeQueryInfo;
import com.example.yikeerp.service.RecordQueryService.InventoryChangeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/inventoryChangeQuery")
public class InventoryChangeQueryController {
    @Resource
    private InventoryChangeQuery inventoryChangeQuery;

    @RequestMapping("/init")
    public int init(){
        return inventoryChangeQuery.init();
    }
    @RequestMapping("/view")
    public Collection<InventoryChangeInfo> view(@RequestBody InventoryChangeQueryInfo info){
        return inventoryChangeQuery.view(info);
    }
    @RequestMapping("/search")
    public Collection<InventoryChangeInfo> search(@RequestBody InventoryChangeQueryInfo info){
        return inventoryChangeQuery.search(info);
    }
}
