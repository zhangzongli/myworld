package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.repo.TestRepository;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Service
public class HelloService {

    @Autowired
    private TestRepository testRepository;

    private static final SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
    public List<Test> getTestList(String id) {
        List<Test> testList = testRepository.getTestList(id);
        return testList;
    }

    @Scheduled(fixedDelay = 1000)
    public void SchedulingOne() {
        System.out.println("这里是第一个定时器"+ sf.format(Calendar.getInstance().getTime()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(fixedDelay = 1000)
    public void SchedulingTwo() {
        System.out.println("这里是第二个定时器"+ sf.format(Calendar.getInstance().getTime()));
    }


}
