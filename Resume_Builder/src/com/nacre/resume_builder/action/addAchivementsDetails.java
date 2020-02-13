package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.dto.AchivementsDto;
import com.nacre.resume_builder.serviceI.AchivementsServiceI;
import com.nacre.resume_builder.serviceImpl.AchivementsServiceImpl;
@WebServlet("/addAchivementsDetails")
public class addAchivementsDetails extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		boolean flag=false;
		/*HttpSession session=request.getSession(false);
		int uid=(int)session.getAttribute("uid");*/
		int uid=4;		
		String achivement=request.getParameter("txtachivements");
		String training=request.getParameter("txttraining");
		AchivementsDto achivementsDto=new AchivementsDto();
		achivementsDto.setUserid(uid);
		achivementsDto.setAchivements(achivement);
		achivementsDto.setTranee(training);
		AchivementsServiceI achivementsServiceI=new AchivementsServiceImpl();
		try {
			flag=achivementsServiceI.addAchivementsService(achivementsDto);
			if(flag){
				System.out.println("added successfully");
			}else{
				System.out.println("not added");
			}
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;		
	}

}
