package com.ruoyi.task.rabbit;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class QueueConfig {

    @Bean
    public CustomExchange delayExchange() {
        Map<String, Object> args = new HashMap<>();
        args.put("x-delayed-type", "direct");
        return new CustomExchange(RabbitConstanct.EXCHANGE,
                "x-delayed-message", true, false, args);
    }

    @Bean
    public Queue queue() {
        Queue queue = new Queue(RabbitConstanct.DEFAULT_QUEUE, true);
        return queue;
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue())
                .to(delayExchange())
                .with(RabbitConstanct.DEFAULT_QUEUE)
                .noargs();
    }
}