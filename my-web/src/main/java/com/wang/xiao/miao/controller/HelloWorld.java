package com.wang.xiao.miao.controller;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.service.HelloService;
import com.wang.xiao.miao.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@RestController
public class HelloWorld {

    @Autowired
    private HelloServiceImpl helloService;

    @RequestMapping("/hello")
    public List<Test> index(){
        return helloService.getTestList("1");
    }

    @RequestMapping("/hello1")
    public List<Test> index1(){
        return helloService.getTestList("2");
    }
}
