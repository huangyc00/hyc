package com.hyc.msg.handler;

import com.hyc.msg.Response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hyc
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    //统一的异常处理
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handle(Exception e){
//        if(e instanceof GirlException){
//            GirlException girlException= (GirlException) e;
//            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
//        }else {
//            logger.error("系统异常{}",e);
//            return ResultUtil.error(-1, "未知错误");
//        }
        return Response.fail("未知错误");
    }
}
