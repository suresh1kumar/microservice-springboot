package com.springboot.school.app.repo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface EnquiryDto {

    Long getEnquiryId();

    String getPhone();

    String getName();

    String getCourses(); //comma separated

    Integer getFollowUpCount();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    Date getDoe();

    Float getFees();
}
