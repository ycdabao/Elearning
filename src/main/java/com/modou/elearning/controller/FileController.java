package com.modou.elearning.controller;


import com.modou.elearning.pojo.Files;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.impl.FileServiceImpl;
import com.modou.elearning.utils.EasyuiResult;
import com.modou.elearning.utils.ModouResult;
import com.modou.elearning.utils.fileutil.FileInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value="/admin/file")

public class FileController {

    private final static Logger log = LoggerFactory.getLogger(FileController.class);


    @Value("${file.video.uploadfolter}")
    private String uploadFolder;

    @Autowired
    private FileServiceImpl wu;


    @RequestMapping(value="/tolist")
    public String printWelcome(ModelMap model) {

        return "admin/files/list";
    }



    @RequestMapping(value="/list")
    @ResponseBody
    public EasyuiResult<Files> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue ="10" ) Integer rows, HttpSession session){

        Users  user = (Users)session.getAttribute("user");

        List<Files> list = wu.list(user.getId(),page,rows);
        int total = wu.count(user.getId());
        EasyuiResult<Files> result = new EasyuiResult<Files>(list,total);
        return result;
    }

    @RequestMapping(value="/findbyid")
    @ResponseBody
    public ModouResult findbyid(String id){
        try {
            Files files = wu.findbyid(id);
            return ModouResult.build(200,"success",files);
        }catch(Exception ex){
            return ModouResult.build(400,"error");
        }
    }



    //大文件上传
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(String status, FileInfo info, @RequestParam(value = "file", required = false) MultipartFile file,HttpSession session)throws Exception{

        Users  user = (Users)session.getAttribute("user");

        if(status == null){	//文件上传
            if(file != null && !file.isEmpty()){	//验证请求不会包含数据上传，所以避免NullPoint这里要检查一下file变量是否为null
                try {
                    File target = wu.getReadySpace(info, this.uploadFolder);	//为上传的文件准备好对应的位置
                    if(target == null){
                        return "{\"status\": 0, \"message\": \"" + wu.getErrorMsg() + "\"}";
                    }

                    file.transferTo(target);	//保存上传文件

                    //将MD5签名和合并后的文件path存入持久层，注意这里这个需求导致需要修改webuploader.js源码3170行
                    //因为原始webuploader.js不支持为formData设置函数类型参数，这将导致不能在控件初始化后修改该参数
                    if(info.getChunks() <= 0){
                        if(!wu.saveMd52FileMap(info.getMd5(), target.getName(),file.getOriginalFilename(),user.getId(),target)){
                            log.error("文件[" + info.getMd5() + "=>" + target.getName() + "]保存关系到持久成失败，但并不影响文件上传，只会导致日后该文件可能被重复上传而已");
                        }
                    }

                    return "{\"status\": 1, \"path\": \"" + target.getName() + "\"}";

                }catch(IOException ex){
                    log.error("数据上传失败", ex);
                    return "{\"status\": 0, \"message\": \"数据上传失败\"}";
                }
            }
        }else{
            if(status.equals("md5Check")){	//秒传验证

                String path = wu.md5Check(info.getMd5());

                if(path == null){
                    return "{\"ifExist\": 0}";
                }else{
                    return "{\"ifExist\": 1, \"path\": \"" + path + "\"}";
                }

            }else if(status.equals("chunkCheck")){	//分块验证

                //检查目标分片是否存在且完整
                if(wu.chunkCheck(this.uploadFolder + "/" + info.getName() + "/" + info.getChunkIndex(), Long.valueOf(info.getSize()))){
                    return "{\"ifExist\": 1}";
                }else{
                    return "{\"ifExist\": 0}";
                }

            }else if(status.equals("chunksMerge")){	//分块合并



                String path = wu.chunksMerge(info.getName(), info.getExt(), info.getChunks(), info.getMd5(), this.uploadFolder,info.getOriginalName(),user.getId());
                if(path == null){
                    return "{\"status\": 0, \"message\": \"" + wu.getErrorMsg() + "\"}";
                }

                return "{\"status\": 1, \"path\": \"" + path + "\", \"message\": \"中文测试\"}";
            }
        }

        log.error("请求参数不完整");
        return "{\"status\": 0, \"message\": \"请求参数不完整\"}";
    }

    //删除
    @RequestMapping(value = "removeFile", method = RequestMethod.POST)
    @ResponseBody
    public String removeFile(String fileName,String extension){
        wu.removeFile(fileName,this.uploadFolder,extension);
        return "success";
    }
}
