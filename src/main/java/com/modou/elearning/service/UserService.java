package com.modou.elearning.service;

import com.modou.elearning.pojo.Users;
import com.modou.elearning.utils.ModouResult;

public interface UserService {

     Users login(String name, String password);

     ModouResult register(Users users);
}
