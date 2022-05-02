package com.example.yikeerp.service.UserManagementService;

import com.example.yikeerp.dao.UserManagementDao.UserLoginDao;
import com.example.yikeerp.entity.UserManagementEntity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserManagement {
    @Resource
    private UserLoginDao UserLoginDao;

    public User login(User user){
        return UserLoginDao.logincheck(user.getUsername(), user.getPassword());
    }
}
