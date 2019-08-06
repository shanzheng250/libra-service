package com.shanz.dto;

import com.shanz.abs.AbstractRequest;

import java.io.Serializable;

/**
 * @ClassName UserRegisterRequest
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class UserRegisterRequest extends AbstractRequest implements Serializable{

    private static final long serialVersionUID = -4807481139973253990L;

    private String username;

    private String password;

    private String mobile;

    private String sex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserRegisterRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex='" + sex + '\'' +
                "} " + super.toString();
    }
}
