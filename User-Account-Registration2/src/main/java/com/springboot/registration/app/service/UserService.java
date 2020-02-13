package com.springboot.registration.app.service;

import com.springboot.registration.app.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
