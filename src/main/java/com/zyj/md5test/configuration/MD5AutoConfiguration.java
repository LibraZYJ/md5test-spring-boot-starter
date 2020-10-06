package com.zyj.md5test.configuration;

import com.zyj.md5test.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yujie_Zhao
 * @ClassName MD5AutoConfiguration
 * @Description TODO
 * @Date 2020/10/6  19:33
 * @Version 1.0
 **/
@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}