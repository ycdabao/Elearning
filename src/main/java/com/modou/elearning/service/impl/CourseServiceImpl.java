package com.modou.elearning.service.impl;


import com.github.pagehelper.PageHelper;

import com.modou.elearning.mapper.CoursesMapper;
import com.modou.elearning.pojo.Chapter;

import com.modou.elearning.pojo.Courses;
import com.modou.elearning.pojo.CoursesExample;
import com.modou.elearning.service.ChapterService;
import com.modou.elearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CoursesMapper coursesMapper;

    @Autowired
    ChapterService chapterService;

    @Override
    public String saveCover(MultipartFile file,String path)throws IOException {
        String originalFilename = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File(path+ java.io.File.separator+filename));

        return filename;
    }

    @Override
    @Transactional
    public void add(Courses courses) {

        coursesMapper.insert(courses);
    }

    @Override
    public List<Courses> findbyCodition(Courses courses,int page,int pageSize) {
        CoursesExample coursesExample = new CoursesExample();
        CoursesExample.Criteria c = coursesExample.createCriteria();
        if(courses!=null){
            if(courses.getCourseName()!=null&&!courses.getCourseName().equals("")){
                c.andCourseNameLike("%"+courses.getCourseName()+"%");
            }

            if(courses.getCourseCreateby()!=null&&!courses.getCourseCreateby().equals("")){
                c.andCourseCreatebyEqualTo(courses.getCourseCreateby());
            }
        }

        PageHelper.offsetPage((page-1)*pageSize,pageSize);


        return   coursesMapper.selectByExample(coursesExample);
    }


    @Override
    public int count(Courses courses) {
        CoursesExample coursesExample = new CoursesExample();
        CoursesExample.Criteria c = coursesExample.createCriteria();
        if(courses!=null){
            if(courses.getCourseName()!=null&&!courses.getCourseName().equals("")){
                c.andCourseNameLike("%"+courses.getCourseName()+"%");
            }
            if(courses.getCourseCreateby()!=null&&!courses.getCourseCreateby().equals("")){
                c.andCourseCreatebyEqualTo(courses.getCourseCreateby());
            }
        }
        return coursesMapper.countByExample(coursesExample);
    }


    @Override
    public Courses findById(String id) {
        List<Chapter> chapterList=chapterService.selectChapterAndChapterContent(id);
        Courses courses = coursesMapper.selectByPrimaryKey(id);
        courses.setChapterList(chapterList);

        return courses;
    }

    @Override
    @Transactional
    public void update(Courses courses) {
        coursesMapper.updateByPrimaryKeySelective(courses);
    }
}
