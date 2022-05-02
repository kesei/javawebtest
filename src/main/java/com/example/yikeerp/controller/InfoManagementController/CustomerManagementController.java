package com.example.yikeerp.controller.InfoManagementController;

import com.example.yikeerp.entity.InfoManagementEntity.customer.CustomerInfo;
import com.example.yikeerp.entity.InfoManagementEntity.customer.CustomermanageInfo;
import com.example.yikeerp.service.InfoManagementService.CustomerManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/customerManagement")
public class CustomerManagementController {
    @Resource
    private CustomerManagement customerManagement;

    @RequestMapping("/init")
    public int init(){
        return customerManagement.init();
    }
    @RequestMapping("/view")
    public Collection<CustomerInfo> view(@RequestBody CustomermanageInfo info){
        return customerManagement.view(info);
    }
    @RequestMapping("/add")
    public boolean add(@RequestBody CustomermanageInfo info){
        return customerManagement.add(info);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody CustomermanageInfo info){
        return customerManagement.sub(info);
    }
    @RequestMapping("/mod")
    public boolean mod(@RequestBody CustomermanageInfo info){
        return customerManagement.mod(info);
    }
    @RequestMapping("/search")
    public Collection<CustomerInfo> search(@RequestBody CustomermanageInfo info){
        return customerManagement.search(info);
    }
}
