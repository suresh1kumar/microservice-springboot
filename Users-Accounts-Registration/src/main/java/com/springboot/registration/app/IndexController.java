package com.springboot.registration.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {

	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView mav = new ModelAndView("homelogin");
		return mav;
	}
	
	@RequestMapping(value="/employeeHomePage",method = RequestMethod.GET)
	  public ModelAndView getHomePage() {
			ModelAndView mav = new ModelAndView("employee");
			return mav;
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
