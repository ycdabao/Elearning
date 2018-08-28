package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.ChapterContentMapper;
import com.modou.elearning.pojo.ChapterContent;
import com.modou.elearning.service.ChapterContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChapterContentServiceImpl implements ChapterContentService {

    @Autowired
    ChapterContentMapper chapterContentMapper;

    @Override
    @Transactional
    public void add(ChapterContent content) {
        chapterContentMapper.insert(content);
    }
}
