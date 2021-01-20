package com.ruoyi.task.rabbit;


import com.ruoyi.common.core.utils.JsonUtil;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.task.domain.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

@Service

public class MessageServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Log(title = "发送定时消息", businessType = BusinessType.OTHER)
    public void sendMsg(String queueName, String msg, long time) {

        rabbitTemplate.convertAndSend(RabbitConstanct.EXCHANGE, queueName, msg, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setHeader(RabbitConstanct.DELAY, time*1000);
                return message;
            }
        });
    }

    public void sendMsg(Msg msg, long time) {
        sendMsg(RabbitConstanct.DEFAULT_QUEUE, JsonUtil.obj2Str(msg), time);
    }

    public void sendMsg(Msg msg) {


        sendMsg(RabbitConstanct.DEFAULT_QUEUE, JsonUtil.obj2Str(msg), msg.getDelayedTime());
    }

    public void sendMsg(String msg) {

        sendMsg(RabbitConstanct.DEFAULT_QUEUE, msg);
    }

    public void sendMsg(String queueName, String msg) {

        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(msg.getBytes(), messageProperties);
        rabbitTemplate.send(RabbitConstanct.EXCHANGE, queueName, message);

    }
}