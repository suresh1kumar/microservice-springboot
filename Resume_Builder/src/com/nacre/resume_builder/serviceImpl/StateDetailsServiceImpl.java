package com.nacre.resume_builder.serviceImpl;

import java.sql.SQLException;
import java.util.Map;

import com.nacre.resume_builder.DaoImpl.StateDetailsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.StateDetailsDaoI;
import com.nacre.resume_builder.serviceI.StateDetailsServiceI;

public class StateDetailsServiceImpl implements StateDetailsServiceI{

	@Override
	public Map<Integer, String> getAllStateService(int country_id)throws DatabaseException, SQLException {
		StateDetailsDaoI stateDetailsDaoI=new StateDetailsDaoImpl();
		
		return stateDetailsDaoI.getAllStateDao(country_id);
	}

}
