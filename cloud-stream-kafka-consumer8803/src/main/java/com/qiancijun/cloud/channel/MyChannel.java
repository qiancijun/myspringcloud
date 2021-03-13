package com.qiancijun.cloud.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyChannel {
    String MY_CHANNEL_INPUT = "my_channel_input"; // 订阅通道的名称
    String MY_CHANNEL_OUTPUT = "my_channel_output"; // 发消息通道的名称
    @Output(MY_CHANNEL_OUTPUT)
    MessageChannel sendMessage();

    @Input(MY_CHANNEL_INPUT)
    SubscribableChannel receiveMessage();

}
