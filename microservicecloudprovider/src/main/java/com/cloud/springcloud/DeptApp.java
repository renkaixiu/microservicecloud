package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dongao on 2018/11/23.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.cloud.springcloud")
public class DeptApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptApp.class,args);
    }
}
