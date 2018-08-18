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
}
