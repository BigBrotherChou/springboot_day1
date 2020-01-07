package com.porridgez.springboot_day1.config;

import com.porridgez.springboot_day1.conponent.LoginInterceptor;
import com.porridgez.springboot_day1.conponent.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//创建一个的配置类，这个配置类也就是管理一个或多个bean 的配置类，并在其内部声明一个@bean，并创建其对应的实体类
@Configuration
public class MyMVCConfig implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/dashboard/**").excludePathPatterns("/asserts/**");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/dashboard").excludePathPatterns("/asserts/**");
    }

    //配置国际化
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
