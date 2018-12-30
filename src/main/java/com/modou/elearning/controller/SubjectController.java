package com.modou.elearning.controller;

import com.modou.elearning.pojo.Subject;

import com.modou.elearning.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/admin/subject")
public class SubjectController {


    @Autowired
    SubjectService subjectService;


    @RequestMapping(value="/findbyparentid")
    @ResponseBody
    public List<Subject> findTypesByParentId(@RequestParam(required = true,defaultValue = "0") Integer parentid){

            List<Subject> typesList = subjectService.findByParentId(parentid);
            return typesList;
    }

}
