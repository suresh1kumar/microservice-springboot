package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.EducationDetailsDto;
import com.nacre.resume_builder.serviceI.EducationDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.EducationDetailsServiceImpl;
@WebServlet("/updateEducationDetails")
public class updateEducationDetails extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		System.out.println("hii");
		
		boolean flag=false;
		int eid=Integer.parseInt(request.getParameter("txteduid"));
		System.out.println(eid);
		String qualification=request.getParameter("txtqua");
		String schooll=request.getParameter("txtschooll");
		String dateattend=request.getParameter("txtdate_atteded");
		float percent=Float.parseFloat(request.getParameter("txtper"));
		String board=request.getParameter("txtboard");
		int tmark=Integer.parseInt(request.getParameter("txttotalmark"));
		int omark=Integer.parseInt(request.getParameter("txtobtain"));
		
		EducationDetailsDto educationDetailsDto=new EducationDetailsDto();
		educationDetailsDto.setEdu_id(eid);
		educationDetailsDto.setSchoollName(schooll);
		
		try {
			java.util.Date date =new SimpleDateFormat("mm/dd/yyyy").parse(dateattend);
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			educationDetailsDto.setDateAttend(sqlDate);
				 
			System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		educationDetailsDto.setPer(percent);
		educationDetailsDto.setBoard(board);
		educationDetailsDto.setTotaMarks(tmark);
		educationDetailsDto.setObtainMarks(omark);
		educationDetailsDto.setQualificatin(qualification);
		
		EducationDetailsServiceI educationDetailsServiceI=new EducationDetailsServiceImpl();
		try {
			flag=educationDetailsServiceI.updateEducationDetailsService(educationDetailsDto);
		
			if(flag){
				
				System.out.println("Updated Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllEducationDetails");
				rd.include(request, response);
			}
			else{
				System.out.println("not Updated");
			}
		} catch (DatabaseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
}
