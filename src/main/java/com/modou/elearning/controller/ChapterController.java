package com.modou.elearning.controller;

import com.modou.elearning.pojo.Chapter;
import com.modou.elearning.service.ChapterService;
import com.modou.elearning.utils.ModouResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/chapter")
public class ChapterController {

    @Autowired
    ChapterService chapterService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public ModouResult add(Chapter chapter) {
        chapter.setChapterCreatedate(new Date());
        String id = UUID.randomUUID().toString();
        chapter.setId(id);

        try {
            chapterService.add(chapter);
            return ModouResult.build(200, "succes", id);
        } catch (Exception ex) {
            return ModouResult.build(400, "error");
        }
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public ModouResult delete(String chapterid) {


        try {
            chapterService.delete(chapterid);
            return ModouResult.build(200, "succes");
        } catch (Exception ex) {
            return ModouResult.build(400, "error");
        }
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public ModouResult update(Chapter chapter) {


        try {
            chapter.setChapterModifydate(new Date());
            chapterService.update(chapter);
            return ModouResult.build(200, "succes");
        } catch (Exception ex) {
            return ModouResult.build(400, "error");
        }
    }

    @RequestMapping(value = "/findbycourseid")
    @ResponseBody
    public ModouResult findChapterByCourseId(String courseid) {
        try {
            List<Chapter> chapterList = chapterService.selectChapterAndChapterContent(courseid);
            return ModouResult.build(200,"success",chapterList);

        } catch (Exception ex) {
            return ModouResult.build(400,"error");
        }
    }

}
