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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "courseId")
    private Long courseId;
    @Column(name = "name")
    private String name;
    
    @Column(name = "fees")
    private Double fees;

    @JoinColumn(name = "instituteId", referencedColumnName = "instituteId")
    @ManyToOne
    private Institute institute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private List<EnquiryCourse> enquiryCourseList;

    public Course(String name, Double fees, Institute institute) {
        this.name = name;
        this.fees = fees;
        this.institute = institute;
    }

    public Course() {
    }

    public Course(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public List<EnquiryCourse> getEnquiryCourseList() {
        return enquiryCourseList;
    }

    public void setEnquiryCourseList(List<EnquiryCourse> enquiryCourseList) {
        this.enquiryCourseList = enquiryCourseList;
    }

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", fees=" + fees + ", institute=" + institute
				+ ", enquiryCourseList=" + enquiryCourseList + "]";
	}
    
    

}
