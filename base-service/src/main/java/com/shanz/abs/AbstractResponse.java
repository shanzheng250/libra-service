package com.shanz.abs;

import java.io.Serializable;

/**
 * @ClassName AbstractResponse
 * @Description: 默认的返回结果
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public abstract class AbstractResponse implements Serializable {

    private static final long serialVersionUID = -6158333386623055045L;

    private String code;    //状态码

    private String message; //信息

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AbstractResponse{}";
    }
}
