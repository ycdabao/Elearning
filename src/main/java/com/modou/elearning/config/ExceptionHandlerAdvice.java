package com.modou.elearning.config;

import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        e.printStackTrace();
        return "/error";
    }

    @ExceptionHandler(UnknownAccountException.class)
    public String handleException(UnknownAccountException e) {
        e.printStackTrace();
        return "/admin/unahthorized";
    }
}
