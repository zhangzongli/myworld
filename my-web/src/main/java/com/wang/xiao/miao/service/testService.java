package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.UserInfo;
import com.wang.xiao.miao.repo.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by zhangzl on 2018/1/22.
 */
@Service
public class testService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Scheduled(fixedDelay = 10000)
    public void test() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("1111");
        userInfoRepository.save(userInfo);
    }
}
