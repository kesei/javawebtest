package com.example.yikeerp.controller.UserManagementController;

import com.example.yikeerp.entity.UserManagementEntity.User;
import com.example.yikeerp.service.UserManagementService.UserManagement;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userManagement")
public class UserManagementController {

    ObjectMapper mapper = new ObjectMapper();
    @Resource
    private UserManagement UserManagement;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        User status= UserManagement.login(user);
        if(status==null)
            return "fail";
        try {
            return mapper.writeValueAsString(status);
        }catch (Exception e){
            return "fail";
        }
    }
}
