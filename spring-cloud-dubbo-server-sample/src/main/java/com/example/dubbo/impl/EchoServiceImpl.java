package com.example.dubbo.impl;

import com.example.dubbo.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 马秀成
 * @date 2019/4/26
 * @jdk.version 1.8
 * @desc
 */
@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }

}

