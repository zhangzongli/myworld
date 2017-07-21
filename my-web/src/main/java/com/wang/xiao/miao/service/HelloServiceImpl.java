package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> getTestList() {
        List<Test> testList = testRepository.getTestList();
        return testList;
    }
}
