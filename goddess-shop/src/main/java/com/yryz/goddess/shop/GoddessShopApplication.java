package com.yryz.goddess.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.yryz.goddess.shop.mapper")
public class GoddessShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoddessShopApplication.class, args);
    }

    public String test (String params){
        return "aaaa"+params;
    }
}
