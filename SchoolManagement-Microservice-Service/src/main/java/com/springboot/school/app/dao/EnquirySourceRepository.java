package com.springboot.school.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.school.app.model.EnquirySource;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface EnquirySourceRepository extends JpaRepository<EnquirySource, Long>{
    
}
