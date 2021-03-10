package com.qiancijun.cloud.service;

import com.qiancijun.cloud.entities.Payment;

public interface PaymentService {
    Integer create(Payment payment);
    Payment getPaymentById(Long id);
}
