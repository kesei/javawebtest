package com.example.yikeerp.service.InfoManagementService;

import com.example.yikeerp.dao.InfoManagementDao.CustomerManagementDao;
import com.example.yikeerp.entity.InfoManagementEntity.customer.CustomerInfo;
import com.example.yikeerp.entity.InfoManagementEntity.customer.CustomermanageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomerManagement {
    @Resource
    private CustomerManagementDao customerManagementDao;

    public int init(){
        return customerManagementDao.init();
    }
    public Collection<CustomerInfo> view(CustomermanageInfo info){
        try {
            return customerManagementDao.view(info.getLimit(),info.getOffset());
        }catch (Exception e){
            return new ArrayList<CustomerInfo>();
        }
    }
    public boolean add(CustomermanageInfo info){
        return customerManagementDao.add(info.getNo(),info.getName(),info.getGender(),info.getTel(),info.getExpiry());
    }
    public boolean sub(CustomermanageInfo info){
        try {
            int length=info.getLength();
            List<String> list=info.getList();
            for(int i=0;i<length;i++){
                customerManagementDao.sub(list.get(i));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean mod(CustomermanageInfo info){
        return customerManagementDao.mod(info.getNo(),info.getName(),info.getGender(),info.getTel(),info.getExpiry(),info.getTarget());
    }
    public Collection<CustomerInfo> search(CustomermanageInfo info){
        switch (info.getType()){
            case "会员卡号":info.setType("CNo");break;
            case "会员名称":info.setType("CName");break;
        }
        return customerManagementDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
