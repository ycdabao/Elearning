package com.modou.elearning.utils;

public class StringUtils {
    public static boolean isBlank(String target){
        if(target!=null&&!target.equals("")){
            return false;
        }
        return true;
    }
}
