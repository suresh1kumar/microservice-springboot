package com.springboot.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.registration.app.controller")
public class UsersAccountRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersAccountRegistrationApplication.class, args);
	}

}
