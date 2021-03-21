package com.qiancijun.cloud.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class MyBlockHandler {
    public static String myHandler(BlockException e) {
        return "global handler";
    }
}
