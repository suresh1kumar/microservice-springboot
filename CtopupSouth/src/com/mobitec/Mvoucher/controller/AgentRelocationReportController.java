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

import com.mobitec.Mvoucher.domain.AgentRelocationReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IAgentRelocationReportService;

@Controller
public class AgentRelocationReportController {
	@Autowired
	public IAgentRelocationReportService  agentRelocationReportServic;
	
	@RequestMapping(value = {"/","/agentRelocationReport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("agentRelocationReport");
        return model;
    }

	@RequestMapping(value = {"/get-all-agentRelocationReport"}, method = RequestMethod.POST)
	    @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		 String Msisdn=request.getParameter("msisdn");
		 String fromdate=request.getParameter("fromDate");
		 String todate=request.getParameter("toDate");
		
		
			System.out.println("Msisdn::"+Msisdn);
			System.out.println("From Date1::"+fromdate);
			System.out.println("To Date::"+todate);
			
	        String json;
	        try {
	        	System.out.println("***********************************AgentRelocationReport controller***********************************");
	            ResponseList<AgentRelocationReportBean> lstInvoices =new  ResponseList<AgentRelocationReportBean>();
	            lstInvoices.addAll(agentRelocationReportServic.getAllAgentRelocationReport(fromdate, todate, Msisdn));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
