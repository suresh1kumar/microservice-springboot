package com.springboot.institute.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.institute.app.dao.AddressRepository;
import com.springboot.institute.app.dao.InstituteRepository;
import com.springboot.institute.app.model.Institute;
import com.springboot.institute.app.service.InstituteServiceImpl;



@Controller
//@RequestMapping("/")
public class InstituteController {
	
		@Autowired
		AddressRepository addressRepository;
		
		@Autowired
		InstituteServiceImpl commonService;
	    
	    @Autowired
	    InstituteRepository instituteRepository;
	
	/*@GetMapping("/institute-form")
    public String form(Model m) {
        m.addAttribute("cmd", new Institute());
        return "/institute-form"; 
    } */
	 
	 @RequestMapping(value="/institute-form", method=RequestMethod.GET)
	 public ModelAndView addArticle() {
		 System.out.println("ModelAndView addArticle-------------------");
	  ModelAndView model = new ModelAndView();
	  
	  Institute article = new Institute();
	  model.addObject("articleForm", article);
	  model.setViewName("institute-form");
	  return model;
	 }
	 
	 
	 
	 /*@RequestMapping(value="/saveArticle", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("articleForm") Article article) {
	  articleService.saveOrUpdate(article);
	  
	  return new ModelAndView("redirect:/article/list");
	 }*/

   // @GetMapping("/save-institute")
    @RequestMapping(value="/save-institute", method=RequestMethod.POST)
    public String save(@ModelAttribute Institute inst) {
    	System.out.println("save institute action------------::"+inst);
    	System.out.println("inst.getContact()::"+inst.getContact());
    	//System.out.println(inst.getContact().setName(inst.getName()));
    	System.out.println("inst.getContact()::"+inst.getContact());
    	
        inst.getContact().setName(inst.getName());
        inst.setDoe(new Date());
        commonService.saveInstitute(inst);
        return "redirect:/institute-list";
    }
    @GetMapping("/institute-list")
    public String list(Model m) {
        //m.addAttribute("instList", instituteRepository.findAll());
        m.addAttribute("instList", instituteRepository.getInstList());
        return "/institute-list"; 
    }

}
