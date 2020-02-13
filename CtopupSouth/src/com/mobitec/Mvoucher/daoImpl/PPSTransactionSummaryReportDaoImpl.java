package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IPPSTransactionSummaryReportDao;
import com.mobitec.Mvoucher.domain.PPSTransactionSummaryReportBean;


@Repository
public class PPSTransactionSummaryReportDaoImpl implements IPPSTransactionSummaryReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReport(String strFromDate,
			String strToDate) {
		
		String sqlDlrReport=null;
		 strFromDate += " 00:00:00";
			strToDate += " 23:59:59";
		    //sqlDlrReport="select * from cancelled_transactions where cancel_date >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and cancel_date <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";
			sqlDlrReport="SELECT DISTINCT T.DESCRIPTION, PS.STATUS, COUNT(P.QUE_SEQ) NUMBER_OF_TRANS , ROUND(SUM(P.AMOUNT))AMOUNT FROM PPS_QUE_ALL P, PPS_STATUS PS, TRANSACTION_TYPE T WHERE P.COMPLETED_TIMESTAMP >= TO_DATE('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and P.COMPLETED_TIMESTAMP <= TO_DATE('"+strToDate+"','dd-mm-yyyy hh24:mi:ss') and P.STATUS = PS.STATUS_CODE AND T.TRA_TYPE_ID = P.TRANSACTION_TYPE GROUP BY T.DESCRIPTION , PS.STATUS ";
			//sqlDlrReport="SELECT dealer_id,transaction_id,authorised_mobile_number,transaction_time,description,amount,nvl(quantity,''),last_updated FROM MVOUCHER.PENDING_TRANSACTIONS  where transaction_time >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and transaction_time <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";
		   //}
			System.out.println("query Print::" + sqlDlrReport);
			return jdbcTemplate.query(sqlDlrReport, new PPSTransactionSummaryReportRowMapper());
	}


	private final class PPSTransactionSummaryReportRowMapper implements RowMapper<PPSTransactionSummaryReportBean> {
		@Override
		public PPSTransactionSummaryReportBean mapRow(ResultSet rs, int args) throws SQLException {
			
			PPSTransactionSummaryReportBean pPSTransactionSummaryReportBean = new PPSTransactionSummaryReportBean();
			
			pPSTransactionSummaryReportBean.setDESCRIPTION(rs.getString("DESCRIPTION"));
			pPSTransactionSummaryReportBean.setSTATUS(rs.getString("STATUS"));
			pPSTransactionSummaryReportBean.setQUE_SEQ(rs.getInt("NUMBER_OF_TRANS"));
			pPSTransactionSummaryReportBean.setAMOUNT(rs.getDouble("AMOUNT"));

			System.out.println("dao PPSTransactionSummaryReportBean ::"+pPSTransactionSummaryReportBean.toString());
			return pPSTransactionSummaryReportBean;
		}

	}
	
	// i am not use both method altter i will use..
	//=========================getCount---


	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportCount(String strFromDate,
			String strToDate) {
		String sqlDlrReport=null;

		strFromDate += " 00:00:00";
		strToDate += " 23:59:59";
	    //sqlDlrReport="select * from cancelled_transactions where cancel_date >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and cancel_date <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";
		//sqlDlrReport="select count(*) from (SELECT dealer_id,transaction_id,authorised_mobile_number,transaction_time,description,amount,quantity,last_updated FROM MVOUCHER.PENDING_TRANSACTIONS  where transaction_time >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and transaction_time <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss'))";
		sqlDlrReport="select count(*) from ( SELECT DISTINCT T.DESCRIPTION, PS.STATUS, COUNT(P.QUE_SEQ) NUMBER_OF_TRANS , ROUND(SUM(P.AMOUNT))AMOUNT FROM PPS_QUE_ALL P, PPS_STATUS PS, TRANSACTION_TYPE T WHERE P.COMPLETED_TIMESTAMP >= TO_DATE('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and P.COMPLETED_TIMESTAMP <= TO_DATE('"+strToDate+"','dd-mm-yyyy hh24:mi:ss') and P.STATUS = PS.STATUS_CODE AND T.TRA_TYPE_ID = P.TRANSACTION_TYPE GROUP BY T.DESCRIPTION , PS.STATUS )";
		//sqlDlrReport="SELECT * FROM MVOUCHER.PENDING_TRANSACTIONS where cancel_date >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') and cancel_date <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";
	//}
	System.out.println("Query getCount() ::"+sqlDlrReport);
	System.out.println("query Print::" + sqlDlrReport);
	return jdbcTemplate.query(sqlDlrReport, new PPSTransactionSummaryReportCountRowMapper());
}


private final class PPSTransactionSummaryReportCountRowMapper implements RowMapper<PPSTransactionSummaryReportBean> {
@Override
public PPSTransactionSummaryReportBean mapRow(ResultSet rs, int args) throws SQLException {
	
	PPSTransactionSummaryReportBean pPSTransactionSummaryReportBean = new PPSTransactionSummaryReportBean();
	
	pPSTransactionSummaryReportBean.setDESCRIPTION(rs.getString("DESCRIPTION"));
	pPSTransactionSummaryReportBean.setSTATUS(rs.getString("STATUS"));
	pPSTransactionSummaryReportBean.setQUE_SEQ(rs.getInt("NUMBER_OF_TRANS"));
	pPSTransactionSummaryReportBean.setAMOUNT(rs.getDouble("AMOUNT"));

	System.out.println("dao PPSTransactionSummaryReportBean ::"+pPSTransactionSummaryReportBean.toString());
	return pPSTransactionSummaryReportBean;
}

}
	//=========================getAmount---

	@Override
	public List<PPSTransactionSummaryReportBean> getAllPPSTransactionSummaryReportAmount(String strFromDate,
			String strToDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
