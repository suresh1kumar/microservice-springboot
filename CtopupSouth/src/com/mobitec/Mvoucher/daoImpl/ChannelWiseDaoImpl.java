package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IChannelWiseDao;
import com.mobitec.Mvoucher.domain.ChannelWiseBean;

@Repository
public class ChannelWiseDaoImpl implements IChannelWiseDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override

	public List<ChannelWiseBean> getAllChannelWiseReport(String status, String req_type, String dest_circle_id, String DEST_ZONE_ID,
			String wichDate, String strFromDate, String strToDate, String cityid) {

		/*--------------------------------------
		  if ((wichDate != null) && (wichDate.equalsIgnoreCase("N"))) {
			 
			  con=db.dbLastSevendDaysConnection();
		  } else if ((wichDate != null) && (wichDate.equalsIgnoreCase("CurrentDay")))
			  //con=db.dbLastSevendDaysConnection();
		       con=db.dbConnection();
		 -------------------------------*/

		String query1 = "SELECT TRUNC (created_timestamp) date1,GETDEALERCIRCLENAME(GETDLRID(SOURCE_MSISDN))"
				+ " REGION_NAME,GETDLRCITYNAME(Getdlrid(SOURCE_MSISDN)) CITY_NAME,source_msisdn,dest_msisdn,amount,"
				+ "DECODE (transaction_type, 10, 'RECHARGE', 4, 'TOPUP', 12, 'FLEXITOPUP' ) transaction_type,"
				+ "DECODE (status, 2, 'success', -2, 'Failed') status1,source_balance_before,source_balance_after, "
				+ "dest_balance_before,dest_balance_after,getcirclename (dest_circle_id) dest_circle_name From ";

		
		
		if ((req_type != null) && !(req_type.equalsIgnoreCase("")) && req_type.equalsIgnoreCase("1")) {
			query1 = query1 + " pps_que_backup_web where ";
		} else {
			query1 = query1 + " pps_que_backup WHERE ";
		}
		if ((status != null) && (!status.equalsIgnoreCase(""))) {
			if (status.equalsIgnoreCase("-2")) {
				query1 = query1 + " status !=2";
			} else {
				query1 = query1 + " status=" + status;
			}
		}
		if ((req_type != null) && (!req_type.equalsIgnoreCase("")) && req_type.equalsIgnoreCase("1")) {
			query1 = query1;
		} else {
			query1 = query1 + " and req_type=" + req_type;
		}

		if ((dest_circle_id != null) && !dest_circle_id.equalsIgnoreCase("")
				&& !dest_circle_id.equalsIgnoreCase("ALL")) {
			query1 = query1 + " AND  UPPER(GETDEALERCIRCLENAME(GETDLRID(SOURCE_MSISDN)))=UPPER('" + dest_circle_id
					+ "')";
			// query1 = query1 + " AND GETDLRCIRCLEID(getdlrid(source_msisdn)
			// )=" + dest_circle_id + " ";
		}

		if ((cityid != null) && !cityid.equalsIgnoreCase("") && !cityid.equalsIgnoreCase("ALL")) {
			query1 = query1 + "AND UPPER(GETDLRCITYNAME(Getdlrid(SOURCE_MSISDN)))=UPPER('" + cityid + "')";
			// query1 = query1 + "AND Getdlrcityid(getdlrid(source_msisdn) )=" +
			// cityid + " ";
		}

		if ((wichDate != null) && (wichDate.equalsIgnoreCase("N"))) {
			if ((strFromDate != null) && (!strFromDate.equalsIgnoreCase("")) && (strToDate != null)
					&& (!strToDate.equalsIgnoreCase(""))) {
				query1 = query1 + " and TRUNC(created_timestamp)  between to_date('" + strFromDate + "','dd-mm-yyyy hh24:mi:ss') and to_date('" + strToDate + "','dd-mm-yyyy hh24:mi:ss')";
						
			}
		} else if ((wichDate != null) && (wichDate.equalsIgnoreCase("CurrentDay"))) {
			query1 = query1 + " and TRUNC(created_timestamp)=trunc(sysdate)";
		}

		System.out.println("query Print::" + query1);
		return jdbcTemplate.query(query1, new ChannelWiseRowMapper());
	}

	private final class ChannelWiseRowMapper implements RowMapper<ChannelWiseBean> {
		@Override
		public ChannelWiseBean mapRow(ResultSet rs, int args) throws SQLException {
			System.out.println("*****************************<<Channel WiseReport Dao>>*****************************");
			ChannelWiseBean channelWiseBean = new ChannelWiseBean();
			channelWiseBean.setCreate_stmt(rs.getDate("date1"));
			channelWiseBean.setCirclename(rs.getString("REGION_NAME"));
			channelWiseBean.setCityname(rs.getString("CITY_NAME"));
			channelWiseBean.setSourcemsisdn(rs.getString("source_msisdn"));
			channelWiseBean.setDescmsisdn(rs.getString("dest_msisdn"));
			channelWiseBean.setAmount(rs.getInt("amount"));
			channelWiseBean.setTransaction_type(rs.getString("transaction_type"));
			channelWiseBean.setStatus(rs.getString("status1"));
			channelWiseBean.setSource_balance_after(rs.getDouble("source_balance_before"));
			channelWiseBean.setSource_balance_before(rs.getDouble("source_balance_after"));
			channelWiseBean.setDest__balance_before(rs.getDouble("dest_balance_before"));
			channelWiseBean.setDest__balance_after(rs.getDouble("dest_balance_after"));
			channelWiseBean.setSource_circlename(rs.getString("dest_circle_name"));

			System.out.println("dao channelwisedata ::"+channelWiseBean.toString());
			return channelWiseBean;
		}

	}
}
