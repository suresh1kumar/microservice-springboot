package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.KYCReportBean;
import com.mobitec.Mvoucher.domain.KYCReportBean2;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsDetailedBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsErrorBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsSummaryBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IMNPCommissionReportsSummaryService;

@Controller
public class MNPCommissionReportsController {
	
	@Autowired
	public IMNPCommissionReportsSummaryService iMNPCommissionReportsSummaryService;
	
	 public void setiChannelWiseService(IMNPCommissionReportsSummaryService iMNPCommissionReportsSummaryService) {
			this.iMNPCommissionReportsSummaryService = iMNPCommissionReportsSummaryService;
		}
	 
	@RequestMapping(value = {"/","/mNPCommissionReports_url"}, method = RequestMethod.GET)
	    public ModelAndView showChannel() {
		 ModelAndView model = new ModelAndView();
	        model.setViewName("MNPCommissionReports");
	        return model;
	    }
	
	@RequestMapping(value = {"/get-all-MNPCommissionReports"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllMNPCommissionReports(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("******************************<<MNPCommissionReportsSummary Main Controller>>******************************");
		String zone =request.getParameter("zone");
		String circle =request.getParameter("region");
		String ssa =request.getParameter("city");
		String msisdn =request.getParameter("msisdn");
		String searchBy =request.getParameter("searchBy");
		String searchType =request.getParameter("searchType");
		String strFromDate =request.getParameter("fromDate");
		String strToDate =request.getParameter("toDate");
		String status =request.getParameter("status");
		
			System.out.println("zone ::"+zone);
			System.out.println("circle::"+circle);
			System.out.println("ssa::"+ssa);
			System.out.println("msisdn::"+msisdn);
			System.out.println("searchBy::"+searchBy);
			System.out.println("searchType::"+searchType);
			System.out.println("strFromDate::"+strFromDate);
			System.out.println("strToDate::"+strToDate);
			System.out.println("status::"+status);
	    	
			 String json=null;
	        try {
	        	
	        	System.out.println("******************************<<MNPCommissionReportsSummary Report Controller>>******************************");
	        	
	        	if ((searchType != null) && (searchType.equalsIgnoreCase("summary"))) {
	        		System.out.println("***********************<<Summary Report Controller>>************************");
	        		ResponseList<MNPCommissionReportsSummaryBean> lstInvoices =new  ResponseList<MNPCommissionReportsSummaryBean>();
	            lstInvoices.addAll(iMNPCommissionReportsSummaryService.getAllMNPCommissionReportsSummary(zone, circle, ssa, msisdn,searchBy, searchType, strFromDate, strToDate, status));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	            
	        	}else if((searchType != null) && (searchType.equalsIgnoreCase("detailed"))){
	        		System.out.println("***********************<<Detailed Report Controller>>************************");
	        		ResponseList<MNPCommissionReportsDetailedBean> lstInvoices =new  ResponseList<MNPCommissionReportsDetailedBean>();
	        		 lstInvoices.addAll(iMNPCommissionReportsSummaryService.getAllMNPCommissionReportsDetailed(zone, circle, ssa, msisdn, searchBy, searchType, strFromDate, strToDate, status));
	        		 json = lstInvoices.toString();
	 	            System.out.println("json ::"+json);
	        	
	        	}else if((searchType != null) && (searchType.equalsIgnoreCase("error"))){
	        		System.out.println("***********************<<Error Report Controller>>************************");
	        		ResponseList<MNPCommissionReportsErrorBean> lstInvoices =new  ResponseList<MNPCommissionReportsErrorBean>();
	        		lstInvoices.addAll(iMNPCommissionReportsSummaryService.getAllMNPCommissionErrorDetailed(zone, circle, ssa, msisdn, searchBy, searchType, strFromDate, strToDate, status));
	        		json = lstInvoices.toString();
	 	            System.out.println("json ::"+json);
	 	            
	        	}
	            
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
	
	


}
