package com.springboot.instituteinfo.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.instituteinfo.app.dao.InstituteRepository;
import com.springboot.instituteinfo.app.model.Institute;
import com.springboot.instituteinfo.app.service.InstituteServiceImpl;



@Controller
//@RequestMapping("/")
public class InstituteController {
	
	 @Autowired
	 InstituteServiceImpl commonService;
	    
	    @Autowired
	    InstituteRepository instituteRepository;
	
	@GetMapping("/institute-form")
    public String form(Model m) {
        m.addAttribute("cmd", new Institute());
        return "/institute-form"; 
    } 
	
	/*@GetMapping("/institute-form")
    public String form(Model m) {
        m.addAttribute("cmd", new Institute());
        return "/institute-form"; //html
    }*/
	
	/* @RequestMapping(method = RequestMethod.GET)
	    public String getIndexPage(Model m) {
		 m.addAttribute("cmd", new Institute());
		 return "institute-form"; 
	    }*/
	 
	

    @GetMapping("/save-institute")
    public String save(@ModelAttribute Institute inst) {
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
