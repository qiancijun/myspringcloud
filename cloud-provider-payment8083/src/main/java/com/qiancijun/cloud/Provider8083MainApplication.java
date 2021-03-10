package com.qiancijun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider8083MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Provider8083MainApplication.class, args);
    }
}
