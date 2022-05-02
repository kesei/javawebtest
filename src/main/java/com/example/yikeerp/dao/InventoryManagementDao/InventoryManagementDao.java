package com.example.yikeerp.dao.InventoryManagementDao;

import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import java.util.Collection;

public interface InventoryManagementDao {
    @Select("SELECT COUNT(*) FROM inventory")
    public int init();

    @Select("SELECT * FROM inventory LIMIT #{limit} OFFSET #{offset}")
    public Collection<InventoryInfo> view(@Param("limit")int limit,@Param("offset")int offset);

    @Select("SELECT BNo FROM inventory WHERE BNo=#{BNo}")
    public Collection<InventoryInfo> check(String BNo);

    @Select("{CALL in_inventory(#{BNo},#{WNo},#{GNo},#{SNo},#{INum},#{IWUnit},#{ISpecs},#{ENo})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean add(@Param("BNo")String BNo,@Param("WNo")String WNo,@Param("GNo")String GNo,@Param("SNo")String SNo,@Param("INum")int INum,@Param("IWUnit")String IWUnit,@Param("ISpecs")int ISpecs,@Param("ENo")String ENo);

    @Select("{CALL out_inventory(#{BNo},#{GNo},#{WNo},#{ENo},#{Num},#{WUnit},#{RNum},#{RUnit},#{SPrice})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean sub(@Param("BNo")String BNo,@Param("WNo")String WNo,@Param("GNo")String GNo,@Param("SNo")String SNo,@Param("Num")int Num,@Param("WUnit")String WUnit,@Param("RNum")int RNum,@Param("RUnit")String RUnit,@Param("SPrice")float SPrice);

    @Select("{CALL del_inventory(#{BNo},#{GNo},#{WNo},#{ENo},#{Num},#{WUnit},#{RNum},#{RUnit},#{SPrice})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean del(@Param("BNo")String BNo,@Param("WNo")String WNo,@Param("GNo")String GNo,@Param("SNo")String SNo,@Param("Num")int Num,@Param("WUnit")String WUnit,@Param("RNum")int RNum,@Param("RUnit")String RUnit,@Param("SPrice")float SPrice);

    @Select("{CALL change_inventory(#{target},#{WNo},#{GNo},#{SNo},#{Num},#{WUnit},#{Specs},#{ENo},#{Content})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean mod(@Param("target")String target,@Param("WNo")String WNo,@Param("GNo")String GNo,@Param("SNo")String SNo,@Param("Num")int Num,@Param("WUnit")String WUnit,@Param("Specs")int Specs,@Param("ENo")String ENo,@Param("Content")String Content);

    @Select("{CALL ptrans_inventory(#{target},#{from_WNo},#{to_WNo},#{GNo},#{SNo},#{Num},#{WUnit},#{Specs},#{ENo})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean ptrans(@Param("target")String target,@Param("from_WNo")String from_WNo,@Param("to_WNo")String to_WNo,@Param("GNo")String GNo,@Param("SNo")String SNo,@Param("Num")int Num,@Param("WUnit")String WUnit,@Param("Specs")int Specs,@Param("ENo")String ENo);

    @Select("{CALL ftrans_inventory(#{target},#{from_WNo},#{to_WNo},#{GNo},#{Num},#{Specs},#{ENo})}")
    @Options(statementType = StatementType.CALLABLE)
    public boolean ftrans(@Param("target")String target,@Param("from_WNo")String from_WNo,@Param("to_WNo")String to_WNo,@Param("GNo")String GNo,@Param("Num")int Num,@Param("Specs")int Specs,@Param("ENo")String ENo);

    @Select("SELECT * FROM inventory WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<InventoryInfo> search(@Param("type")String type,@Param("text")String text,@Param("limit")int limit,@Param("offset")int offset);

    @Select("SELECT WName FROM winfo WHERE WNo=#{No}")
    public String warehouse(String No);
    @Select("SELECT GName FROM ginfo WHERE GNo=#{No}")
    public String goods(String No);
    @Select("SELECT SName FROM sinfo WHERE SNo=#{No}")
    public String supplier(String No);
    @Select("SELECT GUnit FROM ginfo WHERE GNo=#{No}")
    public String unit(String No);
}
