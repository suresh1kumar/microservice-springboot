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
import com.nacre.resume_builder.dto.ProfessionDetailsDto;
import com.nacre.resume_builder.serviceI.ProfessionDetailsServicel;
import com.nacre.resume_builder.serviceImpl.ProfessionDetailsServiceImpl;
@WebServlet("/updateProfessionDetails")
public class updateProfessionDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		int proid=Integer.parseInt(request.getParameter("txtproid"));
		System.out.println(proid);
		String empname=request.getParameter("txtempname");
		String fromdate=request.getParameter("txtfrom");
		String todate=request.getParameter("txtto");
		String jobtitle=request.getParameter("txtjobtitle");
		String duties=request.getParameter("txtduties");
		ProfessionDetailsDto professionDetailsDto=new ProfessionDetailsDto();
		System.out.println("id:"+proid);
		professionDetailsDto.setPro_id(proid);		
		professionDetailsDto.setEmployerName(empname);
		
		try {
			java.util.Date fdate =new SimpleDateFormat("MM/dd/yyyy").parse(fromdate);
			java.util.Date tdate =new SimpleDateFormat("MM/dd/yyyy").parse(todate);
			java.sql.Date sqlfDate=new java.sql.Date(fdate.getTime());
			java.sql.Date sqltDate=new java.sql.Date(tdate.getTime());
			professionDetailsDto.setFromDate(sqlfDate);
			professionDetailsDto.setToDate(sqltDate);
							 
			//System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		professionDetailsDto.setJobTitle(jobtitle);
		professionDetailsDto.setDuties(duties);
		ProfessionDetailsServicel professionDetailsServicel=new ProfessionDetailsServiceImpl();
		try {
			flag=professionDetailsServicel.updateProfessionService(professionDetailsDto);
			System.out.println(flag);
			if(flag){
				System.out.println("updated Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllProfessionalDetails");
				rd.include(request, response);
			}
			else{
				System.out.println("not Updated");
			}
		
		} catch (DatabaseException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
