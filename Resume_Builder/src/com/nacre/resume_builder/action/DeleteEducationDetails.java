package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.daoI.EducationDetailsDaoI;
import com.nacre.resume_builder.dto.EducationDetailsDto;
import com.nacre.resume_builder.serviceI.EducationDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.EducationDetailsServiceImpl;
@WebServlet("/DeleteEducationDetails")
public class DeleteEducationDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		int eid=Integer.parseInt(request.getParameter("eid"));
		EducationDetailsDto educationDetailsDto=new EducationDetailsDto();
		educationDetailsDto.setEdu_id(eid);
		
		EducationDetailsServiceI educationDetailsServiceI=new EducationDetailsServiceImpl();
		try {
			flag=educationDetailsServiceI.deleteEducationDetailsService(educationDetailsDto);
			if(flag){
				System.out.println("Deletated Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllEducationDetails");
				rd.include(request, response);
			}
			else{
				System.out.println("Deletion failed");
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
