package com.example.dubbo.scheduled;

import com.example.dubbo.annotation.RedisLock;
import com.example.dubbo.api.ScheduledService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@Service
@Slf4j
public class ScheduledServiceImpl implements ScheduledService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 定时清理数据库过期的用户
     *
     * @param timeOut 超时时间呀
     */
    @Override
    @RedisLock(lockPrefix = "hello",lockKey = "world",timeOut = "#timeOut")
    public void cleanUsers(String timeOut) {
        log.info("哈哈");
    }

}
