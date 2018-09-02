package com.modou.elearning.controller;

import com.modou.elearning.pojo.ChapterContent;
import com.modou.elearning.service.ChapterContentService;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value="/chaptercontent")
public class ChaterContentController {

    @Autowired
    ChapterContentService chapterContentService;

    @RequestMapping(value="/add")
    @ResponseBody
    public ModouResult add(ChapterContent content){
String id = UUIDUtil.creatUUID();
        content.setId(id);
        content.setChapterContentCreatedate(new Date());
        try {
            chapterContentService.add(content);

            return ModouResult.build(200,"success",id);
        }catch(Exception ex){
            return  ModouResult.build(400,"error");
        }

    }

    @RequestMapping(value="/delete")
    @ResponseBody
    public ModouResult delete(String id){
       try {
           chapterContentService.delete(id);
           return ModouResult.build(200,"success");
       }catch(Exception ex){
            return ModouResult.build(400,"error");
       }
    }

    @RequestMapping(value="/findbyid")
    @ResponseBody
    public ModouResult findbyid(String id){

        try{
            ChapterContent content = chapterContentService.findbyid(id);
            return ModouResult.build(200,"success",content);
        }catch(Exception ex){
            return ModouResult.build(400,"error");
        }
    }

    @RequestMapping(value="/edit")
    @ResponseBody
    public ModouResult edit(ChapterContent content){
        try{
           chapterContentService.edit(content);
           ChapterContent rcontent=chapterContentService.findbyid(content.getId());
            return ModouResult.build(200,"success",rcontent);
        }catch(Exception ex){
            return ModouResult.build(400,"error");
        }
    }

}
