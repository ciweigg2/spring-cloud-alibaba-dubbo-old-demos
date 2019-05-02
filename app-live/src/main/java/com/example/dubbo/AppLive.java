package com.example.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class AppLive {

    public static void main(String[] args) {
//        SpringApplication.run(DubboSpringCloudServerBootstrap.class);
        new SpringApplicationBuilder(AppLive.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);
    }

}
