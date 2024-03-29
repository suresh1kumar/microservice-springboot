package com.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductMicroserviceServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceServersApplication.class, args);
	}

}
