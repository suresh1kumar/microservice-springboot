package com.springboot.admin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RuterAdminController {    
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView mav = new ModelAndView("index");//gallery-advance
		return mav;  
	} 
	  
	@RequestMapping(value="/getGalleryGrid",method = RequestMethod.GET)
	public ModelAndView getGalleryGrid() {
		ModelAndView mav = new ModelAndView("gallery-grid");//gallery-grid.jsp
		return mav;  
	} 
	 
	@RequestMapping(value="/getGalleryMasonry",method = RequestMethod.GET)
	public ModelAndView getGalleryMasonry() {
		ModelAndView mav = new ModelAndView("gallery-masonry");//gallery-grid.jsp
		return mav;   
	}      
	
	@RequestMapping(value="/getGalleryAdvance",method = RequestMethod.GET)
	public ModelAndView getGalleryAdvance() {
		ModelAndView mav = new ModelAndView("gallery-advance");//event-full-calender
		return mav;  
	} 
	   
	@RequestMapping(value="/getEventFullCalender",method = RequestMethod.GET)
	public ModelAndView getEventFullCalender() {
		ModelAndView mav = new ModelAndView("event-full-calender");//event-clndr.jsp
		return mav;  
	} 
	
	@RequestMapping(value="/geTeventClndr",method = RequestMethod.GET)
	public ModelAndView geTeventClndr() {
		ModelAndView mav = new ModelAndView("event-clndr");//user-profile.html
		return mav;  
	}
	
	
	@RequestMapping(value="/getUserProfile",method = RequestMethod.GET)
	public ModelAndView getUserProfile() {
		ModelAndView mav = new ModelAndView("user-profile");//student_modal-form.jsp
		return mav;  
	}
	
	@RequestMapping(value="/getStudentModalForm",method = RequestMethod.GET)
	public ModelAndView getStudentModalForm() {
		ModelAndView mav = new ModelAndView("student_modal-form");//student_modal-form.jsp
		return mav;  
	}

}
