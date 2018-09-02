package com.modou.elearning.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashIterations(3);       //三列次数
        matcher.setHashAlgorithmName("MD5");  //使用MD5三列算法进行加密
        return matcher;
    }
}
