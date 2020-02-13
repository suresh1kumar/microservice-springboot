package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.CityDetailsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.StateDetailsDto;

public class CityDetailsDaoImpl implements CityDetailsDaoI{
	Connection con=null;
	PreparedStatement preparedStatement=null;
	@Override
	public Map<Integer, String> getAllCityDao(int stateid) throws DatabaseException, SQLException {
		con=DbUtil.getConnection();
		System.out.println("Connection Established:"+con);
		preparedStatement=con.prepareStatement(SqlQueryConstants.Get_ALL_CITY_DETAILS);
		preparedStatement.setInt(1,stateid);
		Map<Integer,String> map=new LinkedHashMap<>();
		ResultSet resultSet=preparedStatement.executeQuery();
		//StateDetailsDto stateDetailsDto=new StateDetailsDto();
		//CountryDetailsDto countryDetailsDto=new CountryDetailsDto();
		while(resultSet.next()){
			//countryDetailsDto.setCountryId(resultSet.getInt(1));
			//stateDetailsDto.setState_id(resultSet.getInt(1));
			//stateDetailsDto.setState_name(resultSet.getString(2));
			map.put(resultSet.getInt(1), resultSet.getString(2));
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
		}
		return map;
	}

}
