package com.porridgez.springboot_day1.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid(){
        //@ConfigurationProperties(prefix = "spring.datasource")可以对DruidDatasource中的属性进行配置
        return new DruidDataSource();
    }
}