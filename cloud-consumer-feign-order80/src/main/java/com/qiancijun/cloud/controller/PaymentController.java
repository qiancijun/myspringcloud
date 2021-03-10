package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.entities.CommonResult;
import com.qiancijun.cloud.entities.Payment;
import com.qiancijun.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        return paymentFeignService.get(id);
    }
}
