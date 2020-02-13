package com.springboot.institute.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.institute.app.model.Contact;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
