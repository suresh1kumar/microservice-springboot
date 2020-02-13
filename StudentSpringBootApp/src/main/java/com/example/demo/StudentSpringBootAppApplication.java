package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.reposatory, com.example.demo" } )// If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class
//@ComponentScan(basePackages={"com.example.reposatory"})
public class StudentSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSpringBootAppApplication.class, args);
	}

}
