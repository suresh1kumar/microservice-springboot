package com.nacre.resume_builder.daoI;

import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.LoginDto;

public interface LoginDaoI {
	public boolean loginDao(LoginDto loginDto)throws DatabaseException, SQLException;

	}
