package com.qiancijun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SentinelConsumer84MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumer84MainApplication.class ,args);
    }
}
