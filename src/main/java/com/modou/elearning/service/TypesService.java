package com.modou.elearning.service;

import com.modou.elearning.pojo.Types;

import java.util.List;

public interface TypesService {

     void add(Types types);

      List<Types> findByParentId(Integer parentid);
}
