package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IDealerInfoSearchDao;
import com.mobitec.Mvoucher.domain.DealerInfoSearchBean;

@Repository
public class DealerInfoSearchDaoImpl implements IDealerInfoSearchDao{

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@Override
	public List<DealerInfoSearchBean> getStockAllocationDetails(String Zone, String Circle, String Ssa,
			String DealerCode, String FirstName, String SecondName, String LastName, String ContactNumber,
			String MobileNumber, String Authorised, String Status) {
	
		String query="";

		//query="select rownum inrow,rpad(dealer_code, 60) ,rpad(trim(First_name),30) , rpad(trim(second_name),30),rpad(trim(last_name),30) ,rpad(trim(Contact_number),30),rpad(trim(mobile_number),30),rpad(trim(authorised_mobile_number),30),dealer_status from dealer_info where dealer_id = dealer_id and ref_dealer_id is null ";
	    query = " select rownum inrow,dealer_code ,First_name , second_name,last_name ,Contact_number,mobile_number,authorised_mobile_number,dealer_status from dealer_info where dealer_id = dealer_id and ref_dealer_id is null";
		//LAST_NAME;CONTACT_NUMBER;MOBILE_NUMBER;AUTHORISED_MOBILE_NUMBER;DEALER_STATUS
	    if ((DealerCode != null) && (!DealerCode.equals("")) && (!DealerCode.equalsIgnoreCase("null"))) {
	    	query = query + " AND DEALER_CODE=" + DealerCode;
	     // localStringBuilder.append(" and upper(dealer_code) like '%" + StringWrapper.makeNotNull(DealerCode).toUpperCase() + "%'");
	    }
	    if ((FirstName != null) && (!FirstName.equals("")) && (!FirstName.equalsIgnoreCase("null"))) {
	    	query = query + " AND FIRST_NAME=" + FirstName;
	      //localStringBuilder.append(" and upper(first_name) like '%" + StringWrapper.makeNotNull(FirstName).toUpperCase() + "%'");
	    }
	    if ((SecondName != null) && (!SecondName.equals("")) && (!SecondName.equalsIgnoreCase("null"))) {
	    	query = query + " AND SECOND_NAME=" + SecondName;
	      //localStringBuilder.append(" and upper(second_name) like '%" + StringWrapper.makeNotNull(SecondName).toUpperCase() + "%'");
	    }
	    if ((LastName != null) && (!LastName.equals("")) && (!LastName.equalsIgnoreCase("null"))) {
	    	query = query + " AND LAST_NAME=" + LastName;
	      //localStringBuilder.append(" and upper(last_name) like '%" + StringWrapper.makeNotNull(LastName).toUpperCase() + "%'");
	    }
	    if ((ContactNumber != null) && (!ContactNumber.equals("")) && (!ContactNumber.equalsIgnoreCase("null"))) {
	    	query = query + " AND CONTACT_NUMBER=" + ContactNumber;
	     // localStringBuilder.append(" and upper(contact_number) like '%" + StringWrapper.makeNotNull(ContactNumber).toUpperCase() + "%'");
	    }
	    if ((MobileNumber != null) && (!MobileNumber.equals("")) && (!MobileNumber.equalsIgnoreCase("null"))) {
	    	query = query + " AND MOBILE_NUMBER=" + MobileNumber;
	     // localStringBuilder.append(" and upper(mobile_number) like '%" + StringWrapper.makeNotNull(MobileNumber).toUpperCase() + "%'");
	    }
	    if ((Authorised != null) && (!Authorised.equals("")) && (!Authorised.equalsIgnoreCase("null"))) {
	    	query = query + " AND AUTHORISED_MOBILE_NUMBER=" + Authorised;
	     // localStringBuilder.append(" and upper(authorised_mobile_number) like '%" + StringWrapper.makeNotNull(Authorised).toUpperCase() + "%'");
	    }
	    if ((Status != null) && (!Status.equals("")) && (!Status.equalsIgnoreCase("null"))) {
	    	query = query + " AND DEALER_STATUS='" + Status + "' ";
	      //localStringBuilder.append(" and upper(dealer_Status) ='" + StringWrapper.makeNotNull(Status).toUpperCase() + "'");
	    }
	    if ((Zone != null) && (!Zone.equals("")) && (!Zone.equalsIgnoreCase("null"))) {
	    	query = query + " AND ZONEID=(Select zoneId from mvclient.tbl_zone where z_fullname='" + Zone + "')";
	     // localStringBuilder.append(" and zoneid= (Select zoneId from mvclient.tbl_zone where z_fullname='" + StringWrapper.makeNotNull(Zone) + "')");
	    }
	  query=query + " and length(authorised_mobile_number)<=12 ";
	    
	    if ((Circle != null) && (!Circle.equals("")) && (!Circle.equalsIgnoreCase("null"))) {
	    	query = query + " AND REGIONID=(Select regionId from mvclient.tbl_region where r_fullname='" + Circle + "')";
	     // localStringBuilder.append(" and regionid= (Select regionId from mvclient.tbl_region where r_fullname='" + StringWrapper.makeNotNull(Circle) + "')");
	    }
	    if ((Ssa != null) && (!Ssa.equals("")) && (!Ssa.equalsIgnoreCase("null"))) {
	    	query = query + " AND CITYID=(Select cityId from mvclient.tbl_city where c_fullname='" + Ssa + "')";
	      //localStringBuilder.append(" and cityid= (Select cityId from mvclient.tbl_city where c_fullname='" + StringWrapper.makeNotNull(Ssa) + "')");
	    }
	   /* if (paramInt == 1) {
	      localStringBuilder.append(" order by dealer_id) inr where inr.inrow between " + paramInt + " and 50 ");
	    } else if (paramInt > 1) {
	      paramInt *= 50;
	      localStringBuilder.append(" order by dealer_id) inr where inr.inrow between " + (paramInt - 49) + " and " + paramInt);
	    } else {
	      localStringBuilder.append(")");
	    }*/
	    System.out.println(">>> DealerInfoSearch : generateQueryForStockAllocation() >> query = " + query);
		
		
		
	    return jdbcTemplate.query(query, new DealerInfoSearchRowMapper());
	}

	private final class DealerInfoSearchRowMapper implements RowMapper<DealerInfoSearchBean> {
		@Override
		public DealerInfoSearchBean mapRow(ResultSet rs, int args) throws SQLException {
			//System.out.println("*****************************<<DealerInfoSearch Dao>>*****************************");
			DealerInfoSearchBean dealerInfoSearchBean = new DealerInfoSearchBean();
			
			 dealerInfoSearchBean.setDEALER_CODE(rs.getString("DEALER_CODE"));
			 dealerInfoSearchBean.setFIRST_NAME(rs.getString("FIRST_NAME"));
			 dealerInfoSearchBean.setSECOND_NAME(rs.getString("SECOND_NAME"));
			 dealerInfoSearchBean.setLAST_NAME(rs.getString("LAST_NAME"));
			 dealerInfoSearchBean.setCONTACT_NUMBER(rs.getString("CONTACT_NUMBER"));
			 dealerInfoSearchBean.setMOBILE_NUMBER(rs.getString("MOBILE_NUMBER"));
			 dealerInfoSearchBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("AUTHORISED_MOBILE_NUMBER"));
			 dealerInfoSearchBean.setDEALER_STATUS(rs.getString("DEALER_STATUS"));
			
			
			//System.out.println("dao DealerInfoSearch ::"+dealerInfoSearchBean.toString());
			return dealerInfoSearchBean;
		}

	}

}
