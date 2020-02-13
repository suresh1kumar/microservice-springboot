<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
<style>form{width: 70%;margin: 100px auto}</style>
<script>
$(document).ready(function(){
	var minDate=new Date();
	$("#fromdate").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#todate').datepicker("option","minDate",selectedDate);
	}
	});

	$("#todate").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#fromdate').datepicker("option","minDate",selectedDate);
	}
	});	
});
</script>
</head>

<body bgcolor="lightblue" font-color="pink">

<h2 align="center">
<spring:message code="studentAddRecourd.insertForm"/>
</h2>
${status}
<hr/><br/>
<div align="center">
<form:form action="addStudent" method="post" commandName="studentAddRecourd">

<spring:message code="studentAddRecourd.sid"/> :
 <form:input path="sid" /><br/>
 
 <spring:message code="studentAddRecourd.name"/> : 
 <form:input path="name"/><br/>

<spring:message code="studentAddRecourd.mobile"/>:
 <form:input path="mobile"/><br/>

<spring:message code="studentAddRecourd.cname"/> :
 <form:input path="cname"/><br/>
 
 <spring:message code="studentAddRecourd.fdate"/> :
 <form:input path="fdate"/><br/>
 
 <spring:message code="studentAddRecourd.todate"/> :
 <form:input path="todate"/><br/>
 
<input type="submit" value="register"/>
</form:form>
</div>


<%-- <form action="addStudent" method="POST">
	<!-- <table border='0' width='480px' cellpadding='0' cellspacing='0'
		align='center'>
		<center>
			<tr>
				<td><h1>Registration Form For Sports</h1></td>
			</tr>
			<center> -->

				<table border='0' width='480px' cellpadding='0' cellspacing='0'
					align='center'>
					<tr>
						<td align='center'>Name:</td>
						<td><input type='text' name='name'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Mobile No:</td>
						<td><input type='text' name='mobile'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>City :</td>
						<td><input type='text' name='city'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>Form Date</td>
						<td><input type='text' name='fromdate' id='fromdate'></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align='center'>To Date:</td>
						<td><input type='text' name='todate' id='todate'></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
					</tr>
					<table border='0' cellpadding='0' cellspacing='0' width='480px'
						align='center'>
						<tr>
							<td align='center'><input type='submit' name='register'
								value="Save"></td>
						</tr>
					</table>
				</table>
	</table>
	</form>  --%>
</body>


</html>