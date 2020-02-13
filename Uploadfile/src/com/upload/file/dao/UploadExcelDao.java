package com.upload.file.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.upload.file.util.DBConnection;

import jxl.Sheet;
import jxl.Workbook;

public class UploadExcelDao {

 public int  getUploadExcelAction(InputStream in,String name)
 {
  int res=0;
  try
  {
	  String FilePath="/home/suresh/All_Suresh_SW/Eclipse_Java_Tomcat_SW/up.xls";
	  //FilePath.getAbsolutePath();
	  
   int i=0;
   String st = null,st2 = null ,st3=null,st4=null;
System.out.println("filename DAO :"+in);
  // FileInputStream fs = new FileInputStream(in);
   Workbook wb = Workbook.getWorkbook(in);

   Sheet sh = wb.getSheet("Sheet1");
   int totalNoOfRows = sh.getRows();
   int totalNoOfCols = sh.getColumns();
   Connection connection=DBConnection.getConnection();
   for (int row = 0; row < totalNoOfRows; row++) {
     
    for (int col = 0; col < totalNoOfCols; col++) {
     try {
       if(col==0) {
        st= sh.getCell(col, row).getContents();
        System.out.println("st ::"+st);
       }
       else if(col==1) {
        st2= sh.getCell(col, row).getContents();
        System.out.println("st2 ::"+st2);
       }
       else if(col==2) {
       st3= sh.getCell(col, row).getContents();
      }
      else if(col==4) {
       st4= sh.getCell(col, row).getContents();
      }
     
     }
     catch(Exception ee) {
      ee.printStackTrace();
     }
    }
    
    PreparedStatement pstmt=connection.prepareStatement("insert into loginexcel(ename ,mobile ,amount) values(?,?,?)");
    pstmt.setString(1, name);
    pstmt.setString(2, st);
    pstmt.setString(3, st2);
    
    res=pstmt.executeUpdate();
    
    System.out.println(res);
   }
   System.out.println(i);
  }
  catch(Exception ee) {
   ee.printStackTrace();
  }
  return res;
  
 }
 /*public static void main(String[] args) {
  saveCardStock("abc");
 }*/
}