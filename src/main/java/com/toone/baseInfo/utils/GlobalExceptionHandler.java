package com.toone.baseInfo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ControllerAdvice注解 全局捕获异常的类
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 全局捕获异常
     * ExceptionHandler 表示要拦截的异常
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity globalExceptionResult(Exception ex){
        logger.info(ex.getMessage());
        return ResponseUtil.exceptionFail(ex.getMessage().toString());
    }

    /**
     * 处理 Exception 异常
     *
     * @param httpServletRequest httpServletRequest
     * @param e                  异常
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
        logger.error("服务错误:", e);
        return ResponseUtil.exceptionFail(e.getMessage().toString());
    }

}
