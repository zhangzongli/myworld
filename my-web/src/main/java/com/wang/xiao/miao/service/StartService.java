package com.wang.xiao.miao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangzl on 2018/3/21.
 */
@Component
public class StartService {

    @Autowired
    private HelloService helloService;

    @Autowired
    private ExecutorService pool;

    public void start() {
//        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
//                HelloService helloService = new HelloService();
                helloService.test1();
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                HelloService helloService = new HelloService();
                helloService.test2();
            }
        });

        pool.isShutdown();
    }
}
