package com.wang.xiao.miao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by zhangzl on 2018/3/21.
 */
@Service
public class SchduleService {

//    private static HelloService helloService = new HelloService();

    @Autowired
    private HelloService helloService;

    @Scheduled(cron = "*/2 * * * * *")
    public void scheduleTest1() {
        helloService.test1();
    }

    @Scheduled(cron = "*/2 * * * * *")
    public void scheduleTest2() {
        helloService.test2();
    }
}
