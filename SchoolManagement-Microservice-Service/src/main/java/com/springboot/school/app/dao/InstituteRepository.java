package com.springboot.school.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.school.app.model.Institute;
import com.springboot.school.app.repo.InstituteDto;


/**
 *
 * @author Suresh Kumar Gupta
 */
public interface InstituteRepository extends JpaRepository<Institute, Long> {
    @Query("SELECT i.instituteId AS instituteId, i.name AS name, i.contact.phone AS phone, i.contact.email AS email, i.contact.permanentAddress.city AS city  FROM Institute  AS i ")
    public List<InstituteDto> getInstList();
    
    @Query("SELECT new com.springboot.school.app.model.Institute(i.instituteId, i.name)  FROM Institute  AS i ")
    public List<Institute> getInstCostomList();
}
