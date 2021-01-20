package com.ruoyi.task.rabbit;

import com.ruoyi.common.core.utils.JsonUtil;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.task.domain.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    @Autowired
    MessageServiceImpl messageService;

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    @RabbitListener(queues = RabbitConstanct.DEFAULT_QUEUE)
    @Log(title = "接收定时消息", businessType = BusinessType.OTHER)
    public void receive(String msgs) {
        Msg msg = (Msg) JsonUtil.Str2Obj(msgs, Msg.class);
        log.info("接收定时消息"+msg.toString());
        switch (msg.getType()){

            case 0:
                msg.setDelayedTime(10L);
                messageService.sendMsg(msg);
                break;

            default:
                break;
        }

    }
}