package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.UserRollDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.UserRollDto;

public class UserRollDaoImpl implements UserRollDaoI{
	Connection con=null;
	PreparedStatement preparedStatement=null;
	@Override
	public List<UserRollDto> getUserRollDao() throws DatabaseException, SQLException {
		con=DbUtil.getConnection();
		preparedStatement=con.prepareStatement(SqlQueryConstants.GET_USER_ROLL_DETAILS);
		ResultSet resultSet=preparedStatement.executeQuery();
		UserRollDto userRollDto=new UserRollDto();
		List<UserRollDto>list=new ArrayList<>();
		while(resultSet.next()){
			
			userRollDto.setRoll_id(resultSet.getInt(1));
			userRollDto.setRoll_type(resultSet.getString(2));
			list.add(userRollDto);
		}
		return list;
	}

}
