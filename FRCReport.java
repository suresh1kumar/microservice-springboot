package com.mobitec.Mvoucher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.OrderedJSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;



public class FRCReport implements IFRCReport{
	
	Connection connection= null;
	Statement statement = null;
	ResultSet resultSet = null;
	DBConnection dbConnection = null;
	OrderedJSONObject jsonObject = null;
	JSONArray jsonArray = null;
	boolean data = false;
	public String DetailedReport(String mobile, String zone, String region, String city, String rechargeType, String fromDate, String toDate) {
		String detailedQuery = "";
		 
		try{
			jsonArray = new JSONArray();
			jsonObject = new OrderedJSONObject();
			dbConnection = new DBConnection();
			connection = dbConnection.getNewDatabaseConnection();
			statement = connection.createStatement();
			detailedQuery = "SELECT B.TRANS_DATE,"+
							      " R.R_FULLNAME,"+
							      " C.C_FULLNAME,"+
							      " B.SELLER_NUMBER,"+
							      " GETDLRTYPE (B.SELLER_ID) AS AGENT_CATEGORY,"+
							      " GETDLRMOBILENUM (MASTER_DEALER_ID) AS PARENTMSISDN,"+
							      " 'Success' RESULT,"+
							      " B.DENOMINATION,"+
							      " B.DEST_MSISDN,"+
							      " B.DENOMINATION - B.SELLER_COMM DEDUCTIONS,"+
							      " B.SELLER_COMM,"+
							      " NVL (B.TDS_AMOUNT, 0) AS TDS_AMOUNT,"+
							      " FRANCHISE_COMM,"+
							      " SUBFRANCHISE_NUMBER,"+
							      " SUBFRANCHISE_COMM,"+
							      " E.AGENT_TYPE"+
							      " FROM DEALER_INFO A,"+
							      " MVOUCHER.FRC_COMM_REPORT B,"+
							      " MVCLIENT.TBL_CITY C,"+
							      " MVCLIENT.TBL_REGION R,"+
							      " AGENT_TYPE E"+
							      " WHERE A.CITYID=C.CITYID"+
							      " AND A.REGIONID=R.REGIONID"+
							      " AND A.DEALER_ID=B.SELLER_ID"+
							      " AND A.CATEGORY=E.AGENTTYPE_ID";
			
			if(region!=null && !region.equalsIgnoreCase("") && !region.equalsIgnoreCase("All")){
				detailedQuery += " AND R.R_FULLNAME     ='"+region+"'";
			}
			if(city!=null && !city.equalsIgnoreCase("") && !city.equalsIgnoreCase("All")){
				detailedQuery += " AND C.C_FULLNAME     ='"+city+"'";
			}
			if(mobile!=null && !mobile.equalsIgnoreCase("")){
				detailedQuery += " AND B.SELLER_NUMBER  ='"+mobile+"'";
			}
			if(rechargeType!=null && !rechargeType.equalsIgnoreCase("")){
				detailedQuery += " AND B.COMMISSION_TYPE='"+rechargeType+"'";
			}
			if(fromDate!=null && !fromDate.equalsIgnoreCase("")){
				detailedQuery += " AND B.TRANS_DATE BETWEEN TO_DATE('"+fromDate+"','DD-MM-YYYY') ";
			}
			if(toDate!=null && !toDate.equalsIgnoreCase("")){
				detailedQuery += " AND TO_DATE('"+toDate+"','DD-MM-YYYY')+0.99999";
			}
			detailedQuery += " ORDER BY B.TRANS_DATE DESC";
			System.out.println("detailedQuery :: "+detailedQuery);
			resultSet = statement.executeQuery(detailedQuery);
			while(resultSet.next()){
				OrderedJSONObject json = new OrderedJSONObject();
				json.put("TRANSACTION DATE", resultSet.getString("TRANS_DATE"));
				json.put("CIRCLE", resultSet.getString("R_FULLNAME"));
				json.put("SSA", resultSet.getString("C_FULLNAME"));
				json.put("AGENT MSISDN", resultSet.getString("SELLER_NUMBER"));
				json.put("AGENT CATEGORY", resultSet.getString("AGENT_CATEGORY"));
				json.put("AGENT TYPE", resultSet.getString("AGENT_TYPE"));
				json.put("PARENT MSISDN", resultSet.getString("PARENTMSISDN"));
				json.put("DESTINATION MSISDN", resultSet.getString("DEST_MSISDN"));
				json.put("DENOMINATION", resultSet.getString("DENOMINATION"));
				json.put("AGENT COMMISSION", resultSet.getString("SELLER_COMM"));
				json.put("FRANCHISE COMMISSION", resultSet.getString("FRANCHISE_COMM"));
				json.put("SUBFRANCHISE NUMBER", resultSet.getString("SUBFRANCHISE_NUMBER"));
				json.put("SUBFRANCHISE COMMISSION", resultSet.getString("SUBFRANCHISE_COMM"));
				json.put("TDS AMOUNT", resultSet.getString("TDS_AMOUNT"));
				jsonArray.add(json);
			}
			data  = jsonArray.isEmpty();
			jsonObject.put("status", "200");
			jsonObject.put("isEmpty", data);
			jsonObject.put("reportType", "Detailed");
			jsonObject.put("records", jsonArray);
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		
		catch(SQLException sqle){
			try{
			sqle.printStackTrace();
			jsonObject.put("status", "500");
			}
			catch(JSONException jsone){
				jsone.printStackTrace();
			}
		}
		catch(JSONException jsone){ 
			jsone.printStackTrace();
		}
		finally{
			DBConnection.closeAll(connection, statement, resultSet);
		}
		return jsonObject.toString();
	}

	/*public String SummaryReport(String mobile, String zone, String region, String city, String rechargeType, String fromDate, String toDate) {
		String summaryQuery = "";
		try{
			jsonArray = new JSONArray();
			jsonObject = new OrderedJSONObject();
			dbConnection = new DBConnection();
			connection = dbConnection.getNewDatabaseConnection();
			statement = connection.createStatement();
			
			summaryQuery = "SELECT CIRCLE,"+
						      " SSA,"+
						      " DENOMINATION,"+
						      " COUNT(1) AS TOT_CNT,"+
						      " SUM(COMM) AS TOT_AMT,"+
						      " SUM(NVL(TDS_AMOUNT,0)) AS TOT_TDS_AMT"+
						   " FROM"+
						     " (SELECT MVOUCHER.GETCIRCLENAME(CIRCLE_ID) AS CIRCLE,"+
						       " MVOUCHER.GETCITYNAME(MVOUCHER.GETDLRCITYID(SELLER_ID)) AS SSA,"+
						       " DENOMINATION,"+
						       " SUM(SELLER_COMM+FRANCHISE_COMM+SUBFRANCHISE_COMM) COMM,"+
						       " TDS_AMOUNT"+
						     " FROM MVOUCHER.FRC_COMM_REPORT";
			if(fromDate!=null && !fromDate.equalsIgnoreCase("")){
				summaryQuery += " WHERE TRANS_DATE BETWEEN TO_DATE('"+fromDate+"','DD-MM-YYYY') ";
			}
			if(toDate!=null && !toDate.equalsIgnoreCase("")){
				summaryQuery += " AND TO_DATE('"+toDate+"','DD-MM-YYYY')+0.99999";
			}	
			if(rechargeType!=null && !rechargeType.equalsIgnoreCase("")){
				summaryQuery += " AND COMMISSION_TYPE ='"+rechargeType+"'";
			}
			if(region!=null && !region.equalsIgnoreCase("") && !region.equalsIgnoreCase("All")){
				summaryQuery += " AND MVOUCHER.GETCIRCLENAME(CIRCLE_ID) ='"+region+"'";
			}
			if(city!=null && !city.equalsIgnoreCase("") && !city.equalsIgnoreCase("All")){
				summaryQuery += " AND MVOUCHER.GETCITYNAME(MVOUCHER.GETDLRCITYID(SELLER_ID))='"+city+"'";
			}						     
			summaryQuery += " GROUP BY MVOUCHER.GETCIRCLENAME(CIRCLE_ID) ,"+
						       " MVOUCHER.GETCITYNAME(MVOUCHER.GETDLRCITYID(SELLER_ID)),"+
						       " DENOMINATION,"+
						       " TDS_AMOUNT"+
						     " )"+
						   " GROUP BY CIRCLE,"+
						     " SSA,"+
						     " DENOMINATION";
			System.out.println("summaryQuery ::" + summaryQuery);
			resultSet = statement.executeQuery(summaryQuery);
			while(resultSet.next()){
				OrderedJSONObject json = new OrderedJSONObject();
				json.put("CIRCLE", resultSet.getString("CIRCLE"));
				json.put("SSA", resultSet.getString("SSA"));
				json.put("DENOMINATION", resultSet.getString("DENOMINATION"));
				json.put("TOTAL COUNT", resultSet.getString("TOT_CNT"));
				json.put("TOTAL COMMISSION", resultSet.getString("TOT_AMT"));
				json.put("TOTAL TDS AMOUNT", resultSet.getString("TOT_TDS_AMT"));
				jsonArray.add(json);
			}
			data  = jsonArray.isEmpty();
			jsonObject.put("status", "200");
			jsonObject.put("isEmpty", data);
			jsonObject.put("reportType", "Summary");
			jsonObject.put("records", jsonArray);
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		catch(SQLException sqle){
			try{
			sqle.printStackTrace();
			jsonObject.put("status", "500");
			}
			catch(JSONException jsone){
				jsone.printStackTrace();
			}
		}
		catch(JSONException jsone){ 
			jsone.printStackTrace();
		}
		finally{
			DBConnection.closeAll(connection, statement, resultSet);
		}
		return jsonObject.toString();
	}*/
	public String SummaryReport(String mobile, String zone, String region, String city, String rechargeType, String fromDate, String toDate) {
		String summaryQuery = "";
		try{
			jsonArray = new JSONArray();
			jsonObject = new OrderedJSONObject();
			dbConnection = new DBConnection();
			connection = dbConnection.getNewDatabaseConnection();
			statement = connection.createStatement();
			
			summaryQuery = "SELECT * FROM DEALER_INFO WHERE DOB <> 'null'";
			System.out.println("summaryQuery ::" + summaryQuery);
			resultSet = statement.executeQuery(summaryQuery);
			while(resultSet.next()){
				OrderedJSONObject json = new OrderedJSONObject();
				json.put("DEALER_ID", resultSet.getString("DEALER_ID"));
				json.put("DEALER_CODE", resultSet.getString("DEALER_CODE"));
				json.put("CONTACT_NUMBER", resultSet.getString("CONTACT_NUMBER"));
				json.put("MOBILE_NUMBER", resultSet.getString("MOBILE_NUMBER"));
				json.put("AUTHORISED_MOBILE_NUMBER", resultSet.getString("AUTHORISED_MOBILE_NUMBER"));
				json.put("FIRST_NAME", resultSet.getString("FIRST_NAME"));
				json.put("CATEGORY", resultSet.getString("CATEGORY"));
				json.put("ICCID", resultSet.getString("ICCID"));
				json.put("DOB", resultSet.getString("DOB"));
				json.put("DEALERTYPE", resultSet.getString("DEALERTYPE"));
				json.put("CREATED_DATETIME", resultSet.getString("CREATED_DATETIME"));
				json.put("NO_OF_ATTEMPTS", resultSet.getString("NO_OF_ATTEMPTS"));
				jsonArray.add(json);
			}
			data  = jsonArray.isEmpty();
			jsonObject.put("status", "200");
			jsonObject.put("isEmpty", data);
			jsonObject.put("reportType", "Summary");
			jsonObject.put("records", jsonArray);
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		catch(SQLException sqle){
			try{
			sqle.printStackTrace();
			jsonObject.put("status", "500");
			}
			catch(JSONException jsone){
				jsone.printStackTrace();
			}
		}
		catch(JSONException jsone){ 
			jsone.printStackTrace();
		}
		finally{
			DBConnection.closeAll(connection, statement, resultSet);
		}
		return jsonObject.toString();
	}
}
