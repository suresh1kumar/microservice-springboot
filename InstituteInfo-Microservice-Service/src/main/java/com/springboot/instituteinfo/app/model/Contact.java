package com.springboot.instituteinfo.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contactId")
    private Long contactId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @JoinColumn(name = "localAddress", referencedColumnName = "addressId")
    @ManyToOne
    private Address localAddress;
    
    @JoinColumn(name = "permanentAddress", referencedColumnName = "addressId")
    @ManyToOne
    private Address permanentAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private List<Enquiry> enquiryList;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    
    private List<Institute> instituteList;

    public Contact() {
    }

    public Contact(Long contactId) {
        this.contactId = contactId;
    }

    public Contact(String name, String email, String phone, Address localAddress, Address permanentAddress) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.localAddress = localAddress;
        this.permanentAddress = permanentAddress;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(Address localAddress) {
        this.localAddress = localAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public List<Enquiry> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<Enquiry> enquiryList) {
        this.enquiryList = enquiryList;
    }

    public List<Institute> getInstituteList() {
        return instituteList;
    }

    public void setInstituteList(List<Institute> instituteList) {
        this.instituteList = instituteList;
    }

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", localAddress=" + localAddress + ", permanentAddress=" + permanentAddress + ", enquiryList="
				+ enquiryList + ", instituteList=" + instituteList + "]";
	}
   

}
