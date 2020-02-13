package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.DaoImpl.CityDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.CityDetailsDaoI;
import com.nacre.resume_builder.serviceI.CityDetailsServiceI;

public class CityDetailsServiceImpl implements CityDetailsServiceI{

	@Override
	public Map<Integer, String> getAllCityService(int stateid) throws DatabaseException, SQLException {
		CityDetailsDaoI cityDetailsDaoI=new CityDetailsDaoImpl();
		return cityDetailsDaoI.getAllCityDao(stateid);
		 
	}

	

}
