package com.example.yikeerp.controller.RecordQueryController;

import com.example.yikeerp.entity.RecordQueryEntity.IR.IRInfo;
import com.example.yikeerp.entity.RecordQueryEntity.IR.IRQueryInfo;
import com.example.yikeerp.service.RecordQueryService.IRQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/irQuery")
public class IRQueryController {
    @Resource
    private IRQuery irQuery;

    @RequestMapping("/init")
    public int init(){
        return irQuery.init();
    }
    @RequestMapping("/view")
    public Collection<IRInfo> view(@RequestBody IRQueryInfo info){
        return irQuery.view(info);
    }
    @RequestMapping("/search")
    public Collection<IRInfo> search(@RequestBody IRQueryInfo info){
        return irQuery.search(info);
    }
}
