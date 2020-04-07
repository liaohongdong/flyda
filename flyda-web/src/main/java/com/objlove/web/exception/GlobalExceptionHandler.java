package com.objlove.web.exception;

import com.objlove.util.dto.JsonData;
import com.objlove.util.enums.HttpStatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public JsonData defaultErrorHandler(HttpServletRequest req, HttpServletResponse res, Object o, Exception e) {
        log.error("ExceptionHandler ===>" + e.getMessage());
//        StackTraceElement[] stackTrace = e.getStackTrace();
//        for (int i = 0; i < stackTrace.length; i++) {
//            System.out.println(stackTrace[i]);
//        }
        log.error("Object ==========>>>" + o);
        StringBuffer requestURL = req.getRequestURL();
        log.info("url -------------->" + requestURL);
//        if (e instanceof ParamException) {
//            return JsonData.build("请求参数格式不正确", HttpStatusCode.BAD_REQUEST.getCode());
//        }
//        if (e instanceof ParamException) {
        if (e instanceof BindException) {
            return JsonData.build("请求参数格式不正确", HttpStatusCode.BAD_REQUEST.getCode());
        }
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("stackTrace", e.getStackTrace());
//        mv.addObject("errorMessage", e.getMessage());
//        mv.addObject("url", req.getRequestURL());
//        mv.setViewName("forward:/500");
//        return mv;
        return JsonData.build("服务器错误", 500);
    }
}
