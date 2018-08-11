package com.modou.elearning.service.impl;

import com.modou.elearning.mapper.UsersMapper;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.pojo.UsersExample;
import com.modou.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

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
            if(DigestUtils.md5Digest(password.getBytes()).equals(users.getUserPass()))
            {
                return users;
            }
        }



        return null;
    }
}
