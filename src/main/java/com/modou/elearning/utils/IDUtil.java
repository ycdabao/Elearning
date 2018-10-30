package com.modou.elearning.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IDUtil {
    public static String creatUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     *根据文件绝对路径获取文件名
     * @param absoluteName
     * @return
     */
    public static String getFileName(String absoluteName){
        return absoluteName.substring(absoluteName.lastIndexOf(File.separator)+1,absoluteName.lastIndexOf("."));
    }

    /**
     * 根据文件名或绝对路径获取主展名
     * @param absoluteName
     * @return
     */
    public static String getFileExtendsionName(String absoluteName){
        return absoluteName.substring(absoluteName.lastIndexOf("."));
    }


    public static String createUploadPath(String rootPath,String userid){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = sdf.format(date);
        File file = new File(rootPath+File.separator+userid+File.separator+sdate);
        if(file.exists()){
            return rootPath+File.separator+userid+File.separator+sdate;
        }else{
            file.mkdirs();
            return rootPath+File.separator+userid+File.separator+sdate;
        }
    }
}
