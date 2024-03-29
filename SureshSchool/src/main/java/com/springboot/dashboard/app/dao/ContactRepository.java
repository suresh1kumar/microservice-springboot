package com.springboot.dashboard.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.dashboard.app.model.Contact;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
