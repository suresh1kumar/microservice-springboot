package com.springboot.school.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.school.app.model.Contact;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
