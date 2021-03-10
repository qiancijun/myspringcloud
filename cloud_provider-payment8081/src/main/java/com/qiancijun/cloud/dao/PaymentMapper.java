package com.qiancijun.cloud.dao;

import com.qiancijun.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    Integer create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
