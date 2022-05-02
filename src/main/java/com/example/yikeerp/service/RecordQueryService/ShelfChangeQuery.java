package com.example.yikeerp.service.RecordQueryService;

import com.example.yikeerp.dao.RecordQueryDao.ShelfChangeQueryDao;
import com.example.yikeerp.entity.RecordQueryEntity.ShelfChange.ShelfChangeInfo;
import com.example.yikeerp.entity.RecordQueryEntity.ShelfChange.ShelfChangeQueryInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class ShelfChangeQuery {
    @Resource
    private ShelfChangeQueryDao shelfChangeQueryDao;

    public int init(){
        return shelfChangeQueryDao.init();
    }
    public Collection<ShelfChangeInfo> view(ShelfChangeQueryInfo info){
        return shelfChangeQueryDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<ShelfChangeInfo> search(ShelfChangeQueryInfo info){
        return shelfChangeQueryDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
