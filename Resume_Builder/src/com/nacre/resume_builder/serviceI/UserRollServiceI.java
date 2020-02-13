package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.UserRollDto;

public interface UserRollServiceI {
	public List<UserRollDto> getUserRollService()throws DatabaseException, SQLException;

}
