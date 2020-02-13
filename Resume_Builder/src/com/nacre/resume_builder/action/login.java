package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.LoginDto;
import com.nacre.resume_builder.serviceI.LoginServiceI;
import com.nacre.resume_builder.serviceImpl.LoginServiceImpl;
@WebServlet("/login")
public class login extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		HttpSession session=request.getSession();
		
		LoginDto loginDto=new LoginDto();
		
		
		loginDto.setUsername(username);
		loginDto.setPassword(password);
		LoginServiceI loginServiceI=new LoginServiceImpl();
		try {
			flag=loginServiceI.loginService(loginDto);
			int userid=loginDto.getUserid();
			session.setAttribute("uid",userid);
			System.out.println("uid:"+userid);
			if(flag){
				session.setAttribute("usersession", username);
				session.setAttribute("pwdsession", password);
				System.out.println("login successfull");
				RequestDispatcher rd=request.getRequestDispatcher("");
				rd.forward(request, response);
			}
			else{
				System.out.println("login failed");
			}
			
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
