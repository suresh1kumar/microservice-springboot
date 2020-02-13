package com.mobitec.Mvoucher.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobitec.Mvoucher.dao.IVanityNumberSalesReportDao;
import com.mobitec.Mvoucher.domain.VanityNumberSalesReportBean;

@Repository
public class VanityNumberSalesReportDaoImpl implements IVanityNumberSalesReportDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<VanityNumberSalesReportBean> getAllVanityNumberSalesReports(String region, String city, String mobile,
			String fromDate, String toDate) {
		
		String VanityNumberQuery = "";
		
		VanityNumberQuery = " SELECT SANCHAR_ID,MVOUCHER.GETDLRNAME(DEALER_ID)" 
   		       + " AS FRANCHISE_NAME,TRANS_DATE as timestamp,SOURCE_MSISDN AS CTOPUP_NUMBER,DEST_MSISDN AS FANCY_NUMBER," 
   		       + "AMOUNT,SOURCE_BALANCE_BEFORE AS STOCK_BEFORE,SOURCE_BALANCE_AFTER AS STOCK_AFTER," 
   		       + "MVOUCHER.GETCIRCLENAME(DEST_CIRCLE_ID) DEST_CIRCLE,MVOUCHER.GETCIRCLENAME(SOURCE_CIRCLE_ID)" 
   		       + " AS FRANCHISE_CIRCLE,MVOUCHER.GETDLRCITYNAME(DEALER_ID) AS FRANCHISE_CITY " 
   		       + "FROM MVOUCHER.RETAILER_SIM_SALE_TRANS WHERE";
		
		
		 /* if ((!region.equalsIgnoreCase("")) && (region != null) && (!region.equalsIgnoreCase("all"))) {
			  
            VanityNumberQuery = VanityNumberQuery + " MVOUCHER.GETDLRCIRCLENAME(DEALER_ID)='" + region + "' AND";
            
    	  //VanityNumberQuery = VanityNumberQuery + " MVOUCHER.GETDLRCIRCLENAME(select regionid from MVCLIENT.TBL_REGION where MVCLIENT.TBL_REGION.R_FULLNAME='" + region + "')";
      }*/
      if ((!city.equalsIgnoreCase("")) && (city != null) && (!city.equalsIgnoreCase("all"))) {
          VanityNumberQuery = VanityNumberQuery + " MVOUCHER.GETDLRCITYNAME(DEALER_ID)='" + city + "' AND";//'" + srcNumberOrId + "'"
        }
      if ((!mobile.equalsIgnoreCase("")) && (mobile != null)) {
          VanityNumberQuery = VanityNumberQuery + " SOURCE_MSISDN=" + mobile + " AND";
        }
      if ((!fromDate.equalsIgnoreCase("")) && (fromDate != null) && (!toDate.equalsIgnoreCase("")) && (toDate != null)) {
        VanityNumberQuery = 
          VanityNumberQuery + " TRANS_DATE BETWEEN TO_DATE('" + fromDate + "','DD-MM-YYYY') AND TO_DATE('" + toDate + "','DD-MM-YYYY')+0.99999 ";
      }
      
      VanityNumberQuery += "ORDER BY TRANS_DATE ";
      
      System.out.println("query Print::" + VanityNumberQuery);
		return jdbcTemplate.query(VanityNumberQuery, new VanityNumberSalesReportMapper());
	}

	private final class VanityNumberSalesReportMapper implements RowMapper<VanityNumberSalesReportBean> {
		@Override
		public VanityNumberSalesReportBean mapRow(ResultSet rs, int args) throws SQLException {

			VanityNumberSalesReportBean vanityNumberSalesReportBean = new VanityNumberSalesReportBean();
			
			
			
			vanityNumberSalesReportBean.setSANCHAR_ID(rs.getString("SANCHAR_ID"));
			//Sysout
			vanityNumberSalesReportBean.setDEALER_ID(rs.getInt("FRANCHISE_NAME"));
			vanityNumberSalesReportBean.setTRANS_DATE(rs.getDate("timestamp"));
			vanityNumberSalesReportBean.setSOURCE_MSISDN(rs.getString("CTOPUP_NUMBER"));
			vanityNumberSalesReportBean.setDEST_MSISDN(rs.getString("FANCY_NUMBER"));
			vanityNumberSalesReportBean.setAMOUNT(rs.getDouble("amount"));
			vanityNumberSalesReportBean.setSOURCE_BALANCE_BEFORE(rs.getDouble("STOCK_BEFORE"));
			vanityNumberSalesReportBean.setSOURCE_BALANCE_AFTER(rs.getDouble("STOCK_AFTER"));
			vanityNumberSalesReportBean.setDEST_CIRCLE_ID(rs.getInt("DEST_CIRCLE"));
			vanityNumberSalesReportBean.setSOURCE_CIRCLE_ID(rs.getInt("FRANCHISE_CIRCLE"));

			System.out.println("dao channelwisedata ::"+vanityNumberSalesReportBean.toString());
			return vanityNumberSalesReportBean;
		}

	}
}


/*json.put("sancharid", resultSet.getString("SANCHAR_ID"));
json.put("franchisename", resultSet.getString("FRANCHISE_NAME"));
json.put("timestamp", resultSet.getString("timestamp"));
json.put("ctopupnumber", resultSet.getString("CTOPUP_NUMBER"));
json.put("fancynumber", resultSet.getString("FANCY_NUMBER"));
json.put("amount", resultSet.getString("amount"));
json.put("stockbefore", resultSet.getString("STOCK_BEFORE"));
json.put("stockafter", resultSet.getString("STOCK_AFTER"));
json.put("desccircle", resultSet.getString("DEST_CIRCLE"));
json.put("franchicircle", resultSet.getString("FRANCHISE_CIRCLE"));*/

