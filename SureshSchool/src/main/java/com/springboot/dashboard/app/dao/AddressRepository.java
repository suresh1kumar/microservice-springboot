package com.springboot.dashboard.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.dashboard.app.model.Address;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
