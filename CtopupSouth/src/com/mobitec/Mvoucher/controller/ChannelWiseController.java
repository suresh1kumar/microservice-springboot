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
import com.mobitec.Mvoucher.jsonconv.ResponseList;
import com.mobitec.Mvoucher.service.IChannelWiseService;


@Controller
public class ChannelWiseController {

	@Autowired
	private IChannelWiseService iChannelWiseService;

	 public void setiChannelWiseService(IChannelWiseService iChannelWiseService) {
			this.iChannelWiseService = iChannelWiseService;
		}
	 
	@RequestMapping(value = {"/","/channel_url"}, method = RequestMethod.GET)
	    public ModelAndView showChannel() {
		 ModelAndView model = new ModelAndView();
	        model.setViewName("channelWiseReport");
	        return model;
	    }

	@RequestMapping(value = {"/get-all-channels"}, method = RequestMethod.POST)
	   // @CrossOrigin(origins = "*", allowCredentials = "true")
	    @ResponseBody
	    public String getAllChannelsReport(HttpServletRequest request, HttpServletResponse response) {
	    	
		 String SearchOn1=request.getParameter("SearchOn");
		 String zone1=request.getParameter("zone");
		 String channelid1=request.getParameter("channelid");
		 String searchType11=request.getParameter("searchType1");
		 String strFromDate1=request.getParameter("fromDate");
		 String strToDate1=request.getParameter("toDate");
		 String circlehidden1="Andhra Pradesh";
		 String cityhidden1="Nalgonda";
		
			System.out.println("SearchOn1 ::"+SearchOn1);
			System.out.println("zone1 id::"+zone1);
			System.out.println("Circle name::"+circlehidden1);
			System.out.println("city name::"+cityhidden1);
			System.out.println("channel id1::"+channelid1);
			System.out.println("search Type11::"+searchType11);
			System.out.println("From Date1::"+strFromDate1);
			System.out.println("To Date::"+strToDate1);
	    	
	        String json;
	        try {
	        	System.out.println("******************************<<ChannelWise Report Controller>>******************************");
	            ResponseList<ChannelWiseBean> lstInvoices =new  ResponseList<ChannelWiseBean>();
	            lstInvoices.addAll(iChannelWiseService.getAllChannelWiseReport(SearchOn1, channelid1, circlehidden1, zone1, searchType11, strFromDate1, strToDate1, cityhidden1));
	            json = lstInvoices.toString();
	            System.out.println("json ::"+json);
	        } catch (Exception e) {
	            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
	        }
	        return json;
	    }
	 //=====================================================
	
	/*@RequestMapping(value = "/getAllStudentRecourd",method = RequestMethod.GET)
		public String printWelcome(@RequestParam Map<String,String> requestParams,ModelMap model,HttpServletRequest req) {
		
		System.out.println("=========Student Controller===========");
		System.out.println("====================requestParams  size ::"+requestParams.size());
		
		String strFromDate1="01/25/2011";
		
		String cir=req.getParameter("circlehidden");
		String cit=req.getParameter("cityhidden");
		System.out.println("circle ============::"+cir);
		System.out.println("city ============::"+cit);
	 	
		String status1 = requestParams.get("SearchOn");
		String DEST_ZONE_ID1 = requestParams.get("zone");
		String dest_circle_id1 = requestParams.get("circlehidden");
		String cityid1 = requestParams.get("cityhidden");
		String req_type1 = requestParams.get("channelid");
		String wichDate1 = requestParams.get("searchType1");
		//String strFromDate1= requestParams.get("strFromDate");
		String strToDate1 = requestParams.get("strToDate");
		//String s[]={status1,DEST_ZONE_ID1,req_type1,wichDate1,strToDate1};
		
		System.out.println("status1 Success and cancle::"+status1);
		System.out.println("Channel id::"+req_type1);
		System.out.println("Circle name::"+dest_circle_id1);
		System.out.println("zone name::"+DEST_ZONE_ID1);
		System.out.println("Current and old date::"+wichDate1);
		System.out.println("strFromDate1::"+strFromDate1);
		System.out.println("strToDate1::"+strToDate1);
		System.out.println("City Name::"+cityid1);
		
		
		List<ChannelWiseBean> list = new ArrayList<>();
        
	    list = studentService.getStudent(status1, req_type1, dest_circle_id1, DEST_ZONE_ID1, wichDate1, strFromDate1, strToDate1, cityid1);
		System.out.println("Student CONTROLLER list date === :::"+list);
		System.out.println("Student CONTROLLER list date === :::"+list.size());
		
		model.addAttribute("recordviews", list);
		return "viewRecord";
		
	}*/
	
}
