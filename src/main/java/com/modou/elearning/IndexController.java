package com.modou.elearning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping(value="/index")
    public String index(){

        return "/admin/index";
    }
    @RequestMapping(value="/tofile")
    public String file(){
        return "/admin/files/file";
    }

    @RequestMapping(value="/tologin")
    public String tologin(){
        return "/admin/login";
    }

    @RequestMapping(value="/toindex")
    public String toindex(){
        return "/courses/index";
    }

    @RequestMapping(value="/course/toadd")
    public String courseadd(){
        return "/admin/courses/add";
    }

    /**
     * 修改课程
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="/course/toedit")
    public String courseedit(@RequestParam(required = true) String id, Model model){
        model.addAttribute("courseid",id);

        return "/admin/courses/edit";
    }

    /**
     * 编辑课程大纲
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="/chapter/toedit")
    public String chapteredit(@RequestParam(required = true) String id, Model model){
        model.addAttribute("courseid",id);
        return "/admin/chapter/edit";
    }

    /**
     * 课程列表
     * @return
     */
    @RequestMapping(value="/course/tolist")
    public String tocourselist(){
        return "/admin/courses/list";
    }

    @RequestMapping(value="/chapter/toadd")
    public String chapteradd(@RequestParam(required = true) String id, Model model){
        model.addAttribute("courseid",id);
        return "/admin/chapter/add";
    }

}
