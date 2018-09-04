package com.modou.elearning.service.impl;

import com.github.pagehelper.PageHelper;
import com.modou.elearning.mapper.AuthRoleMapper;
import com.modou.elearning.pojo.AuthRole;
import com.modou.elearning.pojo.AuthRoleExample;
import com.modou.elearning.service.AuthRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AuthRoleServiceImpl implements AuthRoleService {

    @Autowired
    AuthRoleMapper authRoleMapper;

    @Override
    @Transactional
    public void add(AuthRole role) {
        authRoleMapper.insert(role);
    }

    @Override
    @Transactional
    public void update(AuthRole role) {
        authRoleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public List<AuthRole> findByCondition(AuthRole role, Integer page, Integer rows) {
        AuthRoleExample example = new AuthRoleExample();
        AuthRoleExample.Criteria c1 = example.createCriteria();
        if(role.getRoleName()!=null&&!role.getRoleName().equals("")){
            c1.andRoleNameLike("%"+role.getRoleName()+"%");
        }
        PageHelper.offsetPage((page-1)*rows,rows);
        List<AuthRole> list =  authRoleMapper.selectByExample(example);

        return list;
    }

    @Override
    public Integer count(AuthRole role) {
        AuthRoleExample example = new AuthRoleExample();
        AuthRoleExample.Criteria c1 = example.createCriteria();
        if(role.getRoleName()!=null&&!role.getRoleName().equals("")){
            c1.andRoleNameLike("%"+role.getRoleName()+"%");
        }
      Integer count =   authRoleMapper.countByExample(example);
        return count;
    }
}
