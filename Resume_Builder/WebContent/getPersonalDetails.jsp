<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetPersonalDetails | Resume Builder</title>

<style>
	.alter_color{
		width:100%; 
		border-collapse:collapse; 
	}
	.alter_color td{ 
		padding:7px;
		border:#A7AFB0 1px solid;
	}
	.alter_color tr{
		background:#4CAECB;
		
	}
	tr{
		width:100%;
		text-align:center;
	}
	
	.alter_color tr:nth-child(odd){ 
		background-color: #D6E7F1;
	}
	
	.alter_color tr:nth-child(even){
	
		background-color: #F0F4FC;
		}
	.cap{
		font-size:20px;
		font-family:arial;
	}
	.space{
		margin-left:15px;
	}
	.titlespace{
		float:right;
	}
	.cap{
		background-color:#35ACD0;
		padding:20px; 
		border:#A7AFB0;
		color:#eee;
	}
</style>
</head>
<body>
	<table frame="box" rules="all" align="center" class="alter_color">
<caption class="cap">Personal Details List<a href="#"><span class="titlespace"><img src="./images/add.png" height="20" width="20"/>Add</span></a></caption>
<colgroup sapn="8" ></colgroup>
		<thead>
		<tr style="background-color:#4EAECC;color:#eee;">
		<td>First Name</td>
		<td>Last Name</td>
		<td>Father Name</td>
		<td>Mother Name</td>
		<td>D.O.B.</td>
		<td>Country Name</td>
		<td>State Name</td>
		<td>City Name</td>
		<td>Gender</td>
		<td>Pine Code</td>
		<td>Address</td>
		<td>Edit/Update</td>
		
		</tr>
		</thead>
		<tbody>
		<c:forEach var ="personal" items="${sessionScope.personalDetails}">
		<tr>
			
			<td><c:out value="${personal.fname}"></c:out></td>
			<td><c:out value="${personal.lname}"></c:out></td>
			<td><c:out value="${personal.fathname}"></c:out></td>
			<td><c:out value="${personal.mothname}"></c:out></td>
			<td><c:out value="${personal.dob}"></c:out></td>
			<td><c:out value="${personal.countryname}"></c:out></td>
			<td><c:out value="${personal.statename}"></c:out></td>
			<td><c:out value="${personal.cityname}"></c:out></td>
			<td><c:out value="${personal.gender}"></c:out></td>
			<td><c:out value="${personal.pincode}"></c:out></td>
			 <td><c:out value="${personal.addr}"></c:out></td>
			
		<td><a href="updatePersonal.jsp?pid=${personal.p_id}&fname=${personal.fname}
		&lname=${personal.lname}&fathname=${personal.fathname}
		&mothname=${personal.mothname}&dob=${personal.dob}&pincode=${personal.pincode}&addr=${personal.addr}">Edit</a>
		<a href="DeletePersonalDetails?pid=${personal.p_id}">Delete</a>	
		</td>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>