package com.modou.elearning.controller;

import com.modou.elearning.service.ChapterContentService;
import com.modou.elearning.utils.ModouResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping(value="/chaptercontent")
public class ChaterContentController {

    @Autowired
    ChapterContentService chapterContentService;

    @RequestMapping(value="/add")
    @ResponseBody
    public ModouResult add(ChapterContent content){
String id = UUID.randomUUID().toString();
        content.setId(id);
        content.setChapterContentCreatedate(new Date());
        try {
            chapterContentService.add(content);
            return ModouResult.build(200,"success",id);
        }catch(Exception ex){
            return  ModouResult.build(400,"error");
        }

    }
}