package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.CTopUpPaymentsReceivedReportBean;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ICTopUpPaymentsReceivedReportService;

@Controller
public class CTopUpPaymentsReceivedReportController {
	
	public ICTopUpPaymentsReceivedReportService cTopUpPaymentsReceivedReportService;
	
	
	
	public void setcTopUpPaymentsReceivedReportService(
			ICTopUpPaymentsReceivedReportService cTopUpPaymentsReceivedReportService) {
		this.cTopUpPaymentsReceivedReportService = cTopUpPaymentsReceivedReportService;
	}


	@RequestMapping(value = {"/","/cTopUpPaymentsReceivedReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("cTopUpPaymentsReceivedReport");
        return model;
    }


	@RequestMapping(value = {"/get-all-CTopUpPaymentsReceivedReport"}, method = RequestMethod.POST)
	  @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		// String wallet=request.getParameter("wallet");
		// String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String searchType=request.getParameter("searchType");
		 String msisdn=request.getParameter("msisdn");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		 String wallet="CTOPUP";
		 String zone="South Zone";
		
			System.out.println("wallet ::"+wallet);
			System.out.println("region::"+region);
			System.out.println("city::"+city);
			System.out.println("searchType::"+searchType);
			System.out.println("msisdn::"+msisdn);
			//System.out.println("search Type11::"+searchType11);
			System.out.println("From Date1::"+fromDate);
			System.out.println("To Date::"+toDate);
	    	
	        String json;
	        try {
	        	System.out.println("========================home controller===================================");
	            ResponseList<CTopUpPaymentsReceivedReportBean> lstInvoices =new  ResponseList<CTopUpPaymentsReceivedReportBean>();
	            lstInvoices.addAll(cTopUpPaymentsReceivedReportService.getAllCTOPUPaymentsReceivedReport(zone, region, city, msisdn, searchType, fromDate, toDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
