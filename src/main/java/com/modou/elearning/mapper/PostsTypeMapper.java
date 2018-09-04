package com.modou.elearning.mapper;

import com.modou.elearning.pojo.PostsType;
import com.modou.elearning.pojo.PostsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostsTypeMapper {
    int countByExample(PostsTypeExample example);

    int deleteByExample(PostsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostsType record);

    int insertSelective(PostsType record);

    List<PostsType> selectByExample(PostsTypeExample example);

    PostsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostsType record, @Param("example") PostsTypeExample example);

    int updateByExample(@Param("record") PostsType record, @Param("example") PostsTypeExample example);

    int updateByPrimaryKeySelective(PostsType record);

    int updateByPrimaryKey(PostsType record);
}