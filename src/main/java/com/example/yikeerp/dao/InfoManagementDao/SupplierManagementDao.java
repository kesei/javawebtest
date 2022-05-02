package com.example.yikeerp.dao.InfoManagementDao;

import com.example.yikeerp.entity.InfoManagementEntity.supplier.SupplierInfo;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface SupplierManagementDao {
    @Select("SELECT COUNT(*) FROM sinfo")
    public int init();
    @Select("SELECT * FROM sinfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<SupplierInfo>view(@Param("limit")int limit,@Param("offset")int offset);
    @Insert("INSERT INTO sinfo (SNo,SName) VALUES (#{SNo},#{SName})")
    public boolean add(@Param("SNo") String No,@Param("SName") String Name);
    @Delete("DELETE FROM sinfo WHERE SNo=#{SNo}")
    public boolean sub(String SNo);
    @Update("UPDATE sinfo SET SNo=#{SNo},SName=#{SName} WHERE SNo=#{target}")
    public boolean mod(@Param("SNo")String No,@Param("SName")String SName,@Param("target")String target);
    @Select("SELECT * FROM sinfo WHERE ${stype} LIKE '%${stext}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<SupplierInfo>search(@Param("stype")String stype,@Param("stext")String stext,@Param("limit")int limit,@Param("offset")int offset);
}
