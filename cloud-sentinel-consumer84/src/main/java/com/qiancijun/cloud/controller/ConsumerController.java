package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    public String payment(@PathVariable("id") int id) {
        return paymentService.payment(id);
    }
}
