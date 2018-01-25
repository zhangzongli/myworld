package com.wang.xiao.miao.repo;

import com.wang.xiao.miao.domain.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhangzl on 2017/12/21.
 */
public interface SysPermissionRepository extends JpaRepository<SysPermission, Long> {


    SysPermission findTopById(Long id);

}
