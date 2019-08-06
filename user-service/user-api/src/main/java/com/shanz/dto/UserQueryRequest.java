package com.shanz.dto;

import com.shanz.abs.AbstractRequest;

import java.io.Serializable;

/**
 * @ClassName UserQueryRequest
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class UserQueryRequest extends AbstractRequest implements Serializable{
    private static final long serialVersionUID = 7306023298178530119L;

    private Integer uid;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


}
