package com.springboot.instituteinfo.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Entity
@Table(name = "institute")
public class Institute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "instituteId")
    private Long instituteId;
    @Column(name = "name")
    private String name;
    @Column(name = "doe")
    @Temporal(TemporalType.TIMESTAMP)
    private Date doe;

    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    @ManyToOne
    private Contact contact;

  
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient    
    private List<Enquiry> enquiryList;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient         
    private List<Course> courseList;
 

    public Institute() {
    }

    public Institute(Long instituteId, String name) {
        this.instituteId = instituteId;
        this.name = name;
    }

    public Institute(String name, Date doe, Contact contact) {
        this.name = name;
        this.doe = doe;
        this.contact = contact;
    }

    public Institute(Long instituteId) {
        this.instituteId = instituteId;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoe() {
        return doe;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Enquiry> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<Enquiry> enquiryList) {
        this.enquiryList = enquiryList;
    }

	public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", name=" + name + ", doe=" + doe + ", contact=" + contact
				+ ", enquiryList=" + enquiryList + ", courseList=" + courseList + "]";
	}
    
    
    

}
