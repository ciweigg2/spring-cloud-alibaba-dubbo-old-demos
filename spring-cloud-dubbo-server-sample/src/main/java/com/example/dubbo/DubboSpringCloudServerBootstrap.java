package com.example.dubbo;

import org.springframework.boot.SpringApplication;
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
public class DubboSpringCloudServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringCloudServerBootstrap.class);
//        new SpringApplicationBuilder(DubboSpringCloudServerBootstrap .class)
//                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
//                .run(args);
    }
}

