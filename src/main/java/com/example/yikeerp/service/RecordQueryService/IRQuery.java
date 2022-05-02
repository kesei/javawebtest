package com.example.yikeerp.service.RecordQueryService;

import com.example.yikeerp.dao.RecordQueryDao.IRQueryDao;
import com.example.yikeerp.entity.RecordQueryEntity.IR.IRInfo;
import com.example.yikeerp.entity.RecordQueryEntity.IR.IRQueryInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class IRQuery {
    @Resource
    private IRQueryDao irQueryDao;

    public int init(){
        return irQueryDao.init();
    }
    public Collection<IRInfo> view(IRQueryInfo info){
        return irQueryDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<IRInfo> search(IRQueryInfo info){
        return irQueryDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
