package com.qiancijun.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 开启 Nacos 的动态刷新功能
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config")
    public String config() {
        return configInfo;
    }
}
