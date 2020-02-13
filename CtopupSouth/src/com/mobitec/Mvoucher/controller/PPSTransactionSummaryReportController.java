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

import com.mobitec.Mvoucher.domain.PPSTransactionSummaryReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IPPSTransactionSummaryReportService;

@Controller
public class PPSTransactionSummaryReportController {

	@Autowired
	public IPPSTransactionSummaryReportService iPPSTransactionSummaryReportService;
	
	@RequestMapping(value = {"/","/pPSTransactionSummaryReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("pPSTransactionSummaryReport");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-pPSTransactionSummaryReport"}, method = RequestMethod.POST)
	    @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		    String strFromDate=request.getParameter("fromDate");
		    String strToDate=request.getParameter("toDate");
		
			
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<PPS Transaction SummaryReport Controller>>******************************");
	            ResponseList<PPSTransactionSummaryReportBean> lstInvoices =new  ResponseList<PPSTransactionSummaryReportBean>();
	            lstInvoices.addAll(iPPSTransactionSummaryReportService.getAllPPSTransactionSummaryReport(strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
