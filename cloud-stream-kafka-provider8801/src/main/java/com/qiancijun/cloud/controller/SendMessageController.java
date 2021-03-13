package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.channel.MyChannel;
import com.qiancijun.cloud.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private IProviderService providerService;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return providerService.send();
    }

}
