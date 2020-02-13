/*package com.mobitec.Mvoucher.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobitec.Mvoucher.domain.ChannelWiseBean;
import com.mobitec.Mvoucher.service.IChannelWiseService;



@Controller
public class StudentControllerCsv {
	
	@Autowired
	private IChannelWiseService studentService;
	
	 @RequestMapping(value = "/downloadCSV1",method = RequestMethod.GET)
	 @ResponseBody
	 public String downloadCSV(@RequestParam Map<String,String> requestParams,HttpServletRequest req,HttpServletResponse response) throws IOException {
		 
			response.setContentType("text/csv");
			String reportName = "StudentRecourd.csv";
			response.setHeader("Content-disposition", "attachment;filename="+reportName);
	 
			String req_type1 ="106";
			//String dest_circle_id1="Andhra Pradesh";
			//String cityid1="Nalgonda";
			String strFromDate1="01/25/2011";
			
		 	System.out.println("====================requestParams  size ::"+requestParams.size());
			String status1 = requestParams.get("SearchOn");
			String DEST_ZONE_ID1 = requestParams.get("zone");
			String dest_circle_id1 = requestParams.get("circlehidden");
			String cityid1 = requestParams.get("cityhidden");
			//String req_type1 = requestParams.get("channelid");
			String wichDate1 = requestParams.get("searchType1");
			//String strFromDate1= requestParams.get("strFromDate");
			String strToDate1 = requestParams.get("strToDate");
			
			System.out.println("----------------csv---requestParams------------");
			System.out.println("status1 Success and cancle::"+status1);
			System.out.println("Channel id::"+req_type1);
			System.out.println("Circle name::"+dest_circle_id1);
			System.out.println("zone name::"+DEST_ZONE_ID1);
			System.out.println("Current and old date::"+wichDate1);
			System.out.println("strFromDate1::"+strFromDate1);
			System.out.println("strToDate1::"+strToDate1);
			System.out.println("City Name::"+cityid1);
			
			
			String ststessss=req.getParameter("SearchOn");
			String zonessss=req.getParameter("zone");
			String circlessss=req.getParameter("circlehidden");
			String cityttt=req.getParameter("cityhidden");
			
			String channelids=req.getParameter("channelid");
			String statsid=req.getParameter("searchType1");
			//String strFromDate1=req.getParameter("strFromDate");
			String todate=req.getParameter("strToDate");
			
			System.out.println("----------------csv--------getParameter-------");
			System.out.println(" ststessss::==="+ststessss);
			System.out.println(" zonessss::==="+zonessss);
			System.out.println(" circlessss::==="+circlessss);
			System.out.println(" cityttt::==="+cityttt);
			System.out.println(" channelids::==="+channelids);
			System.out.println(" statsid====::==="+statsid);
			System.out.println(" strToDate1::==="+todate);
			ChannelWiseController c=new ChannelWiseController();
			
			List<ChannelWiseBean> rows1;
			
			rows1=studentService.getAllChannelWiseReport(status1, req_type1, dest_circle_id1, DEST_ZONE_ID1, wichDate1, strFromDate1, strToDate1, cityid1);
			
			
			
			List<String> rows = new ArrayList<>(rows1.size());
			List<ChannelWiseBean> list = new ArrayList<>();
			
			
			rows.add("DATE1,SOURCE_CIRCLENAME,SSA_NAME,SOURCE_MSISDN,DEST_MSISDN,AMOUNT,TRANSACTION_TYPE,STATUS1,SOURCE_BALANCE_BEFORE,SOURCE_BALANCE_AFTER,DEST_BALANCE_BEFORE,DEST_BALANCE_AFTER,DEST_CIRCLE_NAME");
			rows.add("\n");
			Object o=null;String part1=null;String part2=null;String part3=null;
			System.out.println(rows);
			Iterator it=rows1.iterator();
			while(it.hasNext()){
				 o=it.next();
				 rows.add(Objects.toString(o, null));
				System.out.println(o);
				String[] parts =   o.toString().split("[sourcemsisdn=descmsisdn,transaction_type,amount,status,create_stmt,source_balance_after,source_balance_before,dest__balance_before,dest__balance_after,circlename,cityname,Source_circlename] ");
				System.out.println("=>"+parts[1]);
				System.out.println("=>"+parts[2]);
				System.out.println("=>"+parts[3]);
				System.out.println("=>"+parts[4]);
				System.out.println("=>"+parts[5]);
				System.out.println("=>"+parts[6]);
				System.out.println("=>"+parts[7]);
				System.out.println("=>"+parts[8]);
				System.out.println("=>"+parts[9]);
				System.out.println("=>"+parts[10]);
				System.out.println("=>"+parts[11]);
				System.out.println("=>"+parts[12]);
				System.out.println("=>"+parts[13]);
				
			}
			System.out.println("****------------- ::"+o.toString());
			
			Iterator<String> iter = rows.iterator();
			while (iter.hasNext()) {
				String outputString = (String) iter.next();
				System.out.println("ccccccccccc"+outputString);
				
				response.getOutputStream().println(outputString);
				
			}
			response.getOutputStream().flush();
			return requestParams.toString();
		}

}
*/