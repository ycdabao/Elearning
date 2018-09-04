package com.modou.elearning.service;

import com.modou.elearning.pojo.AuthRole;

import java.util.List;

public interface AuthRoleService {

     void add(AuthRole role);

     void update(AuthRole role);

     List<AuthRole> findByCondition(AuthRole role, Integer page, Integer rows);

     Integer count(AuthRole role);
}
