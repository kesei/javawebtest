package com.example.yikeerp.controller.InfoManagementController;

import com.example.yikeerp.entity.InfoManagementEntity.employee.EmployeeInfo;
import com.example.yikeerp.entity.InfoManagementEntity.employee.EmployeemanageInfo;
import com.example.yikeerp.service.InfoManagementService.EmployeeManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/employeeManagement")
public class EmployeeManagementController {
    @Resource
    private EmployeeManagement employeeManagement;

    @RequestMapping("/init")
    public int init(){
        return employeeManagement.init();
    }
    @RequestMapping("/view")
    public Collection<EmployeeInfo> view(@RequestBody EmployeemanageInfo info){
        return employeeManagement.view(info);
    }
    @RequestMapping("/search")
    public Collection<EmployeeInfo> search(@RequestBody EmployeemanageInfo info){
        return employeeManagement.search(info);
    }
}
