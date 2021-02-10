package com.zhongger.zmail.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZmailAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmailAdminApplication.class, args);
    }

}
