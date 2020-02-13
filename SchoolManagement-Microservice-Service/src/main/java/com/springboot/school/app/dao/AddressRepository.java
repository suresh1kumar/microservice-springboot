package com.springboot.school.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.school.app.model.Address;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
