package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.ChapterContentMapper;
import com.modou.elearning.mapper.ChapterMapper;
import com.modou.elearning.mapper.FilesMapper;
import com.modou.elearning.pojo.*;
import com.modou.elearning.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChapterServiceImpl  implements ChapterService{

    @Autowired
    ChapterMapper chapterMapper;

    @Autowired
    ChapterContentMapper chapterContentMapper;

    @Autowired
    FilesMapper filesMapper;

    @Override
    @Transactional
    public void add(Chapter chapter) {
/*        Integer maxorder = chapterMapper.selectmaxorder(chapter.getChapterCourseid());
        maxorder= maxorder==null?1:++maxorder;
        chapter.setChapterOrder(maxorder);   //设置顺序*/
        chapterMapper.insert(chapter);
    }

    @Override
    @Transactional
    public void delete(String id) {
        ChapterContentExample example = new ChapterContentExample();
        ChapterContentExample.Criteria c = example.createCriteria();
        c.andChapterIdEqualTo(id);
        List<ChapterContent> list = chapterContentMapper.selectByExample(example);

        for(ChapterContent cc: list){
            chapterContentMapper.deleteByPrimaryKey(cc.getId());
        }

        chapterMapper.deleteByPrimaryKey(id);
    }


    @Override
    @Transactional
    public void update(Chapter chapter) {
        chapterMapper.updateByPrimaryKeySelective(chapter);
    }

    /**
     * 查询章节及对应课时
     * @param courseId
     * @return
     */
    @Override
    public List<Chapter> selectChapterAndChapterContent(String courseId) {
        ChapterExample example1 = new ChapterExample();
        ChapterExample.Criteria c1 = example1.createCriteria();
        c1.andChapterCourseidEqualTo(courseId);
        example1.setOrderByClause("chapter_Order asc");
       List<Chapter> chapterList= chapterMapper.selectByExample(example1);

       for(Chapter c: chapterList){
           ChapterContentExample example2 = new ChapterContentExample();
           ChapterContentExample.Criteria c2 = example2.createCriteria();
           c2.andChapterIdEqualTo(c.getId());
         example2.setOrderByClause("chapter_content_order asc");
           List<ChapterContent> chapterContentList=chapterContentMapper.selectByExample(example2);

          for(ChapterContent c3: chapterContentList){
              Files file =   filesMapper.selectByPrimaryKey(c3.getFileId());
              c3.setFile(file);
          }

           c.setChapterContentList(chapterContentList);



       }

        return chapterList;
    }
}
