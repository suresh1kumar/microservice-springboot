<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/static/cdnfile/main.css" />" />
 	<script src="<c:url value='/static/cdnfile/jquery-3.4.1.min.js' />"></script>
 	
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
 <%@ include file = "menu.jsp" %> 
        <div class="main">
     	 <%@ include file = "header.html" %> 


				 <table border="1" width="90%" align="center" cellpadding="5">                         
                <tr>                       
                    <th>SR</th>
	                <th>ID</th>
	                <th>NAME</th>
	                <th>PHONE</th>
	                <th>EMAIL</th>                
	                <th>CITY</th>                                
	                <th>ACTION</th>                        
                </tr>
                <c:forEach items="${instList }" var="inst" varStatus="count">  
                <tr>                   
                    <td >${itr.count}</td> 
	                <td >${inst.instituteId}</td>
	                <td >${inst.name}</td>
	                <td >${inst.phone}</td>
	                <td >${inst.email}</td>                
	                <td >${inst.city}</td>                    
                    <td> <a href="/article/updateArticle/${inst.instituteId }">Edit</a> |
                     	 <a href="/article/updateArticle/${inst.instituteId}">Delete</a>
                    </td>                        
                </tr>
                </c:forEach>
            </table> 
            
            
            
            

			<%-- <div class="container">
			  <h2>Article List</h2>
			  <table class="table table-striped">
			   <thead>
			    <tr>
			    	<th>SR</th>
	                <th>ID</th>
	                <th>NAME</th>
	                <th>PHONE</th>
	                <th>EMAIL</th>                
	                <th>CITY</th>                                
	                <th>ACTION</th>
			    </tr>
			   </thead>
			   <tbody>
			    <c:forEach items="${instList }" var="inst" varStatus="count">
			     <tr>
				     <td >${itr.count}</td> 
	                <td >${inst.instituteId}</td>
	                <td >${inst.name}</td>
	                <td >${inst.phone}</td>
	                <td >${inst.email}</td>                
	                <td >${inst.city}</td>     
			      <td>
			       <spring:url value="/article/updateArticle/${article.id }" var="updateURL" />
			       		<a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
			       <spring:url value="/article/deleteArticle/${article.id }" var="deleteURL" />
			       		<a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
			      </td>
			     </tr>
			    </c:forEach>
			   </tbody>
			  </table>
			  </div> --%>
	</div>
<!-- -000000000000000000000000 -->
            <%-- <table  border="1" width="90%" align="center" cellpadding="5">
            <tr>
                <td style="font-size: 20px; font-weight: bold" colspan="7">Institute List</td>
            </tr>
            <tr>
                <th>SR</th>
                <th>ID</th>
                <th>NAME</th>
                <th>PHONE</th>
                <th>EMAIL</th>                
                <th>CITY</th>                                
                <th>ACTION</th>                                
            </tr>    
            <tr each="inst,itr : ${instList}">
                <td text="${itr.count}">SR</td>
                <td text="${inst.instituteId}">ID</td>
                <td text="${inst.name}">NAME</td>
                <td text="${inst.phone}">PHONE</td>
                <td text="${inst.email}">EMAIL</td>                
                <td text="${inst.city}">CITY</td>                                
                <td><a href="">Edit</a> | <a href="">Delete</a></td>                                
            </tr> 
        </table>
        </div> --%>
</body>
</html>