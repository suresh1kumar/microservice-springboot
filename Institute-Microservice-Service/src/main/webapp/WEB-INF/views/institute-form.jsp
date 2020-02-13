<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Institute form</title>
	<link rel="stylesheet" href="<c:url value="/static/cdnfile/main.css" />" />
 	<script src="<c:url value='/static/cdnfile/jquery-3.4.1.min.js' />"></script>
 	
</head>
<body>
 
  <%@ include file = "menu.jsp" %> 
        <div class="main">
         <%@ include file = "header.html" %> 
           
<spring:url value="/save-institute" var="saveURL" />
<form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form">
 			<table border="1" width="90%" align="center" cellpadding="5">     
                    <tr>
                        <td class="fheading"  colspan="4">Institute Form</td>
                    </tr>
                    <tr>
                        <td>Institute Name</td>
                        <td>
                            <!-- <input type="text" path="name"/> -->
                            <form:input path="name" cssClass="form-control" id="Input Institute Name" />
                        </td>
                        <td>Phone</td>
                        <td width="50%"><form:input path="contact.phone" cssClass="form-control" id="phone" /></td>
                                               
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><form:input path="contact.email" cssClass="form-control" id="title" /></td>
                        <td>City</td>
                        <td><form:input path="contact.permanentAddress.city" cssClass="form-control" id="category" /></td>                       
                    </tr>
                    <tr>                       
                        <td>Country</td>
                        <td>
                            <form:input path="contact.permanentAddress.country" cssClass="form-control" id="title" />
                        </td>
                        <td>Zip/Pin Code</td>
                        <td><form:input path="contact.permanentAddress.zip" cssClass="form-control" id="category" /></td>
                    </tr>
                    <tr>
                        <td>Address Detail</td>
                        <td colspan="3">
                            <form:textarea path="contact.permanentAddress.detail" placeholder="House No, Street, Landmark" title="description" cols="60" rows="3"/>
                        </td>
                    </tr>               
                    <tr>                    
                        <td colspan="4" align="center">
                            <button type="submit">Save</button>
                        </td>                                        
                    </tr>

                </table>
          </form:form>
     </div>

<!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000 -->
	<%-- <div class="container">
		<spring:url value="/save-institute" var="saveURL" />
		<h2>Article</h2>
		
		<form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form">
			<form:hidden path="id" />
			<table border="1" width="90%" align="center" cellpadding="5">    
			<div class="form-group">
				<label>Institute Name</label>
				<form:input path="name" cssClass="form-control" id="title" />
			</div>
			
			<div class="form-group">
				<label>Phone</label>
				<form:input path="contact.phone" cssClass="form-control" id="category" />
			</div>
			
			<div class="form-group">
				<label>Email</label>
				<form:input path="contact.email" cssClass="form-control" id="title" />
			</div>
			
			<div class="form-group">
				<label>City</label>
				<form:input path="contact.permanentAddress.city" cssClass="form-control" id="category" />
			</div>
			
			
			<div class="form-group">
				<label>Country</label>
				<form:input path="contact.permanentAddress.country" cssClass="form-control" id="title" />
			</div>
			
			<div class="form-group">
				<label>Zip/Pin Code</label>
				<form:input path="contact.permanentAddress.zip" cssClass="form-control" id="category" />
			</div>
			
			<div class="form-group">
				<label>Address Detail</label>
				<textarea path="contact.permanentAddress.detail" placeholder="House No, Street, Landmark" title="description" cols="60" rows="3"></textarea>
			</div>
			
			
			<button type="submit" class="btn btn-primary">Save</button>
			</table>
		</form:form>

	</div> --%>

</body>
</html>