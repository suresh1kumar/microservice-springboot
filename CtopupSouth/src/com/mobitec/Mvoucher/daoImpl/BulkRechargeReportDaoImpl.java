package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IBulkRechargeReportDao;
import com.mobitec.Mvoucher.domain.BulkRechargeReportBean;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;

@Repository
public class BulkRechargeReportDaoImpl implements IBulkRechargeReportDao{
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public List<BulkRechargeReportBean> getAllBulkRechargeReport(String status, String msisdn, String fdate,
			String tdate) {
		String query=null;
		if (status.equalsIgnoreCase("All")) {
		      query = "SELECT   CREATED_TIMESTAMP,source_msisdn,dest_msisdn,amount,DECODE(transaction_type,10,'Recharge',4,'Topup',12,'Flexy') AS transaction_type,DECODE(status, 2, 'SUCCESS', 'FAILURE') AS STATUS FROM   mvoucher.pps_que_backup WHERE REQ_TYPE = 103 AND source_msisdn = '" + msisdn + "' AND status IN (2, -2) AND TRUNC (created_timestamp) BETWEEN '" + fdate + "' AND '" + tdate + "'";
		    }
		    if (status.equalsIgnoreCase("Success")) {
		      query = "SELECT   CREATED_TIMESTAMP,source_msisdn,dest_msisdn,amount,DECODE(transaction_type,10,'Recharge',4,'Topup',12,'Flexy') AS transaction_type,DECODE(status, 2, 'SUCCESS', 'FAILURE') AS STATUS FROM   mvoucher.pps_que_backup WHERE REQ_TYPE = 103 AND source_msisdn = '" + msisdn + "' AND status IN (2) AND TRUNC (created_timestamp) BETWEEN '" + fdate + "' AND '" + tdate + "'";
		    }
		    if (status.equalsIgnoreCase("Failure")) {
		      query = "SELECT   CREATED_TIMESTAMP,source_msisdn,dest_msisdn,amount,DECODE(transaction_type,10,'Recharge',4,'Topup',12,'Flexy') AS transaction_type,DECODE(status, 2, 'SUCCESS', 'FAILURE') AS STATUS FROM   mvoucher.pps_que_backup WHERE REQ_TYPE = 103 AND source_msisdn = '" + msisdn + "' AND status IN (-2) AND TRUNC (created_timestamp) BETWEEN '" + fdate + "' AND '" + tdate + "'";
		    }
		    if (status.equalsIgnoreCase("In Progress")) {
		      System.out.println("in progress query.....");
		      query = "select CREATED_TIMESTAMP,source_msisdn,DEST_MSISDN,AMOUNT,TRANSACTION_TYPE,STATUS from pps_que where REQ_TYPE=103 and source_msisdn='" + 
		        msisdn + "'and status in(0) AND TRUNC (created_timestamp) BETWEEN '" + fdate + "' AND '" + tdate + "'";
		    }
		    System.out.println("query Print::" + query);
			return jdbcTemplate.query(query, new BulkRechargeReportRowMapper());
	}
	private final class BulkRechargeReportRowMapper implements RowMapper<BulkRechargeReportBean> {
		@Override
		public BulkRechargeReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<Bulk RechargeReport Dao>>*****************************");
			
			BulkRechargeReportBean bulkRechargeReportBean = new BulkRechargeReportBean();
			bulkRechargeReportBean.setCREATED_TIMESTAMP(rs.getDate("CREATED_TIMESTAMP"));
			bulkRechargeReportBean.setSOURCE_MSISDN(rs.getString("source_msisdn"));
			bulkRechargeReportBean.setDEST_MSISDN(rs.getString("dest_msisdn"));
			bulkRechargeReportBean.setAMOUNT(rs.getDouble("amount"));
			//bulkRechargeReportBean.setTransaction_type(rs.getDate("transaction_type"));
			System.out.println("=================5");
			//bulkRechargeReportBean.setSTATUS(rs.getInt("STATUS"));
			System.out.println("=================6");
			
			System.out.println("dao bulkRechargeReport ::"+bulkRechargeReportBean.toString());
			return bulkRechargeReportBean;
		}

	}

}
