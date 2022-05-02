package com.example.yikeerp.dao.RecordQueryDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.TR.TRInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface TRQueryDao {
    @Select("SELECT COUNT(*) FROM tr")
    public int init();
    @Select("SELECT * FROM tr LIMIT #{limit} OFFSET #{offset}")
    public Collection<TRInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM tr WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<TRInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);
}
