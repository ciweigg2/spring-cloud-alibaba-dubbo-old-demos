package com.example.dubbo.web;

import com.example.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@RestController
public class AppWebController {

    @Reference
    private UserService userService;

    @GetMapping("/echo")
    public String echo(String message) {
        return userService.echo(message);
    }

}
