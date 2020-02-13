package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.ReverseRchTop3Bean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IReverseRchTop3Service;

@Controller
public class ReverseRchTop3Controller {

	@Autowired
	public IReverseRchTop3Service iReverseRchTop3Service;

	public void setiReverseRchTop3Service(IReverseRchTop3Service iReverseRchTop3Service) {
		this.iReverseRchTop3Service = iReverseRchTop3Service;
	}
	
	@RequestMapping(value = {"/","/ReverseRchTop3_url"}, method = RequestMethod.GET)
    public ModelAndView showReverseRchTop3() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("ReverseRchTop3");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-ReverseRchTop3"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		 String region=request.getParameter("region");
		 String IDName=request.getParameter("IDName");
		 String transStatus=request.getParameter("transStatus");
		 String srcMobileNumber=request.getParameter("srcMobileNumber");
		 String destMobileNumber=request.getParameter("destMobileNumber");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		
		
			System.out.println("region ::"+region);
			System.out.println("IDName::"+IDName);
			System.out.println("transStatus::"+transStatus);
			System.out.println("srcMobileNumber::"+srcMobileNumber);
			System.out.println("destMobileNumber::"+destMobileNumber);
			System.out.println("fromDate::"+fromDate);
			System.out.println("toDate::"+toDate);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<ReverseRchTop3 Report Controller>>******************************");
	            ResponseList<ReverseRchTop3Bean> lstInvoices =new  ResponseList<ReverseRchTop3Bean>();
	            System.out.println("-----------------------controllllllllllllll");
	            lstInvoices.addAll(iReverseRchTop3Service.getAllReverseRechargeTopupReport(region, IDName, transStatus, srcMobileNumber, destMobileNumber, fromDate, toDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }

}
