package com.springboot.instituteinfo.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.instituteinfo.app.model.Address;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
