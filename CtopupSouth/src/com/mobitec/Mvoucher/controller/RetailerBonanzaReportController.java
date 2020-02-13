package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.RetailerBonanzaReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IRetailerBonanzaReportService;

@Controller
public class RetailerBonanzaReportController {
	
	@Autowired
	public IRetailerBonanzaReportService IRetailerBonanzaReportService;

	@RequestMapping(value = {"/","/retailerBonanzaReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("retailerBonanzaReport");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-retailerBonanzaReport"}, method = RequestMethod.POST)
	   @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("******************************<<Retailer BonanzaReport Controller>>******************************");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String status=request.getParameter("status");
		 String mobile=request.getParameter("mobile");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		
		
			System.out.println("region ::"+region);
			System.out.println("city ::"+city);
			System.out.println("status ::"+status);
			System.out.println("mobile ::"+mobile);
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json;
	        try {
	            ResponseList<RetailerBonanzaReportBean> lstInvoices =new  ResponseList<RetailerBonanzaReportBean>();
	            lstInvoices.addAll(IRetailerBonanzaReportService.getAllRetailerBonanzaReport(region, city, status, mobile, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }

}
