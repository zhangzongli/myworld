package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.repo.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Service
public class HelloService {

    private static final Logger log = LoggerFactory.getLogger(HelloService.class);

    private static final SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    private static int one = 0;

    private static int two = 0;

//    private Lock lock = new ReentrantLock();

    private static boolean lock = true;


    @Autowired
    private TestRepository testRepository;

    public List<Test> getTestList(String id) {
        List<Test> testList = testRepository.getTestList(id);
        return testList;
    }

//    @Async
    public synchronized void test1() {
//        while (lock) {
//                lock = false;
//                try{
//                one = one + 1;
//                log.info("test1第"+one+"次执行开始"+sf.format(Calendar.getInstance().getTime()));
//                Thread.sleep(10000L);
//                log.info("test1第"+one+"次执行执行完毕"+sf.format(Calendar.getInstance().getTime()));
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//            lock = true;
//            return;
//        }
//        try{
//            Thread.sleep(10000L);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        test1();

        try{
            one = one + 1;
            log.info("test1第"+one+"次执行开始"+sf.format(Calendar.getInstance().getTime()));
            Thread.sleep(10000L);
            log.info("test1第"+one+"次执行完毕"+sf.format(Calendar.getInstance().getTime()));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Async
    public synchronized void test2() {
        try{
            two = two + 1;
            log.info("test2第"+two+"次执行开始"+sf.format(Calendar.getInstance().getTime()));
            Thread.sleep(5000L);
            log.info("test2第"+two+"次执行完毕"+sf.format(Calendar.getInstance().getTime()));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Scheduled(cron = "*/2 * * * * *")
//    public void scheduleTest1() {
//        test1();
//    }
//
//    @Scheduled(cron = "*/2 * * * * *")
//    public void scheduleTest2() {
//        test2();
//    }

    public void start() {
        test1();
        test2();

    }
}
