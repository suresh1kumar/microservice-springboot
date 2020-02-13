package com.mobitec.Mvoucher.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobitec.Mvoucher.domain.City;
import com.mobitec.Mvoucher.domain.State;
import com.mobitec.Mvoucher.domain.Zone;
import com.mobitec.Mvoucher.service.ZoneStateCityService;

;


@Controller
public class ZoneCircleCityController {

	@Autowired
	private ZoneStateCityService zoneStateCityService;
	
	@RequestMapping("/display")
	public String showAddStudent() {
		System.out.println("****************Display ZoneCircleCity*****************");
		return "display";
	}
	@RequestMapping(value = "/getAllZone")
	public ModelAndView getZoneModelType() {
		System.out.println("*********************************<Country Controller 1>*********************************");
		List<Zone> list = new ArrayList<>();

		list = zoneStateCityService.getZone();
		
		System.out.println("Country list date === :::"+list);
		System.out.println("Country list date === :::"+list.size());
		return new ModelAndView("formDateDis", "zonenames", list);
	}
	
	@RequestMapping(value = "/getAllZoneListType")
	@ResponseBody
	public List<Zone> getZone() {
		System.out.println("*********************************<Country Controller 2>*********************************");
		List<Zone> list = new ArrayList<>();

		list = zoneStateCityService.getZone();
		
		System.out.println("Country list date === :::"+list);
		System.out.println("Country list date === :::"+list.size());
		return list;
	}
	//===============================state
	
	@RequestMapping(value = "/getAllStateSingle",method = RequestMethod.GET)
	@ResponseBody
	public List<State> getState(HttpServletRequest request) {
		System.out.println("*********************************<State Controller>*********************************");
	    String count =request.getParameter("count");
		    
		List<State> list = new ArrayList<>();

		list = zoneStateCityService.getStatesingle();
		System.out.println("State CONTROLLER list date === :::"+list);
		System.out.println("State CONTROLLER list date === :::"+list.size());
		return list;
	}
	
	//=====================city
	@RequestMapping(value = "/getAllCity",method = RequestMethod.GET)
	@ResponseBody
	public List<City> getCity(HttpServletRequest request) {
		System.out.println("*********************************<City Controller>*********************************");
			
		 String count =request.getParameter("count");
		List<City> list = new ArrayList<>();

		list = zoneStateCityService.getCity(count);
		System.out.println("City CONTROLLER list date === :::"+list);
		System.out.println("City CONTROLLER list date === :::"+list.size());
		return list;
	}
	/*@RequestMapping(value = "/getAllChannel")
	@ResponseBody
	public ModelAndView getChannelm(HttpServletResponse response) throws IOException {
		System.out.println("========Channel Controller============");
		 //String channelid =request.getParameter("channel");
		 List<ChannelType> list = new ArrayList<>();

		 list = channelTypeService.getChannel();
		
			 response.sendRedirect("/getAllZone");
			 
		System.out.println("1111channel------ list date === :::"+list);
		System.out.println("111Channel------- list date === :::"+list.size());
		return new ModelAndView("formDateDis", "channelname", list);
	}*/
}
