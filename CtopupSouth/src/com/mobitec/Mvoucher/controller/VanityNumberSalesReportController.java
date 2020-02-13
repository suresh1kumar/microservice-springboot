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

import com.mobitec.Mvoucher.domain.VanityNumberSalesReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IVanityNumberSalesReportService;

@Controller
public class VanityNumberSalesReportController {
	@Autowired
	private IVanityNumberSalesReportService vanityNumberSalesReportService;
	
	@RequestMapping(value = {"/","/vanityNumberSales_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("vanitySaleReport");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-vanityNumberSalesReport"}, method = RequestMethod.POST)
	    @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		
		/*"region": region,
		"city"	: city,
		"mobile"	: mobile,
		"fromDate"	: fromDate,
		"toDate"	: toDate*/
		 String regionName=request.getParameter("region");
		 String cityName=request.getParameter("city");
		 String mobile=request.getParameter("mobile");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		
			System.out.println("Circle name::"+regionName);
			System.out.println("city name::"+cityName);
			System.out.println("search Type11::"+mobile);
			System.out.println("From Date1::"+fromDate);
			System.out.println("To Date::"+toDate);
	    	
	        String json;
	        try {
	        	System.out.println("========================home controller===================================");
	            ResponseList<VanityNumberSalesReportBean> lstInvoices =new  ResponseList<VanityNumberSalesReportBean>();
	            lstInvoices.addAll(vanityNumberSalesReportService.getAllVanityNumberSalesReports(regionName, cityName, mobile, fromDate, toDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }

}
