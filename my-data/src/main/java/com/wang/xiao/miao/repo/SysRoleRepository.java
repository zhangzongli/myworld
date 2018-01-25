package com.wang.xiao.miao.repo;

import com.wang.xiao.miao.domain.SysPermission;
import com.wang.xiao.miao.domain.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangzl on 2017/12/21.
 */
@Repository
public interface SysRoleRepository extends JpaRepository<SysRole, Long> {


    /**
     * 通过ID 获取角色信息
     * @param id
     * @return
     */
    SysRole findTopById(Long id);

}
