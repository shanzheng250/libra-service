package com.shanz.dto;

import com.shanz.abs.AbstractResponse;

/**
 * @ClassName CheckAuthRequest
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class CheckAuthResponse extends AbstractResponse {

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CheckAuthResponse{" +
                "uid='" + uid + '\'' +
                "} " + super.toString();
    }
}
