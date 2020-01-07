package com.porridgez.springboot_day1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.porridgez.springboot_day1.SqlMapper")
@SpringBootApplication
public class SpringbootDay1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDay1Application.class, args);
    }

}
