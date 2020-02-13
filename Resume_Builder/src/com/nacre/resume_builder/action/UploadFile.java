package com.nacre.resume_builder.action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.dto.UploadFileDto;
import com.nacre.resume_builder.serviceI.UploadFileServiceI;
import com.nacre.resume_builder.serviceImpl.UploadFileServiceImpl;

public class UploadFile extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		String path=request.getParameter("txtpath");
		UploadFileDto uploadFileDto=new UploadFileDto();
		uploadFileDto.setPath(path);
		UploadFileServiceI uploadFileServiceI=new UploadFileServiceImpl();
		//uploadFileServiceI.uploadFileServce(path);
	}
}
