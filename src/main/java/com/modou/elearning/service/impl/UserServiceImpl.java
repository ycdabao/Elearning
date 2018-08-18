package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.UsersMapper;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.pojo.UsersExample;
import com.modou.elearning.service.UserService;
import com.modou.elearning.utils.ModouResult;

import com.modou.elearning.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;


import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public Users login(String name, String password) {

        UsersExample example = new UsersExample();
        UsersExample.Criteria c = example.createCriteria();
        c.andUserNameEqualTo(name);

        List<Users> usersList = usersMapper.selectByExample(example);
        if(usersList!=null&&usersList.size()>0){
            Users users = usersList.get(0);
            if(DigestUtils.md5DigestAsHex(password.getBytes()).equals(users.getUserPass()))
            {
                return users;
            }
        }

        UsersExample example1= new UsersExample();
        UsersExample.Criteria c1 = example1.createCriteria();
        c1.andUserTelEqualTo(name);
        List<Users> usersList1 = usersMapper.selectByExample(example1);
        if(usersList1!=null&&usersList1.size()>0){
            Users users = usersList1.get(0);

            if(DigestUtils.md5DigestAsHex(password.getBytes()).equals(users.getUserPass()))
            {
                return users;
            }
        }

        return null;
    }


    @Override
    @Transactional
    public ModouResult register(Users users) {



        if(StringUtils.isBlank(users.getUserPass())){
          return   ModouResult.build(400,"密码不能为空");
        }

        if(StringUtils.isBlank(users.getUserTel())){
          return   ModouResult.build(400,"手机号码不能为空");
        }

        users.setUserPass(DigestUtils.md5DigestAsHex(users.getUserPass().getBytes()));
        users.setUserCreatedate(new Date());
        users.setUserModifydate(new Date());
        users.setId(UUID.randomUUID().toString());
        usersMapper.insert(users);

        return ModouResult.ok();
    }
}
