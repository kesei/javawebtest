package com.example.yikeerp.dao.ShelfManagementDao;

import com.example.yikeerp.entity.ShelfManagementEntity.sales.SalerecordInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface SalerecordManagementDao {
    @Select("SELECT COUNT(*) FROM shelf")
    public int init();
    @Select("SELECT * FROM sales LIMIT #{limit} OFFSET #{offset}")
    public Collection<SalerecordInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("SELECT * FROM sales WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<SalerecordInfo> search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
