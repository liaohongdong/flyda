package com.objlove.web.exception;

import com.objlove.util.dto.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SpringExceptionResolver implements HandlerExceptionResolver {

    private Logger log = LoggerFactory.getLogger(SpringExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURL().toString();
        ModelAndView mv;
        String defaultMsg = "System error";
        if (e instanceof ParamException) {
            JsonData data = JsonData.fail(e.getMessage());
            mv = new ModelAndView("404", data.map());
        } else {
            JsonData data = JsonData.fail(e.getMessage());
            mv = new ModelAndView("500", data.map());
        }
        return mv;
    }
}
