package com.zhongger.zmail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.zhongger.zmail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ZmailMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZmailMemberApplication.class, args);
    }
}
