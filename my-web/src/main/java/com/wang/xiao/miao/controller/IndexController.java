package com.wang.xiao.miao.controller;

import com.wang.xiao.miao.model.ErrorInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangzl on 2017/12/19.
 */
@Api(tags = "index", description = "index")
@Controller
public class IndexController {

    @ApiOperation(value = "index", notes = "index")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "请求参数出错, code:{10204:请求参数类型检查出错}", response = ErrorInfo.class),
            @ApiResponse(code = 401, message = "未经授权", response = ErrorInfo.class),
            @ApiResponse(code = 403, message = "权限不够", response = ErrorInfo.class)
    })
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
