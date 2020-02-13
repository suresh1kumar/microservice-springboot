package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IVasRetailerReportDao;
import com.mobitec.Mvoucher.domain.VasRetailerContentReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportBean;
import com.mobitec.Mvoucher.domain.VasRetailerReportDetailssailsBean;

@Repository
public class VasRetailerReportDaoImpl implements IVasRetailerReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<VasRetailerReportBean> getAllVasRetailerReportSalesSumary(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		String query=null;
		query = " select z.Z_FULLNAME ZONENAME,r.R_FULLNAME CIRCLENAME,c.C_FULLNAME SSANAME,S.DENOMINATION,STV_VALUE,CP_SHARE," +
	      		"COUNT(1) as NOOFTransactions,COUNT(1)*STV_VALUE AS TOTAL_STV_VALUE,COUNT(1)*CP_SHARE AS TOTAL_CPSHARE,CP_NAME," +
	      		"decode(status,2,'Success','Failed') as status FROM((select trans_date,source_msisdn,dest_msisdn,denomination,status from mvoucher.tbl_vas_stv_trans_details_stv) union (select trans_date,source_msisdn,dest_msisdn,denomination,status from mvoucher.tbl_vas_stv_trans_details)) S,mvoucher.cp_details cp,mvoucher.dealer_info d,mvclient.tbl_zone z,mvclient.tbl_region r,mvclient.tbl_city c where substr(s.source_msisdn,-10)=substr(d.authorised_mobile_number,-10) and s.denomination=cp.denomination and d.zoneid=z.zoneid and d.regionid=r.regionid and d.cityid=c.cityid ";
	      
	      if ((strFromDate != null) && (!strFromDate.equals("")) && (!strFromDate.equalsIgnoreCase("null")) && (strToDate != null) && (!strToDate.equals("")) && (!strToDate.equalsIgnoreCase("null")))
	      {
	        query = query + " and trunc(trans_date)  BETWEEN to_date('" + strFromDate + "','dd-mm-yyyy')  and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 ";
	      }
	      
	      if ((strregNam != null) && (!strregNam.equalsIgnoreCase("")) && (!strregNam.equalsIgnoreCase("ALL")))
	      {
	        query = query + " and upper(r.R_FULLNAME)=upper('" + strregNam + "') ";
	      }
	      
	      if ((strcityNam != null) && (!strcityNam.equalsIgnoreCase("")) && (!strcityNam.equalsIgnoreCase("ALL")))
	      {
	        query = query + " AND upper(c.C_FULLNAME)=upper('" + strcityNam + "') ";
	      }
	      
	      query = query + " group by z.Z_FULLNAME,r.R_FULLNAME,c.C_FULLNAME,S.DENOMINATION,STV_VALUE,CP_SHARE,CP_NAME,decode(status,2,'Success','Failed') order by z.Z_FULLNAME,r.R_FULLNAME,c.C_FULLNAME,S.DENOMINATION ";
	      
	      System.out.println(query);
	      return jdbcTemplate.query(query, new VasRetailerReportSalesSumaryRowMapper());
	}
	private final class VasRetailerReportSalesSumaryRowMapper implements RowMapper<VasRetailerReportBean> {
		@Override
		public VasRetailerReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<Vas Retailer Report Sales Sumary Dao 1 >>*****************************");
			VasRetailerReportBean vasRetailerReportBean = new VasRetailerReportBean();
			
			
			vasRetailerReportBean.setZONENAME(rs.getString("ZONENAME"));
			System.out.println("========================1");
			vasRetailerReportBean.setCIRCLENAME(rs.getString("CIRCLENAME"));
			System.out.println("========================2");
			vasRetailerReportBean.setSSANAME(rs.getString("SSANAME"));
			System.out.println("========================3");
			vasRetailerReportBean.setDENOMINATION(rs.getInt("DENOMINATION"));
			System.out.println("========================4");
			vasRetailerReportBean.setSTV_VALUE(rs.getInt("STV_VALUE"));
			System.out.println("========================5");
			vasRetailerReportBean.setCP_SHARE(rs.getInt("CP_SHARE"));
			System.out.println("========================6");
			vasRetailerReportBean.setNOOFTransactions(rs.getInt("NOOFTransactions"));
			System.out.println("========================7");
			vasRetailerReportBean.setTOTAL_STV_VALUE(rs.getInt("TOTAL_STV_VALUE"));
			System.out.println("========================8");
			vasRetailerReportBean.setTOTAL_CPSHARE(rs.getInt("TOTAL_CPSHARE"));
			System.out.println("========================9");
			vasRetailerReportBean.setCP_NAME(rs.getString("CP_NAME"));
			System.out.println("========================10");
			//vasRetailerReportBean.setSTATUS(rs.getInt("status"));
			System.out.println("========================11");
			

			System.out.println("dao VasRetailerReport ::"+vasRetailerReportBean.toString());
			return vasRetailerReportBean;
		}

	}

	@Override
	public List<VasRetailerReportBean> getAllVasRetailerReportDealerWiseSalesSumary(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {

		String query=null;
		query = " select z.Z_FULLNAME ZONENAME,r.R_FULLNAME CIRCLENAMe,c.C_FULLNAME SSANAME,DEALER_ID,FIRST_NAME,S.denomination,STV_VALUE,CP_SHARE,count(1) as NOOFTransactions,count(1)*STV_VALUE TOTAL_STV_VALUE,COUNT(1)*CP_SHARE TOTAL_CPSHARE,CP_NAME,decode(status,2,'SUCCESS','FAILED') status from ((select trans_date,source_msisdn,dest_msisdn,denomination,status from mvoucher.tbl_vas_stv_trans_details_stv) union (select trans_date,source_msisdn,dest_msisdn,denomination,status from mvoucher.tbl_vas_stv_trans_details )) s,mvoucher.dealer_info d,mvoucher.cp_details cp,mvclient.tbl_zone z,mvclient.tbl_region r,mvclient.tbl_city c where substr(s.source_msisdn,-10)=substr(d.authorised_mobile_number,-10) and s.denomination=cp.denomination and d.zoneid=z.zoneid and d.regionid=r.regionid and d.cityid=c.cityid ";
	      
	      if ((strFromDate != null) && (!strFromDate.equals("")) && (!strFromDate.equalsIgnoreCase("null")) && (strToDate != null) && (!strToDate.equals("")) && (!strToDate.equalsIgnoreCase("null")))
	      {
	        query = query + "   and trunc(trans_date)  BETWEEN to_date('" + strFromDate + "','dd-mm-yyyy')  and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 ";
	      }
	      
	      if ((strregNam != null) && (!strregNam.equalsIgnoreCase("")) && (!strregNam.equalsIgnoreCase("ALL")))
	      {
	        query = query + " and upper(r.R_FULLNAME)=upper('" + strregNam + "') ";
	      }
	      
	      if ((strcityNam != null) && (!strcityNam.equalsIgnoreCase("")) && (!strcityNam.equalsIgnoreCase("ALL")))
	      {
	        query = query + " AND upper(c.C_FULLNAME)=upper('" + strcityNam + "') ";
	      }
	      
	      query = query + " GROUP BY z.Z_FULLNAME,r.R_FULLNAME,c.C_FULLNAME,DEALER_ID,FIRST_NAME,S.denomination,STV_VALUE,CP_SHARE,CP_NAME,decode(status,2,'SUCCESS','FAILED') ORDER BY z.Z_FULLNAME,r.R_FULLNAME,c.C_FULLNAME,S.DENOMINATION ";
	      System.out.println(query);
	      return jdbcTemplate.query(query, new VasRetailerReportDealerWiseSalesSumaryRowMapper());
	     	}
	     	private final class VasRetailerReportDealerWiseSalesSumaryRowMapper implements RowMapper<VasRetailerReportBean> {
	     		@Override
	     		public VasRetailerReportBean mapRow(ResultSet rs, int args) throws SQLException {
	     			System.out.println("*****************************<<Vas Retailer Report Dealer Wise SalesSumary Dao 2 >>*****************************");
	     			VasRetailerReportBean vasRetailerReportBean = new VasRetailerReportBean();
	     			
	     			vasRetailerReportBean.setZONENAME(rs.getString("ZONENAME"));
	    			System.out.println("========================1");
	    			vasRetailerReportBean.setCIRCLENAME(rs.getString("CIRCLENAME"));
	    			System.out.println("========================2");
	    			vasRetailerReportBean.setSSANAME(rs.getString("SSANAME"));
	    			System.out.println("========================3");
	    			vasRetailerReportBean.setDENOMINATION(rs.getInt("DENOMINATION"));
	    			System.out.println("========================4");
	    			vasRetailerReportBean.setSTV_VALUE(rs.getInt("STV_VALUE"));
	    			System.out.println("========================5");
	    			vasRetailerReportBean.setCP_SHARE(rs.getInt("CP_SHARE"));
	    			System.out.println("========================6");
	    			vasRetailerReportBean.setNOOFTransactions(rs.getInt("NOOFTransactions"));
	    			System.out.println("========================7");
	    			vasRetailerReportBean.setTOTAL_STV_VALUE(rs.getInt("TOTAL_STV_VALUE"));
	    			System.out.println("========================8");
	    			vasRetailerReportBean.setTOTAL_CPSHARE(rs.getInt("TOTAL_CPSHARE"));
	    			System.out.println("========================9");
	    			vasRetailerReportBean.setCP_NAME(rs.getString("CP_NAME"));
	    			System.out.println("========================10");
	    			//vasRetailerReportBean.setSTATUS(rs.getInt("status"));
	    			System.out.println("========================11");
	    			vasRetailerReportBean.setDEALER_ID(rs.getInt("DEALER_ID"));
	    			System.out.println("========================12");
	    			vasRetailerReportBean.setFIRST_NAME(rs.getString("FIRST_NAME"));
	    			System.out.println("========================13");

	     			System.out.println("dao VasRetailerReport ::"+vasRetailerReportBean.toString());
	     			return vasRetailerReportBean;
	     		}

	     	}

	@Override
	public List<VasRetailerReportDetailssailsBean> getAllVasRetailerReportDetailedSales(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		String query=null;//TRUNC (trans_date) trans_dates
		query = " SELECT z.z_fullname zonename, r.r_fullname circlename, c.c_fullname ssaname,"
				+ " TRUNC (trans_date) trans_dates, transactionid, source_msisdn,"
				+ " SUBSTR (dest_msisdn, -10) dmsisdn, s.subscriber_circle, s.denomination, "
				+ "stv_value, cp_share, cp_name, DECODE (status, 2, 'SUCCESS', 'FAILED') status "
				+ "FROM ((SELECT trans_date, transactionid, source_msisdn, dest_msisdn, denomination, status,GETCIRCLENAME(dest_circle_id) subscriber_circle FROM mvoucher.tbl_vas_stv_trans_details_stv) UNION (SELECT trans_date, transactionid, source_msisdn, dest_msisdn, denomination, status,GETCIRCLENAME(dest_circle_id) subscriber_circle FROM mvoucher.tbl_vas_stv_trans_details)) s, mvoucher.cp_details cp, mvoucher.dealer_info d, mvclient.tbl_zone z, mvclient.tbl_region r, mvclient.tbl_city c WHERE SUBSTR (s.source_msisdn, -10) = SUBSTR (d.authorised_mobile_number, -10) AND s.denomination = cp.denomination AND d.zoneid = z.zoneid AND d.regionid = r.regionid AND d.cityid = c.cityid ";
	      
	      if ((strFromDate != null) && (!strFromDate.equals("")) && (!strFromDate.equalsIgnoreCase("null")) && (strToDate != null) && (!strToDate.equals("")) && (!strToDate.equalsIgnoreCase("null")))
	      {
	        query = query + " and trunc(trans_date)  BETWEEN to_date('" + strFromDate + "','dd-mm-yyyy')  and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 ";
	      }
	      query = query + " order by trans_date asc ";
	      System.out.println("query3::"+query);
	      return jdbcTemplate.query(query, new VasRetailerReportDetailedSalesRowMapper());
	     	}
	     	private final class VasRetailerReportDetailedSalesRowMapper implements RowMapper<VasRetailerReportDetailssailsBean> {
	     		@Override
	     		public VasRetailerReportDetailssailsBean mapRow(ResultSet rs, int args) throws SQLException {
	     			System.out.println("*****************************<<Vas Retailer ReportDetailedSales Dao 3 >>*****************************");
	     			VasRetailerReportDetailssailsBean vasRetailerReportDetailssailsBean = new VasRetailerReportDetailssailsBean();
	     			
	     			/*System.out.println("========================1");
	    			vasRetailerReportBean.setCIRCLENAME(rs.getString(7));
	    			System.out.println("========================2");
	    			vasRetailerReportBean.setSSANAME(rs.getString(8));
	    			System.out.println("========================3");
	    			//vasRetailerReportBean.setTRANSDATE(rs.getDate(17));
	    			System.out.println("========================4");
	    			vasRetailerReportBean.setTRANSACTIONID(rs.getString(18));
	    			System.out.println("========================5");
	    			vasRetailerReportBean.setSOURCE_MSISDN(rs.getString(1));
	    			System.out.println("========================6");
	    			vasRetailerReportBean.setDMSISDN(rs.getString(2));
	    			System.out.println("========================7");
	    			//vasRetailerReportBean.setSUBSCRIBER_CIRCLE(rs.getInt(3));
	    			System.out.println("========================8");
	    			vasRetailerReportBean.setDENOMINATION(rs.getInt(9));
	    			System.out.println("========================9");
	    			vasRetailerReportBean.setTOTAL_STV_VALUE(rs.getInt(10));
	    			System.out.println("========================10");
	    			//vasRetailerReportBean.setTOTAL_CPSHARE(rs.getInt(11));
	    			System.out.println("========================11");
	    			vasRetailerReportBean.setCP_NAME(rs.getString(15));
	    			System.out.println("========================12");
	    			//vasRetailerReportBean.setSTATUS(rs.getInt(16));
	    			System.out.println("========================13");*/
	     			/*private String ZONENAME;
	     			private String CIRCLENAME;
	     			private String SSANAME;
	     		    private Date TRANSDATE;
	     		    private String TRANSACTIONID;
	     		    private String SOURCE_MSISDN;
	     		    private String DMSISDN;
	     		    private int SUBSCRIBER_CIRCLE;
	     			private int DENOMINATION;
	     			private int STV_VALUE;
	     			private int CP_SHARE;
	     		    private String CP_NAME;
	     		    private int STATUS;*/
	     			
	     		   vasRetailerReportDetailssailsBean.setZONENAME(rs.getString("ZONENAME"));
	    			System.out.println("========================1");
	    			vasRetailerReportDetailssailsBean.setCIRCLENAME(rs.getString("CIRCLENAME"));
	    			System.out.println("========================2");
	    			vasRetailerReportDetailssailsBean.setSSANAME(rs.getString("SSANAME"));
	    			System.out.println("========================3");
	    			vasRetailerReportDetailssailsBean.setTRANSDATE(rs.getDate("trans_dates"));
	    			System.out.println("========================4");
	    			vasRetailerReportDetailssailsBean.setTRANSACTIONID(rs.getString("transactionid"));
	    			System.out.println("========================5");
	    			vasRetailerReportDetailssailsBean.setSOURCE_MSISDN(rs.getString("source_msisdn"));
	    			System.out.println("========================6");
	    			vasRetailerReportDetailssailsBean.setDMSISDN(rs.getString("dmsisdn"));
	    			System.out.println("========================7");
	    			//vasRetailerReportBean.setSUBSCRIBER_CIRCLE(rs.getInt("subscriber_circle"));
	    			System.out.println("========================8");
	    			vasRetailerReportDetailssailsBean.setDENOMINATION(rs.getInt("denomination"));
	    			System.out.println("========================9");
	    			vasRetailerReportDetailssailsBean.setSTV_VALUE(rs.getInt("stv_value"));
	    			System.out.println("========================10");
	    			//vasRetailerReportBean.setTOTAL_CPSHARE(rs.getInt("cp_share"));
	    			System.out.println("========================11");
	    			vasRetailerReportDetailssailsBean.setCP_NAME(rs.getString("cp_name"));
	    			System.out.println("========================12");
	    			//vasRetailerReportDetailssailsBean.setSTATUS(rs.getInt("status"));
	    			System.out.println("========================13");

	    			
	     			System.out.println("dao VasRetailerReport ::"+vasRetailerReportDetailssailsBean.toString());
	     			return vasRetailerReportDetailssailsBean;
	     		}

	     	}
	@Override
	public List<VasRetailerContentReportBean> getAllVasRetailerReportContent(String strregNam, String strcityNam,
			String searchOn,String strFromDate, String strToDate) {
		String query=null;
		query = " select z.Z_FULLNAME ZONENAME,r.R_FULLNAME CIRCLENAMe,c.C_FULLNAME SSANAME,s.USER_ID,INITIATION_TIMESTAMP,TRANSACTION_ID," +
        		"REQUESTER_MOBILE_NUMBER,BENIFICIARY_MOBILE_NUMBER,AMOUNT,CONTENT_ID,COMPANY_NAME,COMM_AMOUNT,FULL_AMOUNT FROM " +
        		"tpusers.ctp_tbl_transaction_details s,mvoucher.dealer_info d,mvclient.tbl_zone z,mvclient.tbl_region r,mvclient.tbl_city c " +
        		"where substr(s.REQUESTER_MOBILE_NUMBER,-10)=substr(d.authorised_mobile_number,-10) and trunc(INITIATION_TIMESTAMP) ";
        
        if ((strFromDate != null) && (!strFromDate.equals("")) && (!strFromDate.equalsIgnoreCase("null")) && (strToDate != null) && (!strToDate.equals("")) && (!strToDate.equalsIgnoreCase("null")))
        {
          query = query + " between to_date('" + strFromDate + "','dd-mm-yyyy')  and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 and d.zoneid=z.zoneid and d.regionid=r.regionid and d.cityid=c.cityid ";
        }
        
        if ((strregNam != null) && (!strregNam.equalsIgnoreCase("")) && (!strregNam.equalsIgnoreCase("ALL")))
        {
          query = query + " and upper(r.R_FULLNAME)=upper('" + strregNam + "') ";
        }
        
        if ((strcityNam != null) && (!strcityNam.equalsIgnoreCase("")) && (!strcityNam.equalsIgnoreCase("ALL")))
        {
          query = query + " AND upper(c.C_FULLNAME)=upper('" + strcityNam + "') ";
        }
        
        query = query + "order by INITIATION_TIMESTAMP desc";
        
        System.out.println(query);
        return jdbcTemplate.query(query, new VasRetailerReportContentRowMapper());
       	}
       	private final class VasRetailerReportContentRowMapper implements RowMapper<VasRetailerContentReportBean> {
       		@Override
       		public VasRetailerContentReportBean mapRow(ResultSet rs, int args) throws SQLException {
       			System.out.println("*****************************<<Retailer Report Content Dao 4 >>*****************************");
       			VasRetailerContentReportBean vasRetailerContentReportBean = new VasRetailerContentReportBean();
       			
       			vasRetailerContentReportBean.setINITIATION_TIMESTAMP(rs.getDate("INITIATION_TIMESTAMP"));
       			vasRetailerContentReportBean.setZONENAME(rs.getString("ZONENAME"));
       			vasRetailerContentReportBean.setCIRCLENAME(rs.getString("CIRCLENAMe"));
       			vasRetailerContentReportBean.setSSANAME(rs.getString("SSANAME"));
       			vasRetailerContentReportBean.setUSER_ID(rs.getString("USER_ID"));
       			vasRetailerContentReportBean.setTRANSACTION_ID(rs.getInt("TRANSACTION_ID"));
       			vasRetailerContentReportBean.setREQUESTER_MOBILE_NUMBER(rs.getString("REQUESTER_MOBILE_NUMBER"));
       			vasRetailerContentReportBean.setBENIFICIARY_MOBILE_NUMBER(rs.getString("BENIFICIARY_MOBILE_NUMBER"));
       			vasRetailerContentReportBean.setAMOUNT(rs.getDouble("AMOUNT"));
       			vasRetailerContentReportBean.setCOMPANY_NAME(rs.getString("COMPANY_NAME"));
       			vasRetailerContentReportBean.setCONTENT_ID(rs.getString("CONTENT_ID"));
       			
       			System.out.println("dao VasRetailerReport ::"+vasRetailerContentReportBean.toString());
       			return vasRetailerContentReportBean;
       		}

       	}

}
