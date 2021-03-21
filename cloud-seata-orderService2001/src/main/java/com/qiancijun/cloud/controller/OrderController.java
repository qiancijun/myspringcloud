package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.domain.CommonResult;
import com.qiancijun.cloud.domain.Order;
import com.qiancijun.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create() {
        Order order = new Order(null, 1, 1, 2, 4, null);
        orderService.create(order);
        return new CommonResult(200, "创建订单成功");
    }
}
