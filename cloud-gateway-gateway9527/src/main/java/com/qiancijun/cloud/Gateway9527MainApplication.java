package com.qiancijun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Gateway9527MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527MainApplication.class, args);
    }
}
