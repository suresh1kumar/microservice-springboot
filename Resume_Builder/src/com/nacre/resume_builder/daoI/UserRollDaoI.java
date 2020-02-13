package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.UserRollDto;

public interface UserRollDaoI {
	public List<UserRollDto> getUserRollDao()throws DatabaseException, SQLException;

}
