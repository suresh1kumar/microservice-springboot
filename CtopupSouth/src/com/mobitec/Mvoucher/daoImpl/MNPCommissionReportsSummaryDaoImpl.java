package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IMNPCommissionReportsSummaryDao;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsDetailedBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsErrorBean;
import com.mobitec.Mvoucher.domain.MNPCommissionReportsSummaryBean;

@Repository
public class MNPCommissionReportsSummaryDaoImpl implements IMNPCommissionReportsSummaryDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MNPCommissionReportsSummaryBean> getAllMNPCommissionReportsSummary(String zone,String circle,String ssa,String msisdn,String searchBy,String searchType,String strFromDate,String strToDate,String status) {
		String querySummary="";
		
		System.out.println("************************************<<MNPCommissionReportsSummary>>************************************");
		System.out.println("zone ::"+zone);
		System.out.println("circle::"+circle);
		System.out.println("ssa::"+ssa);
		System.out.println("msisdn::"+msisdn);
		System.out.println("searchType::"+searchType);
		System.out.println("strFromDate::"+strFromDate);
		System.out.println("strToDate::"+strToDate);
		System.out.println("status::"+status);
		
		//if (StringWrapper.makeNotNull(searchType).equals("summary")) {
			if ((searchType != null) && (searchType.equalsIgnoreCase("summary"))) {
		    
				querySummary = querySummary + " SELECT tr.r_fullName, tc.c_fullName, count(fab_seq),'Approved' as status, sum(amount),sum(CASH_RECEIVED),sum(FACE_VALUE), sum(SERVICE_TAX), sum(COMMISSION_AMOUNT), sum(TDS_CTOPUP),sum(TDS_SS) from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
			
				}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " SELECT msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE , sum(amount),CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    
		    		querySummary = querySummary + " SELECT FAB_SEQ, DID, MSISDN, AMOUNT, DESCRIPTION, tr.r_fullName, tc.c_fullName, trunc(INSERTION_DATE),'Approved' as status, SERVICE_TAX, FACE_VALUE, COMMISSION_AMOUNT, CASH_RECEIVED,APPROVED_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	
		    	if ((zone != null) && (!zone.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ZONE=" + zone;
		    		System.out.println("buildQuery ZONE = " + zone);
		    	}
		    	if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND CIRCLE=" + circle;
		    		System.out.println("buildQuery circle = " + circle);
		    	}
		    	if ((ssa != null) && (!ssa.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ssa=" + ssa;
		    		System.out.println("buildQuery ssa = " + ssa);
		    	}
		    	if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND msisdn=" + msisdn;
		    		System.out.println("buildQuery msisdn = " + msisdn);
		    	}
		    	if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null) && (!strToDate.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " and TRUNC("+ searchBy +")  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
		    	}
		    	if ((status != null) && (!status.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND status=" + status;
		    		System.out.println("buildQuery status = " + status);   
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("summary")) || (searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " and (fab.did = di.dealer_id and fab.msisdn = di.authorised_mobile_number) ";
		    	 System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    		querySummary = querySummary + " and\t(fab.did = di.dealer_id and fab.msisdn <> di.authorised_mobile_number) ";
		    	System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equals("summary"))) {
		    		querySummary = querySummary + " group by tr.r_fullName, tc.c_fullName, 'Approved' ";
		    	}
		    	if ((searchType != null) && (searchType.equals("detailed"))) {
		    		querySummary = querySummary + " group by msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE ,CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE  ";
		    	}
		    	if ((searchType != null) && (searchType.equals("error"))) {
		    		querySummary = querySummary + "order by 1  ";
		      
		    }
		    	System.out.println("querySummary Print::" + querySummary);
		return jdbcTemplate.query(querySummary, new MNPCommissionReportsSummaryRowMapper());
	}

	private final class MNPCommissionReportsSummaryRowMapper implements RowMapper<MNPCommissionReportsSummaryBean> {
		@Override
		public MNPCommissionReportsSummaryBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<MNPCommissionReportsSummary Dao>>*****************************");
			MNPCommissionReportsSummaryBean mNPCommissionReportsSummaryBean = new MNPCommissionReportsSummaryBean();
			
			//fab_seq,status,amount,CASH_RECEIVED,FACE_VALUE,SERVICE_TAX,COMMISSION_AMOUNT,TDS_CTOPUP,TDS_SS
			System.out.println("mNPCommissionReportsSummaryBean ---");
			mNPCommissionReportsSummaryBean.setCIRCLE(rs.getString(1));
			System.out.println("=================1");
			mNPCommissionReportsSummaryBean.setSSA(rs.getString(2));
			System.out.println("=================2");
			mNPCommissionReportsSummaryBean.setFAB_SEQ(rs.getInt(3));
			System.out.println("=================3");
			mNPCommissionReportsSummaryBean.setSTATUS(rs.getString(4));
			System.out.println("=================4");
			mNPCommissionReportsSummaryBean.setAMOUNT(rs.getDouble(5));
			System.out.println("=================5");
			mNPCommissionReportsSummaryBean.setCASH_RECEIVED(rs.getInt(6));
			System.out.println("=================6");
			mNPCommissionReportsSummaryBean.setFACE_VALUE(rs.getInt(7));
			System.out.println("=================7");
			mNPCommissionReportsSummaryBean.setSERVICE_TAX(rs.getInt(8));
			System.out.println("=================8");
			mNPCommissionReportsSummaryBean.setCOMMISSION_AMOUNT(rs.getInt(9));
			System.out.println("=================9");
			mNPCommissionReportsSummaryBean.setTDS_CTOPUP(rs.getInt(10));
			System.out.println("=================10");
			mNPCommissionReportsSummaryBean.setTDS_SS(rs.getInt(11));
			System.out.println("=================11");
			
			System.out.println("dao channelwisedata ::"+mNPCommissionReportsSummaryBean.toString());
			return mNPCommissionReportsSummaryBean;
		}

	}
	
	@Override
	public List<MNPCommissionReportsDetailedBean> getAllMNPCommissionReportsDetailed(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,String status) {
String querySummary="";
		
		System.out.println("************************************<<MNPCommissionReportsDetails Dao>>************************************");
		System.out.println("zone ::"+zone);
		System.out.println("circle::"+circle);
		System.out.println("ssa::"+ssa);
		System.out.println("msisdn::"+msisdn);
		System.out.println("searchType::"+searchType);
		System.out.println("strFromDate::"+strFromDate);
		System.out.println("strToDate::"+strToDate);
		System.out.println("status::"+status);
		
		//if (StringWrapper.makeNotNull(searchType).equals("summary")) {
			if ((searchType != null) && (searchType.equalsIgnoreCase("summary"))) {
		    
				querySummary = querySummary + " SELECT tr.r_fullName, tc.c_fullName, count(fab_seq),'Approved' as status, sum(amount),sum(CASH_RECEIVED),sum(FACE_VALUE), sum(SERVICE_TAX), sum(COMMISSION_AMOUNT), sum(TDS_CTOPUP),sum(TDS_SS) from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
			
				}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " SELECT msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE , sum(amount),CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    
		    		querySummary = querySummary + " SELECT FAB_SEQ, DID, MSISDN, AMOUNT, DESCRIPTION, tr.r_fullName, tc.c_fullName, trunc(INSERTION_DATE),'Approved' as status, SERVICE_TAX, FACE_VALUE, COMMISSION_AMOUNT, CASH_RECEIVED,APPROVED_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	
		    	if ((zone != null) && (!zone.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ZONE=" + zone;
		    		System.out.println("buildQuery ZONE = " + zone);
		    	}
		    	if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND CIRCLE=" + circle;
		    		System.out.println("buildQuery circle = " + circle);
		    	}
		    	if ((ssa != null) && (!ssa.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ssa=" + ssa;
		    		System.out.println("buildQuery ssa = " + ssa);
		    	}
		    	if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND msisdn=" + msisdn;
		    		System.out.println("buildQuery msisdn = " + msisdn);
		    	}
		    	if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null) && (!strToDate.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " and TRUNC("+ searchBy +")  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
		    	}
		    	if ((status != null) && (!status.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND status=" + status;
		    		System.out.println("buildQuery status = " + status);   
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("summary")) || (searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " and (fab.did = di.dealer_id and fab.msisdn = di.authorised_mobile_number) ";
		    	 System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    		querySummary = querySummary + " and\t(fab.did = di.dealer_id and fab.msisdn <> di.authorised_mobile_number) ";
		    	System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equals("summary"))) {
		    		querySummary = querySummary + " group by tr.r_fullName, tc.c_fullName, 'Approved' ";
		    	}
		    	if ((searchType != null) && (searchType.equals("detailed"))) {
		    		querySummary = querySummary + " group by msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE ,CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE  ";
		    	}
		    	if ((searchType != null) && (searchType.equals("error"))) {
		    		querySummary = querySummary + "order by 1  ";
		      
		    }
		    	System.out.println("querySummary Print::" + querySummary);
		return jdbcTemplate.query(querySummary, new MNPCommissionReportsDetailedRowMapper());
	}

	private final class MNPCommissionReportsDetailedRowMapper implements RowMapper<MNPCommissionReportsDetailedBean> {
		@Override
		public MNPCommissionReportsDetailedBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<MNPCommissionReportsDetails Dao>>*****************************");
			MNPCommissionReportsDetailedBean mNPCommissionReportsDetailedBean = new MNPCommissionReportsDetailedBean();
			
			System.out.println("mNPCommissionReportsSummaryBean ---");
			
			mNPCommissionReportsDetailedBean.setMSISDN(rs.getString(1));
			System.out.println("=================1");
			mNPCommissionReportsDetailedBean.setDEALER_CODE(rs.getString(2));
			System.out.println("=================2");
			mNPCommissionReportsDetailedBean.setCIRCLE(rs.getString(3));
			System.out.println("=================3");
			mNPCommissionReportsDetailedBean.setSSA(rs.getString(4));
			System.out.println("=================4");
			mNPCommissionReportsDetailedBean.setAPPROVED_DATE(rs.getDate(5));
			System.out.println("=================5");
			mNPCommissionReportsDetailedBean.setAMOUNT(rs.getDouble(6));
			System.out.println("=================6");
			mNPCommissionReportsDetailedBean.setCASH_RECEIVED(rs.getInt(7));
			System.out.println("=================7");
			mNPCommissionReportsDetailedBean.setFACE_VALUE(rs.getInt(8));
			System.out.println("=================8");
			mNPCommissionReportsDetailedBean.setSERVICE_TAX(rs.getInt(9));
			System.out.println("=================9");
			mNPCommissionReportsDetailedBean.setCOMMISSION_AMOUNT(rs.getInt(10));
			System.out.println("=================10");
			mNPCommissionReportsDetailedBean.setTDS_CTOPUP(rs.getInt(11));
			System.out.println("=================11");
			mNPCommissionReportsDetailedBean.setTDS_SS(rs.getInt(12));
			System.out.println("=================12");
			mNPCommissionReportsDetailedBean.setINSERTION_DATE(rs.getDate(13));
			System.out.println("=================13");
			
			System.out.println("dao MNPCommissionReportsDetails ::"+mNPCommissionReportsDetailedBean.toString());
			return mNPCommissionReportsDetailedBean;
		}

	}

	@Override
	public List<MNPCommissionReportsErrorBean> getAllMNPCommissionReportsError(String zone, String circle,
			String ssa, String msisdn, String searchBy, String searchType, String strFromDate, String strToDate,
			String status) {
String querySummary="";
		
		System.out.println("************************************<<MNPCommissionReportsSummary>>************************************");
		System.out.println("zone ::"+zone);
		System.out.println("circle::"+circle);
		System.out.println("ssa::"+ssa);
		System.out.println("msisdn::"+msisdn);
		System.out.println("searchType::"+searchType);
		System.out.println("strFromDate::"+strFromDate);
		System.out.println("strToDate::"+strToDate);
		System.out.println("status::"+status);
		
		//if (StringWrapper.makeNotNull(searchType).equals("summary")) {
			if ((searchType != null) && (searchType.equalsIgnoreCase("summary"))) {
		    
				querySummary = querySummary + " SELECT tr.r_fullName, tc.c_fullName, count(fab_seq),'Approved' as status, sum(amount),sum(CASH_RECEIVED),sum(FACE_VALUE), sum(SERVICE_TAX), sum(COMMISSION_AMOUNT), sum(TDS_CTOPUP),sum(TDS_SS) from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
			
				}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " SELECT msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE , sum(amount),CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    
		    		querySummary = querySummary + " SELECT FAB_SEQ, DID, MSISDN, AMOUNT, DESCRIPTION, tr.r_fullName, tc.c_fullName, trunc(INSERTION_DATE),'Approved' as status, SERVICE_TAX, FACE_VALUE, COMMISSION_AMOUNT, CASH_RECEIVED,APPROVED_DATE from MNP_COMMISSION fab , dealer_info di , mvclient.TBL_REGION tr, mvclient.TBL_CITY tc where tr.regionid = fab.circle and tc.cityid = fab.ssa ";
		    	}
		    	
		    	if ((zone != null) && (!zone.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ZONE=" + zone;
		    		System.out.println("buildQuery ZONE = " + zone);
		    	}
		    	if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND CIRCLE=" + circle;
		    		System.out.println("buildQuery circle = " + circle);
		    	}
		    	if ((ssa != null) && (!ssa.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND ssa=" + ssa;
		    		System.out.println("buildQuery ssa = " + ssa);
		    	}
		    	if ((msisdn != null) && (!msisdn.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND msisdn=" + msisdn;
		    		System.out.println("buildQuery msisdn = " + msisdn);
		    	}
		    	if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null) && (!strToDate.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " and TRUNC("+ searchBy +")  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
		    	}
		    	if ((status != null) && (!status.equalsIgnoreCase(""))) {
		    		querySummary = querySummary + " AND status=" + status;
		    		System.out.println("buildQuery status = " + status);   
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("summary")) || (searchType != null) && (searchType.equalsIgnoreCase("detailed"))) {
		    		querySummary = querySummary + " and (fab.did = di.dealer_id and fab.msisdn = di.authorised_mobile_number) ";
		    	 System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equalsIgnoreCase("error"))) {
		    		querySummary = querySummary + " and\t(fab.did = di.dealer_id and fab.msisdn <> di.authorised_mobile_number) ";
		    	System.out.println("buildQuery searchType = " + searchType);
		    	}
		    	if ((searchType != null) && (searchType.equals("summary"))) {
		    		querySummary = querySummary + " group by tr.r_fullName, tc.c_fullName, 'Approved' ";
		    	}
		    	if ((searchType != null) && (searchType.equals("detailed"))) {
		    		querySummary = querySummary + " group by msisdn,di.DEALER_CODE, tr.r_fullName, tc.c_fullName,APPROVED_DATE ,CASH_RECEIVED,FACE_VALUE, SERVICE_TAX, COMMISSION_AMOUNT, TDS_CTOPUP,TDS_SS,fab.INSERTION_DATE  ";
		    	}
		    	if ((searchType != null) && (searchType.equals("error"))) {
		    		querySummary = querySummary + "order by 1  ";
		      
		    }
		    	System.out.println("querySummary Print::" + querySummary);
		return jdbcTemplate.query(querySummary, new MNPCommissionReportsErrorRowMapper());
	}

	private final class MNPCommissionReportsErrorRowMapper implements RowMapper<MNPCommissionReportsErrorBean> {
		@Override
		public MNPCommissionReportsErrorBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<MNPCommissionReportsError Dao>>*****************************");
			MNPCommissionReportsErrorBean mNPCommissionReportsErrorBean = new MNPCommissionReportsErrorBean();
			
			mNPCommissionReportsErrorBean.setFAB_SEQ(rs.getInt(1));
			System.out.println("=================1");
			mNPCommissionReportsErrorBean.setDealer_Id(rs.getInt(2));
			System.out.println("=================2");
			mNPCommissionReportsErrorBean.setMSISDN(rs.getString(3));
			System.out.println("=================3");
			mNPCommissionReportsErrorBean.setAMOUNT(rs.getDouble(4));
			System.out.println("=================4");
			mNPCommissionReportsErrorBean.setDESCRIPTION(rs.getString(5));
			System.out.println("=================5");
			mNPCommissionReportsErrorBean.setCIRCLE(rs.getString(6));
			System.out.println("=================6");
			mNPCommissionReportsErrorBean.setSSA(rs.getString(7));
			System.out.println("=================7");
			mNPCommissionReportsErrorBean.setINSERTION_DATE(rs.getDate(8));
			System.out.println("=================8");
			mNPCommissionReportsErrorBean.setSTATUS(rs.getString(9));
			System.out.println("=================9");
			mNPCommissionReportsErrorBean.setSERVICE_TAX(rs.getInt(10));
			System.out.println("=================10");
			mNPCommissionReportsErrorBean.setFACE_VALUE(rs.getInt(11));
			System.out.println("=================11");
			mNPCommissionReportsErrorBean.setCOMMISSION_AMOUNT(rs.getInt(12));
			System.out.println("=================12");
			mNPCommissionReportsErrorBean.setCASH_RECEIVED(rs.getInt(13));
			System.out.println("=================13");
			mNPCommissionReportsErrorBean.setAPPROVED_DATE(rs.getDate(14));
			System.out.println("=================14");
			
			
			System.out.println("MNPCommissionReportsError Dao ::"+mNPCommissionReportsErrorBean.toString());
			return mNPCommissionReportsErrorBean;
		}
	}
}
