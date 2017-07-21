package com.wang.xiao.miao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhangzl on 2017/7/21.
 */
@Entity
@Table(name = "Test")
public class Test {

    @Id
    private String id;

    private String valueStr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

}
