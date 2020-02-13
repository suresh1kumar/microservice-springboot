package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.RegisterUserDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.RegisterUserDto;
import com.nacre.resume_builder.dto.UserRollDto;

public class RegisterUserDaoImpl implements RegisterUserDaoI{
	Connection con=null;
	PreparedStatement preparedStatement=null;
	@Override
	public boolean registerUserDao(RegisterUserDto registerUserDto) throws DatabaseException, SQLException {
		boolean flag=false;
		//UserRollDto userRollDto=new UserRollDto();
		con=DbUtil.getConnection();
		System.out.println("Connection Established:"+con);
		preparedStatement=con.prepareStatement(SqlQueryConstants.INSERT_INTO_REGISTER_USER_DETAILS);
		//preparedStatement.setInt(1, userRollDto.getRoll_id());
		preparedStatement.setString(1, registerUserDto.getUserName());
		preparedStatement.setString(2, registerUserDto.getEmail());
		preparedStatement.setDouble(3,registerUserDto.getUserMob());
		int count=preparedStatement.executeUpdate();
		if(count>0){
			flag=true;
		}
		return flag;
	}

}
