package com.wang.xiao.miao.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzl on 2018/3/19.
 */
@Component
public class Runner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("这里是项目启动运行程序");
    }
}
