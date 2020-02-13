package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IFRCReportDao;
import com.mobitec.Mvoucher.domain.FRCReportBean;
import com.mobitec.Mvoucher.domain.FRCReportConsolidateBean;

@Repository
public class FRCReportDaoImpl implements IFRCReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<FRCReportBean> getAllFRCReportDetailed(String strRegion, String strCity, String strSearchOn,
			String strFromDate, String strToDate) {
	String query=null;
	
    query = " SELECT R_FULLNAME AS CIRCLE_NAME,C_FULLNAME AS FRANCHISEE_SSA,"
    		+ "TRIM(FIRST_NAME) || ' ' || TRIM(SECOND_NAME) || ' ' || TRIM(LAST_NAME) AS Franchisee_name,"
    		+ "FRANCHISE_NUMBER AS Franchisee_NUMBER,DEALER_CODE AS Franchisee_ID,"
    		+ "DEALERTYPE AS FRANCHISEE_CATEGORY,DENOMINATION AS FRC_DENOMINATION,SELLER_COMM,"
    		+ "SUBFRANCHISE_COMM AS sub_comm,FRANCHISE_COMM AS FRA_COMM,TDS_AMOUNT tds_value,"
    		+ "DECODE(COMMISSION_TYPE,'F','FRC','S','STV') AS COMMISSION_TYPE FROM MVOUCHER.FRC_COMM_REPORT A,"
    		+ "MVOUCHER.dealer_info b,mvclient.tbl_zone z,mvclient.tbl_region r,mvclient.tbl_city c";
        
        if ((strFromDate != null) && (strToDate != null)) {
          query = query + " WHERE TRUNC(TRANS_DATE) BETWEEN to_date('" + strFromDate + " ','dd-mm-yyyy ') and to_date('" + strToDate + " ','dd-mm-yyyy ')+0.99999 AND a.FRANCHISE_ID=b.dealer_id and b.zoneid=z.zoneid and b.regionid=r.regionid and b.cityid=c.cityid ";
        }
        if ((strRegion != null) && (!strRegion.equalsIgnoreCase("")) && (!strRegion.equalsIgnoreCase("All")) && (!strRegion.equalsIgnoreCase("null")))
        {
          query = query + " and upper(R_FULLNAME)=upper('" + strRegion + "') ";
        }
        if ((strCity != null) && (!strCity.equalsIgnoreCase("")) && (!strCity.equalsIgnoreCase("All")) && (!strCity.equalsIgnoreCase("null")))
        {
          query = query + " and upper(c.C_FULLNAME )=upper('" + strCity + "') ";
        }
        
        query = query + " ORDER BY R_FULLNAME,C_FULLNAME,DEALERTYPE ";
        
        System.out.println("Detailed FRC Report Query: " + query);
        return jdbcTemplate.query(query, new FRCReportDetailedRowMapper());
	}
	private final class FRCReportDetailedRowMapper implements RowMapper<FRCReportBean> {
		@Override
		public FRCReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<FRC Detailed Dao Dao>>*****************************");
			FRCReportBean fRCReportBean = new FRCReportBean();
			
			fRCReportBean.setCIRCLE_NAME(rs.getString("CIRCLE_NAME"));
			fRCReportBean.setFRANCHISEE_SSA(rs.getString("FRANCHISEE_SSA"));
			fRCReportBean.setFranchisee_name(rs.getString("Franchisee_name"));
			fRCReportBean.setFranchisee_NUMBER(rs.getString("Franchisee_NUMBER"));
			fRCReportBean.setFranchisee_ID(rs.getString("Franchisee_ID"));
			fRCReportBean.setFRANCHISEE_CATEGORY(rs.getString("FRANCHISEE_CATEGORY"));
			fRCReportBean.setFRC_DENOMINATION(rs.getInt("FRC_DENOMINATION"));
			fRCReportBean.setSELLER_COMM(rs.getDouble("SELLER_COMM"));
			fRCReportBean.setSub_comm(rs.getString("sub_comm"));
			fRCReportBean.setFRA_COMM(rs.getInt("FRA_COMM"));
			fRCReportBean.setTds_value(rs.getInt("tds_value"));
			fRCReportBean.setCOMMISSION_TYPE(rs.getString("COMMISSION_TYPE"));
			
			
			System.out.println("dao channelwisedata ::"+fRCReportBean.toString());
			return fRCReportBean;
		}

	}

	@Override
	public List<FRCReportConsolidateBean> getAllFRCReportConsolidate(String strRegion, String strCity, String strSearchOn,
			String strFromDate, String strToDate) {
		

		String query=null;
        query = " SELECT R_FULLNAME AS CIRCLE_NAME,C_FULLNAME AS FRANCHISEE_SSA,"
        		+ "TRIM(FIRST_NAME) || ' ' || TRIM(SECOND_NAME) || ' ' || TRIM(LAST_NAME) AS Franchisee_name,"
        		+ "FRANCHISE_NUMBER AS Franchisee_NUMBER,DEALER_CODE AS Franchisee_ID,"
        		+ "DEALERTYPE AS FRANCHISEE_CATEGORY,DENOMINATION AS FRC_DENOMINATION,COUNT(1) AS trans_count,"
        		+ "SUM(SELLER_COMM) AS SELLER_COMM,SUM(SUBFRANCHISE_COMM) AS sub_fra_comm,"
        		+ "SUM(FRANCHISE_COMM) AS FRA_COMM,TDS_AMOUNT tds_value,COUNT (1) * tds_amount AS tot_tds,"
        		+ "DECODE(COMMISSION_TYPE,'F','FRC','S','STV') AS COMMISSION_TYPE FROM MVOUCHER.FRC_COMM_REPORT A,"
        		+ "MVOUCHER.dealer_info b,mvclient.tbl_zone z,mvclient.tbl_region r,mvclient.tbl_city c";
        
        if ((strFromDate != null) && (!"".equals(strFromDate)) && (strToDate != null) && (!"".equals(strToDate))) {
          query = query + " WHERE TRUNC(TRANS_DATE) BETWEEN to_date('" + strFromDate + "','dd-mm-yyyy') AND to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 ";
        }
        query = query + " AND a.FRANCHISE_ID=b.dealer_id and b.zoneid=z.zoneid and b.regionid=r.regionid and b.cityid=c.cityid ";
        
        if ((strRegion != null) && (!strRegion.equalsIgnoreCase("")) && (!strRegion.equalsIgnoreCase("All")) && (!strRegion.equalsIgnoreCase("null")))
        {
          query = query + " and upper(R_FULLNAME)=upper('" + strRegion + "') ";
        }
        
        if ((strCity != null) && (!strCity.equalsIgnoreCase("")) && (!strCity.equalsIgnoreCase("All")) && (!strCity.equalsIgnoreCase("null")))
        {
          query = query + " and upper(C_FULLNAME)=upper('" + strCity + "') ";
        }
        
        query = query + " GROUP BY R_FULLNAME,C_FULLNAME,TRIM(FIRST_NAME) || ' ' || TRIM(SECOND_NAME) || ' ' || TRIM(LAST_NAME),FRANCHISE_NUMBER,DEALER_CODE,DEALERTYPE,DENOMINATION,tds_amount,DECODE(COMMISSION_TYPE,'F','FRC','S','STV') ORDER BY DENOMINATION ";
        
        System.out.println("Query to getFRCConsildateReport::" + query);
        return jdbcTemplate.query(query, new FRCReportConsolidateRowMapper());
	}
	private final class FRCReportConsolidateRowMapper implements RowMapper<FRCReportConsolidateBean> {
		@Override
		public FRCReportConsolidateBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<FRC Consolidate Dao>>*****************************");
			FRCReportConsolidateBean fRCReportConsolidateBean = new FRCReportConsolidateBean();
			
			
			fRCReportConsolidateBean.setCIRCLE_NAME(rs.getString("CIRCLE_NAME"));
			fRCReportConsolidateBean.setFRANCHISEE_SSA(rs.getString("FRANCHISEE_SSA"));
			fRCReportConsolidateBean.setFRANCHISEE_NAME(rs.getString("Franchisee_name"));
			fRCReportConsolidateBean.setFRANCHISEE_NUMBER(rs.getString("Franchisee_NUMBER"));
			fRCReportConsolidateBean.setFRANCHISEE_ID(rs.getString("Franchisee_ID"));
			fRCReportConsolidateBean.setFRANCHISEE_CATEGORY(rs.getString("FRANCHISEE_CATEGORY"));
			fRCReportConsolidateBean.setFRC_DENOMINATION(rs.getInt("FRC_DENOMINATION"));
			fRCReportConsolidateBean.setTRANS_COUNT(rs.getInt("trans_count"));
			fRCReportConsolidateBean.setSELL_COMM(rs.getInt("SELLER_COMM"));
			fRCReportConsolidateBean.setSUB_FRA_COMM(rs.getInt("sub_fra_comm"));
			fRCReportConsolidateBean.setFRAN_COMM(rs.getInt("FRA_COMM"));
			fRCReportConsolidateBean.setTDS_VALUE(rs.getInt("tds_value"));
			fRCReportConsolidateBean.setTOT_TDS(rs.getInt("tot_tds"));
			fRCReportConsolidateBean.setCOMMISSION_TYPE(rs.getString("COMMISSION_TYPE"));
			
			System.out.println("dao channelwisedata ::"+fRCReportConsolidateBean.toString());
			return fRCReportConsolidateBean;
		}

	}

}
