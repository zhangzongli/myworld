package com.wang.xiao.miao.runner;

import com.wang.xiao.miao.service.HourRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by zhangzl on 2018/3/19.
 */
@Component
public class Runner implements CommandLineRunner{

    private static final SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Bean
    public ThreadPoolTaskScheduler trPoolTaskScheduler(){
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(10);
        return threadPoolTaskScheduler;
    }

    private final static Logger log = LoggerFactory.getLogger(Runner.class);

    private String projectId = "";

    @Override
    public void run(String... args) throws Exception {
        //定时器测试
        System.out.println("这里是项目启动运行程序1111");

        projectId = "1";

        HourRunner hourRunner = new HourRunner();
        hourRunner.setProjectId(projectId);
        log.info("当前时间" + sf.format(Calendar.getInstance().getTime()));
        threadPoolTaskScheduler.schedule(hourRunner, new CronTrigger("*/20 * * * * *"));
//        DayRunner dayRunner = new DayRunner();
//        dayRunner.setProjectId("2");
//        threadPoolTaskScheduler.schedule(dayRunner, new CronTrigger("*/5 * * * * *"));


    }
}
