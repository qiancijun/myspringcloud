package com.qiancijun.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String ok(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String timeOut(@PathVariable("id") Long id);
}
