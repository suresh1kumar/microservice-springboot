package com.mobitec.Mvoucher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.domain.DealerInfoSearchBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IChannelWiseService;
import com.mobitec.Mvoucher.service.IDealerInfoSearchService;

@Controller
public class StockAllocationController {
	
	@Autowired
	public IDealerInfoSearchService iDealerInfoSearchService;
	
	 public void setiDealerInfoSearchService(IDealerInfoSearchService iDealerInfoSearchService) {
			this.iDealerInfoSearchService = iDealerInfoSearchService;
		}
	 
	@RequestMapping(value = {"/","/StockAllocation_url"}, method = RequestMethod.GET)
	    public ModelAndView showStockAllocation() {
		 ModelAndView model = new ModelAndView();
	        model.setViewName("searchDealerInfo");
	        return model;
	    }

	@RequestMapping(value = {"/get-all-StockAllocation"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    
		
		 String zone=request.getParameter("zone");
		 String region=request.getParameter("region");
		 String city=request.getParameter("city");
		 String dealerCode=request.getParameter("dealerCode");
		 String firstName=request.getParameter("firstName");
		 String contactNumber=request.getParameter("contactNumber");
		 String secondName=request.getParameter("secondName");
		 String mobileNumber=request.getParameter("mobileNumber");
		 String lastName=request.getParameter("lastName");
		 String authorised=request.getParameter("authorised");
		 String Status=request.getParameter("Status");
		
		
			System.out.println("zone ::"+zone);
			System.out.println("region::"+region);
			System.out.println("city::"+city);
			System.out.println("dealerCode::"+dealerCode);
			System.out.println("firstName::"+firstName);
			System.out.println("contactNumber::"+contactNumber);
			System.out.println("secondName::"+secondName);
			System.out.println("mobileNumber::"+mobileNumber);
			System.out.println("lastName::"+lastName);
			System.out.println("authorised::"+authorised);
			System.out.println("Status::"+Status);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<Stock Allocation Controller>>******************************");
	            ResponseList<DealerInfoSearchBean> lstInvoices =new  ResponseList<DealerInfoSearchBean>();
	            //iDealerInfoSearchService.getStockAllocationDetails(zone, region, city, dealerCode, firstName, secondName, lastName, contactNumber, mobileNumber, authorised, Status)
	            lstInvoices.addAll(iDealerInfoSearchService.getStockAllocationDetails(zone, region, city, dealerCode, firstName, secondName, lastName, contactNumber, mobileNumber, authorised, Status));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
