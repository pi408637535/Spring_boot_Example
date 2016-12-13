package config;

import inspect.version.UserSecurityInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by pigaunghua on 2016/12/13.
 */
//@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    // 多个拦截器组成一个拦截器链
    // addPathPatterns 用于添加拦截规则
    // excludePathPatterns 用户排除拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserSecurityInterceptor()).addPathPatterns("/**");
       // registry.addInterceptor(new UserSecurityInterceptor()).addPathPatterns("/**");

        super.addInterceptors(registry);
    }
}


