package com.nacre.resume_builder.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.LoginDaoI;
import com.nacre.resume_builder.db.DbUtil;
import com.nacre.resume_builder.db.SqlQueryConstants;
import com.nacre.resume_builder.dto.LoginDto;

public class LoginDaoImpl implements LoginDaoI{
Connection con=null;
PreparedStatement preparedStatement=null;
	@Override   
	public boolean  loginDao(LoginDto loginDto) throws DatabaseException, SQLException {
		boolean flag=false;
		con=DbUtil.getConnection();
		System.out.println("Connection Established:"+con);
		preparedStatement=con.prepareStatement(SqlQueryConstants.GET_LOGIN_DETAILS);
		preparedStatement.setString(1,loginDto.getUsername());
		preparedStatement.setString(2, loginDto.getPassword());
		ResultSet resultSet=preparedStatement.executeQuery();		
		flag=resultSet.next();
		loginDto.setUserid(resultSet.getInt(1));
			//System.out.println(resultSet.getInt(1));
			//System.out.println(resultSet.getInt(2));
		
		return flag;
	}
	
	

}
