package com.ruoyi.shop;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@EnableCustomConfig
@EnableRyFeignClients
@SpringCloudApplication
@EnableCustomSwagger2
public class ShopApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ShopApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ 商城模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}

//https://touch.10086.cn/i/mobile/stc-recharge-result.html?orderId=503512812064164816&requestId=20210116164013057168237531525300&hmac=02fdd28c2f38048eebd3d9997ba58095&reserved2=credit&reserved1=0003xWAP&status=0&ts=20210116164808
