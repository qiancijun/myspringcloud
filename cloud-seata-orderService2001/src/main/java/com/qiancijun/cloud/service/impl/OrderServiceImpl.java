package com.qiancijun.cloud.service.impl;

import com.qiancijun.cloud.dao.OrderMapper;
import com.qiancijun.cloud.domain.Order;
import com.qiancijun.cloud.service.AccountService;
import com.qiancijun.cloud.service.OrderService;
import com.qiancijun.cloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    public void create(Order order) {
        // 1. 建订单
        orderMapper.insertOrder(order.getUserId(), order.getCommodityCode(), order.getCount(), order.getMoney());
        // 2. 减库存
        storageService.decrease(order.getCommodityCode(), order.getCount());
        // 3. 减钱
        accountService.update(order.getUserId(), order.getMoney());
        // 4. 更新订单
        orderMapper.updateOrder(order.getUserId());
    }
}
