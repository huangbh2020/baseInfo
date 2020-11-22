package com.hbh.base.utils;

import cn.hutool.json.JSONObject;

public class ResponseUtil {
    /**
     * 成功返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<T> success(T data){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(ResponseEnum.SUCCESS.getCode());
        responseEntity.setMsg(ResponseEnum.SUCCESS.getMsg());
        responseEntity.setData(data);
        return responseEntity;
    }
    /**
     * 失败返回
     * @param responseEnum
     * @return
     */
    public static ResponseEntity fail(ResponseEnum responseEnum){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(responseEnum.getCode());
        responseEntity.setMsg(responseEnum.getMsg());
        return  responseEntity;
    }
    /**
     * 全局异常信息
     * @param errorMessage 抛出的异常信息
     * @return
     */
    public static ResponseEntity exceptionFail(String errorMessage){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(-1);
        responseEntity.setMsg(errorMessage);
        return responseEntity;
    }

    /**
     * 没有登陆返回
     * @return
     */
public static String noLoginMsg(){
        JSONObject returnObj = new JSONObject();
        returnObj.put("code","401");
        returnObj.put("msg","未登陆");
        return returnObj.toString();
    }


    public static String fail(String code,String msg){
        JSONObject returnObj = new JSONObject();
        returnObj.put("code",code);
        returnObj.put("msg",msg);
        return returnObj.toString();
    }


}
