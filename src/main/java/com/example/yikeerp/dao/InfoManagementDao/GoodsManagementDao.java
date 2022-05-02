package com.example.yikeerp.dao.InfoManagementDao;

import com.example.yikeerp.entity.InfoManagementEntity.goods.GoodsInfo;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

@Mapper
public interface GoodsManagementDao {
    @Select("SELECT COUNT(*) FROM ginfo")
    public int init();
    @Select("SELECT * FROM ginfo LIMIT #{limit} OFFSET #{offset}")
    public Collection<GoodsInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Insert("INSERT INTO ginfo (GNo,GName,GFCategory,GSCategory,GMCategory,GUnit,GPrice) VALUES (#{No},#{Name},#{FCategory},#{SCategory},#{MCategory},#{Unit},#{Price})")
    public boolean add(@Param("No") String No,@Param("Name") String Name,@Param("FCategory") String FCategory,@Param("SCategory") String SCategory,@Param("MCategory") String MCategory,@Param("Unit") String Unit,@Param("Price") String Price);
    @Delete("DELETE FROM ginfo WHERE GNo=#{No}")
    public boolean sub(String No);
    @Update("UPDATE ginfo SET GNo=#{No},GName=#{Name},GFCategory=#{FCategory},GSCategory=#{SCategory},GMCategory=#{MCategory},GUnit=#{Unit},GPrice=#{Price} WHERE GNo=#{target}")
    public boolean mod(@Param("No") String No,@Param("Name") String Name,@Param("FCategory") String FCategory,@Param("SCategory") String SCategory,@Param("MCategory") String MCategory,@Param("Unit") String Unit,@Param("Price") String Price,@Param("target")String target);
    @Select("SELECT * FROM ginfo WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<GoodsInfo>search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
