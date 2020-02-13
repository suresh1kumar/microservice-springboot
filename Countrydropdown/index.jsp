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
<style type="text/css">
select {
	height: 25px;
	weight: 250px;
}
</style>
<script language="javascript" type="text/javascript">
	var xmlHttp;
	function showState(str) {

		if (typeof XMLHttpRequest !== "undefined") {
			xmlHttp = new XMLHttpRequest();
		} else if (window.ActiveXobject) {
			xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
		}
		if (xmlHttp == null) {
			alert("browser does not supported XMLHTTP request")
			return;
		}
		var url = "state.jsp";
		url += "?count=" + str;
		xmlHttp.onreadystatechange = stateChange;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
	}
	function stateChange() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			document.getElementById("state").innerHtml = xmlHttp.responseText;
		}
	}
	function showCity(str) {
		if (typeof XMLHttpRequest !== "undefined") {
			xmlHttp = new XMLHttpRequest();
		} else if (window.ActiveXobject) {
			xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
		}
		if (xmlHttp == null) {
			alert("browser does not supported XMLHTTP request")
			return;
		}
		var url = "city.jsp";
		url += "?count=" + str;
		xmlHttp.onreadystatechange = stateChange1;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
	}
	function stateChange1() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			document.getElementById("city").innerHtml = xmlHttp.responseText;
		}
	}
</script>
</head>
<body>
	<table border="2" align="center" width="50%">
		<tr>
			<th align="center" bgcolor="orange" style="color: whit" colspan="5">
				<h2>drop down list with my sql</h2>
			</th>
		</tr>
		<tr>
			<th align="right">Select Country :</th>
			<td><select name="country" onchange="showState(this.value)">
					<option value="none">Select Country</option>
					<%
						Class.forName("con.mysql.jdbc.Driver").newInstance();
						Connection con = DriverManager.getConnection("");
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery("select * from country");
						while (rs.next()) {
					%>
					<option value="<%=rs.getString("countryid")%>"><%=rs.getString("countryname")%></option>
					<%
						}
					%>

			</select></td>
		</tr>
		<tr>
			<th align="right">select State :</th>
			<td id="state"><select name='state'>
					<option value='-1'>select state</option>
			</select></td>
		</tr>
		<tr>
			<th align="right">select city :</th>
			<td id="city"><select name='city'>
					<option value='-1'>select city</option>
			</select></td>
		</tr>
	</table>
</body>
</html>