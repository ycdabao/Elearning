package com.modou.elearning.controller;

import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.UserService;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


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
     * 产生验证码
     */
    @RequestMapping(value="/getvalidatecode")
    public void genValidateCode(HttpServletResponse response, HttpSession session)throws IOException{
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

       String code= ValidateCode.generateVerifyCode(4);
        ValidateCode.outputImage(100,30,response.getOutputStream(),code);


    }



    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value="/doregister")
    public String register(Users user){

             userService.register(user);
             return "admin/index";
    }

    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value="/dologin")
    @ResponseBody
    public ModouResult login(String login, String password, HttpSession session){
        Users  user = userService.login(login,password);

        if(user==null){
            ModouResult result = new ModouResult(400,"用户名或密码错误",null);
            return result;
        }else{
            session.setAttribute("user",user);
            ModouResult result = new ModouResult(200,"登录成功","/index");
            return result;
        }
    }

}
