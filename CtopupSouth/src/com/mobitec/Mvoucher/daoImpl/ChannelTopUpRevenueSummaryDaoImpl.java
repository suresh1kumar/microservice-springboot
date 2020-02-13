package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IChannelTopUpRevenueSummaryDao;
import com.mobitec.Mvoucher.domain.ChannelTopUpRevenueSummaryBean;

@Repository
public class ChannelTopUpRevenueSummaryDaoImpl implements IChannelTopUpRevenueSummaryDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ChannelTopUpRevenueSummaryBean> getAllChannelTopUpRevenueSummaryReport(String zoneFname, String strregNam,
			String strcityNam, String strFromDate, String strToDate) {
		String sqlDlrReport=null; //TRUNC (timestamp) date1 //to_char(timestamp,'dd-mm-yyyy')
		String str2=null;
		sqlDlrReport= " select TRUNC (timestamp) timestamps,number_of_dealers,used_dealer,allocations,"
				+ "recharge_quantity,recharge_amount,topup_quantity,topup_amount,number_of_movements,movements"
				+ " from CTOPUP_TRANSACTION_SUMMARY";
		       str2= " WHERE TIMESTAMP >= TO_DATE('"+strFromDate+"', 'dd-mm-yyyy hh24:mi:ss') AND TIMESTAMP <= TO_DATE('"+strToDate+"', 'dd-mm-yyyy hh24:mi:ss')";
		       sqlDlrReport = sqlDlrReport + str2;
		       if ((zoneFname != null) && (!zoneFname.equalsIgnoreCase("")))
		        {
		         sqlDlrReport = sqlDlrReport + " AND ZONE='" + zoneFname + "'";
		       }
		       if ((strregNam != null) && (!strregNam.equalsIgnoreCase("")))
		       {
		         sqlDlrReport = sqlDlrReport + " AND CIRCLE='" + strregNam + "'";
		       }
		       if ((strcityNam != null) && (!strcityNam.equalsIgnoreCase("")))
		       {
		         sqlDlrReport = sqlDlrReport + " AND CITY='" + strcityNam + "'";
		       }
		      /* if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null)
						&& (!strToDate.equalsIgnoreCase(""))) {
					query1 = query1 + " and TRUNC(TIMESTAMP)  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
							
				}*/
		       System.out.println("query Print::" + sqlDlrReport);
				return jdbcTemplate.query(sqlDlrReport, new ChannelTopUpRevenueSummaryRowMapper());
	}

	private final class ChannelTopUpRevenueSummaryRowMapper implements RowMapper<ChannelTopUpRevenueSummaryBean> {
		@Override
		public ChannelTopUpRevenueSummaryBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<channel TopUp RevenueSummary Dao>>*****************************");
			ChannelTopUpRevenueSummaryBean channelTopUpRevenueSummaryBean = new ChannelTopUpRevenueSummaryBean();
			
			channelTopUpRevenueSummaryBean.setTIMESTAMP(rs.getDate("timestamps"));
			channelTopUpRevenueSummaryBean.setNUMBER_OF_DEALERS(rs.getInt("number_of_dealers"));
			channelTopUpRevenueSummaryBean.setUSED_DEALER(rs.getInt("used_dealer"));
			channelTopUpRevenueSummaryBean.setALLOCATIONS(rs.getDouble("allocations"));
			channelTopUpRevenueSummaryBean.setRECHARGE_QUANTITY(rs.getInt("recharge_quantity"));
			channelTopUpRevenueSummaryBean.setRECHARGE_AMOUNT(rs.getDouble("recharge_amount"));
			channelTopUpRevenueSummaryBean.setTOPUP_QUANTITY(rs.getInt("topup_quantity"));
			channelTopUpRevenueSummaryBean.setTOPUP_AMOUNT(rs.getDouble("topup_amount"));
			channelTopUpRevenueSummaryBean.setNUMBER_OF_MOVEMENTS(rs.getInt("number_of_movements"));
			channelTopUpRevenueSummaryBean.setMOVEMENTS(rs.getDouble("movements"));

			System.out.println("dao channelTopUpRevenueSummary ::"+channelTopUpRevenueSummaryBean.toString());
			return channelTopUpRevenueSummaryBean;
		}

	}

}
