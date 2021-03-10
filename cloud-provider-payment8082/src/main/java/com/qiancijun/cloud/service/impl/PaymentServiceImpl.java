package com.qiancijun.cloud.service.impl;

import com.qiancijun.cloud.dao.PaymentMapper;
import com.qiancijun.cloud.entities.Payment;
import com.qiancijun.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentMapper paymentMapper;

    @Override
    public Integer create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
