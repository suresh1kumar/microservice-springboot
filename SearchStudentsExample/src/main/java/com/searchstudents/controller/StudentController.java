package com.searchstudents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.searchstudents.constants.NareshitConstants;
import com.searchstudents.dto.SearchParameters;
import com.searchstudents.dto.SearchResults;
import com.searchstudents.service.StudentService;

@Controller
public class StudentController {
	
private static final String WEB_SEARCH_STUDENTS="searchStudents";	
private static final String WEB_SEARCH_RESULTS_PAGE="/WEB-INF/pages/searchResults.jsp"; 

@Autowired
	private StudentService studentService;
    @RequestMapping(value=WEB_SEARCH_STUDENTS,
    		method=RequestMethod.GET)
public String showSearchStudentsPage(){
return "/WEB-INF/pages/searchStudents.jsp";
}
    @RequestMapping(value=WEB_SEARCH_STUDENTS,
    		method=RequestMethod.POST)
public ModelAndView searchStudents(
@RequestParam(NareshitConstants.CONST_STUDENT_ID) Integer studentId,
@RequestParam(NareshitConstants.CONST_STUDENT_NAME) String name,
@RequestParam(NareshitConstants.CONST_STUDENT_COURSE) String course,
@RequestParam(NareshitConstants.CONST_STUDENT_MOBILE) String mobile){  
	  
 SearchParameters searchParams=new 
		 SearchParameters();
 searchParams.setStudentId(studentId);
 searchParams.setName(name);
 searchParams.setCourse(course);
 searchParams.setMobile(mobile);
 List<SearchResults> list=studentService.searchStudents(searchParams);
    return new ModelAndView(WEB_SEARCH_RESULTS_PAGE,"searchResultsList",list);
  }
}
