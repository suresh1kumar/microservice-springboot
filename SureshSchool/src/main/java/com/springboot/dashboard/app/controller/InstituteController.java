package com.springboot.dashboard.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dashboard.app.model.Institute;
import com.springboot.dashboard.app.service.CommonService;


@RestController
public class InstituteController {
	
	@Autowired
    CommonService commonService;
	
	 @RequestMapping(value ="/save-institute",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	    public Institute save(@RequestBody Institute inst) {
	    	System.out.println("\n*****************************<< InstituteController|| save(*)>>******************************");
	        inst.getContact().setName(inst.getName());
	        inst.setDoe(new Date());
	        return commonService.saveInstitute(inst);
	        //return "redirect:/institute-list";
	    }
	 
	 /*@RequestMapping(value = "/employee", //
	            method = RequestMethod.POST, //
	            produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee addEmployee(@RequestBody EmployeeForm empForm) {
	        System.out.println("(Service Side) Creating employee with empNo: " + empForm.getEmpNo());
	        return employeeDAO.addEmployee(empForm);
	    }*/

}
