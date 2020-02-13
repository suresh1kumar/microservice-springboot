<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetAchivements | Resume Builder</title>
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
<caption class="cap">Achivements Details List<a href="addAchivements.jsp"><span class="titlespace"><img src="./images/add.png" height="20" width="20"/>Add</span></a></caption>
<colgroup sapn="8" ></colgroup>
		<thead>
		<tr style="background-color:#4EAECC;color:#eee;">
		<td>Achivements</td>
		<td>Training</td>
		
		<td>Edit/Update</td>
		
		</tr>
		</thead>
		<tbody>
		<c:forEach var ="achivement" items="${sessionScope.achivementsDetails}">
		<tr>
			<td><c:out value="${achivement.achivements}"></c:out></td>
			<td><c:out value="${achivement.tranee}"></c:out></td>
		<td><a href="updateAchivements.jsp?achid=${achivement.ach_id}&achivement=${achivement.achivements}&trainee=${achivement.tranee}">Edit</a>
		<a href="DeleteAchivementsDetails?achid=${achivement.ach_id}">Delete</a>	
		</td>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>