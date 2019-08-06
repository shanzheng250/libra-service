package com.shanz.dto;

import java.io.Serializable;

/**
 * @ClassName UserLoginRequest
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 686223598602505582L;
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
