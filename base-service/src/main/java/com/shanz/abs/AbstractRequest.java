package com.shanz.abs;

import java.io.Serializable;

/**
 * @ClassName AbstractRequest
 * @Description: 请求默认
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public abstract class AbstractRequest implements Serializable {

    private static final long serialVersionUID = -5388747731737252810L;

    @Override
    public String toString() {
        return "AbstractRequest{}";
    }
}
