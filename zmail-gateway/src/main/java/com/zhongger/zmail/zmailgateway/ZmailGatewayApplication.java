package com.zhongger.zmail.zmailgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ZmailGatewayApplication {


	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		// 关键是下面几行代码
		return builder.routes()
				.route("remoteaddr_route", r -> r.remoteAddr("127.0.0.1")
						.uri("http://baidu.com"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZmailGatewayApplication.class, args);
	}

}
