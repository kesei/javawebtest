package com.example.yikeerp.dao.RecordQueryDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.InventoryChange.InventoryChangeInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface InventoryChangeQueryDao {
    @Select("SELECT COUNT(*) FROM c_iinfo")
    public int init();
    @Select("SELECT * FROM c_iinfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<InventoryChangeInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM c_iinfo WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<InventoryChangeInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);
}
