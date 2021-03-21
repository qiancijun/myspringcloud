package com.qiancijun.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-sentinel-service", fallback = PaymentServiceFallbcak.class)
public interface PaymentService {
    @GetMapping("/payment/{id}")
    public String payment(@PathVariable("id") int id);
}
