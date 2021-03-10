package com.qiancijun.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@DefaultProperties(defaultFallback = "globalFallbackMethod")
public class PaymentService {
    public String PaymentInfo(Long id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo" + "\t" + id;
    }

//    @HystrixCommand(fallbackMethod = "fallBackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
//    })
    @HystrixCommand
    public String PaymentInfoTimeOut(Long id) {
        try {
            int i = 10 / 0;
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " PaymentInfoTimeOut" + "\t" + id;
    }

    public String fallBackMethod(Long id) {
        return "线程池：" + Thread.currentThread().getName() + " PaymentInfoTimeOut服务降级";
    }


    public String globalFallbackMethod() {
        return "全局服务降级";
    }

    // 服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), // 失败率多少次后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Long id) {
        if (id < 0) {
            throw new RuntimeException("id不能负数");
        }
        String serialNumber = UUID.randomUUID().toString();
        return Thread.currentThread().getName() + '\t' + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Long id) {
        return "id不能负数，稍后再试";
    }

}
