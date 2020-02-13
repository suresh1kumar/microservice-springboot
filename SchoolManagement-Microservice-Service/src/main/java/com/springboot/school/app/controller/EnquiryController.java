package com.springboot.school.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.school.app.dao.CourseRepository;
import com.springboot.school.app.dao.EnquiryRepository;
import com.springboot.school.app.dao.EnquirySourceRepository;
import com.springboot.school.app.dao.FollowupRepository;
import com.springboot.school.app.dao.InstituteRepository;
import com.springboot.school.app.model.Course;
import com.springboot.school.app.model.EnquirySource;
import com.springboot.school.app.model.Institute;
import com.springboot.school.app.repo.EnquiryCommand;
import com.springboot.school.app.service.CommonService;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Controller
public class EnquiryController {

    @Autowired
    InstituteRepository instituteRepository;

    @Autowired
    EnquirySourceRepository enquirySourceRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CommonService commonService;

    @Autowired
    EnquiryRepository enquiryRepository;

    @Autowired
    FollowupRepository followupRepository;

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("cmd", new EnquiryCommand());
        return "/index"; //index.html page
    }

    @GetMapping("/save-enquiry")
    @ResponseBody
    public String save(@ModelAttribute EnquiryCommand cmd) {
    	System.out.println("\n*****************************<< EnquiryController|| save(*)>>******************************");
        commonService.saveEnquiry(cmd);
        return "Enquiry Saved Successfully"; //TODO : go to enquiry list
    }

    @GetMapping("/get-courses")
    @ResponseBody
    public List<Course> getCoursesByInstituteId(@RequestParam Long instId) {
    	System.out.println("\n*****************************<< EnquiryController|| getCoursesByInstituteId(*)>>******************************");
        return courseRepository.findCourseListByInstitute_instituteId(instId);
    }

    @ModelAttribute("instituteList")
    public List<Institute> getInstList() {
    	System.out.println("\n*****************************<< EnquiryController|| getInstList(*)>>******************************");
        return instituteRepository.getInstCostomList();
    }

    @ModelAttribute("sourceList")
    public List<EnquirySource> getSourceList() {
    	System.out.println("\n*****************************<< EnquiryController|| getSourceList(*)>>******************************");
        return enquirySourceRepository.findAll();
    }

    @GetMapping("/enq-list")
    public String enquiryList(@RequestParam(required = false) Long instId, Model m) {
    	System.out.println("\n*****************************<< EnquiryController|| enquiryList(*)>>******************************");
        m.addAttribute("enquiryList", enquiryRepository.getEnquiryDTOList(instId));
        return "/enq-list"; //html
    }

    @GetMapping("/test-get-inst-ids")
    @ResponseBody
    public String getInstIds() {
    	System.out.println("\n*****************************<< EnquiryController|| getInstIds(*)>>******************************");
        return enquiryRepository.findAllIds();
    }

    @PostMapping("/save-followup")
    public String saveFollowup(@RequestParam Long enquiryId, @RequestParam String followup, @RequestParam(required = false) String go) {
    	System.out.println("\n*****************************<< EnquiryController|| saveFollowup(*)>>******************************");
    	commonService.saveFollowup(enquiryId, followup);
        if (go!=null && go.equals("eview")) {
            return "redirect:/enquiry-detail/"+enquiryId;
        }else{
            return "redirect:/enq-list";
        }
    }
    
    @GetMapping("/enquiry-detail/{id}")
    public String enquiryDetail(@PathVariable Long id, Model m){
    	System.out.println("\n*****************************<< EnquiryController|| enquiryDetail(*)>>******************************");
        m.addAttribute("dataMap", enquiryRepository.getEnquiryDetailMap(id));
        m.addAttribute("followupList", followupRepository.getFollowupsByEnquiryId(id));
        return "/enquiry-detail"; //html
    }
    
    @GetMapping("/test-enquiry-detail/{id}")
    @ResponseBody
    public Map<String,Object> getEnqMap(@PathVariable Long id){
    	System.out.println("\n*****************************<< EnquiryController|| getEnqMap(*)>>******************************");
        return enquiryRepository.getEnquiryDetailMap(id);
    }
}