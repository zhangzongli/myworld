package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.repo.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Service
public class HelloServiceImpl implements HelloService{

    private String projectId;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    private final static Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Autowired
    private TestRepository testRepository;

    private static final SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
    public List<Test> getTestList(String id) {
        List<Test> testList = testRepository.getTestList(id);
        return testList;
    }

//    @Scheduled(cron = "*/5 * * * * *")
    @Override
    public void SchedulingOne() {
        synchronized (this) {
            log.info("这里是第一个定时器"+ sf.format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    @Scheduled(cron = "*/1 * * * * *")
    public void SchedulingTwo() {
        log.info("这里是第二个定时器"+ sf.format(Calendar.getInstance().getTime()));
    }

}
