package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.EducationDetailsDto;

public interface EducationDetailsDaoI {
	public boolean addEducationDetailsDao(EducationDetailsDto edd) throws DatabaseException, SQLException, ParseException;
	
	public boolean updateEducationDetailsDao(EducationDetailsDto edd)throws DatabaseException, SQLException;
	
	public List<EducationDetailsDto> getAllEducationDetailsDao(int uid)throws DatabaseException, SQLException;
	
	public boolean deleteEducationDetailsDao(EducationDetailsDto educationDetailsDto)throws DatabaseException, SQLException;
}
