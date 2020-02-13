package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.RegisterUserDto;

public interface RegisterServiceI {
	public boolean registerUserServiceI(RegisterUserDto registerUserDto)throws DatabaseException, SQLException;
}
