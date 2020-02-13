package com.nacre.resume_builder.daoI;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface CityDetailsDaoI {
	public Map<Integer,String> getAllCityDao(int stateid)throws DatabaseException, SQLException;

}
