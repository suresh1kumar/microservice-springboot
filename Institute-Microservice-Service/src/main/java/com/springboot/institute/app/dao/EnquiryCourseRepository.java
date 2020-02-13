package com.springboot.institute.app.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.institute.app.model.EnquiryCourse;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface EnquiryCourseRepository extends JpaRepository<EnquiryCourse, Long> {
    
}
