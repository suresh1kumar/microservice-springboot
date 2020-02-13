package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.ProfessionDetailsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;

public class ProfessionDetailsDaoImpl implements ProfessionDetailsDaoI{
	Connection con=null;
	PreparedStatement ps=null;
	@Override
	public boolean addProfessionDetailsDao(ProfessionDetailsDto pdd) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		System.out.println("Connection is Established:"+con);
		ps=con.prepareStatement(SqlQueryConstants.INSERT_PROFESSION_DETAILS);
		ps.setInt(1, pdd.getUserid());
		ps.setString(2, pdd.getEmployerName());
		ps.setDate(3, pdd.getFromDate());
		ps.setDate(4, pdd.getToDate());
		ps.setString(5, pdd.getJobTitle());
		ps.setString(6, pdd.getDuties());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean updateProfessionDetailsDao(ProfessionDetailsDto pdd) throws DatabaseException, SQLException {
		boolean flag=false;
		try{
		con=DbUtil.getConnection();
		System.out.println("Connection is Established:"+con);
		ps=con.prepareStatement(SqlQueryConstants.UPDATE_PROFESSION_DETAILS);
		
		ps.setString(1, pdd.getEmployerName());
		ps.setDate(2,pdd.getFromDate());
		ps.setDate(3, pdd.getToDate());
		ps.setString(4, pdd.getJobTitle());
		ps.setString(5, pdd.getDuties());
		ps.setInt(6, pdd.getPro_id());
		
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;			
		}
		return flag;
	}
		finally{
			try{
				if(con!=null){
					con.close();
				}
			}catch(SQLException s){
				System.out.println(s);
			}
		}
	}
	@Override
	public List<ProfessionDetailsDto> getAllProfessionDetailsDao(int uid) throws DatabaseException, SQLException {
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.GET_ALL_PROFESSION_DETAILS);
		ps.setInt(1, uid);
		ResultSet resultSet=ps.executeQuery();
		List<ProfessionDetailsDto> list=new ArrayList<>();
		
		while(resultSet.next()){
			ProfessionDetailsDto professionDetailsDto=new ProfessionDetailsDto();
			professionDetailsDto.setPro_id(resultSet.getInt(1));
			professionDetailsDto.setEmployerName(resultSet.getString(3));
			professionDetailsDto.setFromDate(resultSet.getDate(4));
			professionDetailsDto.setToDate(resultSet.getDate(5));
			professionDetailsDto.setJobTitle(resultSet.getString(6));
			professionDetailsDto.setDuties(resultSet.getString(7));
			list.add(professionDetailsDto);
		}
		return list;
	}
	@Override
	public boolean deleteProfessionDetailsDao(ProfessionDetailsDto professionDetailsDto)
			throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		ps=con.prepareStatement(SqlQueryConstants.DELETE_PROFESSION_DETAILS);
		ps.setInt(1, professionDetailsDto.getPro_id());
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
		}
		
		return flag;
	}

}
