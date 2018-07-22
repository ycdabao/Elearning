package com.modou.elearning.subject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }
}
