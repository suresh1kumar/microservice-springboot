package com.springboot.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.test.model.CommanUser;

public interface CommanUserRepo extends JpaRepository<CommanUser, Long>{

}
