package com.example.yikeerp.dao.RecordQueryDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.RecordQueryEntity.IR.IRInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface IRQueryDao {
    @Select("SELECT COUNT(*) FROM ir")
    public int init();
    @Select("SELECT * FROM ir LIMIT #{limit} OFFSET #{offset}")
    public Collection<IRInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM ir WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<IRInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);
}
