package com.springboot.institute.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.institute.app.dao.AddressRepository;
import com.springboot.institute.app.dao.ContactRepository;
import com.springboot.institute.app.dao.CourseRepository;
import com.springboot.institute.app.dao.EnquiryCourseRepository;
import com.springboot.institute.app.dao.EnquiryRepository;
import com.springboot.institute.app.dao.EnquirySourceRepository;
import com.springboot.institute.app.dao.FollowupRepository;
import com.springboot.institute.app.dao.InstituteRepository;
import com.springboot.institute.app.model.Address;
import com.springboot.institute.app.model.Contact;
import com.springboot.institute.app.model.Enquiry;
import com.springboot.institute.app.model.EnquiryCourse;
import com.springboot.institute.app.model.Followup;
import com.springboot.institute.app.model.Institute;
import com.springboot.institute.app.repo.EnquiryCommand;


@Service
public class InstituteServiceImpl {

	@Autowired
    AddressRepository addressRepository;
	
    @Autowired
    ContactRepository contactRepository;
    
    @Autowired
    InstituteRepository instituteRepository;
	
    @Autowired
    EnquirySourceRepository enquirySourceRepository;
    @Autowired
    EnquiryRepository enquiryRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    EnquiryCourseRepository enquiryCourseRepository;
    @Autowired
    FollowupRepository followupRepository;
    
    @Transactional
    public void saveInstitute(Institute inst) {
        //address
        addressRepository.save(inst.getContact().getPermanentAddress());
        System.out.println("addressRepository.save(inst.getContact().getPermanentAddress()) ::"+addressRepository.save(inst.getContact().getPermanentAddress()));
        //contact
        contactRepository.save(inst.getContact());
        System.out.println("contactRepository.save(inst.getContact()) ::"+contactRepository.save(inst.getContact()));
        //institute
        instituteRepository.save(inst);
        System.out.println("instituteRepository.save(inst) ::"+instituteRepository.save(inst));
    }
    
    @Transactional
    public void saveEnquiry(EnquiryCommand cmd){
        Address a = cmd.getEnquiry().getContact().getPermanentAddress();
        addressRepository.save(a);
        
        Contact c = cmd.getEnquiry().getContact();
        contactRepository.save(c);
        
        Enquiry e = cmd.getEnquiry();
        e.setInstitute(instituteRepository.getOne(e.getInstitute().getInstituteId()));
        e.setEnquirySource(enquirySourceRepository.getOne(e.getEnquirySource().getEnquirySourceId()));
        Date d = new Date();
        e.setDoe(d);
        e.setLastUpdate(d);        
        enquiryRepository.save(e);
        
        Long[] courseIds = cmd.getCourses();
        for (Long courseId : courseIds) {
            EnquiryCourse ec = new EnquiryCourse();
            ec.setEnquiry(e);
            ec.setCourse(courseRepository.getOne(courseId));
            enquiryCourseRepository.save(ec);
        }
        
    }   
    @Transactional
    public void saveFollowup(Long enquiryId, String detail){
        Followup fo = new Followup();
        fo.setDetail(detail);
        fo.setEnquiry(enquiryRepository.getOne(enquiryId)); //FK
        fo.setDoe(new Date());
        followupRepository.save(fo);
    }
}
