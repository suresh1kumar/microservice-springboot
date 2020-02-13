package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;

import com.nacre.resume_builder.DaoImpl.RegisterUserDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.RegisterUserDaoI;
import com.nacre.resume_builder.dto.RegisterUserDto;
import com.nacre.resume_builder.serviceI.RegisterServiceI;

public class RegisterUserServiceImpl implements RegisterServiceI{

	@Override
	public boolean registerUserServiceI(RegisterUserDto registerUserDto) throws DatabaseException, SQLException {
		RegisterUserDaoI registerUserDaoI=new RegisterUserDaoImpl();
		return registerUserDaoI.registerUserDao(registerUserDto);
	}

}
