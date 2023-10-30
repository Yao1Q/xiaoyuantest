package org.example.gongchengjixie.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception{

        Object currentObject = request.getSession().getAttribute("CURRENT");

        if (null == currentObject) {
            response.getWriter().append(Result.notLogin("").toJSONString());
            return false;
        }



        return true ;
    }
}
