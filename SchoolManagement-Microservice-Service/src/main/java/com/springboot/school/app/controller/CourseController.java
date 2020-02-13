package com.springboot.school.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.school.app.dao.CourseRepository;
import com.springboot.school.app.dao.InstituteRepository;
import com.springboot.school.app.model.Course;
import com.springboot.school.app.model.Institute;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Controller
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    
    @Autowired
    InstituteRepository  instituteRepository;
    
    @GetMapping("/courses")
    public String form(Model m){
        m.addAttribute("cmd", new Course());
        return "/courses"; //html
    }
    
    @GetMapping("/save-course")
    public String save(@ModelAttribute Course c){
    	System.out.println("\n*****************************<< CourseController|| save(*)>>******************************");
        courseRepository.save(c);
        return "redirect:/courses"; //action
    }
    
    @ModelAttribute("instituteList")
    public List<Institute> getInstituteList(){
    	System.out.println("\n*****************************<< CourseController|| getInstituteList(*)>>******************************");
        //return instituteRepository.findAll();
    	List<Institute> l=instituteRepository.getInstCostomList();
    	System.out.println("\n\n getInstituteList --------------------------::"+l);
        return instituteRepository.getInstCostomList();
    }
    
    @ModelAttribute("courseList")
    public List<Map<String,Object>> getcourseList(){  
    	System.out.println("\n*****************************<< CourseController|| getcourseList(*)>>******************************");
//        return courseRepository.findAll();
        return courseRepository.getCourses();
    }
    
    @GetMapping("/tmp-courses")
    @ResponseBody
    public  List<Map<String,Object>> courseListTemp(){
    	System.out.println("\n*****************************<< CourseController || courseListTemp(*)>>******************************");
    	
        return courseRepository.getCourses();
    }
}
