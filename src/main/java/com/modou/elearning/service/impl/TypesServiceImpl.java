package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.TypesMapper;
import com.modou.elearning.pojo.Types;
import com.modou.elearning.pojo.TypesExample;
import com.modou.elearning.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    TypesMapper typesMapper;


    @Override
    public void add(Types types) {
        typesMapper.insert(types);
    }

    @Override
    public List<Types> findByParentId(Integer parentid) {

        TypesExample example = new TypesExample();
        TypesExample.Criteria c = example.createCriteria();
        if(parentid!=null){
            c.andParentidEqualTo(parentid);
        }


        return  typesMapper.selectByExample(example);
    }
}
