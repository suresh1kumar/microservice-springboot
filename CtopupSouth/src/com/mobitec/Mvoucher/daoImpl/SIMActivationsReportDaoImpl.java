package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ISIMActivationsReportDao;
import com.mobitec.Mvoucher.domain.SIMActivationsReportBean;

@Repository
public class SIMActivationsReportDaoImpl implements ISIMActivationsReportDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<SIMActivationsReportBean> getAllSIMActivationsReport(String circleid, String cityid, String strFromDate,
			String strToDate) {
		System.out.println("circleid::"+circleid);
		System.out.println("cityid::"+cityid);
		String qry="";  //TRUNC (upd_date) upd_dates
		 qry="SELECT d.dealer_id, getdlrmobilenum (d.dealer_id) Auth_MSISDN, d.b_month, d.b_year,b.min_no_of_sale," +
		 		" ss.no_of_sales, d.receipt_no, d.tot_face_value, d.bonus_disc_percent," +
		 		"  d.disc_amount_appr, TO_CHAR (d.upd_date, 'dd/mm/yyyy'),getcirclename (d.circle_id) Circle, getcityname (d.ssa_id) SSA"+
		 		" FROM dlr_bonus_disc_sim_act d,bonus_disc_config_sim_act b, sim_sales ss" +
		 		" WHERE d.status = 'U' AND d.DEALER_ID=ss.DEALER_ID AND d.B_MONTH=ss.B_MONTH AND B.B_YEAR  = SS.B_YEAR AND D.B_YEAR = SS.B_YEAR " +
		 		" AND b.b_month = ss.b_month AND d.circle_id = b.circle_id AND d.ssa_id = b.ssa_id AND getdlrtype(d.dealer_id)=b.DEALER_TYPE";
		
		if(circleid!=null && !circleid.equals("") && !circleid.equalsIgnoreCase("null"))
		{
			//qry+=" and d.CIRCLE_ID=:circleid ";
			qry+=" and d.CIRCLE_ID=" + circleid+ "";
			//qry = qry + " AND  UPPER(GETDEALERCIRCLENAME(GETDLRID(SOURCE_MSISDN)))=UPPER('" + circleid+ "')";
		}
		if(cityid!=null && !cityid.equals("") && !cityid.equalsIgnoreCase("null"))
		{
			//qry+=" and d.SSA_ID=:cityid ";
			qry+=" and d.SSA_ID=" + cityid+ "";
			//qry = qry + "AND UPPER(GETDLRCITYNAME(Getdlrid(SOURCE_MSISDN)))=UPPER('" + cityid + "')";
		}
		if(strFromDate!=null && !strFromDate.equals("") && !strFromDate.equalsIgnoreCase("null")
				&& strToDate!=null && !strToDate.equals("") && !strToDate.equalsIgnoreCase("null"))
		{
			qry+="	AND TRUNC(d.upd_date) between trunc(to_date('" + strFromDate + "','dd-mm-yyyy')) and trunc(to_date('" + strToDate + "','dd-mm-yyyy'))";
			/*qry+=" AND TRUNC(d.upd_date) >= TO_DATE (:fdate, 'dd-mm-yyyy') " +
				 " AND TRUNC(d.upd_date) <= TO_DATE (:tdate, 'dd-mm-yyyy')";*/
		}
		System.out.println("query Print::" + qry);
		return jdbcTemplate.query(qry, new SIMActivationsReportRowMapper());
	}
	private final class SIMActivationsReportRowMapper implements RowMapper<SIMActivationsReportBean> {
		@Override
		public SIMActivationsReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("******************************<<SIM Activations Report Dao>>******************************");
			SIMActivationsReportBean sIMActivationsReportBean = new SIMActivationsReportBean();
			
			sIMActivationsReportBean.setDEALER_ID(rs.getInt("dealer_id"));
			sIMActivationsReportBean.setAUTHORISED_MOBILE_NUMBER(rs.getString("Auth_MSISDN"));
			sIMActivationsReportBean.setB_MONTH(rs.getString("b_month"));
			sIMActivationsReportBean.setB_YEAR(rs.getString("b_year"));
			sIMActivationsReportBean.setMIN_NO_OF_SALE(rs.getInt("min_no_of_sale"));
			sIMActivationsReportBean.setNO_OF_SALES(rs.getInt("no_of_sales"));
			sIMActivationsReportBean.setRECEIPT_NO(rs.getString("receipt_no"));
			sIMActivationsReportBean.setTOT_FACE_VALUE(rs.getDouble("tot_face_value"));
			sIMActivationsReportBean.setBONUS_DISC_PERCENT(rs.getDouble("bonus_disc_percent"));
			sIMActivationsReportBean.setDISC_AMOUNT_APPR(rs.getDouble("disc_amount_appr"));
			//sIMActivationsReportBean.setINS_DATE(rs.getDate("upd_date"));
			System.out.println("===================11");
			sIMActivationsReportBean.setCIRCLE_ID(rs.getString("Circle"));
			sIMActivationsReportBean.setSSA_ID(rs.getString("SSA"));
			
			System.out.println("dao channelwisedata ::"+sIMActivationsReportBean.toString());
			return sIMActivationsReportBean;
		}

	}

}
