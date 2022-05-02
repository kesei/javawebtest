package com.example.yikeerp.dao.InfoManagementDao;

import com.example.yikeerp.entity.InfoManagementEntity.customer.CustomerInfo;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface CustomerManagementDao {
    @Select("SELECT COUNT(*) FROM cinfo")
    public int init();
    @Select("SELECT * FROM cinfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<CustomerInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Insert("INSERT INTO cinfo (CNo,CName,CGender,CTel,CExpiry) VALUES (#{No},#{Name},#{Gender},#{Tel},#{Expiry})")
    public boolean add(@Param("No") String No,@Param("Name") String Name,@Param("Gender") String Gender,@Param("Tel") String Tel,@Param("Expiry") String Expiry);
    @Delete("DELETE FROM cinfo WHERE CNo=#{No}")
    public boolean sub(String No);
    @Update("UPDATE cinfo SET CNo=#{No},CName=#{Name},CGender=#{Gender},CTel=#{Tel},CExpiry=#{Expiry} WHERE CNo=#{target}")
    public boolean mod(@Param("No") String No,@Param("Name") String Name,@Param("Gender") String Gender,@Param("Tel") String Tel,@Param("Expiry") String Expiry,@Param("target")String target);
    @Select("SELECT * FROM cinfo WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<CustomerInfo>search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
