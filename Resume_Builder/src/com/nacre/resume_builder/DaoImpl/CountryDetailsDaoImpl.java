package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.CountryDetailsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;

public class CountryDetailsDaoImpl implements CountryDetailsDaoI{
	Connection con=null;
	PreparedStatement ps=null;
	
	@Override
	public Map<Integer, String> getAllCountryDao() throws DatabaseException, SQLException {
		con=DbUtil.getConnection();
		System.out.println("Connection Established:"+con);
		ps=con.prepareStatement(SqlQueryConstants.GET_ALL_COUNTRY_DETAILS);
		ResultSet resultSet=ps.executeQuery();
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		while(resultSet.next()){
			map.put(resultSet.getInt(1), resultSet.getString(2));
			System.out.println(resultSet.getLong(1)+" "+resultSet.getString(2));
			
		}
		return map;
	}

}
