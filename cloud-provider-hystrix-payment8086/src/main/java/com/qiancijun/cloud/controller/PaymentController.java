package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String ok(@PathVariable("id") Long id) {
        return paymentService.PaymentInfo(id);
    }
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String timeOut(@PathVariable("id") Long id) {
        return paymentService.PaymentInfoTimeOut(id);
    }

    // 服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Long id) {
        String result = paymentService.paymentCircuitBreaker(id);
        return result;
    }
}
