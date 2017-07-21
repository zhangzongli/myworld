package com.wang.xiao.miao.repo;

import com.wang.xiao.miao.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
public interface TestRepository extends JpaRepository<Test, String>{

    @Query("select t from Test t")
    List<Test> getTestList();

}
