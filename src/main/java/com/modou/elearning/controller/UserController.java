package com.modou.elearning.controller;

import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.UserService;
import com.modou.elearning.utils.EasyuiResult;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.UUIDUtil;
import com.modou.elearning.utils.ValidateCode;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 产生验证码
     */
    @RequestMapping(value = "/getvalidatecode")
    public void genValidateCode(HttpServletResponse response, HttpSession session) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        String code = ValidateCode.generateVerifyCode(4);
        ValidateCode.outputImage(100, 30, response.getOutputStream(), code);


    }


    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/doregister")
    @ResponseBody
    public ModouResult register(Users user) {
        try {
            String password = new SimpleHash("MD5", user.getUserPass(), "imodou", 3).toHex();
            user.setId(UUIDUtil.creatUUID());
            user.setUserPass(password);
            user.setUserCreatedate(new Date());
            user.setUserModifydate(new Date());
            userService.register(user);
            return ModouResult.build(200,"success");
        } catch (Exception ex) {
           return ModouResult.build(200,"error","/index");
        }

    }

    /**
     * 用户登录
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/dologin")
    @ResponseBody
    public ModouResult login(String login, String password, HttpSession session) {

        Subject subject=SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(login,password);
        try {
            subject.login(token);
            Users user = (Users)subject.getPrincipal();
            session.setAttribute("user",user);
        }catch(Exception ex){
            return ModouResult.build(400,"error");
        }


        return ModouResult.build(200,"success","/admin/index");
    }


    @RequestMapping(value="/tolist")
    public String toList(){
        return "/admin/users/list";
    }

    @RequestMapping(value="/list")
    @ResponseBody
    public EasyuiResult<Users> list(Users users, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows){


            List<Users> usersList = userService.findByCondition(users,page,rows);
            Integer count = userService.count(users);
            EasyuiResult<Users> result = new EasyuiResult<Users>();
            result.setTotal(count);
            result.setRows(usersList);
            return result;
    }

}
