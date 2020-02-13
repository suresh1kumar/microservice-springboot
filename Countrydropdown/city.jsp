<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String state=request.getParameter("count");
String buffer="<select name='city'><option value='-1'>select city</option>";
try{
	Class.forName("con.mysql.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from city where stateid='"+state+"'");
	while (rs.next()) {
		//buffer=buffer+"<option value='"rs.getString("stateid")+"'>"+rs.getString("statename")+"</option>;
		buffer=buffer+"<option value='"+rs.getString("cityid")+"'>"+rs.getString("cityname")+"</option>";
	}
	buffer=buffer+"</select>";
	response.getWriter().println(buffer);
	}catch(Exception e){
		System.out.println(e);
}
%>
</body>
</html>