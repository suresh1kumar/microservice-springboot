package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.UserRollDto;
import com.nacre.resume_builder.serviceI.UserRollServiceI;
import com.nacre.resume_builder.serviceImpl.UserRollServiceImpl;
@WebServlet("/")
public class getUserRoll extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		UserRollServiceI userRollServiceI=new UserRollServiceImpl();
		UserRollDto userRollDto=new UserRollDto();
		try {
			List<UserRollDto> list=userRollServiceI.getUserRollService();
			for(UserRollDto lists:list){
				System.out.println(userRollDto.getRoll_id()+" "+userRollDto.getRoll_type());
			}
		} catch (DatabaseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
