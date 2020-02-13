package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.CanceledMovedStkReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.ICanceledMovedStkReportService;

@Controller
public class CanceledMovedStkReportController {
	
	@Autowired
	private ICanceledMovedStkReportService canceledMovedStkReportService;

	public void setCanceledMovedStkReportService(ICanceledMovedStkReportService canceledMovedStkReportService) {
		this.canceledMovedStkReportService = canceledMovedStkReportService;
	}

	@RequestMapping(value = {"/","/CanceledMovedStkReport"}, method = RequestMethod.GET)
    public ModelAndView showCanceledMovedStkReport() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("CanceledMovedStkReport");
        return model;
    }

	/*"wallet" : wallet,
	"srcNumbOrIdOptn" : srcNumbOrIdOptn,
	"srcNumberOrId" : srcNumberOrId,
	"destMobileNumber" : destMobileNumber,
	"fromDate" : fromDate,
	"toDate" : toDate*/
	@RequestMapping(value = {"/get-all-CanceledMovedStkReport"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllCanceledMovedStkReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		 String wallet=request.getParameter("wallet");
		 String srcNumbOrIdOptn=request.getParameter("srcNumbOrIdOptn");
		 String srcNumberOrId=request.getParameter("srcNumberOrId");
		 String destMobileNumber=request.getParameter("destMobileNumber");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		
		
			System.out.println("wallettype ::"+wallet);
			System.out.println("srcNumbOrIdOptn::"+srcNumbOrIdOptn);
			System.out.println("srcNumberOrId::"+srcNumberOrId);
			System.out.println("destMobileNumber::"+destMobileNumber);
			System.out.println("From Date1::"+fromDate);
			System.out.println("To Date::"+toDate);
	    	
	        String json;
	        try {
	        	System.out.println("========================Canceled Moved StkReport===================================");
	            ResponseList<CanceledMovedStkReportBean> lstInvoices =new  ResponseList<CanceledMovedStkReportBean>();
	            System.out.println("======================== StkReport 1===================================");
	            lstInvoices.addAll(canceledMovedStkReportService.getAllCanceledMovedStkReport(wallet, srcNumbOrIdOptn, srcNumberOrId,destMobileNumber,fromDate, toDate));
	            System.out.println("========================StkReport 2===================================");
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
