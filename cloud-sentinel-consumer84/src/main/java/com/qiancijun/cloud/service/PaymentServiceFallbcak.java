package com.qiancijun.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallbcak implements PaymentService {
    @Override
    public String payment(int id) {
        return "Feign服务降级";
    }
}
