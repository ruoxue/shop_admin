package com.ruoyi.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TastController {


    @Autowired
    MessageServiceImpl messageService;

    @GetMapping("/test")
    public String tets() {
        System.out.println("123");
        messageService.sendMsg("test123", "test12121", 3);
        return "ok";

    }
}
