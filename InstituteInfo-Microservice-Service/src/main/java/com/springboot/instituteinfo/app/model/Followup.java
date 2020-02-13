package com.springboot.instituteinfo.app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Suresh Kumar Gupta
 */
@Entity
@Table(name = "followup")
public class Followup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "followupId")
    private Long followupId;
    
    @Column(name = "doe")
    @Temporal(TemporalType.TIMESTAMP)
    private Date doe;
    
    @Column(name = "detail")
    private String detail;
   
    @JoinColumn(name = "enquiryId", referencedColumnName = "enquiryId")
    @ManyToOne
    private Enquiry enquiry;

    public Followup(Long followupId, Date doe, String detail) {
        this.followupId = followupId;
        this.doe = doe;
        this.detail = detail;
    }

    
    
    public Followup() {
    }

    public Followup(Long followupId) {
        this.followupId = followupId;
    }

    public Long getFollowupId() {
        return followupId;
    }

    public void setFollowupId(Long followupId) {
        this.followupId = followupId;
    }

    public Date getDoe() {
        return doe;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Enquiry getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Enquiry enquiry) {
        this.enquiry = enquiry;
    }



	@Override
	public String toString() {
		return "Followup [followupId=" + followupId + ", doe=" + doe + ", detail=" + detail + ", enquiry=" + enquiry
				+ "]";
	}

    
    
}
