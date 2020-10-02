package com.zhongger.zmail.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZmailProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmailProductApplication.class, args);
	}

}
