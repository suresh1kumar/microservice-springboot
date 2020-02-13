package com.mobitec.Mvoucher.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.domain.StockCancellationReportBean;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IStockCancellationReportService;

import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.OrderedJSONObject;

@Controller
public class StockCancellationReportController {
	
	@Autowired
	private IStockCancellationReportService stockCancellationReportService;
	
	
	@RequestMapping(value = {"/","/StockCancellationReport_url"}, method = RequestMethod.GET)
    public ModelAndView showStockCancellationReport(Model model1) throws JSONException {
		
	 ModelAndView model = new ModelAndView();
        model.setViewName("StkAlockAppvCanRep");
        return model;
    }
	
	@RequestMapping(value = {"/get-all-StockCancellationReport"}, method = RequestMethod.POST)
	    @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllStockCancellationReport(Model model ,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("*******************************<<stockcanclemovestock Controller>>*******************************");
		
		 String wallet=request.getParameter("wallet");
		 String srcNumbOrIdOptn=request.getParameter("srcNumbOrIdOptn");
		 String srcNumberOrId=request.getParameter("srcNumberOrId");
		 String SearchOn=request.getParameter("SearchOn");
//		 String wichDate=request.getParameter("wichDate");
		 String fromDate=request.getParameter("fromDate");
		 String toDate=request.getParameter("toDate");
		//String wichDate="CancelDate";
		 String wichDate="AllocApproveDate";
		
			System.out.println("wallet ::"+wallet);
			System.out.println("srcNumbOrIdOptn::"+srcNumbOrIdOptn);
			System.out.println("srcNumberOrId::"+srcNumberOrId);
			System.out.println("SearchOn::"+SearchOn);
			System.out.println("wichDate::"+wichDate);
			System.out.println("fromDate::"+fromDate);
			System.out.println("toDate::"+toDate);
			
			 OrderedJSONObject jsonObject = new OrderedJSONObject();
	        String json;
	        try {
	            ResponseList<StockCancellationReportBean> lstInvoices =new  ResponseList<StockCancellationReportBean>();
	           
	               JSONArray  jsonArray = new JSONArray();
	   		       jsonObject.put("wallet", "wallet");
	   		       json=jsonObject.toString();
	   		       System.out.println("json wallet ::"+json);
	            
	               lstInvoices.addAll(stockCancellationReportService.getAllStockCancellationReport(wallet, wichDate, srcNumbOrIdOptn, srcNumberOrId, SearchOn, fromDate, toDate));
	               json = lstInvoices.toString();
	               System.out.println("*******************************<<stockcanclemovestock Controller Json Data>>*******************************");
	               System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
}
