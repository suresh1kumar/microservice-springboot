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

import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.domain.CircleINDenomReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ICircleINDenomReportService;

@Controller
public class CircleINDenomReportController {
	@Autowired
	private ICircleINDenomReportService circleINDenomReportService;
	
	@RequestMapping(value = {"/","/circleINDenomReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("circleINDenomReport");
        return model;
    }

	@RequestMapping(value = {"/get-all-circleINDenomReport"}, method = RequestMethod.POST)
	   @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		
		 String region=request.getParameter("region");
		 String description=request.getParameter("description");
		 String strFromDate1=request.getParameter("fromDate");
		 String strToDate1=request.getParameter("toDate");
		
			System.out.println("region ::"+region);
			System.out.println("description id::"+description);
			System.out.println("From Date1::"+strFromDate1);
			System.out.println("To Date::"+strToDate1);
	    	
	        String json;
	        try {
	        	System.out.println("========================CircleINDenomReport controller===================================");
	            ResponseList<CircleINDenomReportBean> lstInvoices =new  ResponseList<CircleINDenomReportBean>();
	            System.out.println("========================CircleINDenomReport controller111===================================");
	            lstInvoices.addAll( circleINDenomReportService.getAllDenominationwiseSalesReport(region, description, strFromDate1, strToDate1));
	            System.out.println("========================CircleINDenomReport controller2222222===================================");
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
