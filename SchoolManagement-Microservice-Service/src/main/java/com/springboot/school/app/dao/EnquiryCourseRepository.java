package com.springboot.school.app.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.school.app.model.EnquiryCourse;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface EnquiryCourseRepository extends JpaRepository<EnquiryCourse, Long> {
    
}
