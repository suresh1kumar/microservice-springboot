package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.DaoImpl.AchivementsDaoImpl;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.AchivementsDto;
import com.nacre.resume_builder.serviceI.AchivementsServiceI;
import com.nacre.resume_builder.serviceImpl.AchivementsServiceImpl;
@WebServlet("/DeleteAchivementsDetails")
public class DeleteAchivementsDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		int achid=Integer.parseInt(request.getParameter("achid"));
		System.out.println(achid);
		AchivementsDto achivementsDto=new AchivementsDto();
		achivementsDto.setAch_id(achid);
		AchivementsServiceI achivementsServiceI=new AchivementsServiceImpl();
		try {
			flag=achivementsServiceI.deleteAchivementsDetailsService(achivementsDto);
			if(flag){
				
				System.out.println("Deleted Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("getAllAchivements");
				rd.include(request, response);
			}
			else{
				System.out.println("Deletion Failed");
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
