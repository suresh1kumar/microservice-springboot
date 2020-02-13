package com.nacre.resume_builder.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
@WebServlet("/DeleteProfessionDetails")
public class DeleteProfessionDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		PrintWriter out=response.getWriter();
		int proid=Integer.parseInt(request.getParameter("proid"));
		System.out.println(proid);
		ProfessionDetailsDto professionDetailsDto=new ProfessionDetailsDto();
		professionDetailsDto.setPro_id(proid);
		ProfessionDetailsServicel professionDetailsServicel=new ProfessionDetailsServiceImpl();
		try {
			flag=professionDetailsServicel.deleteProfessionService(professionDetailsDto);
			if(flag){
				System.out.println("deleted Successfully");
				out.write("delete sussessfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllProfessionalDetails");
				rd.include(request, response);
				//response.sendRedirect("getProfessionDetails.jsp");
			}
			else
			{
				System.out.println("deletion failed");
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
