package com.springboot.dashboard.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/institute/form",method = RequestMethod.GET)
	  public ModelAndView getPhotogallery() { 
			ModelAndView mav = new ModelAndView("institute-form");
			return mav;
	    }
}
