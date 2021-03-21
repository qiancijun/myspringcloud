package com.qiancijun.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/{id}")
    public String payment(@PathVariable("id") int id) {
        if (id == 2) {
            throw new IllegalArgumentException("参数错误");
        } else if (id == 1) {
            throw new RuntimeException("运行时错误");
        }
        return port + " " + id;
    }

}