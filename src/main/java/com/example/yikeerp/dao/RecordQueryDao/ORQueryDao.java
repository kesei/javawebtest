package com.example.yikeerp.dao.RecordQueryDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.OR.ORInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface ORQueryDao {
    @Select("SELECT COUNT(*) FROM `or`")
    public int init();
    @Select("SELECT * FROM `or` LIMIT #{limit} OFFSET #{offset}")
    public Collection<ORInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM `or` WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<ORInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);
}
