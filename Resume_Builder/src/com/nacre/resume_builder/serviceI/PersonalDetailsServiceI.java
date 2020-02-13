package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;

public interface PersonalDetailsServiceI {
	public boolean addPersonalDetailsService(PersonalDetailsDto pdd) throws DatabaseException, SQLException;
	
	public List<PersonalDetailsDto> getAllPersonalService(int uid)throws DatabaseException,SQLException;
	
	public boolean updatePersonalDetailsService(PersonalDetailsDto personalDetailsDto)throws DatabaseException, SQLException;
	
	public boolean deletePersonalDetailsService(PersonalDetailsDto personalDetailsDto)throws DatabaseException, SQLException;
}
