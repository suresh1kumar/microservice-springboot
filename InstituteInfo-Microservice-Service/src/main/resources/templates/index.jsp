<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
 <title>Institute Form</title>

 
 
 <link rel="stylesheet" href="<c:url value="/static/main.css" />" />
 <script src="<c:url value='/static/jquery-3.4.1.min.js' />"></script>
</head>
<body>
<a th:href="@{/institute-form}">Add Institute</a>
    <a th:href="@{/institute-list}">Institute List</a>  
  
</body>
</html>