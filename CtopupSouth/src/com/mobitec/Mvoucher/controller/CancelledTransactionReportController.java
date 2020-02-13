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

import com.mobitec.Mvoucher.domain.CancelledTransactionBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ICancelledTransactionReportService;

@Controller
public class CancelledTransactionReportController {
	
	@Autowired
	public ICancelledTransactionReportService icancelledTransactionReportService;
	
	@RequestMapping(value = {"/","/cancelledTransaction_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("cancelledTransactionReport");
        return model;
    }

	@RequestMapping(value = {"/get-all-cancelledTransaction"}, method = RequestMethod.POST)
	 @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
		      System.out.println("******************************<<Cancelled Transaction Controller>>******************************");
		      String SearchOn=request.getParameter("SearchOn");
		      String strFromDate=request.getParameter("fromDate");
		      String strToDate=request.getParameter("toDate");
		
			  System.out.println("SearchOn1 ::"+SearchOn);
			  System.out.println("From Date1::"+strFromDate);
			  System.out.println("To Date::"+strToDate);
	    	
	          String json;
	        try {
	            ResponseList<CancelledTransactionBean> lstInvoices =new  ResponseList<CancelledTransactionBean>();
	            lstInvoices.addAll(icancelledTransactionReportService.getAllTransactionDateReport(SearchOn, strFromDate, strToDate));
	            json = lstInvoices.toString();
	            System.out.println("************************<<Cancelled Transaction Controller Json Data>>************************");
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
