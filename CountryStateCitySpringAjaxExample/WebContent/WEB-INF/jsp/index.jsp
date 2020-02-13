<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
<style>form{width: 70%;margin: 100px auto}</style>
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
			alert("inside state : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			/* document.getElementById("state1").innerHTML = xmlHttp.responseText; */
			
			
			var jsonstate = JSON.parse(xmlHttp.responseText);

            var stateid = document.getElementById('state1');
            for (var i = 0; i < jsonstate.length; i++) {
            	stateid.innerHTML = stateid.innerHTML +
                    '<option value="' + jsonstate[i].sid + '">' + jsonstate[i].sname + '</option>';
            }
			
		}
	}
	function showCity(str) {
		//alert("city ::");
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
			alert("ccccccccccccccccccccccccc");
			alert("inside city : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			// document.getElementById("city1").innerHTML = xmlHttp.responseText; 
			
			 var jsoncity = JSON.parse(xmlHttp.responseText);
            var city_id = document.getElementById('city1');
            for (var i = 0; i < jsoncity.length; i++) {
            	city_id.innerHTML = city_id.innerHTML +
            	'<option value="' + jsoncity[i].cid + '">' + jsoncity[i].cname + '</option>';
            } 
		}
	}
</script> 
 
<body>
<table border="2" align="center" width="50%">
		<tr>
		  <th align="center" bgcolor="gray" style="color: whit" colspan="5">
			<h2>Drop down List With Spring</h2>
		   </th>
		  </tr>
		   <tr>
		       <th align="right">Select Country :</th>
			<td> <select id="zone" name="zone" onchange="showState(this.value)">
			 <option value="1">--select zone--</option>
			 <c:forEach items="${zonenames}" var="s">
					<option value="${s.zid }">${s.zname}</option>
				</c:forEach>
			</select></td>
		   </tr>
		   <tr>
			<th align="right">select State :</th>
			<td><select id='state1' name='state' onchange="showCity(this.value)" >
			<option value='-1'>select state</option>
			</select></td>
		   </tr>
		   <tr>
			<th align="right">select city :</th>
			<td><select id='city1' name='city' >
			<option value='-1'>select city</option>
			</select></td>
		  </tr>
	 </table>

</body>
</html>