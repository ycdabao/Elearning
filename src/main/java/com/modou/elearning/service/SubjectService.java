package com.modou.elearning.service;


import com.modou.elearning.pojo.Subject;

import java.util.List;

public interface SubjectService {

     void add(Subject types);

      List<Subject> findByParentId(Integer parentid);
}
