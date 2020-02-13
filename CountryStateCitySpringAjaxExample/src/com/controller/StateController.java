package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.State;
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

	@RequestMapping(value = "/getAllState",method = RequestMethod.GET)
	@ResponseBody
	public List<State> getState(HttpServletRequest request) {
		System.out.println("=========State Controller===========");
		//logger.debug("Displaying items available in the store...")
	    String count =request.getParameter("count");
		    
		List<State> list = new ArrayList<>();

		list = zoneStateCity.getState(count);
		System.out.println("State CONTROLLER list date === :::"+list);
		System.out.println("State CONTROLLER list date === :::"+list.size());
		return list;
	}
	
	
	/*@RequestMapping(value = "/listExistingUser", method = RequestMethod.GET)
	 @ResponseBody
	public Object getAuthentication(@ModelAttribute("studentId") int studentId, HttpServletRequest request, HttpServletResponse response)
			   {
				System.out.println("listExistingUser is called in controller");
			   }*/
}
