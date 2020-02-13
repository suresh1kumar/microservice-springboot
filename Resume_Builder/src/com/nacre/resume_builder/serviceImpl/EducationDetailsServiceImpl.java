package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.nacre.resume_builder.DaoImpl.EducationDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.EducationDetailsDaoI;
import com.nacre.resume_builder.dto.EducationDetailsDto;
import com.nacre.resume_builder.serviceI.EducationDetailsServiceI;

public class EducationDetailsServiceImpl implements EducationDetailsServiceI{

	/*======================================================================*/
	
	@Override
	public boolean addEducationDetailsService(EducationDetailsDto edd) throws DatabaseException, SQLException, ParseException {
		EducationDetailsDaoI educationDetailsDaoI=new EducationDetailsDaoImpl();
		return educationDetailsDaoI.addEducationDetailsDao(edd);
	}

	/*======================================================================*/
	
	@Override
	public boolean updateEducationDetailsService(EducationDetailsDto edd) throws DatabaseException, SQLException {
		EducationDetailsDaoI educationDetailsDaoI=new EducationDetailsDaoImpl();
		return educationDetailsDaoI.updateEducationDetailsDao(edd);
	}
	
/*======================================================================*/
	
	@Override
	public List<EducationDetailsDto> getAllEducationDetailsService(int uid) throws DatabaseException, SQLException {
		EducationDetailsDaoI educationDetailsDaoI=new EducationDetailsDaoImpl();
		return educationDetailsDaoI.getAllEducationDetailsDao(uid);
	}
	
	/*======================================================================*/

	@Override
	public boolean deleteEducationDetailsService(EducationDetailsDto educationDetailsDto)
			throws DatabaseException, SQLException {
		EducationDetailsDaoI educationDetailsDaoI=new EducationDetailsDaoImpl();
		
		return educationDetailsDaoI.deleteEducationDetailsDao(educationDetailsDto);
	}
}
