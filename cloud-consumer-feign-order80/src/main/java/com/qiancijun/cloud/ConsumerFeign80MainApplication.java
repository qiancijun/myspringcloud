package com.qiancijun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeign80MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign80MainApplication.class, args);
    }
}
