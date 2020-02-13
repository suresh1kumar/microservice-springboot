package com.springboot.institute.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.institute.app.dao.EnquirySourceRepository;
import com.springboot.institute.app.model.EnquirySource;
import com.springboot.institute.app.model.Institute;


/**
 *
 * @author Suresh Kumar Gupta
 */
@Controller
public class EnquirySourceController {
    
    @Autowired
    EnquirySourceRepository enquirySourceRepository;
    
    
    @RequestMapping(value="/sources", method=RequestMethod.GET)
	 public ModelAndView addArticle() {
		 System.out.println("ModelAndView addArticle-------------------");
	  ModelAndView model = new ModelAndView();
	  
	  EnquirySource article = new EnquirySource();
	  model.addObject("articleForm", article);
	  model.setViewName("sources");
	  return model;
	 }
   
    
    @RequestMapping("/enquiry-source-edit/{id}")
   // public String edit(@PathVariable Long id , Model model) {
    public ModelAndView edit(@PathVariable Long id , ModelAndView model) {
    	System.out.println("edit-----------------------------------------000\n\n");
        EnquirySource cmd = enquirySourceRepository.findById(id).get();
        //model.addAttribute("cmd", cmd);
        model.addObject("articleForm", cmd);
        model.addObject("articleForm",new EnquirySource());
        System.out.println("------------------------------------------2222\n\n");
        model.setViewName("sources");
        return model; //sources.html  
    }
    
    @RequestMapping(value="/save-enquiry-source", method=RequestMethod.POST)
    //@RequestMapping(value="/save-institute", method=RequestMethod.POST)
    public String save(@ModelAttribute EnquirySource es) {
        enquirySourceRepository.save(es);
        return "redirect:/sources"; 
    }
    
    @RequestMapping("/enquiry-source-delete/{id}")
    public String delete(@PathVariable Long id) {
        enquirySourceRepository.deleteById(id);
        return "redirect:/sources"; 
    }
    
    @ModelAttribute("enquirySourceList")
    public List<EnquirySource> getEnquirySourceList(){
        return enquirySourceRepository.findAll();
    }
    
}
