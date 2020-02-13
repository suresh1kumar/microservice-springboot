package com.springboot.physicians.app.service;

import java.util.List;

import com.springboot.physicians.app.model.Physicians;


public interface PhysiciansRepository {
	
	List<Physicians> getAllPhysicians();

}
