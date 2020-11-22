package com.hbh.base.utils;

/**
 * 状态码返回枚举类
 */
public enum ResponseEnum{
    SUCCESS(200,"成功"),
    FAIL(-1,"失败"),
    ERROE_400(400,"错误的请求"),
    ERROE_401(401,"请先登录"),
    ERROE_402(402,"登陆失败"),
    ERROE_405(405,"token为空"),
    ERROE_406(406,"token不合法"),
    ERROE_407(407,"参数错误"),
    ERROE_403(403,"账号或者密码错误");
    private Integer code;
    private String msg;
    ResponseEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

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
}
