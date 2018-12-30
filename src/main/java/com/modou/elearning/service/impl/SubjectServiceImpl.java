package com.modou.elearning.service.impl;


import com.modou.elearning.mapper.SubjectMapper;
import com.modou.elearning.pojo.Subject;
import com.modou.elearning.pojo.SubjectExample;
import com.modou.elearning.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectMapper subjectMapper;


    @Override
    public void add(Subject subject) {
        subjectMapper.insert(subject);
    }

    @Override
    public List<Subject> findByParentId(Integer parentid) {

        SubjectExample example = new SubjectExample();
        SubjectExample.Criteria c = example.createCriteria();
        if(parentid!=null){
            c.andParentidEqualTo(parentid);
        }


        return  subjectMapper.selectByExample(example);
    }
}
