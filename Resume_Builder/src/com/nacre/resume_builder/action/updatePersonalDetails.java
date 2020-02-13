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
import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.serviceI.PersonalDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.PersonalDetailsServiceImpl;
@WebServlet("/updatePersonalDetails")
public class updatePersonalDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//get data  from  getParaMeter()
		boolean flag=false;
		int pid=Integer.parseInt(request.getParameter("pid"));
		System.out.println(pid);
		String fname=request.getParameter("txtfname");
		String lname=request.getParameter("txtlname");
		String fathername=request.getParameter("txtfathername");
		String mothername=request.getParameter("txtmothername");
		String dob=request.getParameter("txtdob");
		String countryname=request.getParameter("scountry");
		String statename=request.getParameter("sstate");
		String cityname=request.getParameter("scity");
		String gender=request.getParameter("gender");
		int  pincode=Integer.parseInt(request.getParameter("txtpincode"));
		String address=request.getParameter("txtaddr");
		PersonalDetailsDto personalDetailsDto=new PersonalDetailsDto();
		personalDetailsDto.setP_id(pid);
		personalDetailsDto.setFname(fname);
		personalDetailsDto.setLname(lname);
		personalDetailsDto.setFathname(fathername);
		personalDetailsDto.setMothname(mothername);
		
		try {
			java.util.Date date =new SimpleDateFormat("MM/dd/yyyy").parse(dob);
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			personalDetailsDto.setDob(sqlDate);
				 
			System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		personalDetailsDto.setP_id(pid);
		personalDetailsDto.setCountryname(countryname);
		personalDetailsDto.setStatename(statename);
		personalDetailsDto.setCityname(cityname);
		personalDetailsDto.setGender(gender);
		personalDetailsDto.setPincode(pincode);
		personalDetailsDto.setAddr(address);
		PersonalDetailsServiceI personalDetailsServiceI=new PersonalDetailsServiceImpl();
		try {
			flag=personalDetailsServiceI.updatePersonalDetailsService(personalDetailsDto);
			if(flag){
				System.out.println("updated successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllProfessionalDetails");
				rd.include(request, response);
			}
			else{
				System.out.println("updation failed");
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
