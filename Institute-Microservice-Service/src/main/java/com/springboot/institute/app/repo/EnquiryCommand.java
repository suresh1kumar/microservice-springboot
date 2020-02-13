package com.springboot.institute.app.repo;

import com.springboot.institute.app.model.Enquiry;

/**
 *
 * @author Suresh Kumar Gupta
 */
public class EnquiryCommand {
    Enquiry enquiry;
    Long[] courses;

    public Enquiry getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Enquiry enquiry) {
        this.enquiry = enquiry;
    }

    public Long[] getCourses() {
        return courses;
    }

    public void setCourses(Long[] courses) {
        this.courses = courses;
    }
    
    
}
