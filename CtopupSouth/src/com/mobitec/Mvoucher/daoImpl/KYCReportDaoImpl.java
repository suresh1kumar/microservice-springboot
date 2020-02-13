package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IKYCReportDao;
import com.mobitec.Mvoucher.domain.KYCReportBean;
import com.mobitec.Mvoucher.domain.KYCReportBean2;

@Repository
public class KYCReportDaoImpl implements IKYCReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	/*******************************************<<Detailed Dao>>*******************************************/
	@Override
	public List<KYCReportBean> getDetailedReport(String Region, String City, String msisdn, String fdate, String tdate,
			String ReportType) {
		String DetailedQuery="";
		
		DetailedQuery = " SELECT TRANSACTIONID, "
				      + "source_msisdn, "
				      + "SUBSTR (dest_msisdn, -10) dmsisdn,"
				      + "s.denomination denomination, "
				      + "TO_CHAR (TRANS_DATE, 'DD/MM/YYYY') TRANSDATE,"
				      + "FAILURE_REASON,"
				      + "s.subscriber_circle subscriber_circle, "
				      + "BAL_BEFORE,"
				      + "BAL_AFTER,"
				      + "DECODE (status, 2, 'SUCCESS', 'FAILED') status "
				      + "FROM ( (SELECT transactionid, "
				      + "source_msisdn, "
				      + "dest_msisdn, "
				      + "denomination, "
				      + "trans_date, "
				      + "BAL_AFTER, "
				      + "BAL_BEFORE, "
				      + "FAILURE_REASON,"
				      + " EXECUTION_STATUS,"
				      + " DEST_CIRCLE_ID, "
				      + "status, "
				      + "GETCIRCLENAME (dest_circle_id) subscriber_circle "
				      + "FROM mvoucher.tbl_vas_stv_trans_details)) s,"
				      + "mvoucher.dealer_info d,mvclient.tbl_zone z,"
				      + "mvclient.tbl_region r,mvclient.tbl_city c "
				      + "WHERE SUBSTR (s.source_msisdn, -10) = SUBSTR (d.authorised_mobile_number, -10) "
				      + "AND d.zoneid = z.zoneid "
				      + "AND d.regionid = r.regionid "
				      + "AND d.cityid = c.cityid AND ";
        if ((Region != null) && (!Region.equalsIgnoreCase("")) && (!Region.equalsIgnoreCase("All")) && (!Region.equalsIgnoreCase("null"))) {
        	DetailedQuery = DetailedQuery + " R.R_FULLNAME='" + Region + "' AND ";
        }
        if ((!City.equals("ALL")) && (City != null) && (!City.equalsIgnoreCase("")) && (!City.equalsIgnoreCase("All")) && (!City.equalsIgnoreCase("null"))) {
        	DetailedQuery = DetailedQuery + " C.C_FULLNAME='" + City + "' AND ";
        }
       /* if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
          query = String.valueOf(query) + " source_msisdn='" + msisdn + "' AND ";
        }*/
        if ((fdate != null) && (tdate != null)) {
        	DetailedQuery = DetailedQuery + " TRANS_DATE between TO_DATE('" + fdate + "','DD/MM/YYYY') and TO_DATE('" + tdate + "','DD/MM/YYYY')+0.99999 ";
        }
        DetailedQuery = DetailedQuery + " order by TRANS_DATE DESC ";
         System.out.println(" Print DetailedQuery::"+DetailedQuery);
 		return jdbcTemplate.query(DetailedQuery, new KYCDetailedReportRowMapper());
 		 //return jdbcTemplate.query(DetailedQuery, new BeanPropertyRowMapper<KYCReportBean>(KYCReportBean.class));
		
	}
 		private final class KYCDetailedReportRowMapper implements RowMapper<KYCReportBean> {
 		 
 			@Override
 			public KYCReportBean mapRow(ResultSet rs, int args) throws SQLException {
 				System.out.println("*****************************<<Detailed Dao>>*****************************");
 				KYCReportBean KYCReportBean=new KYCReportBean();
 				KYCReportBean.setTRANSACTIONID(rs.getInt("TRANSACTIONID"));
 				KYCReportBean.setSource_msisdn(rs.getString("SOURCE_MSISDN"));
 				KYCReportBean.setDmsisdn(rs.getString("DMSISDN"));
 				KYCReportBean.setDenomination(rs.getInt("DENOMINATION"));
 				
 				KYCReportBean.setFAILURE_REASON(rs.getString("FAILURE_REASON"));
 				KYCReportBean.setSubscriber_circle(rs.getString("SUBSCRIBER_CIRCLE"));
 				KYCReportBean.setBAL_BEFORE(rs.getInt("BAL_BEFORE"));
 				KYCReportBean.setBAL_AFTER(rs.getInt("BAL_AFTER"));
 				//KYCReportBean.setSTATUS(rs.getString("STATUS"));
 				System.out.println("========================10");
 				//KYCReportBean.setTRANSDATE(rs.getDate("TRANSDATE"));
 				System.out.println("========================11");
 				
 				return KYCReportBean;
 			}
	}
 		/*******************************************<<Summary Dao>>*******************************************/
	@Override
	public List<KYCReportBean2> getSummaryReport(String Region, String City, String msisdn, String fdate, String tdate,
			String ReportType) {
		String SummaryQuery="";
		SummaryQuery=" SELECT getcirclename(d.regionid) circle,"
				    + "getcityname(d.cityid) ssa, "
				    + "denomination,count(1) tot_cnt,"
				    + "sum(denomination) tot_amt "
			  		+ "FROM ( (SELECT trans_date,"
			  		+ "transactionid,"
			  		+ "source_msisdn,"
			  		+ "dest_msisdn,"
			  		+ "denomination,"
			  		+ "BAL_AFTER,"
			  		+ "BAL_BEFORE,"
			  		+ "FAILURE_REASON,"
			  		+ "EXECUTION_STATUS,"
			  		+ "DEST_CIRCLE_ID,"
			  		+ "status,"
			  		+ "GETCIRCLENAME (dest_circle_id) subscriber_circle "
			  		+ "FROM mvoucher.tbl_vas_stv_trans_details where status=2)) s, "
			  		+ "mvoucher.dealer_info d,"
			  		+ "mvclient.tbl_zone z,"
			  		+ "mvclient.tbl_region r,"
			  		+ "mvclient.tbl_city c "
			  		+ "WHERE SUBSTR (s.source_msisdn, -10) =SUBSTR (d.authorised_mobile_number, -10) "
			  		+ "AND d.zoneid = z.zoneid "
			  		+ "AND d.regionid = r.regionid "
			  		+ "AND d.cityid = c.cityid AND ";
	        if ((Region != null) && (!Region.equalsIgnoreCase("")) && (!Region.equalsIgnoreCase("All")) && (!Region.equalsIgnoreCase("null"))) {
	        	SummaryQuery = SummaryQuery + " R.R_FULLNAME='" + Region + "' AND ";
	        }
	         if ((!City.equals("ALL")) && (City != null) && (!City.equalsIgnoreCase("")) && (!City.equalsIgnoreCase("All")) && (!City.equalsIgnoreCase("null"))) {
	        	 SummaryQuery = SummaryQuery + " C.C_FULLNAME='" + City + "' AND ";
	        }
	        /* if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
	          query = query + " source_msisdn='" + msisdn + "' AND ";
	        }*/
	        if ((fdate != null) && (tdate != null)) {
	        	SummaryQuery =SummaryQuery + " TRANS_DATE between TO_DATE('" + fdate + "','DD/MM/YYYY') and TO_DATE('" + tdate + "','DD/MM/YYYY')+0.99999";
	        }
	        SummaryQuery = SummaryQuery + " group by getcirclename(d.regionid),getcityname(d.cityid), denomination ";
			System.out.println(" Print SummaryQuery::"+SummaryQuery);
			return jdbcTemplate.query(SummaryQuery, new KYCSummaryReportRowMapper());
			// return jdbcTemplate.query(SummaryQuery, new BeanPropertyRowMapper<KYCReportBean2>(KYCReportBean2.class));
	}
	
     private final class KYCSummaryReportRowMapper implements RowMapper<KYCReportBean2> {
        
		@Override
		public KYCReportBean2 mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<Summary Dao>>*****************************");
			KYCReportBean2 kYCReportBean2=new KYCReportBean2();
			
			kYCReportBean2.setCIRCLE(rs.getString("circle"));
			kYCReportBean2.setSSA(rs.getString("ssa"));
			kYCReportBean2.setDENOMINATION(rs.getInt("denomination"));
			kYCReportBean2.setTOT_CNT(rs.getInt("tot_cnt"));
			kYCReportBean2.setTOT_AMT(rs.getInt("tot_amt"));
			
			 return kYCReportBean2;
		}

	}
}
