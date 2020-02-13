package com.springboot.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.school.app.dao.EnquirySourceRepository;
import com.springboot.school.app.model.EnquirySource;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Controller
public class EnquirySourceController {
    
    @Autowired
    EnquirySourceRepository enquirySourceRepository;
    
    @RequestMapping("/sources")
    public String enquirySources(Model model) {
        EnquirySource cmd = new EnquirySource();
        model.addAttribute("cmd", cmd);
        return "/sources"; //sources.html
    }
    
    @RequestMapping("/enquiry-source-edit/{id}")
    public String edit(@PathVariable Long id , Model model) {
    	System.out.println("*****************************<<EnquirySourceController || edit(*)>>******************************");
        EnquirySource cmd = enquirySourceRepository.findById(id).get();
        System.out.println("cmd ::"+cmd);
        model.addAttribute("cmd", cmd);
        return "/sources"; //sources.html
    }
    
    @RequestMapping("/save-enquiry-source")
    public String save(@ModelAttribute EnquirySource es) {
    	System.out.println("*****************************<<EnquirySourceController || save(*)>>******************************");
        enquirySourceRepository.save(es);
        
        System.out.println("enquirySourceRepository.save(es) ::"+enquirySourceRepository.save(es));
        return "redirect:/sources"; 
    }
    
    @RequestMapping("/enquiry-source-delete/{id}")
    public String delete(@PathVariable Long id) {
    	System.out.println("*****************************<<EnquirySourceController || delete(*)>>******************************");
        enquirySourceRepository.deleteById(id);
        System.out.println("delete id.."+id);
        return "redirect:/sources"; 
    }
    
    @ModelAttribute("enquirySourceList")
    public List<EnquirySource> getEnquirySourceList(){
    	System.out.println("*****************************<<EnquirySourceController || getEnquirySourceList(*)>>******************************");
    	List<EnquirySource> enq=enquirySourceRepository.findAll();
    	System.out.println("getEnquirySourceList ::"+enq);
        //return enquirySourceRepository.findAll();
    	return enq;
    }
    
}
