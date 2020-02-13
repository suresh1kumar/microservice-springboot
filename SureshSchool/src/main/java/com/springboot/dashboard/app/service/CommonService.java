package com.springboot.dashboard.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dashboard.app.dao.AddressRepository;
import com.springboot.dashboard.app.dao.ContactRepository;
import com.springboot.dashboard.app.dao.InstituteRepository;
import com.springboot.dashboard.app.model.Institute;


/**
 *
 * @author Suresh Kumar Gupta
 */
@Service
public class CommonService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    InstituteRepository instituteRepository;
    /*@Autowired
    EnquirySourceRepository enquirySourceRepository;
    @Autowired
    EnquiryRepository enquiryRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    EnquiryCourseRepository enquiryCourseRepository;
    @Autowired
    FollowupRepository followupRepository;*/

    @Transactional
    public Institute saveInstitute(Institute inst) {
        //address
        addressRepository.save(inst.getContact().getPermanentAddress());
        System.out.println("addressRepository.save(inst.getContact().getPermanentAddress()) ::"+addressRepository.save(inst.getContact().getPermanentAddress()));
        //contact
        contactRepository.save(inst.getContact());
        System.out.println("contactRepository.save(inst.getContact()) ::"+contactRepository.save(inst.getContact()));
        //institute
        instituteRepository.save(inst);
        System.out.println("instituteRepository.save(inst) ::"+instituteRepository.save(inst));
    return inst;
    }

   /* @Transactional
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
    }*/
    
}
