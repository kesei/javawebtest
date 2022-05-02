package com.example.yikeerp.service.RecordQueryService;

import com.example.yikeerp.dao.RecordQueryDao.ORQueryDao;
import com.example.yikeerp.entity.RecordQueryEntity.OR.ORInfo;
import com.example.yikeerp.entity.RecordQueryEntity.OR.ORQueryInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class ORQuery {
    @Resource
    private ORQueryDao orQueryDao;

    public int init(){
        return orQueryDao.init();
    }
    public Collection<ORInfo> view(ORQueryInfo info){
        return orQueryDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<ORInfo> search(ORQueryInfo info){
        return orQueryDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
