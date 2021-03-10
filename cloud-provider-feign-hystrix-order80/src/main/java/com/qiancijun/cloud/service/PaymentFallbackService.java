package com.qiancijun.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public String ok(Long id) {
        return "远程服务挂了";
    }

    @Override
    public String timeOut(Long id) {
        return "远程服务挂了";
    }
}
