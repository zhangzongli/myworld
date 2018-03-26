package com.wang.xiao.miao.task;

import com.wang.xiao.miao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangzl on 2018/3/21.
 */
public class RunnableTask implements Runnable {

    @Autowired
    private HelloService helloService;

    @Override
    public void run() {
        helloService.test1();
        helloService.test2();
    }
}
