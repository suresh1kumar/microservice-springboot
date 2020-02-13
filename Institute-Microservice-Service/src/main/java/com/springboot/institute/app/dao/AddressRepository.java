package com.springboot.institute.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.institute.app.model.Address;


/**
 *
 * @author Suresh Kumar Gupta
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
