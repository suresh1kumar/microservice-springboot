package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.serviceI.PersonalDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.PersonalDetailsServiceImpl;
@WebServlet("/getAllPersonalDetails")
public class getAllPersonalDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	PersonalDetailsServiceI personalDetailsServiceI=new PersonalDetailsServiceImpl();
	HttpSession session=request.getSession();
	try {
		List<PersonalDetailsDto>list=personalDetailsServiceI.getAllPersonalService(4);
		
		
		session.setAttribute("personalDetails", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("getPersonalDetails.jsp");
		rd.forward(request, response);
		
		for(PersonalDetailsDto lists:list){
			System.out.println(lists.getFname()+"\t"+lists.getLname()+"\t"+lists.getFathname()+"\t"+lists.getMothname()+"\t"+lists.getDob()+"\t"+lists.getCountryname()+"\t"+lists.getStatename()+"\t"+lists.getCityname()+"\t"+lists.getGender()+"\t"+lists.getPincode()+"\t"+lists.getAddr());
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
