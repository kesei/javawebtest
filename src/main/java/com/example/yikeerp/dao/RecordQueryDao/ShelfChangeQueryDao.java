package com.example.yikeerp.dao.RecordQueryDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.ShelfChange.ShelfChangeInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface ShelfChangeQueryDao {
    @Select("SELECT COUNT(*) FROM c_shelfinfo")
    public int init();
    @Select("SELECT * FROM c_shelfinfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<ShelfChangeInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM c_shelfinfo WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<ShelfChangeInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);
}
