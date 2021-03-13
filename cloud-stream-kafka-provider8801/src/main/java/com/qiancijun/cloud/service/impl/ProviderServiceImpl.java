package com.qiancijun.cloud.service.impl;

import com.qiancijun.cloud.channel.MyChannel;
import com.qiancijun.cloud.service.IProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(MyChannel.class)
public class ProviderServiceImpl implements IProviderService {

    @Resource(name = MyChannel.MY_CHANNEL_OUTPUT)
    private MessageChannel messageChannel;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        messageChannel.send(MessageBuilder.withPayload(uuid).build());
        System.out.println(uuid);
        return null;
    }
}
