package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
//import java.util.stream.*;

import com.bean.Upload;
import com.dao.UploadDao;
import com.dao.UploadDaoImpl;

//@WebServlet("/UploadController")
public class UploadController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	UploadDao uploadDao = null;

	public void init() {
		uploadDao = new UploadDaoImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===========================");

		List<Upload> list = new ArrayList<>();
		try {
			list = uploadDao.getAllUploadRecord();
			req.setAttribute("listdate", list);
			// req.getRequestDispatcher("update.jsp");

			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/update.jsp");
			rd.forward(req, resp);
			System.out.println("---------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * String action=req.getParameter("action"); ProductModel if(action!=null) {
		 * req.setAttribute(list, uploadService.findAll());
		 * req.getRequestDispatcher("index.jsp").forward(req, resp); }
		 */
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\n******************************<<<Update Multiple Records>>>******************************");// status
		StringTokenizer stInfo = null;
		//StringTokenizer stInfo1 = null;
		String idTokenizer = "";
		String nameTokenizer = "";
		String priceTokenizer ="";
		String statusTokenizer = "";
		int productId =0;
		
		String[] statusnew = req.getParameterValues("ids");
		String stream1 = (String) Arrays.toString(statusnew);
		String stream11 = (String) Arrays.toString(statusnew);
		System.out.println("statusnew ---:" + statusnew.length);
		
		Upload up=new Upload();
		
		stInfo = new StringTokenizer(stream1, "[,]");
		
		while (stInfo.hasMoreTokens()) {

			cityID = stInfo.nextToken();
			resionID = stInfo.nextToken();

		}
		/*for( int i = 0; i < elements.length - 1; i++)
		{
		    String element = elements[i];
		    String nextElement = elements[i+1];
		}*/
		
		//stInfo1 = new StringTokenizer(stream11, "[,]");
		/*for (int i = 0; i < statusnew.length; i++) {
			while (stInfo1.hasMoreElements()) {

				String id2 = stInfo.nextToken();
				String name2 = stInfo.nextToken();
				String price2 = stInfo.nextToken();
				String status2 = stInfo.nextToken();
				System.out.println("id ---:" + id2);
				System.out.println("name ---:" + name2);
				System.out.println("price ---:" + price2);
				System.out.println("status ---:" + status2);
				System.out.println("---------------second times11------------------------");
			}
			System.out.println("---------------second times322------------------------");
		}*/
		
		System.out.println("---------------------------------------------------------------------------\n\n\n");

		// System.out.println(Arrays.toString(statusnew));
		// String action=req.getParameter("action");
		// System.out.println("action ::"+action);
		// if(action.equalsIgnoreCase("update")) {
		String[] id = req.getParameterValues("ids");
		String[] name = req.getParameterValues("name");
		String[] price = req.getParameterValues("price");
		String[] status = req.getParameterValues("status");
		//System.out.println(" id.length------::" + id.length);
		//System.out.println(" id.length------::" + id);
		/*for (int i = 0; i < id.length; i++) {
			System.out.println(" id------::" + id[i]);
			System.out.println(" name----::" + name[i]);
			System.out.println(" price---::" + price[i]);
			System.out.println(" status--::" + status[i]);
		}*/
		
		for (int i = 0; i < statusnew.length; i++) {
			System.out.println("------------------------------------------------------11 ");
				while (stInfo.hasMoreElements()) {
					System.out.println("------------------------------------------------------22 ");
					try {
						System.out.println("------------------------------------------------------33 ");
						 idTokenizer = stInfo.nextToken();
						 System.out.println("------------------------------------------------------33 "+idTokenizer);
						  //productId = Integer.parseInt(idTokenizer);		
						 System.out.println("\nidTokenizer==========================::"+idTokenizer);
						 //Upload upload = uploadDao.getProductId(Integer.valueOf(productId));
						 Upload upload = uploadDao.getProductId(Integer.parseInt(idTokenizer));
						 nameTokenizer = stInfo.nextToken();
						 priceTokenizer = stInfo.nextToken();
						 statusTokenizer = stInfo.nextToken();
						
						System.out.println("update record id ::" + upload);
						upload.setName(nameTokenizer);
						upload.setPrice(priceTokenizer);
						upload.setStatus(statusTokenizer);
						uploadDao.updateUploadRecordDao(upload);
						System.out.println(uploadDao.updateUploadRecordDao(upload));
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
		//page = "UploadController";
		resp.sendRedirect("UploadController");

	}

}






















/*


StringTokenizer stInfo = null;
		String idTokenizer = "";
		String nameTokenizer = "";
		String priceTokenizer ="";
		String statusTokenizer = "";
		
		String[] statusnew = req.getParameterValues("ids");
		String stream1 = (String) Arrays.toString(statusnew);
		System.out.println("statusnew ---:" + statusnew.length);
		

		stInfo = new StringTokenizer(stream1, "[,]");
		for (int i = 0; i < statusnew.length; i++) {
			while (stInfo.hasMoreElements()) {

				String id2 = stInfo.nextToken();
				String name2 = stInfo.nextToken();
				String price2 = stInfo.nextToken();
				String status2 = stInfo.nextToken();
				System.out.println("id ---:" + id2);
				System.out.println("name ---:" + name2);
				System.out.println("price ---:" + price2);
				System.out.println("status ---:" + status2);
			}
		}
		//String[] arrOfStr = stream1.split(",");
		//for (int i = 0; i < arrOfStr.length; i++) {
		////	System.out.println(arrOfStr[i]);
		//}
		System.out.println("---------------------------------------------------------------------------\n\n\n");

		// System.out.println(Arrays.toString(statusnew));
		// String action=req.getParameter("action");
		// System.out.println("action ::"+action);
		// if(action.equalsIgnoreCase("update")) {
		String[] id = req.getParameterValues("ids");
		String[] name = req.getParameterValues("name");
		String[] price = req.getParameterValues("price");
		String[] status = req.getParameterValues("status");
		System.out.println(" id.length------::" + id.length);
		System.out.println(" id.length------::" + id);
		for (int i = 0; i < id.length; i++) {
			System.out.println(" id------::" + id[i]);
			System.out.println(" name----::" + name[i]);
			System.out.println(" price---::" + price[i]);
			System.out.println(" status--::" + status[i]);
		}
		String page = "";
		for (int i = 0; i < id.length; i++) {
			try {
				Upload upload = uploadDao.getProductId(Integer.valueOf(id[i]));
				System.out.println("update record id ::" + upload);
				upload.setName(name[i]);
				upload.setPrice(price[i]);
				upload.setStatus(status[i]);
				uploadDao.updateUploadRecordDao(upload);
				System.out.println(uploadDao.updateUploadRecordDao(upload));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		page = "UploadController";
		resp.sendRedirect("UploadController");

	}



*/