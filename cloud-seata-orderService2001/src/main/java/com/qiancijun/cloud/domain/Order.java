package com.qiancijun.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private int userId;
    private int commodityCode;
    private int count;
    private int money;
    private Integer status;
}
