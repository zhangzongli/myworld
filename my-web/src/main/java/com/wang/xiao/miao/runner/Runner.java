package com.wang.xiao.miao.runner;

import com.wang.xiao.miao.config.ThreadPoolConfig;
import com.wang.xiao.miao.service.HelloService;
import com.wang.xiao.miao.service.StartService;
import com.wang.xiao.miao.task.RunnableTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

/**
 * Created by zhangzl on 2018/3/21.
 */
@Component
public class Runner  implements CommandLineRunner{

    @Autowired
    private StartService startService;

    @Override
    public void run(String... args) throws Exception {

//        StartService startService = new StartService();
        startService.start();

//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-poo-").build();
//        ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS,
//               new LinkedBlockingQueue<Runnable> (1024)) ;
//        ExecutorService pool = ThreadPoolExecutor.new(10);
//        ExecutorService pool = Executors.newCachedThreadPool();


    }
}
