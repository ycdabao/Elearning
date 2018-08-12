package com.modou.elearning.controller;

import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.UserService;
import com.modou.elearning.utils.ModouResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="tologin")
    public String tologin(){
        return "login";
    }


    @RequestMapping(value="toregister")
    public String toregister()
    {
        return "register";
    }


    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value="/doregister")
    public ModouResult register(Users user){

            return userService.register(user);
    }

    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value="/dologin")
    public ModouResult login(String name,String password,HttpSession session){
        Users  user = userService.login(name,password);
        if(user==null){
            return ModouResult.build(400,"用户名或密码错误");
        }else{
            session.setAttribute("user",user);
            return ModouResult.ok();
        }
    }

}
