package com.example.yikeerp.dao.ShelfManagementDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfmanageInfo;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import java.sql.Statement;
import java.util.Collection;

public interface ShelfManagementDao {
    @Select("SELECT COUNT(*) FROM shelf")
    public int init();
    @Select("SELECT * FROM shelf LIMIT #{limit} OFFSET #{offset}")
    public Collection<ShelfInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Select("{CALL out_shelf(#{No},#{ID},#{BNo},#{CNo},#{GNo},#{ENo},#{Num},#{SPrice})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean sub(@Param("No")String No,@Param("ID")String ID,@Param("BNo")String BNo,@Param("CNo")String CNo,@Param("GNo")String GNo,@Param("ENo")String ENo,@Param("Num")int Num,@Param("SPrice")float SPrice);
    @Select("{CALL del_shelf(#{No},#{ID},#{BNo},#{CNo},#{GNo},#{ENo},#{Num},#{$Price})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean del(@Param("No")String No,@Param("ID")String ID,@Param("BNo")String BNo,@Param("CNo")String CNo,@Param("GNo")String GNo,@Param("ENo")String ENo,@Param("Num")int Num,@Param("SPrice")float SPrice);
    @Select("{CALL pmod_shelf(#{target},#{Num},#{Price},#{ENo},#{Content})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean pmod(@Param("target")String target,@Param("Num")int Num,@Param("Price")float Price,@Param("ENo")String ENo,@Param("Content")String Content);
    @Select("{CALL fmod_shelf(#{target},#{Num},#{Price},#{ENo},#{Content})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean fmod(@Param("target")String target,@Param("Num")int Num,@Param("Price")float Price,@Param("ENo")String ENo,@Param("Content")String Content);
    @Select("SELECT * FROM shelf WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<ShelfInfo> search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
