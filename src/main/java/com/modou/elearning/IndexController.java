package com.modou.elearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping(value="/course/add")
    public String courseadd(){
        return "/admin/courses/add";
    }


}
