package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.domain.FRCReportBean;
import com.mobitec.Mvoucher.domain.FRCReportConsolidateBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IFRCReportService;

@Controller
public class FRCReportController {

	@Autowired
	public IFRCReportService ifrcReportService;
	
	@RequestMapping(value = {"/","/frcReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("FRCReport");
        return model;
    }
	@RequestMapping(value = {"/get-all-frcReport"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		
		 String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String StatusOn=request.getParameter("StatusOn");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		
			System.out.println("zone ::"+zone);
			System.out.println("region ::"+region);
			System.out.println("city name::"+city);
			System.out.println("StatusOn::"+StatusOn);
			
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json=null;
	        try {
	        	System.out.println("******************************<<FRC Report Controller>>******************************");
	            ResponseList<FRCReportBean> lstInvoices =new  ResponseList<FRCReportBean>();
	            ResponseList<FRCReportConsolidateBean> lstInvoices2 =new  ResponseList<FRCReportConsolidateBean>();
	            
	            if (StatusOn!=null && !StatusOn.equalsIgnoreCase("") && StatusOn.equalsIgnoreCase("Detailed")){
	            	lstInvoices.addAll(ifrcReportService.getAllFRCReportDetailed(region, city, StatusOn, strFromDate, strToDate));
	                json = lstInvoices.toString();
	                System.out.println("******************************<<FRC Report Controller Json Data 1>>******************************");
	                System.out.println("json ::"+json);
	            
	            }else if (StatusOn!=null && !StatusOn.equalsIgnoreCase("") && StatusOn.equalsIgnoreCase("Consolidate")){
	            	 
	            	lstInvoices2.addAll(ifrcReportService.getAllFRCReportConsolidate(region, city, StatusOn, strFromDate, strToDate));
	 	            json = lstInvoices2.toString();
	 	            System.out.println("******************************<<FRC Report Controller Json Data 2>>******************************");
	 	            System.out.println("json ::"+json);
	            }
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
