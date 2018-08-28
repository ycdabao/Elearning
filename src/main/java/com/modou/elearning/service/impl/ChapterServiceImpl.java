package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.ChapterContentMapper;
import com.modou.elearning.mapper.ChapterMapper;

import com.modou.elearning.pojo.Chapter;
import com.modou.elearning.pojo.ChapterContent;
import com.modou.elearning.pojo.ChapterContentExample;
import com.modou.elearning.pojo.ChapterExample;
import com.modou.elearning.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChapterServiceImpl  implements ChapterService{

    @Autowired
    ChapterMapper chapterMapper;

    @Autowired
    ChapterContentMapper chapterContentMapper;

    @Override
    @Transactional
    public void add(Chapter chapter) {
        chapterMapper.insert(chapter);
    }

    @Override
    @Transactional
    public void delete(String id) {
        ChapterContentExample example = new ChapterContentExample();
        ChapterContentExample.Criteria c = example.createCriteria();
        c.andChapterIdEqualTo(id);
        List<ChapterContent> list = chapterContentMapper.selectByExample(example);

        for(ChapterContent cc: list){
            chapterContentMapper.deleteByPrimaryKey(cc.getId());
        }

        chapterMapper.deleteByPrimaryKey(id);
    }


    @Override
    @Transactional
    public void update(Chapter chapter) {
        chapterMapper.updateByPrimaryKeySelective(chapter);
    }

    /**
     * 查询章节及对应课时
     * @param courseId
     * @return
     */
    @Override
    public List<Chapter> selectChapterAndChapterContent(String courseId) {
        ChapterExample example1 = new ChapterExample();
        ChapterExample.Criteria c1 = example1.createCriteria();
        c1.andChapterCourseidEqualTo(courseId);
        example1.setOrderByClause("chapter_Order asc");
       List<Chapter> chapterList= chapterMapper.selectByExample(example1);

       for(Chapter c: chapterList){
           ChapterContentExample example2 = new ChapterContentExample();
           ChapterContentExample.Criteria c2 = example2.createCriteria();
           c2.andChapterIdEqualTo(c.getId());
         example2.setOrderByClause("chapter_content_order asc");
           List<ChapterContent> chapterContentList=chapterContentMapper.selectByExample(example2);
           c.setChapterContentList(chapterContentList);
       }

        return chapterList;
    }
}
