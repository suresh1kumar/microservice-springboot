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
import com.nacre.resume_builder.dto.PersonalDetailsDto;
import com.nacre.resume_builder.serviceI.PersonalDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.PersonalDetailsServiceImpl;

@WebServlet("/addPersonalDetails")
public class addPersonalDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag=false;
		
		/*HttpSession session=request.getSession(false);
		int uid=(int)session.getAttribute("uid");*/
		int uid=4;
		String fname=request.getParameter("txtfname");
		String lname=request.getParameter("txtlname");
		String fathername=request.getParameter("txtfathername");
		String mothername=request.getParameter("txtmothername");
		String dob=request.getParameter("txtdob");
		String countryname=request.getParameter("scountry");
		String statename=request.getParameter("sstate");
		String cityname=request.getParameter("scity");
		String gender=request.getParameter("gender");
		int pincode =Integer.parseInt(request.getParameter("txtpincode"));
		String addr=request.getParameter("txtaddr");		
		PersonalDetailsDto pdd=new PersonalDetailsDto();
		
		try {
			java.util.Date date =new SimpleDateFormat("MM/dd/yyyy").parse(dob);
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			pdd.setDob(sqlDate);
				 
			System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		pdd.setUserId(uid);
		pdd.setFname(fname);
		pdd.setLname(lname);
		pdd.setFathname(fathername);
		pdd.setMothname(mothername);
		
		pdd.setCountryname(countryname);
		pdd.setStatename(statename);
		pdd.setCityname(cityname);
		pdd.setGender(gender);
		pdd.setPincode(pincode);
		pdd.setAddr(addr);
		
		PersonalDetailsServiceI pds=new PersonalDetailsServiceImpl();
		try {
			flag=pds.addPersonalDetailsService(pdd);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag){
			System.out.println("addesd successfully");
		}
		else{
			System.out.println("failed");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
