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
import com.nacre.resume_builder.dto.EducationDetailsDto;
import com.nacre.resume_builder.serviceI.EducationDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.EducationDetailsServiceImpl;
@WebServlet("/getAllEducationDetails")
public class getAllEducationDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		HttpSession session=request.getSession();
		//int id=(int)session.getAttribute("uid");*/
		
		EducationDetailsServiceI educationDetailsServiceI=new EducationDetailsServiceImpl();
		try {
			List<EducationDetailsDto> list=educationDetailsServiceI.getAllEducationDetailsService(4);
			session.setAttribute("educationDetails", list);
			RequestDispatcher rd=request.getRequestDispatcher("getEducationDetails.jsp");
			rd.forward(request, response);
			for( EducationDetailsDto lists:list){
				System.out.println(lists.getQualificatoin()+"\t"+lists.getSchoollName()+"\t"+lists.getDateAttend()+"\t "+lists.getPer()+"\t "+lists.getBoard()+"\t"+lists.getTotaMarks()+"\t "+lists.getObtainMarks());
				
			}
		
		} catch (DatabaseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
