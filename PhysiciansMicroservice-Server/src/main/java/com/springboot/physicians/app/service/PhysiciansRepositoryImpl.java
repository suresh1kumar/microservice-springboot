package com.springboot.physicians.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;


import com.springboot.physicians.app.model.Physicians;

@Repository
public class PhysiciansRepositoryImpl implements PhysiciansRepository{

private Map<String, Physicians> physiciansByDisease = new HashMap<String, Physicians>();
	
	public PhysiciansRepositoryImpl() {
		
		Physicians account = new Physicians(10l, "Ashma" , "Warm water bath");
		physiciansByDisease.put("5115", account);
		account = new Physicians(102, "Headache-1" , "Panadol capsule-1");
		physiciansByDisease.put("2089", account);
		account = new Physicians(103, "Headache-2" , "Panadol capsule-2");
		physiciansByDisease.put("1286", account);
		Logger.getLogger(PhysiciansRepositoryImpl.class).info("Created PhysiciansRepositoryImpl");
	}
	
	
	
	@Override
	public List<Physicians> getAllPhysicians() {
		return new ArrayList<Physicians>(physiciansByDisease.values());
	}
	
	

}
