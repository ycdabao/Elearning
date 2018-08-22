package com.modou.elearning.controller;

import com.modou.elearning.pojo.Courses;
import com.modou.elearning.service.CourseService;
import com.modou.elearning.utils.ModouResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping(value="/course")
public class CourseController {

    private String uploadFolder="/coverupload";

    @Autowired
    private CourseService courseService;

    @RequestMapping(value="/uploadcover")
    @ResponseBody
    public ModouResult uploadCover(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request){

     try {
          String path=courseService.saveCover(file, "d://temp//cover");

          return ModouResult.build(200,"上传成功",path);
     }catch(IOException ex){
         return null;
     }
    }

@RequestMapping(value = "/add")
@ResponseBody
    public ModouResult addCourse(Courses courses){

        return null;
    }
}
