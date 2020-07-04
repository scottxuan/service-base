package com.service.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author : pc
 * @date : 2020/7/2
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.service.base.mapper"})
@ComponentScan(basePackages = {"com.scottxuan","com.service.base"})
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }
}
