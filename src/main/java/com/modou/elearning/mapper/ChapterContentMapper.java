package com.modou.elearning.mapper;

import com.modou.elearning.pojo.ChapterContent;
import com.modou.elearning.pojo.ChapterContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChapterContentMapper {
    int countByExample(ChapterContentExample example);

    int deleteByExample(ChapterContentExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChapterContent record);

    int insertSelective(ChapterContent record);

    List<ChapterContent> selectByExample(ChapterContentExample example);

    ChapterContent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChapterContent record, @Param("example") ChapterContentExample example);

    int updateByExample(@Param("record") ChapterContent record, @Param("example") ChapterContentExample example);

    int updateByPrimaryKeySelective(ChapterContent record);

    int updateByPrimaryKey(ChapterContent record);
}