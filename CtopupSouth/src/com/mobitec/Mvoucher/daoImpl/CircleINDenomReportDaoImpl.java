package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.ICircleINDenomReportDao;
import com.mobitec.Mvoucher.domain.CircleINDenomReportBean;

@Repository
public class CircleINDenomReportDaoImpl implements ICircleINDenomReportDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CircleINDenomReportBean> getAllDenominationwiseSalesReport(String circleid, String inid,String strFromDate, String strToDate) {
		
		String query=null;
		/*String query="select  to_char(timestamp), GETCIRCLENAME("+circleid+"), GETINNAME("+inid+"), Denomination, GETTRANSACTIONNAME(TRANSACTION_TYPE), "
				+ "total_trans, sum_denom from reports where circleid ="+circleid+"  and TO_DATE(TO_CHAR(TIMESTAMP,'DD-MON-YYYY')) BETWEEN TO_DATE('"+strFromDate+"')"
						+ " AND TO_DATE('"+strToDate+"') order by timestamp, denomination, circleid,IN_id,  GETTRANSACTIONNAME(TRANSACTION_TYPE)";*/
		if ((circleid == null) && (inid == null) && (strFromDate != null) && (strToDate != null)){

			query="select  to_char(timestamp),GETCIRCLENAME(circleid), GETINNAME(in_id), Denomination, GETTRANSACTIONNAME(TRANSACTION_TYPE), total_trans, sum_denom from reports"+ 
			            " where TO_DATE(TO_CHAR(TIMESTAMP,'DD-MON-YYYY')) BETWEEN TO_DATE('"+strFromDate+"') AND TO_DATE('"+strToDate+"')"+
			            " order by timestamp, denomination, circleid,IN_id,  GETTRANSACTIONNAME(TRANSACTION_TYPE)";
			}
			if ((circleid == null) && (inid != null) && (strFromDate != null) && (strToDate != null)){

				query="select  to_char(timestamp),GETCIRCLENAME(circleid), GETINNAME("+inid+"), Denomination, GETTRANSACTIONNAME(TRANSACTION_TYPE), total_trans, sum_denom from reports"+ 
			            " where in_id ="+inid+" and TO_DATE(TO_CHAR(TIMESTAMP,'DD-MON-YYYY')) BETWEEN TO_DATE('"+strFromDate+"') AND TO_DATE('"+strToDate+"')"+
			            " order by timestamp, denomination, circleid,IN_id,  GETTRANSACTIONNAME(TRANSACTION_TYPE)";
			}
			if ((circleid != null) && (inid == null) && (strFromDate != null) && (strToDate != null)){

				query="select  to_char(timestamp),GETCIRCLENAME("+circleid+"), GETINNAME(in_id), Denomination, GETTRANSACTIONNAME(TRANSACTION_TYPE), total_trans, sum_denom from reports"+ 
			            " where circleid ="+circleid+" and TO_DATE(TO_CHAR(TIMESTAMP,'DD-MON-YYYY')) BETWEEN TO_DATE('"+strFromDate+"') AND TO_DATE('"+strToDate+"')"+
			            " order by timestamp, denomination, circleid,IN_id,  GETTRANSACTIONNAME(TRANSACTION_TYPE)";
			}

			if ((circleid != null) && (inid != null) && (strFromDate != null) && (strToDate != null)){

				query="select  to_char(timestamp), GETCIRCLENAME("+circleid+") CIRCLENAME, GETINNAME("+inid+") INNAME, Denomination, GETTRANSACTIONNAME(TRANSACTION_TYPE) TRANSACTIONNAME, total_trans, sum_denom from reports"+ 
			            " where circleid ="+circleid+"  and TO_DATE(TO_CHAR(TIMESTAMP,'DD-MON-YYYY')) BETWEEN TO_DATE('"+strFromDate+"') AND TO_DATE('"+strToDate+"')"+
			            " order by timestamp, denomination, circleid,IN_id,  GETTRANSACTIONNAME(TRANSACTION_TYPE)";
			}
	
	/*if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null) && (!strToDate.equalsIgnoreCase("")))
    {
      query = query + " and TRUNC(created_timestamp)  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
    }*/
	//return jdbcTemplate.query(query, new BeanPropertyRowMapper<CircleINDenomReportBean>(CircleINDenomReportBean.class));
	return jdbcTemplate.query(query, new CircleINDenomReportRowMapper());
	}

	private final class CircleINDenomReportRowMapper implements RowMapper<CircleINDenomReportBean> {
		@Override
		public CircleINDenomReportBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("=====================");
			
			/*
			 {
"timestamp":null,
"in_ID":0.0,
"denomination":5000,
"circleid":0,
"transaction_TYPE":0.0,
"total_TRANS":2,
"sum_DENOM":10000
}
	*/
			CircleINDenomReportBean circleINDenomReportBean = new CircleINDenomReportBean();
			//circleINDenomReportBean.setTIMESTAMP(rs.getDate("timestamp"));
			System.out.println("=====================1");
			circleINDenomReportBean.setDENOMINATION(rs.getInt("DENOMINATION"));
			System.out.println("====================2=");
			circleINDenomReportBean.setTOTAL_TRANS(rs.getInt("total_trans"));
			System.out.println("=====================3");
			circleINDenomReportBean.setSUM_DENOM(rs.getInt("sum_denom"));
			System.out.println("=====================4");
			circleINDenomReportBean.setTRANSACTION_TYPE(rs.getInt("TRANSACTIONNAME"));
			System.out.println("=====================7");
			//circleINDenomReportBean.setCIRCLEID(rs.getInt("CIRCLENAME"));
			System.out.println("=====================5");
			//circleINDenomReportBean.setIN_ID(rs.getInt("INNAME"));
			System.out.println("=====================6");
			//circleINDenomReportBean.setTRANSACTION_TYPE(rs.getInt("TRANSACTIONNAME"));
			System.out.println("=====================7");
			
			

			System.out.println("dao channelwisedata ::"+circleINDenomReportBean.toString());
			return circleINDenomReportBean;
		}

	}

}
