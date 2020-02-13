package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.resume_builder.daoException.DatabaseException;
import com.nacre.resume_builder.serviceI.StateDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.StateDetailsServiceImpl;
@WebServlet("/getAllStateBasedOnCountry")
public class getAllStateBasedOnCountry extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//get Request from getParameter()
		int country_id =Integer.parseInt(request.getParameter("countryid"));
		System.out.println("countryid :"+country_id);
		StateDetailsServiceI stateDetailsServiceI=new StateDetailsServiceImpl();
		try {
			Map<Integer,String>map=stateDetailsServiceI.getAllStateService(country_id);
			
			/*for (Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("=============");
			    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}*/
			response.setContentType("application/json");
			Gson Json =new Gson();
			String str=Json.toJson(map);
			response.getWriter().println(str);
			
		} catch (DatabaseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
