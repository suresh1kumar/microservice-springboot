package com.springboot.institute.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.institute.app.model.EnquirySource;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface EnquirySourceRepository extends JpaRepository<EnquirySource, Long>{
    
}
