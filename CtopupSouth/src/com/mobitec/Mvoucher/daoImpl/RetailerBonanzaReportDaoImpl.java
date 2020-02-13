package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IRetailerBonanzaReportDao;
import com.mobitec.Mvoucher.domain.RetailerBonanzaReportBean;

@Repository
public class RetailerBonanzaReportDaoImpl implements IRetailerBonanzaReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<RetailerBonanzaReportBean> getAllRetailerBonanzaReport (String region,String city,String status,String msisdn,String strFromDate,String strToDate) {
		
             String query=null;
            query = "select  AMOUNT,STATUS,ALLOCATED_USER,APPROVED_USER,allocated_date,approved_date "
            		+ "from retailer_bonanza_stock "
            		+ "where AUTHORISED_MOBILE_NUMBER='" + msisdn + "' and status='" + status + "'  ";
        
              if ((region != null) && (!region.equalsIgnoreCase("")) && (!region.equalsIgnoreCase("All")) && (!region.equalsIgnoreCase("null"))) {
              query = query + " AND circleid=(select circleid from mvclient.tbl_region where r_fullname='" + region + "') AND ";
             }
             if ((city != null) && (!city.equalsIgnoreCase("")) && (!city.equalsIgnoreCase("All")) && (!city.equalsIgnoreCase("null"))) {
              query = query + "cityid=(select cityid from mvclient.tbl_city where c_fullname='" + city + "') AND ";
             }
             if ((strFromDate != null) && (strToDate != null))
             {
             //query = query + " trunc(offer_start_date)  between TO_DATE('" + fdate + "','DD-MM-YYYY') and TO_DATE('" + tdate + "','DD-MM-YYYY')+0.99999";
             query = query + " trunc(offer_start_date) between to_date('"+strFromDate+"','dd-mm-yyyy') and to_date('"+strToDate+"','dd-mm-yyyy')+0.99999";
             }
             System.out.println("query before execute:" + query);
     		return jdbcTemplate.query(query, new RetailerBonanzaReportRowMapper());
	}
	private final class RetailerBonanzaReportRowMapper implements RowMapper<RetailerBonanzaReportBean> {
		@Override
		public RetailerBonanzaReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("******************************<<RetailerBonanzaReport Dao>>******************************");
			RetailerBonanzaReportBean retailerBonanzaReportBean = new RetailerBonanzaReportBean();
			
			retailerBonanzaReportBean.setAMOUNT(rs.getDouble("AMOUNT"));
			retailerBonanzaReportBean.setSTATUS(rs.getString("STATUS"));
			retailerBonanzaReportBean.setALLOCATED_USER(rs.getString("ALLOCATED_USER"));
			retailerBonanzaReportBean.setAPPROVED_USER(rs.getString("APPROVED_USER"));
			retailerBonanzaReportBean.setALLOCATED_DATE(rs.getDate("ALLOCATED_DATE"));
			retailerBonanzaReportBean.setAPPROVED_DATE(rs.getDate("APPROVED_DATE"));
			
			System.out.println("dao RetailerBonanzaReport ::"+retailerBonanzaReportBean.toString());
			return retailerBonanzaReportBean;
		}

	}

}
