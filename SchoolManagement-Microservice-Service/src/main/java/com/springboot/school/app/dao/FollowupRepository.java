package com.springboot.school.app.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.school.app.model.Followup;

/**
 *
 * @author Suresh Kumar Gupta
 */
public interface FollowupRepository extends JpaRepository<Followup, Long> {

    @Query("SELECT new Followup(f.followupId, f.doe, f.detail) FROM Followup as f WHERE f.enquiry.enquiryId=?1 ORDER BY f.doe desc")
    List<Followup> getFollowupsByEnquiryId(Long enquiryId);
}
