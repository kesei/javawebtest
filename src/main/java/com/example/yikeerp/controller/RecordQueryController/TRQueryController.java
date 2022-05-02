package com.example.yikeerp.controller.RecordQueryController;

import com.example.yikeerp.entity.RecordQueryEntity.TR.TRInfo;
import com.example.yikeerp.entity.RecordQueryEntity.TR.TRQueryInfo;
import com.example.yikeerp.service.RecordQueryService.TRQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/trQuery")
public class TRQueryController {
    @Resource
    private TRQuery trQuery;

    @RequestMapping("/init")
    public int init(){
        return trQuery.init();
    }
    @RequestMapping("/view")
    public Collection<TRInfo> view(@RequestBody TRQueryInfo info){
        return trQuery.view(info);
    }
    @RequestMapping("/search")
    public Collection<TRInfo> search(@RequestBody TRQueryInfo info){
        return trQuery.search(info);
    }
}
