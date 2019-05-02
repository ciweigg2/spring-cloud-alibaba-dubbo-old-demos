package com.example.dubbo.api;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
public interface ScheduledService {

    /**
     * 定时清理数据库过期的用户
     *
     * @param timeOut 超时时间呀
     */
    void cleanUsers(String timeOut);

}
