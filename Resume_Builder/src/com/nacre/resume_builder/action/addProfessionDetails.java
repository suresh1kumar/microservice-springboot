package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.ProfessionDetailsDto;
import com.nacre.resume_builder.serviceI.ProfessionDetailsServicel;
import com.nacre.resume_builder.serviceImpl.ProfessionDetailsServiceImpl;

@WebServlet("/addProfessionDetails")
public class addProfessionDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get requst from form 
		boolean flag=false;
		/*HttpSession session=request.getSession(false);
		int uid=(int)session.getAttribute("uid");*/
		int uid=4;
		String empname=request.getParameter("txtempname");
		String fromdate=request.getParameter("txtfrom");
		String todate=request.getParameter("txtto");
		String jobtitle=request.getParameter("txtjobtitle");
		String duties=request.getParameter("txtduties");
		ProfessionDetailsDto professionDetailsDto=new ProfessionDetailsDto();
	
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
		professionDetailsDto.setUserid(uid);
		professionDetailsDto.setEmployerName(empname);
		professionDetailsDto.setDuties(duties);
		professionDetailsDto.setJobTitle(jobtitle);
		
		
		
		ProfessionDetailsServicel professionDetailsServicel=new ProfessionDetailsServiceImpl();
		
		try {
			flag=professionDetailsServicel.addProfessionDetailsSevice(professionDetailsDto);
			if(flag){
				System.out.println("added successfully");
			}
			else {
				System.out.println("failed");
			}
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
