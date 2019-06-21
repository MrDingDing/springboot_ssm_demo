package com.my;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//包含三个 扫描注解   自动配置注解
@SpringBootApplication
@EnableSwagger2
@MapperScan(value = "com.my.dao")
public class MainApplication {
    public static void main(String[] args) {
        //此处形参为主类的名称
        SpringApplication.run(MainApplication.class,args);
    }
}

