package com.example.dubbo;

import com.example.dubbo.api.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication
public class AppScheduled {

    @Autowired
    private ScheduledService scheduledService;

    public static void main(String[] args) {
//        SpringApplication.run(AppScheduled.class);
        new SpringApplicationBuilder(AppScheduled.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);
    }

    @Scheduled(cron = "*/1 * * * * ?")
    public void init(){
        scheduledService.cleanUsers("1000");
    }

}
