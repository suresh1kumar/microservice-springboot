package com.springboot.institute.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Entity
@Table(name = "enquirysource")
public class EnquirySource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enquirySourceId")
    private Long enquirySourceId;
    @Column(name = "name")
    private String name;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private List<Enquiry> enquiryList;
 
    public EnquirySource() {
    }

    public EnquirySource(Long enquirySourceId, String name) {
        this.enquirySourceId = enquirySourceId;
        this.name = name;
    }

    
    public EnquirySource(String name) {
        this.name = name;
    }
    

    public EnquirySource(Long enquirySourceId) {
        this.enquirySourceId = enquirySourceId;
    }

    public Long getEnquirySourceId() {
        return enquirySourceId;
    }

    public void setEnquirySourceId(Long enquirySourceId) {
        this.enquirySourceId = enquirySourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enquiry> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<Enquiry> enquiryList) {
        this.enquiryList = enquiryList;
    }

	@Override
	public String toString() {
		return "EnquirySource [enquirySourceId=" + enquirySourceId + ", name=" + name + ", enquiryList=" + enquiryList
				+ "]";
	}
    
    
    
}
