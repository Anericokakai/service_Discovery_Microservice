package com.discoveryService.DiscoveryService_Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceEcommerceApplication.class, args);
	}

}
