<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function Approve(){
	var obj=document.getElementsByName("id");
	var count = 0;
	for(i=0;i<obj.length;i++){
		if(obj[i].checked == true){
	  		count++;
	  	}
	}
	alert(count);
	if(count <= 0){
		alert("Please select atleast one record to update");
		return false;
	}
	//document.UploadC.action="FranchiseAddBalanceApproval.jsp?flag=Approve";
	document.UploadC.action="UploadController?action=update";
	document.UploadC.App.disabled=true;
	document.UploadC.method="post";
	document.UploadC.submit();
}

function selectAll(){
	var obj=document.getElementsByName("ids");
	if(document.getElementById("all").checked== true){
	  	for(i=0;i<obj.length;i++){
	  		obj[i].checked = "checked";
	  	}
  	}else{
  		for(i=0;i<obj.length;i++){
	  		obj[i].checked = false;
	  	}
  	}
}
</script>

</head>
<%
String[] id=request.getParameterValues("statuss");
if(id!=null){
	System.out.println(" id.length------::"+id.length);
	System.out.println(" id------::"+id);
}else{
	System.out.println(" id------::");
}

%>
<body>
	<a href="UploadController">view Upload</a>
	<!-- <a href="/UploadController">view Upload</a> -->

	<form action="UploadController?action=update" method="post" name="UploadC">
	<!-- <form  name="UploadC">
		<input type="submit" value="update" onclick="return Approve();">
	 -->

		<input type="submit" value="update" >
		<div align="center">
			<table border="1" cellpadding="5">
				<%-- <caption>
					<h2>List of users</h2>
				</caption> --%>
				 <thead >
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>price</th>
					<th>status</th>
					<th>Select</th>
					<th class="w3-text-sand">
						<input type="checkbox" value="all" name="all" id="all" onclick="selectAll()">
					</th>
				</tr>
				 </thead >
				 <tbody>
				<tr>
				
				
					<%-- <c:forEach items="${listdate}" var="string">
						<tr>
							<c:forEach items="${string}" begin="1" var="vars">
								<td class="aw "> ${vars} </td>
							</c:forEach>
							<td class="aw "> <input type="checkbox" value="${string[1]},${string[2]},${string[3]},${string[4]}" name="statuss" ></td>
							<td> 
								<input type="checkbox" value="${string.id},${string.name},${string.price},${string.status}" name="statuss" >
							</td>
						</tr>
					</c:forEach> --%>
				</tr>
				</tbody>
				
				<c:forEach var="user" items="${listdate}">
					<tr>
						<td>${user.id}<input type="hidden" name="id1" value="${user.id}">
						</td>
						<td>${user.name}<input type="text" name="name" value="${user.name}">
						</td>
						<td>${user.price}<input type="text" name="price" value="${user.price}">
						</td>
						<td>${user.status}<input type="text" name="status" value="${user.status}">
						</td>
						<%-- <td><input type="checkbox" name="id" value="${user.id},${user.name},${user.price}" /></td> --%>
						<td><input type="checkbox" name="ids" value="${user.id},${user.name},${user.price},${user.status}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form>
</body>
</html>