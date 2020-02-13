package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.LoginDto;

public interface LoginServiceI {
	public boolean loginService(LoginDto loginDto)throws DatabaseException, SQLException;

}
