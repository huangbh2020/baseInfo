package com.toone.baseInfo.utils;

import java.io.Serializable;

/**
 * 统一返回的json格式数据
 * @param <T>
 */
public class ResponseEntity<T> implements Serializable {
    private static long SerializableUID=3595741978061989861L;
    private Integer code; //状态码
    private String msg;//返回信息
    private T data;// 返回数据
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
