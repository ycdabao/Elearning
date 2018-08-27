package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.ChapterMapper;

import com.modou.elearning.pojo.Chapter;
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
}
