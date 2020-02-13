package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.BulkRechargeReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IBulkRechargeReportService;

@Controller
public class BulkRechargeReportController {
	
	@Autowired
	public IBulkRechargeReportService iBulkRechargeReportService;
	
	@RequestMapping(value = {"/","/bulkRechargeReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("bulkRechargeReport");
        return model;
    }

	@RequestMapping(value = {"/get-all-bulkRechargeReport"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		
		 String course=request.getParameter("course");
		 String smsisdn=request.getParameter("smsisdn");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		 
		
			System.out.println("course ::"+course);
			System.out.println("smsisdn ::"+smsisdn);
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<Bulk RechargeReport Controller>>******************************");
	            ResponseList<BulkRechargeReportBean> lstInvoices =new  ResponseList<BulkRechargeReportBean>();
	           
	            lstInvoices.addAll( iBulkRechargeReportService.getAllBulkRechargeReport(course, smsisdn, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("******************************<<Bulk RechargeReport Controller Json Data>>******************************");
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
