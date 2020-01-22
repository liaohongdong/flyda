package com.objlove.util;

import com.objlove.util.dto.JsonData;
import com.objlove.util.exception.ParamException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpringExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURL().toString();
        ModelAndView mv;
        String defaultMsg = "System error";
        if (e instanceof ParamException) {
            JsonData data = JsonData.fail(e.getMessage());
            mv = new ModelAndView("jsonView", data.map());
        } else {
            JsonData data = JsonData.fail(e.getMessage());
            mv = new ModelAndView("jsonView", data.map());
        }
        return mv;
    }
}
