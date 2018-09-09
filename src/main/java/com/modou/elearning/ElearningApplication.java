package com.modou.elearning;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.modou.elearning.mapper")
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.modou.app","com.modou.elearning"})
public class ElearningApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(ElearningApplication.class, args);
    }

    @Override
    //为了打包springboot项目
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
