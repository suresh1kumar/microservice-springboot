package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bean.Zone;
import com.dao.ZoneStateCity;

@Controller
public class CountryController {

	@Autowired
	private ZoneStateCity zoneStateCity;

	@RequestMapping("/display")
	public String showAddStudent() {
		System.out.println("-----------------------");
		return "display";
	}

	@RequestMapping(value = "/getAllZone")
	public ModelAndView getStudent() {
		System.out.println("========Country Controller============");
		List<Zone> list = new ArrayList<>();

		list = zoneStateCity.getZone();
		
		System.out.println("Country list date === :::"+list);
		System.out.println("Country list date === :::"+list.size());
		return new ModelAndView("index", "zonenames", list);
	}
}
