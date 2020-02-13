package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.EducationDetailsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.EducationDetailsDto;

public class EducationDetailsDaoImpl implements EducationDetailsDaoI{
	Connection con=null;
	PreparedStatement ps=null;
	/*----------------------------------------------------------------*/
	@Override
	public boolean addEducationDetailsDao(EducationDetailsDto edd) throws DatabaseException, SQLException, ParseException {
		boolean flag=false;
		con=DbUtil.getConnection();
		System.out.println("connection established:"+con);
		ps=con.prepareStatement(SqlQueryConstants.INSERT_EDUCATION_DETAILS);
		
		ps.setInt(1, edd.getUserId());
		ps.setString(2, edd.getQualificatoin());
		ps.setString(3,edd.getSchoollName());
		ps.setDate(4,edd.getDateAttend());
		ps.setFloat(5, edd.getPer());
		ps.setString(6, edd.getBoard());
		ps.setInt(7, edd.getTotaMarks());
		ps.setInt(8,edd.getObtainMarks());
		//ps.setInt(9,edd.getAdrid());
		
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		
		return flag;
	}
	
	/*----------------------------------------------------------------*/
	
	@Override
	public boolean updateEducationDetailsDao(EducationDetailsDto edd) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.UPDATE_EDUCATION_DETAILS);
		
		ps.setString(1,edd.getQualificatoin());
		ps.setString(2,edd.getSchoollName() );
		ps.setDate(3, edd.getDateAttend());
		ps.setFloat(4, edd.getPer());
		ps.setString(5, edd.getBoard());
		ps.setInt(6, edd.getTotaMarks());
		ps.setInt(7, edd.getObtainMarks());
		ps.setInt(8, edd.getEdu_id());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
			System.out.println("flag:"+flag+" "+edd.getEdu_id());
		}
		return flag;
	}
	
	/*----------------------------------------------------------------*/
	@Override
	public List<EducationDetailsDto> getAllEducationDetailsDao(int uid) throws DatabaseException, SQLException {
		
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.GET_ALL_EDUCATION_DETAILS);
		ps.setInt(1, uid);
		ResultSet resultSet=ps.executeQuery();
		List<EducationDetailsDto> list=new ArrayList<>();
		while(resultSet.next()){
			EducationDetailsDto educationDetailsDto=new EducationDetailsDto();
			 
			
			educationDetailsDto.setEdu_id(resultSet.getInt(1));
			educationDetailsDto.setQualificatin(resultSet.getString(3));
			educationDetailsDto.setSchoollName(resultSet.getString(4));
			educationDetailsDto.setDateAttend(resultSet.getDate(5));
			educationDetailsDto.setPer(resultSet.getFloat(6));
			educationDetailsDto.setBoard(resultSet.getString(7));
			educationDetailsDto.setTotaMarks(resultSet.getInt(8));
			educationDetailsDto.setObtainMarks(resultSet.getInt(9));
			list.add(educationDetailsDto);
			
		}
		return list;
	}
	
	/*----------------------------------------------------------------*/
	
	@Override
	public boolean deleteEducationDetailsDao(EducationDetailsDto educationDetailsDto)
			throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.DELETE_EDUCATION_DETAILS);
		ps.setInt(1, educationDetailsDto.getEdu_id());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}
	

}
