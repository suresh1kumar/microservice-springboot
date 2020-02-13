package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.serviceI.PersonalDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.PersonalDetailsServiceImpl;
@WebServlet("/DeletePersonalDetails")
public class DeletePersonalDetails extends HttpServlet{
	public void  doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		int pid=Integer.parseInt(request.getParameter("pid"));
		System.out.println(pid);
		PersonalDetailsDto personalDetailsDto=new PersonalDetailsDto();
		personalDetailsDto.setP_id(pid);
		
		PersonalDetailsServiceI personalDetailsServiceI=new PersonalDetailsServiceImpl();
		try {
			flag=personalDetailsServiceI.deletePersonalDetailsService(personalDetailsDto);
			if(flag){
				System.out.println("Deleted Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllPersonalDetails");
				rd.include(request, response);
			}
			else{
				
				System.out.println("Deletion Failed");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}

}
