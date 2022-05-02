package com.example.yikeerp.controller.RecordQueryController;

import com.example.yikeerp.entity.RecordQueryEntity.OR.ORInfo;
import com.example.yikeerp.entity.RecordQueryEntity.OR.ORQueryInfo;
import com.example.yikeerp.service.RecordQueryService.ORQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/orQuery")
public class ORQueryController {
    @Resource
    private ORQuery orQuery;

    @RequestMapping("/init")
    public int init(){
        return orQuery.init();
    }
    @RequestMapping("/view")
    public Collection<ORInfo> view(@RequestBody ORQueryInfo info){
        return orQuery.view(info);
    }
    @RequestMapping("/search")
    public Collection<ORInfo> search(@RequestBody ORQueryInfo info){
        return orQuery.search(info);
    }
}
