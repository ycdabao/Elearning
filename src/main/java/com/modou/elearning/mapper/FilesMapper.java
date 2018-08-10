package com.modou.elearning.mapper;

import com.modou.elearning.pojo.Files;
import com.modou.elearning.pojo.FilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilesMapper {
    int countByExample(FilesExample example);

    int deleteByExample(FilesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Files record);

    int insertSelective(Files record);

    List<Files> selectByExampleWithBLOBs(FilesExample example);

    List<Files> selectByExample(FilesExample example);

    Files selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByExampleWithBLOBs(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByExample(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKeyWithBLOBs(Files record);

    int updateByPrimaryKey(Files record);
}