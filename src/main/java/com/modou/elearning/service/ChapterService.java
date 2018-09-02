package com.modou.elearning.service;

import com.modou.elearning.pojo.Chapter;

import java.util.List;

public interface ChapterService {

     void add(Chapter chapter);

     void delete(String id);

    void update(Chapter chapter);

    List<Chapter> selectChapterAndChapterContent(String courseId);
}
