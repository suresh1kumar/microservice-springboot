package com.springboot.school.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springboot.school.app.dao.InstituteRepository;
import com.springboot.school.app.model.Institute;
import com.springboot.school.app.service.CommonService;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Controller
public class InstituteController {

    @Autowired
    CommonService commonService;
    
    @Autowired
    InstituteRepository instituteRepository;

    @GetMapping("/institute-form")
    public String form(Model m) {
        m.addAttribute("cmd", new Institute());
        return "/institute-form"; //html
    }

    @GetMapping("/save-institute")
    public String save(@ModelAttribute Institute inst) {
    	System.out.println("\n*****************************<< InstituteController|| save(*)>>******************************");
        inst.getContact().setName(inst.getName());
        inst.setDoe(new Date());
        commonService.saveInstitute(inst);
        return "redirect:/institute-list";
    }
    @GetMapping("/institute-list")
    public String list(Model m) {
    	System.out.println("\n*****************************<< InstituteController || list(*)>>******************************");
        //m.addAttribute("instList", instituteRepository.findAll());
        m.addAttribute("instList", instituteRepository.getInstList());
        return "/institute-list"; //html
    }
}
