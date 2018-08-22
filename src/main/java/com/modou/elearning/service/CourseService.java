package com.modou.elearning.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CourseService {

    public String saveCover(MultipartFile file,String path) throws IOException;
}
