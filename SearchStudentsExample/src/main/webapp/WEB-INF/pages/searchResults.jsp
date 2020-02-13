<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@include file="searchStudents.jsp" %>
<html>
<body>
<table border="1">
<tr>
<th>studentId</th><th>name</th><th>mobile</th><th>course</th><th>city</th>
<th>state</th>
</tr>
<c:choose>
<c:when test="${searchResultsList.size()>0}">
<c:forEach items="${searchResultsList}" var="searchResults">
<tr>
<td>${searchResults.sid}</td>
<td>${searchResults.name}</td>
<td>${searchResults.mobile}</td>
<td>${searchResults.course}</td>
<td>${searchResults.city}</td>
<td>${searchResults.state}</td>
</tr>
</c:forEach>
</c:when>
<c:otherwise>
<tr><td colspan="6">
<c:out value="No Records Are Found"/>
</td></tr>
</c:otherwise>
</c:choose>
</table>
</body>
</html>
