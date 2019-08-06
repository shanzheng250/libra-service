package com.shanz.dto;

import com.shanz.abs.AbstractResponse;

import java.io.Serializable;

/**
 * @ClassName UserRegisterResponse
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class UserRegisterResponse extends AbstractResponse implements Serializable{

    private static final long serialVersionUID = -7690077437344492561L;

    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
