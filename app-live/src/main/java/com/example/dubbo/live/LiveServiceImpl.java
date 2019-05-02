package com.example.dubbo.live;

import com.example.dubbo.api.LiveService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@Service
public class LiveServiceImpl implements LiveService {

    @Override
    public String getUserNameByLives(String userName) {
        return userName;
    }

}
