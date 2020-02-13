package com.springboot.instituteinfo.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.instituteinfo.app.model.Contact;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
