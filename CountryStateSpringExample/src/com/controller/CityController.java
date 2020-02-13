package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.City;
import com.bean.State;
import com.bean.Zone;
import com.dao.ZoneStateCity;

@Controller
public class CityController {

	@Autowired
	private ZoneStateCity zoneStateCity;

	@RequestMapping("/display2")
	public String showAddStudent() {
		System.out.println("-----------------------");
		return "display2";
	}

	@RequestMapping(value = "/getAllCity")
	public ModelAndView getCity(HttpServletRequest request) {
		System.out.println("==========City Controller==========");
			
		String count =request.getParameter("count");
		List<City> list = new ArrayList<>();

		list = zoneStateCity.getCity(count);
		
		System.out.println("City CONTROLLER list date === :::"+list);
		System.out.println("City CONTROLLER list date === :::"+list.size());
		return new ModelAndView("index", "citynames", list);
	}
}
