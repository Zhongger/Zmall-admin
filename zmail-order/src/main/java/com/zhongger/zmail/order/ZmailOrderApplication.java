package com.zhongger.zmail.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZmailOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmailOrderApplication.class, args);
    }
}
