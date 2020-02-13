package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.AchivementsDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.AchivementsDto;

public class AchivementsDaoImpl implements AchivementsDaoI{
Connection con=null;
PreparedStatement preparedStatement=null;
	@Override
	public boolean addAchivementsDao(AchivementsDto achivementsDto) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		preparedStatement=con.prepareStatement(SqlQueryConstants.INSERT_ACHIVEMENTS_DETAILS);
		preparedStatement.setInt(1, achivementsDto.getUserid());
		preparedStatement.setString(2,achivementsDto.getAchivements() );
		preparedStatement.setString(3,achivementsDto.getTranee());
		int count=preparedStatement.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}
	@Override
	public List<AchivementsDto> getAllAchichivementsDao(int achid) throws DatabaseException, SQLException {
		boolean falg=false;
		con=DbUtil.getConnection();
		preparedStatement=con.prepareStatement(SqlQueryConstants.GET_ALL_ACHIVEMENTS_DETAILS);
		preparedStatement.setInt(1, achid);
		ResultSet resultSet=preparedStatement.executeQuery();
		List<AchivementsDto> list=new ArrayList<>();
		while(resultSet.next()){
			AchivementsDto achivementsDto = new AchivementsDto();
			achivementsDto.setAch_id(resultSet.getInt(1));
			achivementsDto.setUserid(resultSet.getInt(2));
			achivementsDto.setAchivements(resultSet.getString(3));
			achivementsDto.setTranee(resultSet.getString(4));
			list.add(achivementsDto);
			
		}
		return list;
	}
	
	
	@Override
	public boolean updateAchivementsDao(AchivementsDto achivementsDto) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		preparedStatement=con.prepareStatement(SqlQueryConstants.UPDATE_ACHIVEMENTS_DETAILS);
		preparedStatement.setString(1, achivementsDto.getAchivements());
		preparedStatement.setString(2, achivementsDto.getTranee());
		preparedStatement.setInt(3, achivementsDto.getAch_id());
		int count=preparedStatement.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean deleteAchivementsDao(AchivementsDto achivementsDto) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		preparedStatement=con.prepareStatement(SqlQueryConstants.DELETE_ACHIVEMENTS_DETAILS);
		preparedStatement.setInt(1, achivementsDto.getAch_id());
		int count=preparedStatement.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}

}
