package net.xdclass.online_xdclass.config;

import net.xdclass.online_xdclass.intercepter.LoginIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置  /api/v1/pri
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Bean
    LoginIntercepter loginIntercepter() {
        return new LoginIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截全部
        registry.addInterceptor(loginIntercepter()).addPathPatterns("/api/v1/pri/*/*/**")
                // 放行指定的路径
                .excludePathPatterns("/api/v1/pri/user/login", "/api/v1/pri/user/register");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
