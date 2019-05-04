package com.example.dubbo.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.dubbo.api.LiveService;
import com.example.dubbo.api.UserService;
import com.example.dubbo.mybatis.entity.User;
import com.example.dubbo.mybatis.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 马秀成
 * @date 2019/4/26
 * @jdk.version 1.8
 * @desc
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Reference
    private LiveService liveService;

    @Autowired
    private UserMapper userMapper;

    @Override
    public String echo(String message) {
        userMapper.update(
                new User().setUserName("测试分布式事务"),
                new LambdaQueryWrapper<User>().eq(User::getUserName, "haha")
        );
        String userName = liveService.getUserNameByLives("直播模块呀");
        //模拟事务回滚
//        int a = 1/0;
        return "[echo] Hello, " + message + userName;
    }

}

