package com.springboot.instituteinfo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.instituteinfo.app.dao.AddressRepository;
import com.springboot.instituteinfo.app.dao.ContactRepository;
import com.springboot.instituteinfo.app.dao.InstituteRepository;
import com.springboot.instituteinfo.app.model.Institute;

@Service
public class InstituteServiceImpl {

	@Autowired
    AddressRepository addressRepository;
	
    @Autowired
    ContactRepository contactRepository;
    
    @Autowired
    InstituteRepository instituteRepository;
	

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
}
