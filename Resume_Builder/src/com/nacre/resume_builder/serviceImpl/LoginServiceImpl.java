package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;

import com.nacre.resume_builder.DaoImpl.LoginDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.LoginDaoI;
import com.nacre.resume_builder.dto.LoginDto;
import com.nacre.resume_builder.serviceI.LoginServiceI;

public class LoginServiceImpl implements LoginServiceI{

	@Override
	public boolean loginService(LoginDto loginDto) throws DatabaseException, SQLException {
		LoginDaoI loginDaoI=new LoginDaoImpl();
		
		return loginDaoI.loginDao(loginDto);
	}

}
