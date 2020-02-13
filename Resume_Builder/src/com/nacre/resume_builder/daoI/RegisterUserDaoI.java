package com.nacre.resume_builder.daoI;

import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.RegisterUserDto;

public interface RegisterUserDaoI {
	public boolean registerUserDao(RegisterUserDto registerUserDto)throws DatabaseException, SQLException;

}
