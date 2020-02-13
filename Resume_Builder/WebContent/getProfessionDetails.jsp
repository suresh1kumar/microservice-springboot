<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profession Details List</title>

<style>
	.alter_color{
		width:100%; 
		border-collapse:collapse; 
	}
	tr{
		width:100%;
		text-align:center;
	}
	.alter_color td{ 
		padding:7px;
		border:#A7AFB0 1px solid;
	}
	.alter_color tr{
		background:#4CAECB;
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
		<caption class="cap">Profession Details List<a href="#"><span class="titlespace"><img src="./images/add.png" height="20" width="20"/>Add</span></a></caption>
		<colgroup sapn="8" ></colgroup>
		<thead>
		<tr style="background-color:#4EAECC;color:#eee;">
		<td>Employee Name</td>
		<td>From</td>
		<td>To</td>
		<td>Job Title</td>
		<td>Duties</td>
		<td>Edit/Update</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach var ="profession" items="${sessionScope.professiondetails}">
		<tr>
			<td><c:out value="${profession.employerName}"></c:out></td>
			<td><c:out value="${profession.fromDate}"></c:out></td>
			<td><c:out value="${profession.toDate}"></c:out></td>
			<td><c:out value="${profession.jobTitle}"></c:out></td>
			<td><c:out value="${profession.duties}"></c:out></td>
			
		<td><a href="updateProfession.jsp?proid=${profession.pro_id}&ename=${profession.employerName}
		&fromdate=${profession.fromDate}&todate=${profession.toDate}&jtitle=${profession.jobTitle}
		&duties=${profession.duties}">Edit</a>
		<a href="DeleteProfessionDetails?proid=${profession.pro_id}">Delete</a>	
		</td>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>