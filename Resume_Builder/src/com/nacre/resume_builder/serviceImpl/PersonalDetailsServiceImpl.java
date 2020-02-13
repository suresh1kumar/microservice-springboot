package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.DaoImpl.PersonalDeatailsDaoImpl;
import com.nacre.resume_builder.DaoImpl.ProfessionDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.PersonalDeatailsDaoI;
import com.nacre.resume_builder.daoI.ProfessionDetailsDaoI;
import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;
import com.nacre.resume_builder.serviceI.PersonalDetailsServiceI;

public class PersonalDetailsServiceImpl implements PersonalDetailsServiceI{

	@Override
	public boolean addPersonalDetailsService(PersonalDetailsDto pdd) throws DatabaseException, SQLException {
		PersonalDeatailsDaoI educationDetailsDaoI=new PersonalDeatailsDaoImpl();
		return educationDetailsDaoI.addPersonalDetailsDao(pdd);
	}

	@Override
	public List<PersonalDetailsDto> getAllPersonalService(int uid) throws DatabaseException, SQLException {
		PersonalDeatailsDaoI personalDeatailsDaoI=new PersonalDeatailsDaoImpl();
		return personalDeatailsDaoI.getAllPersonalDetailsDao(uid);
	}

	
	@Override
	public boolean updatePersonalDetailsService(PersonalDetailsDto personalDetailsDto)
			throws DatabaseException, SQLException {
		PersonalDeatailsDaoI personalDeatailsDaoI=new PersonalDeatailsDaoImpl();
		
		return personalDeatailsDaoI.updatePersonalDeatilsDao(personalDetailsDto);
	}

	@Override
	public boolean deletePersonalDetailsService(PersonalDetailsDto personalDetailsDto)
			throws DatabaseException, SQLException {
		PersonalDeatailsDaoI personalDeatailsDaoI=new PersonalDeatailsDaoImpl();
		return personalDeatailsDaoI.deletePersonalDetailsDao(personalDetailsDto);
	}
	}
