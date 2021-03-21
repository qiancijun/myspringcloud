package com.qiancijun.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qiancijun.cloud.exception.MyBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FLowLimitController {
    @GetMapping("/test")
    @SentinelResource(value = "test", blockHandlerClass = MyBlockHandler.class, blockHandler = "myHandler")
    public String test() {
        return "test--------";
    }

    public String handlerException(BlockException e) {
        return "error";
    }

}
