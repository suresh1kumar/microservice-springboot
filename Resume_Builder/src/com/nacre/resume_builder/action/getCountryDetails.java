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
import com.nacre.resume_builder.serviceI.CountryDetailsServiceI;
import com.nacre.resume_builder.serviceImpl.CountryDetailsServiceImpl;
@WebServlet("/getCountryDetails")
public class getCountryDetails extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		CountryDetailsServiceI countryDetailsServiceI= new CountryDetailsServiceImpl();
		try {
			Map<Integer,String> map=countryDetailsServiceI.getAllcountryService();
			
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
			    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
			response.setContentType("application/json");
			Gson Json =new Gson();
			String str=Json.toJson(map);
			System.out.println(str);
			response.getWriter().println(str);	
		} catch (DatabaseException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
