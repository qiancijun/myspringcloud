package com.qiancjun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderNacos9001MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderNacos9001MainApplication.class ,args);
    }
}
