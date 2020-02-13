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
import com.nacre.resume_builder.dto.AddressDetailsDto;
import com.nacre.resume_builder.dto.CityDetailsDto;
import com.nacre.resume_builder.dto.EducationDetailsDto;
import com.nacre.resume_builder.serviceI.EducationDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.EducationDetailsServiceImpl;

@WebServlet("/addEducationDetails")
public class addEducationDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
			
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get value from getParameter();
		/*HttpSession session=request.getSession(false);
		int uid=(int)session.getAttribute("uid");*/
		
		
		int userid=4;
		String qualification=request.getParameter("txtqua");
		String schoollName=request.getParameter("txtschooll");
		String dateAttend=request.getParameter("txtdate_atteded");
		System.out.println(dateAttend);
		float per=Float.parseFloat(request.getParameter("txtper"));
		String board=request.getParameter("txtboard");
		int totalMark=Integer.parseInt(request.getParameter("txttotalmark"));
		int obtMark=Integer.parseInt(request.getParameter("txtobtain"));
		EducationDetailsDto educationDetailsDto=new EducationDetailsDto();
				 
		try {
			java.util.Date date =new SimpleDateFormat("MM/dd/yyyy").parse(dateAttend);
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			educationDetailsDto.setDateAttend(sqlDate);
				 
			System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		boolean flag=false;
		educationDetailsDto.setUserId(userid);
	educationDetailsDto.setQualificatin(qualification);	
	educationDetailsDto.setSchoollName(schoollName);

	educationDetailsDto.setPer(per);
	educationDetailsDto.setBoard(board);
	educationDetailsDto.setTotaMarks(totalMark);
	educationDetailsDto.setObtainMarks(obtMark);
	//educationDetailsDto.setAdrid(addrid);
	//educationDetailsDto.setDegree(degree);
	
	/*CityDetailsDto c= new CityDetailsDto();
	c.setCityId(1);
	c.setCityName("hyd");
	
	AddressDetailsDto ad = new AddressDetailsDto();
ad.setCityId(c);
	*/
	EducationDetailsServiceI eds=new EducationDetailsServiceImpl();
try {
	try {
		flag=eds.addEducationDetailsService(educationDetailsDto);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(flag){
		System.out.println("added Successfully");
	}
	else{
		System.out.println("failed");
	}
} catch (DatabaseException | SQLException e) {
	
	e.printStackTrace();
}		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
