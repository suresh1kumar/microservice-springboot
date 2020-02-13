package com.upload.file.action;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.upload.file.dao.UploadExcelDao;

//@WebServlet("/UploadExcelAction")
@MultipartConfig
public class UploadExcelAction extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		res.setContentType("text/html;charset=UTF-8");
		Part p=req.getPart("excels");
		//InputStream in=null;
		InputStream in=p.getInputStream();
		
		/*//InputStream isFoto = req.getPart("excels").getInputStream();
	   System.out.println("isFoto :"+isFoto.toString());
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    byte buf[] = new byte[8192];
	    int qt = 0;
	    while ((qt = isFoto.read(buf)) != -1) {
	      baos.write(buf, 0, qt);
	    }
	    String sResumen = baos.toString();*/
		System.out.println("filePathfilePathfilePathsssssssssss :"+p);
	    System.out.println("filePathfilePathfilePathsssssssssss :"+in);
	    
	    
		String sname=req.getParameter("firstName");
		//String fileName=req.getParameter("excels");
		//fileName.
		String	filePath1 = getServletContext().getInitParameter("excels");  
	String	filePath = getServletContext().getInitParameter("fileName");  
	//	System.out.println("filePathfilePathfilePath :"+filePath1);
		//System.out.println("filename :"+fileName);
		/*if(fileName == null || fileName.equals("")){
			throw new ServletException("File Name can't be null or empty");
		}else{*/
		UploadExcelDao uploadExcelDao=new UploadExcelDao();
		uploadExcelDao.getUploadExcelAction(in,sname);
		System.out.println("filePathfilePathfilePathsssssssssss-------------- :");
		//System.out.println("uploadExcelDao :"+uploadExcelDao);
		//}
	}

}
