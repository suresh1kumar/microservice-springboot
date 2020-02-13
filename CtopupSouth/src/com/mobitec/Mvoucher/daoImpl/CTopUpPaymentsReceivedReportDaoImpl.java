package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ICTopUpPaymentsReceivedReportDao;
import com.mobitec.Mvoucher.domain.CTopUpPaymentsReceivedReportBean;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;

@Repository
public class CTopUpPaymentsReceivedReportDaoImpl implements ICTopUpPaymentsReceivedReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CTopUpPaymentsReceivedReportBean> getAllCTOPUPaymentsReceivedReport(String strZone, String strRegion,
			String strSsa, String strDealer,String wichDate, String strFromDate, String strToDate) {
		System.out.println("====================================daoCTOPUP================");
		String QUERY_CTPOUP=null;
		/*QUERY_CTPOUP = "SELECT c_fullname,to_char(timestamp,'dd-mm-yyyy hh24:mi:ss'),DEALERTYPE,dealer_code,AUTHORISED_MOBILE_NUMBER,"
				+ "nvl(full_amount,0),RECEIPT_NO,PAYMENT_MODE,CHECK_DD_NUM,nvl(amount,0),nvl(service_tax,0),"
				+ "nvl(dlr_commission,0),nvl(tds,0),nvl(sur_charge,0),nvl(ses,0),nvl(face_value,0) from stock_allocation_detail ";
	  */ 
		QUERY_CTPOUP = " SELECT c_fullname,TRUNC (timestamp) date1,DEALERTYPE,dealer_code,AUTHORISED_MOBILE_NUMBER,full_amount,RECEIPT_NO,PAYMENT_MODE,CHECK_DD_NUM,amount,service_tax,dlr_commission,tds,sur_charge,ses,face_value from stock_allocation_detail ";
		QUERY_CTPOUP = QUERY_CTPOUP + " where z_fullname='" + strZone + "'";
	      if ((strRegion != null) && (!strRegion.equalsIgnoreCase("")) && (!strRegion.equalsIgnoreCase("null"))) {
	    	  QUERY_CTPOUP = QUERY_CTPOUP + " and r_fullname='" + strRegion + "'";
	      }
	      if ((strSsa != null) && (!strSsa.equalsIgnoreCase("")) && (!strSsa.equalsIgnoreCase("null"))) {
	    	  QUERY_CTPOUP = QUERY_CTPOUP + " and c_fullname='" + strSsa + "'";
	      }
	      if ((strDealer != null) && (!strDealer.equalsIgnoreCase("")) && (!strDealer.equalsIgnoreCase("null"))) {
	    	  QUERY_CTPOUP = QUERY_CTPOUP + " and AUTHORISED_MOBILE_NUMBER ='" + strDealer + "'";
	      }
	      if ((wichDate != null) && (wichDate.equalsIgnoreCase("N"))) {
				if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null)
						&& (!strToDate.equalsIgnoreCase(""))) {
					QUERY_CTPOUP = QUERY_CTPOUP + " and TRUNC(timestamp)  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
				}
			} else if ((wichDate != null) && (wichDate.equalsIgnoreCase("CurrentDay"))) {
				QUERY_CTPOUP = QUERY_CTPOUP + " and TRUNC(timestamp)=trunc(sysdate)";
			}
	      //str1 = str1 + " and timestamp between to_date('" + strFromDate + "','dd-mm-yyyy') and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999 ";
	      if ((strSsa != null) && (!strSsa.equalsIgnoreCase("")) && (!strSsa.equalsIgnoreCase("null")))
	      {
	    	  QUERY_CTPOUP = QUERY_CTPOUP + " order by timestamp DESC";
	      }
	      else {
	    	  QUERY_CTPOUP = QUERY_CTPOUP + " order by c_fullname,timestamp DESC";
	      }
		//return null;
	      System.out.println("query Print::" + QUERY_CTPOUP);
			return jdbcTemplate.query(QUERY_CTPOUP, new CTopUpPaymentsReceivedReportRowMapper());
	}

	private final class CTopUpPaymentsReceivedReportRowMapper implements RowMapper<CTopUpPaymentsReceivedReportBean> {
		@Override
		public CTopUpPaymentsReceivedReportBean mapRow(ResultSet rs, int args) throws SQLException {

			CTopUpPaymentsReceivedReportBean CTopUpPaymentsReceivedReportBean = new CTopUpPaymentsReceivedReportBean();
			
			CTopUpPaymentsReceivedReportBean.setC_fullname(rs.getString("c_fullname"));
			System.out.println("==============1");
			CTopUpPaymentsReceivedReportBean.setTimestamp(rs.getDate("timestamp"));
			System.out.println("==============2");
			CTopUpPaymentsReceivedReportBean.setDEALERTYPE(rs.getString("DEALERTYPE"));
			System.out.println("==============3");
			CTopUpPaymentsReceivedReportBean.setDealer_code(rs.getString("dealer_code"));
			System.out.println("==============4");
			CTopUpPaymentsReceivedReportBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("AUTHORISED_MOBILE_NUMBER"));
			System.out.println("==============5");
			CTopUpPaymentsReceivedReportBean.setFull_amount(rs.getDouble("full_amount"));
			System.out.println("==============6");
			CTopUpPaymentsReceivedReportBean.setRECEIPT_NO(rs.getString("RECEIPT_NO"));
			System.out.println("==============7");
			CTopUpPaymentsReceivedReportBean.setPAYMENT_MODE(rs.getString("PAYMENT_MODE"));
			System.out.println("==============8");
			CTopUpPaymentsReceivedReportBean.setCHECK_DD_NUM(rs.getString("CHECK_DD_NUM"));
			System.out.println("==============9");
			CTopUpPaymentsReceivedReportBean.setAmount(rs.getDouble("amount"));
			System.out.println("==============10");
			CTopUpPaymentsReceivedReportBean.setService_tax(rs.getDouble("service_tax"));
			System.out.println("==============11");
			CTopUpPaymentsReceivedReportBean.setDlr_commission(rs.getDouble("dlr_commission"));
			System.out.println("==============12");
			CTopUpPaymentsReceivedReportBean.setTds(rs.getInt("tds"));
			System.out.println("==============13");
			CTopUpPaymentsReceivedReportBean.setSur_charge(rs.getInt("sur_charge"));
			System.out.println("==============14");
			CTopUpPaymentsReceivedReportBean.setSes(rs.getInt("ses"));
			System.out.println("==============15");
			CTopUpPaymentsReceivedReportBean.setFace_value(rs.getDouble("face_value"));
			System.out.println("==============16");
			
			System.out.println("dao channelwisedata ::"+CTopUpPaymentsReceivedReportBean.toString());
			return CTopUpPaymentsReceivedReportBean;
		}
	}

	@Override
	public List<CTopUpPaymentsReceivedReportBean> getAllCBPaymentsReceivedReport(String strZone, String strRegion,
			String strSsa, String strDealer, String wichDate, String strFromDate, String strToDate) {
		String Query=null;
		Query = "SELECT c_fullname,to_char(timestamp,'dd-mm-yyyy hh24:mi:ss'),"
				+ "DEALERTYPE,dealer_code,AUTHORISED_MOBILE_NUMBER,nvl(full_amount,0),RECEIPT_NO,PAYMENT_MODE,"
				+ "CHECK_DD_NUM,nvl(amount,0),nvl(service_tax,0),nvl(dlr_commission,0),nvl(tds,0),nvl(sur_charge,0),"
				+ "nvl(ses,0),nvl(face_value,0) from mwa_stock_allocation_detail";
		
	      Query = Query + " where wallet_id=3 and z_fullname='" + strZone + "'";
	      if ((strRegion != null) && (!strRegion.equalsIgnoreCase("")) && (!strRegion.equalsIgnoreCase("null"))) {
	        Query = Query + " and r_fullname='" + strRegion + "'and wallet_id=3";
	      }
	      if ((strSsa != null) && (!strSsa.equalsIgnoreCase("")) && (!strSsa.equalsIgnoreCase("null"))) {
	        Query = Query + " and c_fullname='" + strSsa + "'";
	      }
	      if ((strDealer != null) && (!strDealer.equalsIgnoreCase("")) && (!strDealer.equalsIgnoreCase("null"))) {
	        Query = String.valueOf(Query) + " and dealer_code ='" + strDealer + "'";
	      }
	      if ((wichDate != null) && (wichDate.equalsIgnoreCase("N"))) {
				if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null)
						&& (!strToDate.equalsIgnoreCase(""))) {
					Query = Query + " and TRUNC(timestamp)  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
							
				}
			} else if ((wichDate != null) && (wichDate.equalsIgnoreCase("CurrentDay"))) {
				Query = Query + " and TRUNC(timestamp)=trunc(sysdate)";
			}
	      //Query = String.valueOf(Query) + " and timestamp between to_date('" + strFromDate + "','dd-mm-yyyy') and to_date('" + strToDate + "','dd-mm-yyyy')+0.99999";
	      
	      Query = Query + "order by c_fullname,timestamp DESC";
	      return jdbcTemplate.query(Query, new CBPPaymentsReceivedReportRowMapper());
	}
	private final class CBPPaymentsReceivedReportRowMapper implements RowMapper<CTopUpPaymentsReceivedReportBean> {
		@Override
		public CTopUpPaymentsReceivedReportBean mapRow(ResultSet rs, int args) throws SQLException {

			CTopUpPaymentsReceivedReportBean CTopUpPaymentsReceivedReportBean = new CTopUpPaymentsReceivedReportBean();
			
			CTopUpPaymentsReceivedReportBean.setC_fullname(rs.getString("c_fullname"));
			CTopUpPaymentsReceivedReportBean.setTimestamp(rs.getDate("timestamp"));
			CTopUpPaymentsReceivedReportBean.setDEALERTYPE(rs.getString("DEALERTYPE"));
			CTopUpPaymentsReceivedReportBean.setDealer_code(rs.getString("dealer_code"));
			CTopUpPaymentsReceivedReportBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("AUTHORISED_MOBILE_NUMBER"));
			CTopUpPaymentsReceivedReportBean.setFull_amount(rs.getDouble("full_amount"));
			CTopUpPaymentsReceivedReportBean.setRECEIPT_NO(rs.getString("RECEIPT_NO"));
			CTopUpPaymentsReceivedReportBean.setPAYMENT_MODE(rs.getString("PAYMENT_MODE"));
			CTopUpPaymentsReceivedReportBean.setCHECK_DD_NUM(rs.getString("CHECK_DD_NUM"));
			CTopUpPaymentsReceivedReportBean.setAmount(rs.getDouble("amount"));
			CTopUpPaymentsReceivedReportBean.setService_tax(rs.getDouble("service_tax"));
			CTopUpPaymentsReceivedReportBean.setDlr_commission(rs.getDouble("dlr_commission"));
			CTopUpPaymentsReceivedReportBean.setTds(rs.getInt("tds"));
			CTopUpPaymentsReceivedReportBean.setSur_charge(rs.getInt("sur_charge"));
			CTopUpPaymentsReceivedReportBean.setSes(rs.getInt("ses"));
			CTopUpPaymentsReceivedReportBean.setFace_value(rs.getDouble("face_value"));
			
			System.out.println("dao channelwisedata ::"+CTopUpPaymentsReceivedReportBean.toString());
			return CTopUpPaymentsReceivedReportBean;
		}
	}
}
