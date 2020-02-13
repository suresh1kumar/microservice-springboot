package com.springboot.institute.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.institute.app.dao.CourseRepository;
import com.springboot.institute.app.dao.InstituteRepository;
import com.springboot.institute.app.model.Course;
import com.springboot.institute.app.model.Institute;

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
        courseRepository.save(c);
        return "redirect:/courses"; //action
    }
    
    @ModelAttribute("instituteList")
    public List<Institute> getInstituteList(){
        //return instituteRepository.findAll();
        return instituteRepository.getInstCostomList();
    }
    
    @ModelAttribute("courseList")
    public List<Map<String,Object>> getcourseList(){       
//        return courseRepository.findAll();
        return courseRepository.getCourses();
    }
    
    @GetMapping("/tmp-courses")
    @ResponseBody
    public  List<Map<String,Object>> courseListTemp(){
        return courseRepository.getCourses();
    }
}
