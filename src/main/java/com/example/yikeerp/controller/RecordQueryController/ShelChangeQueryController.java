package com.example.yikeerp.controller.RecordQueryController;

import com.example.yikeerp.entity.RecordQueryEntity.ShelfChange.ShelfChangeInfo;
import com.example.yikeerp.entity.RecordQueryEntity.ShelfChange.ShelfChangeQueryInfo;
import com.example.yikeerp.service.RecordQueryService.ShelfChangeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/shelfChangeQuery")
public class ShelChangeQueryController {
    @Resource
    private ShelfChangeQuery shelfChangeQuery;

    @RequestMapping("/init")
    private int init(){
        return shelfChangeQuery.init();
    }
    @RequestMapping("/view")
    private Collection<ShelfChangeInfo> view(@RequestBody ShelfChangeQueryInfo info){
        return shelfChangeQuery.view(info);
    }
    @RequestMapping("/search")
    private Collection<ShelfChangeInfo> search(@RequestBody ShelfChangeQueryInfo info){
        return shelfChangeQuery.search(info);
    }
}
