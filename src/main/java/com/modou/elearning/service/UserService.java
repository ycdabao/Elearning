package com.modou.elearning.service;

import com.modou.elearning.pojo.Users;

public interface UserService {

    public Users login(String name, String password);
}
