<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="getAllZone">Click Portal</a><br><br>
<a href="getAllCity">aduuuuuuuuud</a>
<a href="addStudent">Controlleradd</a>
<hr>
 <form action="getAllZone" method="GET">
  <table cellpadding="0" width="80%" border="1" align="center" cellspacing="3"> 
<td>Zone Name</td>
<td>
   <select name="sname">
      <c:forEach items="${zonenames}" var="s">
         <option >${s.zname}</option>
       </c:forEach>
     </select>
     </td> </table> </form>
</body>
</html>