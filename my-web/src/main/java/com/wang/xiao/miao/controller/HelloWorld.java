package com.wang.xiao.miao.controller;

import com.wang.xiao.miao.domain.UserInfo;
import com.wang.xiao.miao.model.ErrorInfo;
import com.wang.xiao.miao.service.HelloServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Api(tags = "hello", description = "hello")
@RestController
@RequestMapping("/api/v1")
public class HelloWorld {

    @Autowired
    private HelloServiceImpl helloService;

    @ApiOperation(value = "hello", notes = "hello")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "请求参数出错, code:{10204:请求参数类型检查出错}", response = ErrorInfo.class),
            @ApiResponse(code = 401, message = "未经授权", response = ErrorInfo.class),
            @ApiResponse(code = 403, message = "权限不够", response = ErrorInfo.class)
    })
    @RequestMapping("/hello")
    public List<UserInfo> index(){
//        return helloService.getTestList("1");
        return null;
    }

    @ApiOperation(value = "hello1", notes = "hello1")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "请求参数出错, code:{10204:请求参数类型检查出错}", response = ErrorInfo.class),
            @ApiResponse(code = 401, message = "未经授权", response = ErrorInfo.class),
            @ApiResponse(code = 403, message = "权限不够", response = ErrorInfo.class)
    })
    @RequestMapping("/hello1")
    public List<UserInfo> index1(){
//        return helloService.getTestList("2");
        return null;
    }
}
