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

import com.mobitec.Mvoucher.domain.UnifiedSimSalesReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IUnifiedSimSalesReportService;

@Controller
public class UnifiedSimSalesReportController {

	@Autowired
	public IUnifiedSimSalesReportService iUnifiedSimSalesReportService;
	
	@RequestMapping(value = {"/","/unifiedSimSalesReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("unifiedSimSalesReport");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-unifiedSimSalesReport"}, method = RequestMethod.POST)
	@CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		
		 String status=request.getParameter("status");
		 String searchBy=request.getParameter("searchBy");
		 String msisdn=request.getParameter("msisdn");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		
		
			System.out.println("status ::"+status);
			System.out.println("searchBy::"+searchBy);
			System.out.println("msisdn::"+msisdn);
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<Unified SimSales ReportBean Controller>>******************************");
	            ResponseList<UnifiedSimSalesReportBean> lstInvoices =new  ResponseList<UnifiedSimSalesReportBean>();
	            
	            lstInvoices.addAll(iUnifiedSimSalesReportService.getAllUnifiedSimSalesReport(status, searchBy, msisdn, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
