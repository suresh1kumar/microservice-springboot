package com.mobitec.Mvoucher.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.KYCReportBean;
import com.mobitec.Mvoucher.domain.KYCReportBean2;
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IKYCReportService;

@Controller
public class KYCReportController {
	@Autowired
	private IKYCReportService IkYCReportService;
	
	
	@RequestMapping(value = {"/","/kycreport_url"}, method = RequestMethod.GET)
    public ModelAndView showChannel() {
	 ModelAndView model = new ModelAndView();
        model.setViewName("KYCReport");
        return model;
    }

@RequestMapping(value = {"/get-all-kycreport"}, method = RequestMethod.POST)
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @ResponseBody
    public String getAllChannelsReport(@RequestParam Map<String,String> requestParams,HttpServletRequest request, HttpServletResponse response) {
	System.out.println("*****************************<<Detailed & Summary Controller>>*****************************");
	
	String Region1 = request.getParameter("region");
	String City1 = request.getParameter("city");
	String msisdn1 = request.getParameter("msisdn");
	String fdate1 = request.getParameter("fromDate");
	String tdate1 = request.getParameter("toDate");
	//String msisdn1 = request.getParameter("SearchOn");
	String ReportType1 = request.getParameter("ReportType");
	
	System.out.println("state ::"+Region1);
	System.out.println("city id::"+City1);
	System.out.println("from date ::"+fdate1);
	System.out.println("to date name::"+tdate1);
	System.out.println("Report type::"+ReportType1);
	
	//List<KYCReportBean> list = new ArrayList<>();
	
        String json=null;
        try {
        	
            if ((ReportType1 != null) && (ReportType1.equalsIgnoreCase("Detailed"))) {
            	// JSONObject object = new JSONObject();   
            	 System.out.println("*****************************<<Detailed Controller>>*****************************");
            	  //object.put("ReportType", "Detailed");
            	  ResponseList<KYCReportBean> lstInvoices =new  ResponseList<KYCReportBean>();
                  lstInvoices.addAll(IkYCReportService.getDetailedReport(Region1, City1, msisdn1, fdate1, tdate1, ReportType1));
                  // lstInvoices.addAllsure("ReportType", "Detailed");
                  json = lstInvoices.toString();
                  // json= object.toString();
                  System.out.println("json ::"+json);
            
            }else if ((ReportType1 != null) && (ReportType1.equalsIgnoreCase("Summary"))){
            	System.out.println("*****************************<<Summary Controller>>*****************************");
            	 ResponseList<KYCReportBean2> lstInvoices2 =new  ResponseList<KYCReportBean2>();
            	 lstInvoices2.addAll(IkYCReportService.getSummaryReport(Region1, City1, msisdn1, fdate1, tdate1, ReportType1));
            	 // lstInvoices2.addAllsure("ReportType", "Summary");
                 json = lstInvoices2.toString();
                 System.out.println("json ::"+json);
            }
        } catch (Exception e) {
            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
        }
        return json;
    }

}
