package com.example.yikeerp.service.RecordQueryService;

import com.example.yikeerp.dao.RecordQueryDao.TRQueryDao;
import com.example.yikeerp.entity.RecordQueryEntity.TR.TRInfo;
import com.example.yikeerp.entity.RecordQueryEntity.TR.TRQueryInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class TRQuery {
    @Resource
    private TRQueryDao trQueryDao;

    public int init(){
        return trQueryDao.init();
    }
    public Collection<TRInfo> view(TRQueryInfo info){
        return trQueryDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<TRInfo> search(TRQueryInfo info){
        return trQueryDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
