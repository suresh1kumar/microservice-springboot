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
import com.nacre.resume_builder.dto.AchivementsDto;
import com.nacre.resume_builder.serviceI.AchivementsServiceI;
import com.nacre.resume_builder.serviceImpl.AchivementsServiceImpl;
@WebServlet("/updateAchivementsDetails")
public class updateAchivementsDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		System.out.println("updateAchivementsDetails");
		boolean flag=false;
		int acid=Integer.parseInt(request.getParameter("achid"));
		System.out.println(acid);
		String achivement=request.getParameter("txtachivements");
		String trainee=request.getParameter("txttraining");
		AchivementsDto achivementsDto=new AchivementsDto();
		achivementsDto.setAch_id(acid);
		achivementsDto.setAchivements(achivement);
		achivementsDto.setTranee(trainee);
		
		AchivementsServiceI achivementsServiceI=new AchivementsServiceImpl();
		try {
			flag=achivementsServiceI.updateAchivementsDetailsService(achivementsDto);
			if(flag){
				
				System.out.println("Updated Successfully");
				
				RequestDispatcher rd=request.getRequestDispatcher("getAllAchivements");
				rd.include(request, response);
			}
			else{
				System.out.println("Updation Failed");
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
