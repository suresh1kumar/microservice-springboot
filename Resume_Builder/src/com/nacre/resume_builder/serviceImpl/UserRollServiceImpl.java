package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.DaoImpl.UserRollDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.UserRollDaoI;
import com.nacre.resume_builder.dto.UserRollDto;
import com.nacre.resume_builder.serviceI.UserRollServiceI;

public class UserRollServiceImpl implements UserRollServiceI{

	@Override
	public List<UserRollDto> getUserRollService() throws DatabaseException, SQLException {
		UserRollDaoI userRollDaoI=new UserRollDaoImpl();
		
		return userRollDaoI.getUserRollDao();
	}

}
