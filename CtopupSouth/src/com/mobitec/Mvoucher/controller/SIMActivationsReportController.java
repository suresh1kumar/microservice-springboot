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

import com.mobitec.Mvoucher.domain.SIMActivationsReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ISIMActivationsReportService;

@Controller
public class SIMActivationsReportController {
	
	@Autowired
	public ISIMActivationsReportService iSIMActivationsReportService;
	
	@RequestMapping(value = {"/","/sIMActivationsReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("sIMActivationsReport");
        return model;
    }

	@RequestMapping(value = {"/get-all-sIMActivationsReport"}, method = RequestMethod.POST)
	   @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("******************************<<SIM Activations Report Controller>>******************************");
		 String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		 
		
			System.out.println("zone ::"+zone);
			System.out.println("region ::"+region);
			System.out.println("city name::"+city);
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json;
	        try {
	            ResponseList<SIMActivationsReportBean> lstInvoices =new  ResponseList<SIMActivationsReportBean>();
	            lstInvoices.addAll(iSIMActivationsReportService.getAllSIMActivationsReport(region, city, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("******************************<<SIM Activations Report Controller Json Data>>******************************");
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
