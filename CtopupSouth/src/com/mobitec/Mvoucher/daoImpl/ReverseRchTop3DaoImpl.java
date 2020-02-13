package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IReverseRchTop3Dao;
import com.mobitec.Mvoucher.domain.ReverseRchTop3Bean;

@Repository
public class ReverseRchTop3DaoImpl implements IReverseRchTop3Dao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ReverseRchTop3Bean> getAllReverseRechargeTopupReport(String circle,String descriptionin,String transStatus,String srcMobileNumber,String destMobileNumber,String fromDate,String toDate)
	 {
		System.out.println("**************************Start ReverseRchTop3 method dao**************************************");
		System.out.println("*********transStatus::"+transStatus);
		String query="";
		
		query = " SELECT  src_msisdn, desc_msisdn, amount,DECODE (t_type,'12', ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate)), 2),'10', ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate))),'4',ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate)))) reverted,DECODE (t_type,'12', (amount - ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate)), 2)),'10', (amount - ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate)))),'4', (amount - ROUND (amount / (select stax from staxconfigdatewise where trunc(rrt.trans_date) >= trunc(begindate) and trunc(rrt.trans_date) <= trunc(enddate))))) stax,trans_date, ins_date, comp_date, t_type, remark,user_ins, user_name FROM MVOUCHER.TBL_REVERSE_REC_TOP rrt ";
			if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
			query += ",mvoucher.tblnumberseries ns, mvclient.tbl_region r ";
		}
			if ((descriptionin != null) && (!descriptionin.equalsIgnoreCase(""))) {
			query += ", mvoucher.tblnumberseries ns1 ";
		}
		if ((fromDate != null) && (!fromDate.equalsIgnoreCase("")) && (toDate != null) && (!toDate.equalsIgnoreCase(""))) {
			query += " where to_date(INS_DATE) >= TO_DATE('" + fromDate + "','dd-mm-yyyy') AND" + " to_date(INS_DATE) <= TO_DATE('" + toDate + "','dd-mm-yyyy') ";
		}
		if ((transStatus != null) && (transStatus.equalsIgnoreCase("1"))) {
			query += " AND STATUS='PND'";
		}
		if ((transStatus != null) && (transStatus.equalsIgnoreCase("2"))) {
			query += " AND STATUS='COMP'";
		}
		if ((transStatus != null) && (transStatus.equalsIgnoreCase("3"))) {
			query += " AND STATUS='REJ'";
		}
		if ((srcMobileNumber != null) && (!srcMobileNumber.equalsIgnoreCase(""))) {
			query = query + " AND src_msisdn='" + srcMobileNumber + "'";
		}
		if ((destMobileNumber != null) && (!destMobileNumber.equalsIgnoreCase(""))) {
			query = query + " AND desc_msisdn='" + destMobileNumber + "'";
		}
		if ((circle != null) && (!circle.equalsIgnoreCase(""))) {
			query += " AND (r.r_fullname = '" + circle + "' AND ns.circleid = r.regionid AND SUBSTR (SUBSTR (rrt.src_msisdn, -10), 1, 5) = ns.numberseries)";
		}
		/*if (!StringWrapper.makeNotNull(inid).equals("")) {
			query += " AND (ns1.inid =  AND SUBSTR (SUBSTR (rrt.desc_msisdn, -10), 1, 5) = ns1.numberseries)";
		}
		*/
		System.out.println(">>> ReverseOfTopupRecharge: getData() query = "+ query);
		return jdbcTemplate.query(query, new ReverseRchTop3RowMapper());
	}

	private final class ReverseRchTop3RowMapper implements RowMapper<ReverseRchTop3Bean> {
		@Override
		public ReverseRchTop3Bean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<ReverseRchTop3 Dao>>*****************************");
			ReverseRchTop3Bean reverseRchTop3Bean = new ReverseRchTop3Bean();
			
			reverseRchTop3Bean.setSrc_msisdn(rs.getString(1));
			reverseRchTop3Bean.setDesc_msisdn(rs.getString(2));
			reverseRchTop3Bean.setAmount(rs.getDouble(3));
			reverseRchTop3Bean.setReverted(rs.getDouble(4));
			reverseRchTop3Bean.setStax(rs.getDouble(5));
			reverseRchTop3Bean.setTrans_date(rs.getDate(6));
			reverseRchTop3Bean.setINS_DATE(rs.getDate(7));
			reverseRchTop3Bean.setComp_date(rs.getDate(8));
			reverseRchTop3Bean.setT_type(rs.getInt(9));
			System.out.println("-----------------------10");
			//reverseRchTop3Bean.setRemark(rs.getInt(10));
			reverseRchTop3Bean.setUser_ins(rs.getString(11));
			reverseRchTop3Bean.setUser_name(rs.getString(12));
			
			System.out.println("dao reverseRchTop3Bean ::"+reverseRchTop3Bean.toString());
			return reverseRchTop3Bean;
		}

	}
}
