<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
<title>JSP Page</title>
<!--   <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script> -->
<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
</head>

<script language="javascript" type="text/javascript">
	var xmlHttp;
	function showState(str) {

		if (typeof XMLHttpRequest !== "undefined") {
			xmlHttp = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
		}
		if (xmlHttp == null) {
			alert("browser does not supported XMLHTTP request")
			return;
		}
		var url = "getAllState";
		url += "?count=" + str;
		xmlHttp.onreadystatechange = stateChange;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
	}
	function stateChange() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			//alert("inside state : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			document.getElementById("state").innerHTML = xmlHttp.responseText;
		}
	}
	function showCity(str) {
		if (typeof XMLHttpRequest !== "undefined") {
			xmlHttp = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
		}
		if (xmlHttp == null) {
			alert("browser does not supported XMLHTTP request")
			return;
		}
		var url = "getAllCity";
		url += "?count=" + str;
		xmlHttp.onreadystatechange = stateChange1;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
	}
	function stateChange1() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			document.getElementById("city").innerHTML = xmlHttp.responseText;
		}
	}
</script>

<body>
	<!-- <tr> -->
		<!--  <th align="center" bgcolor="gray" style="color: whit" colspan="5"> -->
		<h2>drop down list with my portal</h2>
	
	<!-- </tr>
	<tr> -->
		<th align="right">Select Zone :</th>
		<td><select id="zone" name="zone" onchange="showState(this.value)">
				<option value="1">Select Zone</option>
				<c:forEach items="${zonenames}" var="s">
					<option value="${s.zid }">${s.zname}</option>
				</c:forEach>
		</select></td>
<!-- 	</tr>
	<tr> -->
			<th align="right">select State :</th>
			<td id="state" ><select name='state' id='state' >
					<option value='-1'>select state..</option>
			</select></td>
		<!-- </tr>
		<tr> -->
			<th align="right">select city :</th>
			<td id="city"><select name='city' >
					<option value='-1'>select city..</option>
			</select></td>
		</tr>
		
		
	
	
	</table>
















	<%--  <form action="getAllZone" method="GET">
 <table cellpadding="0" width="80%" border="1" align="center" cellspacing="3"> 
<td>Zone Name</td>
<td>
   <select name="country" onchange="showState(this.value)">
      <c:forEach items="${zonenames}" var="s">
         <option >${s.zname}</option>
       </c:forEach>
     </select>
     </td>
 
  
  <td>State Name</td>
  <td id="state">
      <select name="state">
      <c:forEach items="${statenames}" var="s1"> 
          <option >${s1.sname}</option>
      </c:forEach>
</select>
</td> 

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
</form>  --%>
	<!-- <table border="2" align="center" width="50%"> -->
</body>
</html>