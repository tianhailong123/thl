package cn.jiun.ssm.config;

import cn.jiun.ssm.interceptor.Myinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private Myinterceptor myinterceptor;

    public void addInterceptors(InterceptorRegistry registry){
    registry.addInterceptor(myinterceptor).addPathPatterns("/**");
    }


}
