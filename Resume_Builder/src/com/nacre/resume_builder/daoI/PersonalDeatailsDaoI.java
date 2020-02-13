package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.PersonalDetailsDto;

public interface PersonalDeatailsDaoI {
	public boolean addPersonalDetailsDao(PersonalDetailsDto pdd) throws DatabaseException, SQLException;
	
	public List<PersonalDetailsDto> getAllPersonalDetailsDao(int uid)throws DatabaseException,SQLException;
	
	public boolean updatePersonalDeatilsDao(PersonalDetailsDto personalDetailsDto) throws DatabaseException,SQLException;

	public boolean deletePersonalDetailsDao(PersonalDetailsDto personalDetailsDto)throws DatabaseException,SQLException;
	
}

