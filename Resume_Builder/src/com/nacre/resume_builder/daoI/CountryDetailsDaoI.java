package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface CountryDetailsDaoI {
	public Map<Integer,String> getAllCountryDao() throws DatabaseException, SQLException;

}
