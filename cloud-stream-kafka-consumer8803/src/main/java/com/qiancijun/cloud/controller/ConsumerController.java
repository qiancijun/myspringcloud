package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.channel.MyChannel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(MyChannel.class)
public class ConsumerController {

    @Value("${server.port}")
    private String port;

    @StreamListener(MyChannel.MY_CHANNEL_INPUT)
    public void receive(Message<String> message) {
        System.out.println(port + "订阅者：" + message.getPayload());
    }
}
