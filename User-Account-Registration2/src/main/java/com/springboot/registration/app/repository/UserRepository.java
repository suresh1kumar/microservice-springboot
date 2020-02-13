package com.springboot.registration.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.registration.app.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
