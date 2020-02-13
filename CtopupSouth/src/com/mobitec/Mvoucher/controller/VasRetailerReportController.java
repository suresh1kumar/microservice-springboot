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
import com.mobitec.Mvoucher.domain.VasRetailerContentReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportDetailssailsBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IVasRetailerReportService;

@Controller
public class VasRetailerReportController {

	@Autowired
	public IVasRetailerReportService iVasRetailerReportService;
	
	
	@RequestMapping(value = {"/","/vasRetailerReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("vasRetailerReport");
        return model;
    }
	@RequestMapping(value = {"/get-all-vasRetailerReport"}, method = RequestMethod.POST)
	   @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		 
		 String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String SearchOn=request.getParameter("SearchOn");
		 String strFromDate=request.getParameter("fromDate");
		 String strToDate=request.getParameter("toDate");
		 
		
			System.out.println("zone ::"+zone);
			System.out.println("region::"+region);
			System.out.println("city ::"+city);
			System.out.println("SearchOn::"+SearchOn);
			System.out.println("From Date1::"+strFromDate);
			System.out.println("To Date::"+strToDate);
	    	
	        String json=null;
	        try {
	        	System.out.println("******************************<<Vas Retailer Report Controller>>******************************");
	            ResponseList<VasRetailerReportBean> lstInvoices =new  ResponseList<VasRetailerReportBean>();
	            ResponseList<VasRetailerReportDetailssailsBean> lstInvoices1 =new  ResponseList<VasRetailerReportDetailssailsBean>();
	            ResponseList<VasRetailerContentReportBean> lstInvoices2 =new  ResponseList<VasRetailerContentReportBean>();
	           
	            if (SearchOn!=null && !SearchOn.equalsIgnoreCase("") && SearchOn.equalsIgnoreCase("SalesSummary")){
	            	//iVasRetailerReportService.getAllVasRetailerReportSalesSumary(region, city,SearchOn, strFromDate, strToDate)
	            	System.out.println("******************************<<Sales Sumary Controller 1>>******************************");
	            	lstInvoices.addAll(iVasRetailerReportService.getAllVasRetailerReportSalesSumary(region, city,SearchOn, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	           }
	            
	            if (SearchOn!=null && !SearchOn.equalsIgnoreCase("") && SearchOn.equalsIgnoreCase("DealerWiseSalesSummary")){
	            	System.out.println("******************************<<Dealer Wise Sales Sumary Controller 2>>******************************");
	            	 lstInvoices.addAll(iVasRetailerReportService.getAllVasRetailerReportDealerWiseSalesSumary(region, city,SearchOn, strFromDate, strToDate));
		            json = lstInvoices.toString();
		            System.out.println("json ::"+json);
		           }
	            
	            if (SearchOn!=null && !SearchOn.equalsIgnoreCase("") && SearchOn.equalsIgnoreCase("DetailedSalesReport")){
	            	System.out.println("******************************<<Detailed Sales Controller 3>>******************************");
	            	lstInvoices1.addAll(iVasRetailerReportService.getAllVasRetailerReportDetailedSales(region, city,SearchOn, strFromDate, strToDate));
		            json = lstInvoices1.toString();
		            System.out.println("json ::"+json);
		           }
	            else if (SearchOn!=null && !SearchOn.equalsIgnoreCase("") && SearchOn.equalsIgnoreCase("content")){
	            	System.out.println("******************************<<Content Repor Controller 4>>******************************");
	            	
	            	  lstInvoices2.addAll(iVasRetailerReportService.getAllVasRetailerReportContent(region, city,SearchOn, strFromDate, strToDate));
		            json = lstInvoices2.toString();
		            System.out.println("json ::"+json);
		           }
	            
	            if (SearchOn!=null && !SearchOn.equalsIgnoreCase("") && SearchOn.equalsIgnoreCase("subscriber")){
	            	System.out.println("******************************<< Controller 5 >>******************************");
	            	//lstInvoices.addAll(iChannelWiseService.getAllChannelWiseReport(region, city,SearchOn, strFromDate, strToDate));
		            json = lstInvoices.toString();
		            System.out.println("json ::"+json);
		           }
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
