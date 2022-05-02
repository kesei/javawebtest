package com.example.yikeerp.service.InfoManagementService;

import com.example.yikeerp.dao.InfoManagementDao.SupplierManagementDao;
import com.example.yikeerp.entity.InfoManagementEntity.supplier.SupplierInfo;
import com.example.yikeerp.entity.InfoManagementEntity.supplier.SuppliermanageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class SupplierManagement {
    @Resource
    private SupplierManagementDao supplierManagementDao;

    public int init(){
        return supplierManagementDao.init();
    }
    public Collection<SupplierInfo>view(SuppliermanageInfo info){
        try {
            return supplierManagementDao.view(info.getLimit(),info.getOffset());
        }catch (Exception e){
            return new ArrayList<SupplierInfo>();
        }
    }
    public boolean add(SuppliermanageInfo info){
        return supplierManagementDao.add(info.getSNo(),info.getSName());
    }
    public boolean sub(SuppliermanageInfo info){
        try {
            int length=info.getLength();
            List<String> list=info.getList();
            for(int i=0;i<length;i++){
                supplierManagementDao.sub(list.get(i));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean mod(SuppliermanageInfo info){
        return supplierManagementDao.mod(info.getSNo(),info.getSName(),info.getTarget());
    }
    public Collection<SupplierInfo> search(SuppliermanageInfo info){
        switch (info.getStype()){
            case "供货商编号":info.setStype("SNo");break;
            case "供货商名称":info.setStype("SName");break;
        }
        return supplierManagementDao.search(info.getStype(),info.getStext(),info.getLimit(),info.getOffset());
    }
}
