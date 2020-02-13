package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IUnifiedSimSalesReportDao;
import com.mobitec.Mvoucher.domain.UnifiedSimSalesReportBean;

@Repository
public class UnifiedSimSalesReportDaoImpl implements IUnifiedSimSalesReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<UnifiedSimSalesReportBean> getAllUnifiedSimSalesReport(String status, String searchBy, String msisdn,
			String strFromDate, String strToDate) {
		
                                   //TRUNC (INS_DATE) INS_DATES  //to_char(INS_DATE,'dd-MM-yyyy') INS_DATES
		String query=" SELECT TC_MSISDN, to_char(INS_DATE,'dd-MM-yyyy') INS_DATES, to_char(UPD_DATE,'dd-MM-yyyy') UPD_DATES, STATUS from TRANS_COMM_NUMBERS where 1 = 1";
		if ((status != null) && (!status.equalsIgnoreCase(""))) {
			
				query = query + " AND STATUS='" + status + "'";
		}//'" + cityid + "'
		/*if ((searchBy != null) && (!searchBy.equalsIgnoreCase(""))) {
			
			query = query + " AND status=" + searchBy;
	     }*/
        if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
			
			query = query + " AND TC_MSISDN=" + msisdn;
	     }
        if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null)
				&& (!strToDate.equalsIgnoreCase(""))) {
			query = query + " and TRUNC(" + searchBy + ")  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss') ";
		}
        query=query + "order by 1";
        System.out.println("query Print::" + query);
		return jdbcTemplate.query(query, new UnifiedSimSalesReportRowMapper());
	}

	private final class UnifiedSimSalesReportRowMapper implements RowMapper<UnifiedSimSalesReportBean> {
		@Override
		public UnifiedSimSalesReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<UnifiedSim SalesReport Dao>>*****************************");
			UnifiedSimSalesReportBean unifiedSimSalesReportBean = new UnifiedSimSalesReportBean();
			
			unifiedSimSalesReportBean.setMSISDN(rs.getString("TC_MSISDN"));
			System.out.println("=====================1");
			//unifiedSimSalesReportBean.setInsertedDate(rs.getDate("INS_DATES"));
			System.out.println("=====================2");
			//unifiedSimSalesReportBean.setUpdatedDate(rs.getDate("UPD_DATES"));
			System.out.println("=====================3");
			unifiedSimSalesReportBean.setStatus(rs.getString("STATUS"));
			System.out.println("=====================4");
			
			System.out.println("dao UnifiedSimSalesReportBean ::"+unifiedSimSalesReportBean.toString());
			return unifiedSimSalesReportBean;
		}

	}
}
