package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.SalesReconciliationBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ISalesReconciliationService;

@Controller
public class SalesReconciliationController {

	@Autowired
	public ISalesReconciliationService iSalesReconciliationService;

	public void setiSalesReconciliationService(ISalesReconciliationService iSalesReconciliationService) {
		this.iSalesReconciliationService = iSalesReconciliationService;
	}
	
	@RequestMapping(value = {"/","/SalesReconciliation_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("SalesReconciliation");
        return model;
    }

	
	@RequestMapping(value = {"/get-all-SalesReconciliation"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		 String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String walletid=request.getParameter("walletid");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		
			System.out.println("zone ::"+zone);
			System.out.println("region ::"+region);
			System.out.println("city name::"+city);
			System.out.println("walletid::"+walletid);
			System.out.println("From Date::"+fromDate);
			System.out.println("To Date::"+toDate);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<SalesReconciliation Report Controller>>******************************");
	            ResponseList<SalesReconciliationBean> lstInvoices =new  ResponseList<SalesReconciliationBean>();
	            
	            lstInvoices.addAll(iSalesReconciliationService.getSalesReconciliationReport(zone, region, city, walletid, fromDate, toDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
