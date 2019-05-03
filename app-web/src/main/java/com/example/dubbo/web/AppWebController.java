package com.example.dubbo.web;

import com.example.dubbo.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@RestController
@Slf4j
public class AppWebController {

    @Reference
    private UserService userService;

    @GetMapping("/echo")
    public String echo(String message) throws IOException {
        log.info(message);
        return userService.echo(message);
    }

}
