package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ICancelledTransactionReportDao;
import com.mobitec.Mvoucher.domain.CancelledTransactionBean;

@Repository
public class CancelledTransactionReportDaoImpl implements ICancelledTransactionReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CancelledTransactionBean> getAllTransactionDateReport(String SearchOn, String strFromDate,
			String strToDate) {
		String CancelledQuery=null;
		if(SearchOn != null && (SearchOn.equals("TransactionDate")))//TRUNC (created_timestamp) date1
		 {
	CancelledQuery=" select dealer_id,transaction_id,authorised_mobile_number,TRUNC (transaction_time) transaction_times,transaction_type,"
					+ "amount,TRUNC (cancel_date) cancel_dates,last_updated "
					+ "FROM MVOUCHER.CANCELLED_TRANSACTIONS ";

			  //to_char(transaction_time,'dd-mm-yyyy hh24:mi:ss') ttime,to_char(cancel_date,'dd-mm-yyyy hh24:mi:ss')
				 CancelledQuery +=" where transaction_time between trunc(to_date('"+strFromDate+"','dd-mm-yyyy')) and trunc(to_date('"+strToDate+"','dd-mm-yyyy')) order by transaction_time desc";
			 }
			 if(SearchOn != null && (SearchOn.equals("CancelledDate")))
			 {
				CancelledQuery=" select dealer_id,transaction_id,authorised_mobile_number,to_char(transaction_time,'dd-mm-yyyy hh24:mi:ss'),transaction_type,amount,to_char(cancel_date,'dd-mm-yyyy hh24:mi:ss'),last_updated FROM MVOUCHER.CANCELLED_TRANSACTIONS ";
               
			    //sqlDlrReport="select * from cancelled_transactions where cancel_date >= to_date('"+strFromDate+"','mm-dd-yyyy hh24:mi:ss') and cancel_date <=to_date('"+strToDate+"','mm-dd-yyyy hh24:mi:ss')";
				CancelledQuery +=" where trunc(cancel_date) between trunc(to_date('"+strFromDate+"','dd-mm-yyyy')) and trunc(to_date('"+strToDate+"','dd-mm-yyyy'))  order by transaction_time desc";

				//sqlDlrReport="SELECT dealer_id,transaction_id,authorised_mobile_number,transaction_time,transaction_type,amount,cancel_date,last_updated FROM MVOUCHER.CANCELLED_TRANSACTIONS  where cancel_date >= to_date('"+strFromDate+"','mm-dd-yyyy hh24:mi:ss') and cancel_date <=to_date('"+strToDate+"','mm-dd-yyyy hh24:mi:ss')";

			}
			 System.out.println("query Print::" + CancelledQuery);
				return jdbcTemplate.query(CancelledQuery, new CancelledTransactionReportRowMapper());
	}
	private final class CancelledTransactionReportRowMapper implements RowMapper<CancelledTransactionBean> {
		@Override
		public CancelledTransactionBean mapRow(ResultSet rs, int args) throws SQLException {
            System.out.println("******************************<<Cancelled Transaction Dao>>******************************");
			CancelledTransactionBean cancelledTransactionBean = new CancelledTransactionBean();

					cancelledTransactionBean.setDEALER_ID(rs.getInt("dealer_id"));
			        cancelledTransactionBean.setTRANSACTION_ID(rs.getString("transaction_id"));
			        cancelledTransactionBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("authorised_mobile_number"));
			        cancelledTransactionBean.setTRANSACTION_TIME(rs.getDate("transaction_times"));
			        cancelledTransactionBean.setTRANSACTION_TYPE(rs.getString("transaction_type"));
			        cancelledTransactionBean.setAMOUNT(rs.getDouble("amount"));
			        cancelledTransactionBean.setCANCEL_DATE(rs.getDate("cancel_dates"));
			        cancelledTransactionBean.setLAST_UPDATED(rs.getString("last_updated"));
			System.out.println("dao channelwisedata ::"+cancelledTransactionBean.toString());
			return cancelledTransactionBean;
		}

	}

}
