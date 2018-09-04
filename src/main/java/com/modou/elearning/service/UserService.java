package com.modou.elearning.service;

import com.modou.elearning.pojo.AuthFunction;
import com.modou.elearning.pojo.AuthRole;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.utils.ModouResult;

import java.util.List;

public interface UserService {

     Users findByUserName(String name);

     ModouResult register(Users users);

     List<Users> findByCondition(Users users,Integer page,Integer rows);

    Integer count(Users users);

     List<AuthRole> findRoleListByUserId(String id);

     List<AuthFunction> findFunctionListByUserId(String id);
}
