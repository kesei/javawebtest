package com.example.yikeerp.dao.InfoManagementDao;

import com.example.yikeerp.entity.InfoManagementEntity.employee.EmployeeInfo;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface EmployeeManagementDao {
    @Select("SELECT COUNT(*) FROM cinfo")
    public int init();
    @Select("SELECT * FROM einfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<EmployeeInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM einfo WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<EmployeeInfo>search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
