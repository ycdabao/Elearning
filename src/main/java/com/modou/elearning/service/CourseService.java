package com.modou.elearning.service;

import com.modou.elearning.pojo.Courses;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {

    public String saveCover(MultipartFile file,String path) throws IOException;


    public void add(Courses courses);

    public List<Courses> findbyCodition(Courses courses,int page,int pageSize);

    public int count(Courses courses);

    public Courses findById(String id);

    void update(Courses courses);
}
