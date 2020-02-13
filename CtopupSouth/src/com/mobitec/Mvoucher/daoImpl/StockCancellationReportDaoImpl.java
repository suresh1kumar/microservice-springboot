package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IStockCancellationReportDao;
import com.mobitec.Mvoucher.domain.StockCancellationReportBean;

@Repository
public class StockCancellationReportDaoImpl implements IStockCancellationReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<StockCancellationReportBean> getAllStockCancellationReport(String wallet,String wichDate, String srcNumbOrIdOptn, String srcNumberOrId,
			String SearchOn, String strFromDate, String strToDate) {
	
		//(String stkCancleAfter,String wichDate,String strFromDate, String strToDate, String srcNumberOrId, String option, int Page_no)
		 String queryStr1="select  DI.DEALER_CODE,DI.AUTHORISED_MOBILE_NUMBER,STK.SA_TRANSACTION_ID,"
		 		+ "to_char(STK.TIMESTAMP,'dd-mm-yyyy hh24:mi:ss') time,STK.DEALER_ID,"
		 		+ "STK.AMOUNT,STK.USER_ID,STK.BALANCE_BEFORE,STK.BALANCE_AFTER, STK.SERVICE_TAX,STK.TDS,"
		 		+ "STK.SUR_CHARGE,STK.SES,STK.FULL_AMOUNT,STK.DLR_COMMISSION,STK.RECEIPT_NO,"
		 		+ "STK.PAYMENT_MODE,STK.CHECK_DD_NUM, STK.CHECK_DD_DATE,STK.FACE_VALUE,STK.BANK_NAME,"
		 		+ "STK.USER_CANCEL,STK.CANCEL_DATE,STK.CANCEL_AFTER,STK.BALANCE_BEFORE_CANCEL,"
		 		+ "STK.BALANCE_AFTER_CANCEL FROM( SELECT SA_TRANSACTION_ID,TIMESTAMP,DEALER_ID,AMOUNT,"
		 		+ " USER_ID,BALANCE_BEFORE,BALANCE_AFTER,TRANSACTION_ID,SERVICE_TAX, TDS,SUR_CHARGE, "
		 		+ "SES,FULL_AMOUNT,DLR_COMMISSION,RECEIPT_NO,PAYMENT_MODE,CHECK_DD_NUM, CHECK_DD_DATE,"
		 		+ "FACE_VALUE,BANK_NAME,USER_CANCEL,CANCEL_DATE,CANCEL_AFTER,BALANCE_BEFORE_CANCEL, "
		 		+ "BALANCE_AFTER_CANCEL FROM TBL_CANCEL_STOCK_ALLOCATION WHERE";
		 
         if(wichDate!=null && wichDate.equalsIgnoreCase("AllocApproveDate"))
         {
         	queryStr1+=" TIMESTAMP >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') AND  TIMESTAMP <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";

         }
         else if(wichDate!=null && wichDate.equalsIgnoreCase("CancelDate")) 
         {
            queryStr1+=" CANCEL_DATE >= to_date('"+strFromDate+"','dd-mm-yyyy hh24:mi:ss') AND  CANCEL_DATE <=to_date('"+strToDate+"','dd-mm-yyyy hh24:mi:ss')";
         }
        if(SearchOn!=null && SearchOn.equalsIgnoreCase("CancleAfterAlloc")){

     	   queryStr1+=" AND CANCEL_AFTER='ALLOCATION') STK,DEALER_INFO DI WHERE STK.DEALER_ID=DI.DEALER_ID";
        }
        else if(SearchOn!=null && SearchOn.equalsIgnoreCase("CancleAfterApprove")){

     	   queryStr1+=" AND CANCEL_AFTER='APPROVAL') STK,DEALER_INFO DI WHERE STK.DEALER_ID=DI.DEALER_ID";
        }
        if(!srcNumberOrId.equalsIgnoreCase(""))
        {
     	   if(srcNumbOrIdOptn.equalsIgnoreCase("1")){
     		   queryStr1 = queryStr1+ " AND DI.AUTHORISED_MOBILE_NUMBER = '"+srcNumberOrId+"' ";
     	   }
     	   else if(srcNumbOrIdOptn.equalsIgnoreCase("2")){
     		   queryStr1 = queryStr1+ " AND DI.DEALER_ID = '"+srcNumberOrId+"' ";
     	   }
	      }
 
       System.out.println("CTOPUP Query:  " +queryStr1);
       return jdbcTemplate.query(queryStr1, new StockCancellationReportRowMapper());
	}

	private final class StockCancellationReportRowMapper implements RowMapper<StockCancellationReportBean> {
		@Override
		public StockCancellationReportBean mapRow(ResultSet rs, int args) throws SQLException {
			
			
		    System.out.println("***********************************<<stockcanclemovestock Dao>>***********************************");
			StockCancellationReportBean stockCancellationReportBean = new StockCancellationReportBean();
			
			stockCancellationReportBean.setTime(rs.getDate("CANCEL_DATE"));
			stockCancellationReportBean.setDEALER_CODE(rs.getString("DEALER_CODE"));
			stockCancellationReportBean.setAMOUNT(rs.getDouble("AMOUNT"));
			stockCancellationReportBean.setRECEIPT_NO(rs.getString("RECEIPT_NO"));
			stockCancellationReportBean.setPAYMENT_MODE(rs.getString("PAYMENT_MODE"));
			stockCancellationReportBean.setCHECK_DD_NUM(rs.getString("CHECK_DD_NUM"));
			stockCancellationReportBean.setFULL_AMOUNT(rs.getDouble("FULL_AMOUNT"));
			stockCancellationReportBean.setSERVICE_TAX(rs.getDouble("SERVICE_TAX"));
			stockCancellationReportBean.setDLR_COMMISSION(rs.getDouble("DLR_COMMISSION"));
			stockCancellationReportBean.setTDS(rs.getInt("TDS"));
			stockCancellationReportBean.setSUR_CHARGE(rs.getInt("SUR_CHARGE"));
			stockCancellationReportBean.setSES(rs.getInt("SES"));
			
			System.out.println("dao Canceled Moved StkReport ::"+stockCancellationReportBean.toString());
			return stockCancellationReportBean;
		}

	}
}
