package com.modou.elearning.controller;

import com.modou.elearning.pojo.Courses;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.CourseService;
import com.modou.elearning.utils.EasyuiResult;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/admin/course")
public class CourseController {

    @Value("${file.cover.uploadfolder}")
    private String coverFolder;

    @Autowired
    private CourseService courseService;


    @RequestMapping(value = "/uploadcover")
    @ResponseBody
    public ModouResult uploadCover(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {

        try {
            String path = courseService.saveCover(file, coverFolder);

            return ModouResult.build(200, "上传成功", path);
        } catch (IOException ex) {
            return null;
        }
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public ModouResult addCourse(Courses courses, HttpSession session) {

        Users user = (Users) session.getAttribute("user");
        courses.setCourseCreateby(user.getId());
        courses.setCourseCreatedate(new Date());
        courses.setCourseStatus("草稿");
        courses.setCourseStudentNumber(0);
        String courseid= UUIDUtil.creatUUID();
        courses.setId(courseid);
        try {
            courseService.add(courses);
            return ModouResult.build(200, "succes",courseid);
        } catch (Exception ex) {
            return ModouResult.build(400, "error");
        }
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public EasyuiResult<Courses> list(Courses courses, @RequestParam(required = true,defaultValue = "1") int page, int rows,HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        courses.setCourseCreateby(user.getId());
        List<Courses> coursesList=courseService.findbyCodition(courses,page,rows);
        int count = courseService.count(courses);
        EasyuiResult<Courses> result = new EasyuiResult<Courses>(coursesList,count);
        return result;
    }


    @RequestMapping(value="/findbyid")
    @ResponseBody
    public ModouResult findById(String id){
        try {
            Courses courses = courseService.findById(id);
           return  ModouResult.build(200, "success", courses);
        }catch(Exception ex){
           return  ModouResult.build(400,"error");
        }
    }

    @RequestMapping(value="/update")
    @ResponseBody
    public ModouResult update(Courses Courses) {
        try {
            courseService.update(Courses);
            return ModouResult.build(200, "success");
        } catch (Exception ex) {
            return ModouResult.build(400, "error");
        }

    }
}
