package com.chj.util;

import java.io.Serializable;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 10:15
 * @params :
 */
public class ResultMap implements Serializable {
    /**
     * 20000,40000
     */
    private String code;
    /**
     * 返回语句
     */
    private String msg;
    /**
     * 返回对象
     */
    private Object data;

    public ResultMap(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
