package com.zhongger.zmail.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZmailWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmailWareApplication.class, args);
	}

}
