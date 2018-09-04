package com.modou.elearning.controller;

import com.modou.elearning.pojo.AuthRole;
import com.modou.elearning.service.AuthRoleService;
import com.modou.elearning.utils.EasyuiResult;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.UUIDUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/role")
public class AuthRoleController {

    @Autowired
    AuthRoleService authRoleService;


    @RequestMapping(value="/tolist")
    public String tolist(){
        return "/admin/roles/list";
    }

    @RequestMapping(value="/toadd")
    public String toadd(){
        return "/admin/roles/add";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public EasyuiResult<AuthRole> list(AuthRole role, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows) {

        List<AuthRole> list = authRoleService.findByCondition(role, page, rows);
        Integer count = authRoleService.count(role);
        EasyuiResult<AuthRole> result = new EasyuiResult<AuthRole>();
        result.setRows(list);
        result.setTotal(count);
        return result;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public ModouResult add(AuthRole role) {
        try {
            String id = UUIDUtil.creatUUID();
            role.setId(id);
            authRoleService.add(role);
            return ModouResult.build(200,"success",id);
        } catch (Exception ex) {
            return ModouResult.build(400,"error");
        }

    }


    @RequestMapping(value = "/update")
    @ResponseBody
    public ModouResult update(AuthRole role) {
        try {
            authRoleService.update(role);
            return ModouResult.build(200,"success");
        }catch(Exception ex){
            return ModouResult.build(400,"error");
        }
    }


}
