package com.springboot.admin.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.springboot.admin.app.model.Student;
import com.springboot.admin.app.service.StudentService;
import com.springboot.admin.app.utils.ErrorUtils;


@RestController
public class RestStudentController {
	
	@Autowired
	StudentService studentService;
	
	/*@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView mav = new ModelAndView("index");//gallery-advance
		return mav;  
	} */
	
	
	/*@RequestMapping(value="/testurl",method = RequestMethod.GET)
	public String getIndexPage2(@RequestParam String name) {
		System.out.println("\n\n\n\n@RequestParam String name ::"+name);
		//ModelAndView mav = new ModelAndView("index");//gallery-advance
		return "student save";  
	} */
	
	@RequestMapping(value = "/getUserDatas",method = RequestMethod.POST,  headers="Accept=application/json")
	public  String addressAdd(@Valid @RequestBody Student users_form, BindingResult result) {
		System.out.println("\n\n\n\nresult::"+result);
		System.out.println("\n\n\n\nresult::"+users_form.getName());
		//System.out.println("\n\n\n\nresult::"+student.getAddress());
		 Student st =new Student();  
		 //st.setName(name);
		if(result.hasErrors()) {
			System.out.println("\n\n\n\nresult::"+result);
		//	System.out.println("\n\n\n\nresult::"+student.getName());
			//System.out.println("\n\n\n\nresult::"+student.getAddress());
			//System.out.println("\n\n\n\nresult::"+student.getMobile());
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			System.out.println("\n\n\n\nresultssssss::"+result);
			//System.out.println("\n\n\n\nresultssssssss::"+student);
			return studentService.addStudent(users_form);
		}
	}
	
	//@PostMapping(value="/getUserData", headers="Accept=application/json")
	 /*@RequestMapping(value = "/getUserDatas", method = RequestMethod.POST)
	   public ResponseEntity<Void> createUser(@RequestBody Student  user,UriComponentsBuilder ucBuilder,BindingResult result) {
	 public String createUser(@RequestParam String name,@RequestParam String phone,
			 					@RequestParam String email,@RequestParam String country,
			 					@RequestParam String city,@RequestParam String address,
			 					UriComponentsBuilder ucBuilder, BindingResult result) {
		 
		 System.out.println("saveOrUpdate11=================saveOrUpdate=11==================="+user.getName());
	       
	 
		 Student st =new Student();  
		 st.setName(name);
		 st.setEmail(email);
		 st.setMobile(phone);
		 st.setCountry(country);
		 st.setCity(city);
		 st.setAddress(address);
		 
		// Student student =new Student(name,email,phone,country,city,address);
		 System.out.println("saveOrUpdate11=================saveOrUpdate=11::"+user);
	        if (studentService.isUserExist(st)) {
	            System.out.println("A User with name " + user.getUserName() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }
	        System.out.println("saveOrUpdate11=================saveOrUpdate=11==================="+st);
	    
	        if(result.hasErrors()) {
				return ErrorUtils.customErrors(result.getAllErrors());
			} else {
				return studentService.addStudent(user);
			}
	    }
*/
}
