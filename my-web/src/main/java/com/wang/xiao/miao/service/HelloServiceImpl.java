package com.wang.xiao.miao.service;

import com.wang.xiao.miao.domain.UserInfo;
import com.wang.xiao.miao.repo.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserInfoRepository userInfoRepository;

//    public List<UserInfo> getTestList(String id) {
//        List<UserInfo> userInfoList = userInfoRepository.getTestList(id);
//        return userInfoList;
//    }
}
