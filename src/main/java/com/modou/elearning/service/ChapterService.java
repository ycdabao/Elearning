package com.modou.elearning.service;

import com.modou.elearning.pojo.Chapter;

public interface ChapterService {

     void add(Chapter chapter);

     void delete(String id);

    void update(Chapter chapter);
}
