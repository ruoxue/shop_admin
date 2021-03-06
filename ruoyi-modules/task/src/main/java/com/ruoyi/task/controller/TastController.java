package com.ruoyi.task.controller;

import com.ruoyi.task.domain.Msg;
import com.ruoyi.task.rabbit.MessageServiceImpl;
import com.ruoyi.task.rabbit.RabbitConstanct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController("/api")
public class TastController {


    @Autowired
    MessageServiceImpl messageService;

    @GetMapping("/test/{time}")
    public String tets(@PathVariable("time") Long time) {
        System.out.println("123");

        Msg msg=new Msg();
        msg.setSendTime(Instant.now().getEpochSecond());
        msg.setContent("test");
        msg.setDelayedTime(time);

        messageService.sendMsg(  msg);
        return "ok";

    }


    @GetMapping("/test2")
    public String tets2() {
        System.out.println("123");
        messageService.sendMsg( RabbitConstanct.DEFAULT_QUEUE, "test12121");
        return "ok";

    }
}
