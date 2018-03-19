package com.wang.xiao.miao.controller;

import com.wang.xiao.miao.domain.Test;
import com.wang.xiao.miao.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Api(tags = "AlarmLog", description = "告警信息")
@RestController
public class HelloWorld {

    @Autowired
    private HelloService helloService;

    @ApiOperation(value = "根据电站ID和时间范围获取电站告警记录", notes = "根据电站ID和时间范围获取电站告警记录")
    @RequestMapping("/hello")
    public List<Test> index(){
        return helloService.getTestList("1");
    }

    @RequestMapping("/hello1")
    public List<Test> index1(){
        return helloService.getTestList("2");
    }
}
