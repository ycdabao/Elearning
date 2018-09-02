package com.modou.elearning.controller;

import com.modou.elearning.pojo.Types;
import com.modou.elearning.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/types")
public class TypesController {


    @Autowired
    TypesService typesService;


    @RequestMapping(value="/findbyparentid")
    @ResponseBody
    public List<Types> findTypesByParentId(@RequestParam(required = true,defaultValue = "0") Integer parentid){

            List<Types> typesList = typesService.findByParentId(parentid);
            return typesList;
    }

}
