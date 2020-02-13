package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ISalesReconciliationDao;
import com.mobitec.Mvoucher.domain.SalesReconciliationBean;

@Repository
public class SalesReconciliationDaoImpl implements ISalesReconciliationDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	@Override
	public List<SalesReconciliationBean> getSalesReconciliationReport(String zone, String circle, String city,
			String walletName, String strFromDate, String strToDate) {
		
System.out.println("******************************************Dao Top***********************************************************");
		String query="";
		
		query = "SELECT TO_CHAR(DATETIME,'DD-MON-YYYY') DATETIME, CIRCLE, SSA, DEALER_ID, DEALER_CODE, DEALER_NAME,DEALER_NUMBER, OPENING_BALANCE, CLOSING_BALANCE,STOCK_ALLOCATED,STOCK_MOVED_IN, STOCK_MOVED_OUT,RECHARGE_TOPUP_SALE, DIFF, CANCEL_AMOUNT, STOCK_ALLOCATED_CANCELED, STOCK_MOVED_IN_CANCELED, STOCK_MOVED_OUT_CANCELED,SALE_CANCELED FROM MVOUCHER.SALES_RECONCILIATION_ARCHIVE";
		//query = " SELECT SR.DATETIME, SR.CIRCLE, SR.SSA,SR.AREA, SR.DEALER_ID, SR.DEALER_CODE, SR.DEALER_NAME, SR.DEALER_NUMBER, SR.OPENING_BALANCE,  SR.CLOSING_BALANCE,   SR.STOCK_ALLOCATED,  SR.STOCK_MOVED_IN,  SR.STOCK_MOVED_OUT,   SR.RECHARGE_TOPUP_SALE,  SR.DIFF,  SR.CANCEL_AMOUNT,  SR.STOCK_ALLOCATED_CANCELED,  SR.STOCK_MOVED_IN_CANCELED,  SR.STOCK_MOVED_OUT_CANCELED,  SR.SALE_CANCELED, FN_AGNTTYPE(FN_GETCATEGORY(DEALER_NUMBER)) AGENTTYPE,    GETDLRMOBILENUM(DI.MASTER_DEALER_ID) MDLRNUMBER,  GETDLRNAME(DI.MASTER_DEALER_ID) MDLRNAME  FROM MVOUCHER.SALES_RECONCILIATION_ARCHIVE SR,DEALER_INFO DI  WHERE SR.DEALER_NUMBER=DI.authorised_mobile_number ";
	      
	     
	      if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
	        query = query + " AND CIRCLE = '" + circle + "'";
	      }
	      if ((city != null) && (!city.equalsIgnoreCase(""))) {
	        query = query + " AND SSA = '" + city + "'";
	      }
	      if ((walletName != null) && (!walletName.equalsIgnoreCase(""))) {
	        query = query + " AND DEALER_NUMBER = '" + walletName + "'";
	      }
	      if ((strFromDate != null) && (strToDate != null)) {
		        //query = query + " AND DATETIME BETWEEN TO_DATE('" + strFromDate + "','dd-mm-yyyy') AND TO_DATE('" + strToDate + "','dd-mm-yyyy')+0.99999";
		        //query = "WHERE TRUNC(DATETIME) BETWEEN TO_DATE(?,'dd-mm-yyyy') AND TO_DATE(?,'dd-mm-yyyy') ";
		        query = "WHERE TRUNC(DATETIME) BETWEEN TO_DATE('" + strFromDate + "','dd-mm-yyyy') AND TO_DATE('" + strToDate + "','dd-mm-yyyy')+0.99999";
		      }
	      
	      query = query + " UNION ";
	      query = "  SELECT TO_CHAR(DATETIME,'DD-MON-YYYY') DATETIME, CIRCLE, SSA, DEALER_ID, DEALER_CODE, DEALER_NAME,DEALER_NUMBER, OPENING_BALANCE, CLOSING_BALANCE, STOCK_ALLOCATED, STOCK_MOVED_IN, STOCK_MOVED_OUT,RECHARGE_TOPUP_SALE, DIFF, CANCEL_AMOUNT, STOCK_ALLOCATED_CANCELED, STOCK_MOVED_IN_CANCELED, STOCK_MOVED_OUT_CANCELED,SALE_CANCELED FROM MVOUCHER.SALES_RECONCILIATION";
	      //query = query + " SELECT SR.DATETIME, SR.CIRCLE, SR.SSA,SR.AREA, SR.DEALER_ID, SR.DEALER_CODE, SR.DEALER_NAME, SR.DEALER_NUMBER, SR.OPENING_BALANCE,  SR.CLOSING_BALANCE,   SR.STOCK_ALLOCATED,  SR.STOCK_MOVED_IN,  SR.STOCK_MOVED_OUT,   SR.RECHARGE_TOPUP_SALE,  SR.DIFF,  SR.CANCEL_AMOUNT,  SR.STOCK_ALLOCATED_CANCELED,  SR.STOCK_MOVED_IN_CANCELED,  SR.STOCK_MOVED_OUT_CANCELED,  SR.SALE_CANCELED, FN_AGNTTYPE(FN_GETCATEGORY(DEALER_NUMBER)) AGENTTYPE,    GETDLRMOBILENUM(DI.MASTER_DEALER_ID) MDLRNUMBER,  GETDLRNAME(DI.MASTER_DEALER_ID) MDLRNAME  FROM MVOUCHER.SALES_RECONCILIATION SR,DEALER_INFO DI  WHERE SR.DEALER_NUMBER=DI.authorised_mobile_number ";

	      if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
	        query = query + " AND CIRCLE = '" + circle + "'";
	      }
	      if ((city != null) && (!city.equalsIgnoreCase(""))) {
	        query = query + " AND SSA = '" + city + "'";
	      }
	      if ((walletName != null) && (!walletName.equalsIgnoreCase(""))) {
	        query = query + " AND SR.DEALER_NUMBER = '" + walletName + "'";
	      }
	      if ((strFromDate != null) && (strToDate != null)) {
		       // query = query + " AND DATETIME BETWEEN TO_DATE('" + strFromDate + "','dd-mm-yyyy') AND TO_DATE('" + strToDate + "','dd-mm-yyyy')+0.99999";
		        query = query + " WHERE TRUNC(DATETIME)=TO_DATE('" + strToDate + "','dd-mm-yyyy')+0.99999";
		      }
	      System.out.println("sales reconciliation query:" + query);
	      return jdbcTemplate.query(query, new SalesReconciliationRowMapper());
	}

	private final class SalesReconciliationRowMapper implements RowMapper<SalesReconciliationBean> {
		@Override
		public SalesReconciliationBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<SalesReconciliation Dao>>*****************************");
			SalesReconciliationBean salesReconciliationBean = new SalesReconciliationBean();
			
			System.out.println("--------------------------1");
			salesReconciliationBean.setDatetime(rs.getDate(1));
			System.out.println("-------------------------2");
			salesReconciliationBean.setCircle(rs.getString(2));
			System.out.println("--------------------------3");
			salesReconciliationBean.setSsa(rs.getString(3));
			System.out.println("--------------------------4");
			salesReconciliationBean.setDealer_id(rs.getInt(4));
			System.out.println("--------------------------5");
			salesReconciliationBean.setDealer_code(rs.getString(5));
			System.out.println("--------------------------6");
			salesReconciliationBean.setDealer_name(rs.getString(6));
			System.out.println("--------------------------7");
			salesReconciliationBean.setDealer_number(rs.getString(7));
			System.out.println("--------------------------8");
			salesReconciliationBean.setOpening_balance(rs.getInt(8));
			System.out.println("--------------------------9");
			salesReconciliationBean.setClosing_balance(rs.getInt(9));
			System.out.println("--------------------------10");
			salesReconciliationBean.setStock_allocated(rs.getInt(10));
			System.out.println("--------------------------11");
			salesReconciliationBean.setStock_moved_in(rs.getInt(11));
			System.out.println("--------------------------12");
			salesReconciliationBean.setStock_moved_out(rs.getInt(12));
			System.out.println("--------------------------13");
			salesReconciliationBean.setRecharge_topup_sale(rs.getInt(13));
			System.out.println("--------------------------14");
			salesReconciliationBean.setDiff(rs.getInt(14));
			System.out.println("--------------------------15");
			salesReconciliationBean.setCancel_amount(rs.getInt(15));
			System.out.println("--------------------------16");
			salesReconciliationBean.setStock_allocated_canceled(rs.getInt(16));
			System.out.println("--------------------------17");
			
			salesReconciliationBean.setStock_moved_in_canceled(rs.getInt(17));
			System.out.println("--------------------------18");
			salesReconciliationBean.setStock_moved_out_canceled(rs.getInt(18));
			System.out.println("--------------------------19");
			salesReconciliationBean.setSale_canceled(rs.getInt(19));
			
			System.out.println("dao salesReconciliationBean ::"+salesReconciliationBean.toString());
			return salesReconciliationBean;
		}

	}
}
