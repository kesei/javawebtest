package com.example.yikeerp.service.InfoManagementService;

import com.example.yikeerp.dao.InfoManagementDao.EmployeeManagementDao;
import com.example.yikeerp.entity.InfoManagementEntity.employee.EmployeeInfo;
import com.example.yikeerp.entity.InfoManagementEntity.employee.EmployeemanageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

@Service
public class EmployeeManagement {
    @Resource
    private EmployeeManagementDao employeeManagementDao;

    public int init(){
        return employeeManagementDao.init();
    }
    public Collection<EmployeeInfo> view(EmployeemanageInfo info){
        try {
            return employeeManagementDao.view(info.getLimit(),info.getOffset());
        }catch (Exception e) {
            return new ArrayList<EmployeeInfo>();
        }
    }
    public Collection<EmployeeInfo> search(EmployeemanageInfo info) {
        switch (info.getType()){
            case "店员编号":info.setType("ENo");break;
            case "店员名称":info.setType("EName");break;
        }
        return employeeManagementDao.search(info.getType(),info.getText(),info.getLimit(), info.getOffset());
    }
}
