<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>source form</title>
<link rel="stylesheet" href="<c:url value="/static/cdnfile/main.css" />" />
 	<script src="<c:url value='/static/cdnfile/jquery-3.4.1.min.js' />"></script>
 	
 	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script> -->
</head>
<body>
<%@ include file = "menu.jsp" %> 
        <div class="main">
         <%@ include file = "header.html" %> 

<spring:url value="/save-enquiry-source" var="saveURL" />
		<form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form">
            
                <table border="1" width="90%" align="center" cellpadding="5">     
                    <tr>
                        <td class="fheading" colspan="3">Enquiry Source</td>
                    </tr>
                    <tr>                       
                        <td align="right">Enter Source                            
                        </td>
                        <td>
                        
                        	<form:input path="name" cssClass="form-control" id="name" />
                        	<form:hidden path="enquirySourceId"/>
                        	
                        	<span class="txt_small">Source for Enquiry like Google Search</span>
                        </td>    
                        <td width="40%">
                            <button >Save</button>
                        </td> 
                    </tr>
                </table>
            </form:form>
            <br/>
            
            
             <div class="container">
			  <h2>Article List</h2>
			  <table class="table table-striped">
			   <thead>
			    <tr>
			    	<th>SR</th>
                    <th>ID</th>
                    <th>SOURCE</th>                        
                    <th>ACTION</th> 
			    </tr>
			   </thead>
			   <tbody>
			    <c:forEach items="${enquirySourceList }" var="inst" varStatus="count">
			     <tr>
				     <td >${itr.count}</td> 
	                <td >${inst.enquirySourceId}</td>
	                <td >${inst.name}</td>
			      <td>
			       <spring:url value="/enquiry-source-edit/${inst.enquirySourceId}" var="updateURL" />
			       		<a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
			       <spring:url value="/enquiry-source-delete/${inst.enquirySourceId}" var="deleteURL" />
			       		<a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
			      </td>
			     </tr>
			    </c:forEach>
			   </tbody>
			  </table>
			  </div> 
			  
			  
            <%-- <table border="1" width="90%" align="center" cellpadding="5">                         
                <tr>                       
                    <th>SR</th>
                    <th>ID</th>
                    <th>SOURCE</th>                        
                    <th>ACTION</th>                        
                </tr>
                <c:forEach items="${enquirySourceList }" var="inst" varStatus="count">   
                <tr>                   
                    <td >${itr.count}</td> 
	                <td >${inst.enquirySourceId}</td>
	                <td >${inst.name}</td>                   
                    <td> 
                    	 <a href="/enquiry-source-edit/${inst.enquirySourceId}">Edit</a> |
                     	 <a href="/enquiry-source-delete/${itr.enquirySourceId}">Delete</a>
                    </td>                        
                </tr>
                </c:forEach>
            </table>  --%>
        </div>
        </div>
</body>
</html>