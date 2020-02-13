package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.DaoImpl.CountryDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.CountryDetailsDaoI;
import com.nacre.resume_builder.serviceI.CountryDetailsServiceI;

public class CountryDetailsServiceImpl implements CountryDetailsServiceI{

	@Override
	public Map<Integer, String> getAllcountryService() throws DatabaseException, SQLException {
		CountryDetailsDaoI countryDetailsDaoI=new CountryDetailsDaoImpl();
		
		return countryDetailsDaoI.getAllCountryDao();
	}

}
