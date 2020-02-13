package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.State;
import com.bean.Zone;
import com.dao.ZoneStateCity;

@Controller
public class StateController {

	@Autowired
	private ZoneStateCity zoneStateCity;

	@RequestMapping("/display1")
	public String showAddStudent() {
		System.out.println("-----------------------");
		return "display1";
	}

	@RequestMapping(value = "/getAllState{zip}")
	public ModelAndView getState(HttpServletRequest request) {
		System.out.println("=========State Controller===========");
		
	    String count =request.getParameter("count");
		    
		List<State> list = new ArrayList<>();

		list = zoneStateCity.getState(count);
		
		System.out.println("State CONTROLLER list date === :::"+list);
		System.out.println("State CONTROLLER list date === :::"+list.size());
		return new ModelAndView("index", "statenames", list);
	}
}
