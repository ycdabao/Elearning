package com.modou.elearning.service.impl;

import com.github.pagehelper.PageHelper;
import com.modou.elearning.mapper.*;
import com.modou.elearning.pojo.*;
import com.modou.elearning.service.UserService;
import com.modou.elearning.utils.ModouResult;

import com.modou.elearning.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private AuthRoleMapper authRoleMapper;

    @Autowired
    private AuthFunctionMapper authFunctionMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleFunctionMapper roleFunctionMapper;


    @Override
    public Users findByUserName(String name) {

        UsersExample example = new UsersExample();
        UsersExample.Criteria c = example.createCriteria();
        c.andUserNameEqualTo(name);

        List<Users> usersList = usersMapper.selectByExample(example);
        if (usersList != null && usersList.size() > 0) {
            Users users = usersList.get(0);

            return users;

        }

        UsersExample example1 = new UsersExample();
        UsersExample.Criteria c1 = example1.createCriteria();
        c1.andUserTelEqualTo(name);
        List<Users> usersList1 = usersMapper.selectByExample(example1);
        if (usersList1 != null && usersList1.size() > 0) {
            Users users = usersList1.get(0);
            return users;

        }

        return null;
    }


    @Override
    @Transactional
    public ModouResult register(Users users) {
        if (StringUtils.isBlank(users.getUserPass())) {
            return ModouResult.build(400, "密码不能为空");
        }

        if (StringUtils.isBlank(users.getUserTel())) {
            return ModouResult.build(400, "手机号码不能为空");
        }
        usersMapper.insert(users);
        return ModouResult.ok();
    }


    @Override
    public List<AuthRole> findRoleListByUserId(String id) {

        UserRoleExample example1 = new UserRoleExample();
        UserRoleExample.Criteria c1 = example1.createCriteria();
        c1.andUserIdEqualTo(id);
        List<UserRole> userRoles = userRoleMapper.selectByExample(example1);
        List<AuthRole> roleList = new ArrayList<AuthRole>();
        for (UserRole ur : userRoles) {
            AuthRole role = authRoleMapper.selectByPrimaryKey(ur.getRoleId());
            roleList.add(role);
        }

        return roleList;
    }

    @Override
    public List<AuthFunction> findFunctionListByUserId(String id) {
        List<AuthRole> roleList = this.findRoleListByUserId(id);
        List<String> roleids = new ArrayList<String>();
        for (AuthRole ar : roleList) {
            roleids.add(ar.getId());
        }


        RoleFunctionExample example1 = new RoleFunctionExample();
        RoleFunctionExample.Criteria c1 = example1.createCriteria();
        c1.andRoleIdIn(roleids);
        List<RoleFunction> roleFunctionList = roleFunctionMapper.selectByExample(example1);

        List<AuthFunction> functionList = new ArrayList<AuthFunction>();

        for (RoleFunction rf : roleFunctionList) {
            AuthFunction af = authFunctionMapper.selectByPrimaryKey(rf.getFunctionId());
            functionList.add(af);
        }
        return functionList;
    }


    @Override
    public List<Users> findByCondition(Users users,Integer page,Integer rows) {

        UsersExample example = new UsersExample();
        UsersExample.Criteria c1 =example.createCriteria();
        if(users.getUserName()!=null&&!users.getUserName().equals("")){
            c1.andUserNameLike("%"+users.getUserName()+"%");
        }

        PageHelper.offsetPage((page-1)*rows,rows);
        List<Users> userList = usersMapper.selectByExample(example);

        return userList;
    }

    public Integer count(Users users){
        UsersExample example = new UsersExample();
        UsersExample.Criteria c1 =example.createCriteria();
        if(users.getUserName()!=null&&!users.getUserName().equals("")){
            c1.andUserNameLike("%"+users.getUserName()+"%");
        }

        return usersMapper.countByExample(example);
    }
}
