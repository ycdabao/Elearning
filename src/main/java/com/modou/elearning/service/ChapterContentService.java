package com.modou.elearning.service;

import com.modou.elearning.pojo.ChapterContent;

public interface ChapterContentService {

     void add(ChapterContent content);

    void delete(String id);

    ChapterContent findbyid(String id);

    void edit(ChapterContent content);
}
