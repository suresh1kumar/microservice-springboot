package com.springboot.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.school.app.dao.EnquirySourceRepository;
import com.springboot.school.app.model.EnquirySource;

/**
 *
 * @author Suresh Kumar Gupta
 */
@RestController
public class TestController {

    @Autowired
    EnquirySourceRepository enquirySourceRepository;

    @GetMapping("/test-save-source")
    public String testSaveSource() {
        EnquirySource es = new EnquirySource("Website Partner");
        enquirySourceRepository.save(es);
        return "Success";
    }
    @GetMapping("/test-source-list")
    public List<EnquirySource> getSourceList() {       
        return enquirySourceRepository.findAll();
    }
}
