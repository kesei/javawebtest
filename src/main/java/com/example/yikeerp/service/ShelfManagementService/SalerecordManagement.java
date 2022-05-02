package com.example.yikeerp.service.ShelfManagementService;

import com.example.yikeerp.dao.ShelfManagementDao.SalerecordManagementDao;
import com.example.yikeerp.entity.ShelfManagementEntity.sales.SalerecordInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.sales.SalerecordmanageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class SalerecordManagement {
    @Resource
    private SalerecordManagementDao salerecordManagementDao;

    public int init(){
        return salerecordManagementDao.init();
    }
    public Collection<SalerecordInfo> view(SalerecordmanageInfo info){
        return salerecordManagementDao.view(info.getLimit(),info.getOffset());
    }
    public Collection<SalerecordInfo> search(SalerecordmanageInfo info){
        return salerecordManagementDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
