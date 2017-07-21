package com.wang.xiao.miao.repo;

import com.wang.xiao.miao.domain.Test;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by zhangzl on 2017/7/21.
 */
@CacheConfig(cacheNames = "test")
public interface TestRepository extends JpaRepository<Test, String>{

    @Cacheable
    @Query("select t from Test t where id = :id")
    List<Test> getTestList(@Param("id") String id);

}
