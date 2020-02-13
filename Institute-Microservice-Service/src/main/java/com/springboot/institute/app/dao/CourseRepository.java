package com.springboot.institute.app.dao;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.institute.app.model.Course;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
    
    public List<Course> findCourseListByInstitute_instituteId(Long instituteId);
    
    @Query("SELECT c.courseId AS courseId, c.name AS name, c.fees AS fees, c.institute.name AS instituteName  FROM Course AS c")
    public List<Map<String,Object>> getCourses();
}
