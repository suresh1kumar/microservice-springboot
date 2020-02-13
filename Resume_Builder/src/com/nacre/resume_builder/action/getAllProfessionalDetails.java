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
import com.nacre.resume_builder.dto.ProfessionDetailsDto;
import com.nacre.resume_builder.serviceI.ProfessionDetailsServicel;
import com.nacre.resume_builder.serviceImpl.ProfessionDetailsServiceImpl;
@WebServlet("/getAllProfessionalDetails")
public class getAllProfessionalDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		int uid=4;
		HttpSession session=request.getSession();
		
		ProfessionDetailsServicel professionDetailsServicel=new ProfessionDetailsServiceImpl();
		try {
			List<ProfessionDetailsDto>list =professionDetailsServicel.getAllProfessionalDetailsService(uid);
			session.setAttribute("professiondetails", list);
			RequestDispatcher rd=request.getRequestDispatcher("getProfessionDetails.jsp");
			rd.forward(request, response);
			for(ProfessionDetailsDto lists:list){
				System.out.println(lists.getEmployerName()+"\t"+lists.getFromDate()+"\t"+lists.getToDate()+"\t"+lists.getJobTitle()+"\t"+lists.getDuties());
				System.out.println();
				
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
