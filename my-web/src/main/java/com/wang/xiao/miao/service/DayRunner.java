package com.wang.xiao.miao.service;

import org.springframework.stereotype.Component;

/**
 * Created by zhangzl on 2018/3/20.
 */
@Component
public class DayRunner implements Runnable {

    private String projectId;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public void run() {

        HelloServiceImpl helloService = new HelloServiceImpl();
        helloService.setProjectId(projectId);
        helloService.SchedulingTwo();
    }
}
