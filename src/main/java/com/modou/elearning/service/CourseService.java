package com.modou.elearning.service;

import com.modou.elearning.pojo.Courses;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {

     String saveCover(MultipartFile file,String path) throws IOException;


     void add(Courses courses);

     List<Courses> findbyCodition(Courses courses,int page,int rows);

     int count(Courses courses);

     Courses findById(String id);

    void update(Courses courses);

    List<Courses> findHotTop10();
}
