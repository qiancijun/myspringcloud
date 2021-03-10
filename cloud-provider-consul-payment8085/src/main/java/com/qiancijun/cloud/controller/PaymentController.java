package com.qiancijun.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/consul")
    public String payment() {
        return "cloud with consul:" + port + '\t' + UUID.randomUUID().toString();
    }
}
