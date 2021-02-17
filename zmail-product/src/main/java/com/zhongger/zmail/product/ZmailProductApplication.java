package com.zhongger.zmail.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.zhongger.zmail.product.feign")
public class ZmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmailProductApplication.class, args);
    }

}
