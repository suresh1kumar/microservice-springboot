package com.springboot.registration.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.registration.app.model.User;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	
	 User findByEmail(String email);
	 
	 User findByConfirmationToken(String confirmationToken);
}