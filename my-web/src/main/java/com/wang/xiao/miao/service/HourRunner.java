package com.wang.xiao.miao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzl on 2018/3/20.
 */
@Component
public class HourRunner implements Runnable {

    @Autowired
    private HelloService helloService;

    private String projectId;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public void run() {

//        HelloServiceImpl helloService = new HelloServiceImpl();
//        helloService.setProjectId(projectId);
        helloService.SchedulingOne();
    }
}
