package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ICanceledMovedStkReportDao;
import com.mobitec.Mvoucher.domain.CanceledMovedStkReportBean;

@Repository
public class CanceledMovedStkReportDaoImpl implements ICanceledMovedStkReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CanceledMovedStkReportBean> getAllCanceledMovedStkReport(String wallet,String srcNumbOrIdOptn, String srcNumberOrId,
			String destMobileNumber, String fromDate, String toDate) {
		

		String str = "select d.dealer_code,xyz.SM_TRANSACTION_ID,to_char(xyz.TIMESTAMP,'dd-mm-yyyy'),xyz. TRANSACTION_TYPE,xyz.DEALER_ID,xyz.DEST_DEALER_ID,xyz.AMOUNT,xyz.USER_ID,xyz.BALANCE_BEFORE,xyz.BALANCE_AFTER,to_char(xyz.CANCEL_DATE,'dd-mm-yyyy'),xyz.RECORD_ID,xyz.BALANCE_BEFORE_CANCEL,xyz.BALANCE_AFTER_CANCEL from(select * from  STOCK_MOVEMENT_CANCEL where CANCEL_DATE >= to_date('" + fromDate + "','dd-mm-yyyy hh24:mi:ss') and CANCEL_DATE <=to_date('" + new StringBuilder(String.valueOf(toDate)).append(" 23:59:59").toString() + "','dd-mm-yyyy hh24:mi:ss') order by  SM_TRANSACTION_ID)xyz ,dealer_info d  where d.DEALER_ID=xyz.DEALER_ID ";
	      
	      if (!srcNumberOrId.equalsIgnoreCase("")) {
	        if (!srcNumbOrIdOptn.equalsIgnoreCase("1")) {
	          str = str + " AND D.AUTHORISED_MOBILE_NUMBER='" + srcNumberOrId + "'";
	        }
	        else if (!srcNumbOrIdOptn.equalsIgnoreCase("2")) {
	          str = str + " AND D.DEALER_ID='" + srcNumberOrId + "'";
	        }
	      }
	      if (!destMobileNumber.equalsIgnoreCase("")) {
	        str = "select d.dealer_code,xyz.SM_TRANSACTION_ID,to_char(xyz.TIMESTAMP,'dd-mm-yyyy'),xyz. TRANSACTION_TYPE,xyz.DEALER_ID,xyz.DEST_DEALER_ID,xyz.AMOUNT,xyz.USER_ID,xyz.BALANCE_BEFORE,xyz.BALANCE_AFTER,to_char(xyz.CANCEL_DATE,'dd-mm-yyyy'),xyz.RECORD_ID,xyz.BALANCE_BEFORE_CANCEL,xyz.BALANCE_AFTER_CANCEL from(select * from  STOCK_MOVEMENT_CANCEL where CANCEL_DATE >= to_date('" + fromDate + "','dd-mm-yyyy hh24:mi:ss') and CANCEL_DATE <=to_date('" + new StringBuilder(String.valueOf(toDate)).append(" 23:59:59").toString() + "','dd-mm-yyyy hh24:mi:ss') order by  SM_TRANSACTION_ID)xyz ,dealer_info d  where d.DEALER_ID=xyz.DEST_DEALER_ID AND D.AUTHORISED_MOBILE_NUMBER='" + destMobileNumber + "' ";
	      }
	      System.out.println("**********************getListInTranReport_CTOPUP***********************" );

		System.out.println("query Print::" + str);
		//return jdbcTemplate.query(query1, new ChannelWiseRowMapper());
		// return jdbcTemplate.query(str, new BeanPropertyRowMapper<CanceledMovedStkReportBean>(CanceledMovedStkReportBean.class));
		return jdbcTemplate.query(str, new CanceledMovedStkReportRowMapper());
	}

	private final class CanceledMovedStkReportRowMapper implements RowMapper<CanceledMovedStkReportBean> {
		@Override
		public CanceledMovedStkReportBean mapRow(ResultSet rs, int args) throws SQLException {
/*
 * 
 * 	private double RECORD_ID;
	 	private double SM_TRANSACTION_ID;
	 	private Date TIMESTAMP;
	 	private String dealer_code;
	    private double AMOUNT;
	 	private double BALANCE_BEFORE;
	 	private double BALANCE_AFTER;
	 	private double BALANCE_BEFORE_CANCEL;
	 	private double BALANCE_AFTER_CANCEL;
	 	private Date  CANCEL_DATE;
 * 
 */
			
			
			CanceledMovedStkReportBean canceledMovedStkReportBean = new CanceledMovedStkReportBean();
			
			canceledMovedStkReportBean.setRECORD_ID(rs.getLong("RECORD_ID"));
			System.out.println("=============1");
			canceledMovedStkReportBean.setSM_TRANSACTION_ID(rs.getLong("SM_TRANSACTION_ID"));
			System.out.println("=============2");
			//canceledMovedStkReportBean.setTIMESTAMP(rs.getDate("TIMESTAMP"));
		//	System.out.println("=============3");
			canceledMovedStkReportBean.setDealer_code(rs.getString("dealer_code"));
			                                                     
			System.out.println("=============4");
			canceledMovedStkReportBean.setAMOUNT(rs.getDouble("AMOUNT"));
			System.out.println("=============5");
			canceledMovedStkReportBean.setBALANCE_BEFORE(rs.getDouble("BALANCE_BEFORE"));
			System.out.println("=============6");
			canceledMovedStkReportBean.setBALANCE_AFTER(rs.getDouble("BALANCE_AFTER"));
			System.out.println("=============7");
			canceledMovedStkReportBean.setBALANCE_BEFORE_CANCEL(rs.getDouble("BALANCE_BEFORE_CANCEL"));
			System.out.println("=============8");
			canceledMovedStkReportBean.setBALANCE_AFTER_CANCEL(rs.getDouble("BALANCE_AFTER_CANCEL"));
			System.out.println("=============9");
			//canceledMovedStkReportBean.setCANCEL_DATE(rs.getDate("CANCEL_DATE"));
			System.out.println("=============10");
		
			System.out.println("dao Canceled Moved StkReport ::"+canceledMovedStkReportBean.toString());
			return canceledMovedStkReportBean;
		}

	}
	}


