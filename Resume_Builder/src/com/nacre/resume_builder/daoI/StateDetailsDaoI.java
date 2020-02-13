package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface StateDetailsDaoI {
	public Map<Integer,String> getAllStateDao(int country_id) throws DatabaseException, SQLException;
}
