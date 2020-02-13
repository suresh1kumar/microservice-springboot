package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bean.Upload;
import com.util.DBConnection;

public class UploadDaoImpl implements UploadDao{
	

	Statement stInfo;
	Statement stInfo1;
	ResultSet rsInfo;
	Connection con=null;
	
	public List<Upload> getAllUploadRecord() throws SQLException {
		System.out.println("*********************<<Upload view DAO>>**************************");
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
	    DBConnection db = null;
	    String uploadquery="";
	    List<Upload> list=new ArrayList();
	    try {
	    	//db = new DBConnection();
	       // con = DBConnection.getConnection();
	        
	        try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@172.22.0.155:1521:ctopup", "mvoucher", "mvoucher");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	st=con.createStatement();
	    	
	    	uploadquery = " select id ,name,price,status from updatsuresh ";
	    	
	    	System.out.println("uploadquery ::"+uploadquery);
	    	rs=st.executeQuery(uploadquery);
	    	
	    	while(rs.next()){
	    		Upload upload=new Upload();
	    		
	    		upload.setId(rs.getInt("id")); 
	    		upload.setName(rs.getString("name")); 
	    		upload.setPrice(rs.getString("price"));  
	    		upload.setStatus(rs.getString("status")); 
	            list.add(upload);
	    	}
	        
	    } catch (SQLException ex) {
	        Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	        return null;
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	        if (st != null) {
	            try {
	                st.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }
		return list;
	}
	
	
	public boolean updateUploadRecordDao(Upload upload) throws SQLException {
		System.out.println("*********************************<< update UploadDetails DAO >>*********************************");
		boolean flag=false;
		Connection con=null;
		PreparedStatement ps=null;
		DBConnection db = null;
	    String uploadQuery="";
	    
	    System.out.println("getId :::"+upload.getId());
	    System.out.println(" getName :::"+upload.getName());
	    System.out.println(" getPrice :::"+upload.getPrice());
	    System.out.println("getStatus :::"+upload.getStatus());
    	
	    try {
	    	db = new DBConnection();
	        con = DBConnection.getConnection();
	        //uploadQuery = " update updatsuresh set id=?,name=? ,price=?,status=? where id=? ";
	        
	        
	        int ids=upload.getId();
	    	String names=upload.getName();
	    	String prices= upload.getPrice();
	    	String status=upload.getStatus();
	    	
	    	uploadQuery = " update updatsuresh set name='" + names + "',price='" + prices + "',status='" + status + "'  where id=" + ids + " ";
	        
	    	ps=con.prepareStatement(uploadQuery);
	    	
	    	/*ps.setInt(1,upload.getId());
	    	ps.setString(2,upload.getName());
	    	ps.setString(3, upload.getPrice());
	    	ps.setString(4,upload.getStatus());*/
	    	
			System.out.println("updated query ::"+uploadQuery);
			
		int count=ps.executeUpdate();
		if(count>0){
			flag=true;
			System.out.println("update true  dao-------------- ");
		}
		System.out.println("count-------------- "+count);
	    } catch (SQLException ex) {
	        Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	       // return null;
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	        if (ps != null) {
	            try {
	                ps.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }
	    return flag;
	}
	public Upload getProductId(int sno) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		DBConnection db = null;
		Upload upload=new Upload();
	    try {
	    	
	    	db = new DBConnection();
	    	con = DBConnection.getConnection();
		      stInfo = con.createStatement();
		      String query = "select  id from updatsuresh where  id=" + sno + " ";
		      System.out.println("query ceircle ::"+query);
		      rsInfo = stInfo.executeQuery(query);
		      while (rsInfo.next())
		      {
		    	  upload.setId(rsInfo.getInt(1)); 
		      }
			System.out.println("update true  dao-------------- "+upload);
		
	    } catch (SQLException ex) {
	        Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	        if (ps != null) {
	            try {
	                ps.close();
	            } catch (SQLException ex) {
	                Logger.getLogger(UploadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }
		return upload;
	}



}
