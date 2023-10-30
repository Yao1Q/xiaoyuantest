//package org.example.gongchengjixie.common;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.PrintWriter;
//
//@Configuration
//public class SystemConfig implements WebMvcConfigurer{
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new HandlerInterceptor() {
//            @Override
//            public boolean preHandle(
//                    HttpServletRequest request,
//                    HttpServletResponse response,
//                    Object handler) throws Exception {
//                HttpSession session = request.getSession();
//
//                if (null == session.getAttribute("CURRENT")){
//                    response.setContentType("application/json;charset=UTF-8");
//                    PrintWriter out = response.getWriter();
//                    out.write(Result.notLogin(null).toJSONString());
//                    out.flush();
//                    out.close();
//
//                    return false;
//                }
//
//                return true;
//            }
//        }).addPathPatterns("/**").excludePathPatterns("/system/**");
//    }
//}
