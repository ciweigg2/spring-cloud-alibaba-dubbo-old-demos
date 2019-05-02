package com.example.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 马秀成
 * @date 2019/4/26
 * @jdk.version 1.8
 * @desc
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
@MapperScan("com.example.dubbo.mybatis.mapper")
public class AppUser {

    public static void main(String[] args) {
//        SpringApplication.run(DubboSpringCloudServerBootstrap.class);
        new SpringApplicationBuilder(AppUser.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);
    }
}

