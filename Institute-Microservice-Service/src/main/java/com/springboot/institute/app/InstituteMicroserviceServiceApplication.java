package com.springboot.institute.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.springboot.institute.app.controller,com.springboot.institute.app.dao,com.springboot.institute.app.model,com.springboot.institute.app.repo,com.springboot.institute.app.service" } )// If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class
//@ComponentScan({ "com.springboot.instituteinfo.app.controller, com.springboot.instituteinfo.app.dao, com.springboot.instituteinfo.app.model, com.springboot.instituteinfo.app.repo", "com.springboot.instituteinfo.app.service" } )// If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class

public class InstituteMicroserviceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteMicroserviceServiceApplication.class, args);
	}

}
