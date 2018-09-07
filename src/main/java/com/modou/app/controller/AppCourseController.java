package com.modou.app.controller;

import com.modou.elearning.pojo.Courses;
import com.modou.elearning.service.CourseService;
import com.modou.elearning.utils.ModouResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;



@Controller
@RequestMapping(value="/course")
public class AppCourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping(value="/list")
    @ResponseBody
    public ModouResult list(Courses courses, @RequestParam(required = true,defaultValue = "1") int page, @RequestParam(required = true,defaultValue = "10")int rows, HttpSession session){
        List<Courses> coursesList=  courseService.findbyCodition(courses,page,rows);
        return ModouResult.build(200,"success",coursesList);
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

    @RequestMapping(value="/index")
    public String index(){
        return "/course/index";
    }

    @RequestMapping(value="/toview")
    public String toview(String id,Model model){
        model.addAttribute("id",id);
        return "/course/view";
    }

    @RequestMapping(value="/view")
    public String view(){
        return "/course/learn";
    }

    @RequestMapping(value="/tolearn")
    public String tolearn(String fileId,Model model){
        model.addAttribute("fileId",fileId);
        return "/course/learn";
    }

}
