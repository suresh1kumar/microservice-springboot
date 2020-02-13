package com.springboot.test.service;

import java.util.List;

import com.springboot.test.model.CommanUser;

public interface CommanUserService {

	public List<CommanUser> getAllUser();
	
	CommanUser findOne(Long id);
	
	public String saveUser(CommanUser user);
	
	public String updateUser(CommanUser user);
	//String addUser(CommanUser user);
	
	void deleteUser(Long id);
	
	
}
