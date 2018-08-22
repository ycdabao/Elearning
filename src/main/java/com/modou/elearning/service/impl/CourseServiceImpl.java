package com.modou.elearning.service.impl;

import com.modou.elearning.service.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {

    @Override
    public String saveCover(MultipartFile file,String path)throws IOException {
        String originalFilename = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File(path+ java.io.File.separator+filename));

        return filename;
    }
}
