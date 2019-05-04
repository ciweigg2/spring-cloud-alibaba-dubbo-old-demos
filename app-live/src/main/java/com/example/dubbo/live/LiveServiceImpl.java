package com.example.dubbo.live;

import com.example.dubbo.api.LiveService;
import com.example.dubbo.mybatis.entity.Live;
import com.example.dubbo.mybatis.mapper.LiveMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@Service
@Transactional
public class LiveServiceImpl implements LiveService {

    @Autowired
    private LiveMapper liveMapper;

    @Override
    public String getUserNameByLives(String userName) {
        liveMapper.insert(new Live().setLiveName("卡莎直播呀"));
        //模拟事务回滚
        int a = 1/0;
        return userName;
    }

}
