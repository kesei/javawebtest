package com.example.yikeerp.dao.StorageManagementDao;

import com.example.yikeerp.entity.StorageManagementEntity.StorageInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface StorageManagementDao {
    @Select("SELECT COUNT(*) FROM file")
    public int init();
    @Select("SELECT * FROM filelist LIMIT #{limit} OFFSET #{offset}")
    public Collection<StorageInfo> view(@Param("limit")int limit, @Param("offset")int offset);
    @Insert("INSERT INTO file (filename,uploader_no,filepath) VALUES (#{filename},#{uploader_no},#{filepath})")
    public boolean record(@Param("filename")String filename,@Param("uploader_no")String uploader_no,@Param("filepath")String filepath);
    @Delete("DELETE FROM file WHERE filename=#{filename}")
    public boolean sub(String filename);
    @Select("SELECT * FROM filelist WHERE ${type} LIKE '%${text}%' LIMIT #{limit} OFFSET #{offset}")
    public Collection<StorageInfo>search(@Param("type")String type, @Param("text")String text, @Param("limit")int limit, @Param("offset")int offset);
}
