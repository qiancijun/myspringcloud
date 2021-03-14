package com.qiancjun.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/provider")
    public String provider() {
        return port;
    }
}
