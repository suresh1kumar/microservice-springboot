package com.nacre.resume_builder.serviceI;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;

public interface CityDetailsServiceI {
public Map<Integer,String> getAllCityService(int stateid)throws DatabaseException, SQLException;
}
