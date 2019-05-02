package com.example.dubbo.user;

import com.example.dubbo.api.LiveService;
import com.example.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 马秀成
 * @date 2019/4/26
 * @jdk.version 1.8
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    private LiveService liveService;

    @Override
    public String echo(String message) {
        String userName = liveService.getUserNameByLives("直播模块呀");
        return "[echo] Hello, " + message + userName;
    }

}

