package com.zhongger.zmail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZmailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmailCouponApplication.class, args);
    }

}
