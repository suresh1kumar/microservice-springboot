package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface StateDetailsServiceI {
	public Map<Integer,String> getAllStateService(int country_id)throws DatabaseException, SQLException;

}
