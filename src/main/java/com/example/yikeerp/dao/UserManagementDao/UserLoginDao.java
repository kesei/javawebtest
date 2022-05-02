package com.example.yikeerp.dao.UserManagementDao;

import com.example.yikeerp.entity.UserManagementEntity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {
    @Select("SELECT * FROM user WHERE username=#{username} AND password=#{password}")
    public User logincheck(@Param("username") String username, @Param("password") String password);
}
