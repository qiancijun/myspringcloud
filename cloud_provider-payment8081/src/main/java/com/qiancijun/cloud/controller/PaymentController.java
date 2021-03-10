package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.entities.CommonResult;
import com.qiancijun.cloud.entities.Payment;
import com.qiancijun.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        Integer res = paymentService.create(payment);
        log.info("{}", res);
        if (res > 0) {
            return new CommonResult(200, "success " + port, res);
        } else {
            return new CommonResult(200, "fail");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("{}", payment);
        if (payment != null) {
            return new CommonResult(200, "success " + port, payment);
        } else {
            return new CommonResult(200, "fail");
        }
    }

    @GetMapping("/payment/discory")
    public Object discory() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId() + '\t' + instance.getPort() + '\t' + instance.getHost() + '\t' + instance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String lb() {
        return port;
    }
}
