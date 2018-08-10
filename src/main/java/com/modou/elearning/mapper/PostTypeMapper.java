package com.modou.elearning.mapper;

import com.modou.elearning.pojo.PostType;
import com.modou.elearning.pojo.PostTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostTypeMapper {
    int countByExample(PostTypeExample example);

    int deleteByExample(PostTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostType record);

    int insertSelective(PostType record);

    List<PostType> selectByExample(PostTypeExample example);

    PostType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByExample(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByPrimaryKeySelective(PostType record);

    int updateByPrimaryKey(PostType record);
}