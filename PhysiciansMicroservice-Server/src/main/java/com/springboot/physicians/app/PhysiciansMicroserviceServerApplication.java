package com.springboot.physicians.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhysiciansMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhysiciansMicroserviceServerApplication.class, args);
	}

}
