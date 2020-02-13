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
import com.nacre.resume_builder.dto.AchivementsDto;
import com.nacre.resume_builder.serviceI.AchivementsServiceI;
import com.nacre.resume_builder.serviceImpl.AchivementsServiceImpl;
@WebServlet("/getAllAchivements")
public class getAllAchivements extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		/*HttpSession session=request.getSession(false);
		int uid=(int)session.getAttribute("uid");*/
		HttpSession session=request.getSession();
		int uid=4;
		
		//AchivementsDto achivementsDto=new AchivementsDto();
		AchivementsServiceI achivementsServiceI=new AchivementsServiceImpl();
		try {
			List<AchivementsDto> list=achivementsServiceI.getAllAchivementsService(uid);
			
			session.setAttribute("achivementsDetails", list);
			RequestDispatcher rd=request.getRequestDispatcher("getAchivementsDetails.jsp");
			rd.forward(request, response);
			for(AchivementsDto lists:list){
				System.out.println(lists.getAch_id()+"\t"+lists.getUserid()+"\t"+lists.getAchivements()+"\t"+lists.getTranee());
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
