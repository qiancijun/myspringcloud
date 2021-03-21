package com.qiancijun.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
    private int id;
    private int commodityCode;
    private int count;
}
