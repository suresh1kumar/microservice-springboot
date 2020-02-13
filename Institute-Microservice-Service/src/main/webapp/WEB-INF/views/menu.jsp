<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="sidenav">
    <div >
        <a  href="/" style="padding-bottom: 0; padding-top:0 ; margin-left: 12px">
            <!-- <img th:src="@{/logo.png}" />   -->
           <!--  <img src="@{/logo.png}" /> /static/cdnfile/main.css        --> 
            <img src="/static/cdnfile/logo.png" />   
        </a> 
        
        <a style="font-size: 12px; margin-left: 0; padding-top: 0" th:href="@{/}">www.ezeontech.com</a>         
    </div>

    <div class="mheader">
        Enquiry
    </div>     
    <a href="@{/}">Add Enquiry</a>
    <a href="@{/enq-list}">List Enquiry</a>
    
    <div class="mheader">
        Institute
    </div>   

    <a href="/institute-form">Add Institute</a>
    <a href="/institute-list">Institute List</a>  
    
    <div class="mheader">
        Masters
    </div> 
    
    <a href="/sources">Enquiry Source</a>
    <a href="/courses">Courses</a> 
    
</div>
</body>
</html>