package com.springboot.registration.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {

	
	/*@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		System.out.println("\n\n\n===============================Home :");
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}*/
	
	@RequestMapping("/")
	   public String index() {
	      return "home";
	   }
	  
	  @RequestMapping(value="/formPage",method = RequestMethod.GET)
	  public ModelAndView getformPage() {
			ModelAndView mav = new ModelAndView("formpage");
			return mav;
	    }
	  
	  @RequestMapping(value="/linkPage",method = RequestMethod.GET)
	  public ModelAndView getLinkPage() {
			ModelAndView mav = new ModelAndView("link");
			return mav;
	    }
	  
	  
	  

}
