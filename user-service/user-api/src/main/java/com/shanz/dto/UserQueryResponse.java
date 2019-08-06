package com.shanz.dto;

import com.shanz.abs.AbstractResponse;

import java.io.Serializable;

/**
 * @ClassName UserQueryResponse
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public class UserQueryResponse extends AbstractResponse implements Serializable{
    private static final long serialVersionUID = -1477838039558773615L;

    private String realName;

    private String avatar;

    private String mobile;

    private String sex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
        return "UserQueryResponse{" +
                "realName='" + realName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex='" + sex + '\'' +
                "} " + super.toString();
    }
}
