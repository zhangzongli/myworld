package com.wang.xiao.miao.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.List;

/**
 * Created by cuckoo on 16/12/2016.
 * 错误信息类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorInfo {
    /**
     * 出错时间
     */
    protected Calendar timestamp;

    /**
     * 请求URL
     */
    protected String path;

    /**
     * 错误编码
     */
    protected Integer code;

    /**
     * 错误信息
     */
    protected String message;

    /**
     * 多条错误信息
     */
    protected List<Error> errors;

    public ErrorInfo() {
        this.timestamp = Calendar.getInstance();
    }

    public ErrorInfo(HttpServletRequest request, Integer code) {
        this.timestamp = Calendar.getInstance();
        this.path = request.getRequestURI();
        this.code = code;
    }

    public ErrorInfo(HttpServletRequest request, ErrorCode code) {
        this.timestamp = Calendar.getInstance();
        this.path = request.getRequestURI();
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public ErrorInfo(HttpServletRequest request, ErrorCode code, String message) {
        this.timestamp = Calendar.getInstance();
        this.path = request.getRequestURI();
        this.code = code.getCode();
        this.message = message;
    }

    public ErrorInfo(HttpServletRequest request, Integer code, String message) {
        this.timestamp = Calendar.getInstance();
        this.path = request.getRequestURI();
        this.code = code;
        this.message = message;
    }

    @ApiModelProperty(value = "请求URL", required = true)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @ApiModelProperty(value = "多条错误信息的列表")
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @ApiModelProperty(value = "错误编码", required = true)
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @ApiModelProperty(value = "错误信息", required = true)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @ApiModelProperty(value = "出错时间", required = true)
    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }
}
