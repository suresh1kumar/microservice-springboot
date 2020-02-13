package com.springboot.dashboard.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.dashboard.app.dto.InstituteDto;
import com.springboot.dashboard.app.model.Institute;


public interface InstituteRepository extends JpaRepository<Institute, Long>{
	
	@Query("SELECT i.instituteId AS instituteId, i.name AS name, i.contact.phone AS phone, i.contact.email AS email, i.contact.permanentAddress.city AS city  FROM Institute  AS i ")
    public List<InstituteDto> getInstList();
    
    @Query("SELECT new com.springboot.dashboard.app.model.Institute(i.instituteId, i.name)  FROM Institute  AS i ")
    public List<Institute> getInstCostomList();

}
