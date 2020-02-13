package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.PersonalDeatailsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.PersonalDetailsDto;

public class PersonalDeatailsDaoImpl implements PersonalDeatailsDaoI{
	Connection con=null;
	PreparedStatement ps=null;
	
	
	/*=================================================================================================*/
	
	@Override
	public boolean addPersonalDetailsDao(PersonalDetailsDto pdd) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		System.out.println("Connection Established:"+con);
		
			ps=con.prepareStatement(SqlQueryConstants.INSERT_PERSONAL_DETAILS);
			ps.setInt(1, pdd.getUserId());
			ps.setString(2, pdd.getFname());
			ps.setString(3, pdd.getLname());
			ps.setString(4,pdd.getFathname());
			ps.setString(5, pdd.getMothname());
			ps.setDate(6, pdd.getDob());
			ps.setString(7, pdd.getCountryname());
			ps.setString(8, pdd.getStatename());
			ps.setString(9, pdd.getCityname());
			ps.setString(10, pdd.getGender());
			ps.setInt(11, pdd.getPincode());
			ps.setString(12, pdd.getAddr());
			
			//ps.setString(2, pdd.getAddressDetails());
			int count=ps.executeUpdate();
			if(count>0){
				flag=true;
				
			}
		
			return flag;
	}
	
	/*=================================================================================================*/
	
	@Override
	public List<PersonalDetailsDto> getAllPersonalDetailsDao(int uid) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.GET_ALL_PERSONAL_DETAILS);
		ps.setInt(1, uid);
		ResultSet resultSet=ps.executeQuery();
		List<PersonalDetailsDto> list=new ArrayList<PersonalDetailsDto>();
		while(resultSet.next()){
			PersonalDetailsDto personalDetailsDto=new PersonalDetailsDto();
			personalDetailsDto.setP_id(resultSet.getInt(1));
			personalDetailsDto.setFname(resultSet.getString(3));
			personalDetailsDto.setLname(resultSet.getString(4));
			personalDetailsDto.setFathname(resultSet.getString(5));
			personalDetailsDto.setMothname(resultSet.getString(6));
			personalDetailsDto.setDob(resultSet.getDate(7));
			personalDetailsDto.setCountryname(resultSet.getString(8));
			personalDetailsDto.setStatename(resultSet.getString(9));
			personalDetailsDto.setCityname(resultSet.getString(10));
			personalDetailsDto.setGender(resultSet.getString(11));
			personalDetailsDto.setPincode(resultSet.getInt(12));
			personalDetailsDto.setAddr(resultSet.getString(13));
			list.add(personalDetailsDto);
		}
		return list;
	}
	
	/*=================================================================================================*/
	
	@Override
	public boolean updatePersonalDeatilsDao(PersonalDetailsDto personalDetailsDto) throws DatabaseException, SQLException {
		boolean flag=false;
		
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.UPDATE_PERSONAL_DETAILS);
		ps.setString(1,personalDetailsDto.getFname());
		ps.setString(2, personalDetailsDto.getLname());
		ps.setString(3, personalDetailsDto.getFathname());
		ps.setString(4, personalDetailsDto.getMothname());
		ps.setDate(5, personalDetailsDto.getDob());
		ps.setString(6,personalDetailsDto.getCountryname());
		ps.setString(7, personalDetailsDto.getStatename());
		ps.setString(8, personalDetailsDto.getCityname());
		ps.setString(9, personalDetailsDto.getGender());
		ps.setInt(10, personalDetailsDto.getPincode());
		ps.setString(11, personalDetailsDto.getAddr());
		ps.setInt(12, personalDetailsDto.getP_id());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}
	
	/*=================================================================================================*/
	
	@Override
	public boolean deletePersonalDetailsDao(PersonalDetailsDto personalDetailsDto)
			throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.DELETE_PERSONAL_DETAILS);
		ps.setInt(1,personalDetailsDto.getP_id());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}

}
