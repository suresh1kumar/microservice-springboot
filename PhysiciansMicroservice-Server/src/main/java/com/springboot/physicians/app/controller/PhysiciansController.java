package com.springboot.physicians.app.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.physicians.app.model.Physicians;
import com.springboot.physicians.app.service.PhysiciansRepository;


@RestController
public class PhysiciansController {
	
protected Logger logger = Logger.getLogger(PhysiciansController.class.getName());
	
	@Autowired
	PhysiciansRepository physiciansRepository;
	
	@RequestMapping("/physicians")
	public Physicians[] all() {
		logger.info("physicians-microservice all() invoked");
		
		List<Physicians> accounts = physiciansRepository.getAllPhysicians();
		
		logger.info("physicians-microservice all() found: " + accounts.size());
		return accounts.toArray(new Physicians[accounts.size()]);
	}
	

}
