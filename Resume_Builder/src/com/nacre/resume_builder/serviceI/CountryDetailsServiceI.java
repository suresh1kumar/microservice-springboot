package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface CountryDetailsServiceI {
	public Map<Integer,String> getAllcountryService() throws DatabaseException, SQLException;

}
