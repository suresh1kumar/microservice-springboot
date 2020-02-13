package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.EducationDetailsDto;

public interface EducationDetailsServiceI {
	public boolean addEducationDetailsService(EducationDetailsDto edd) throws DatabaseException, SQLException, ParseException;
	
	public boolean updateEducationDetailsService(EducationDetailsDto edd)throws DatabaseException, SQLException;
	
	public List<EducationDetailsDto> getAllEducationDetailsService(int uid) throws DatabaseException, SQLException;
	
	public boolean deleteEducationDetailsService(EducationDetailsDto educationDetailsDto)throws DatabaseException,SQLException;

}
