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

  <form th:action="@{/save-institute}" th:object="${cmd}">
                <table border="1" width="90%" align="center" cellpadding="5">     
                    <tr>
                        <td class="fheading"  colspan="4">Institute Form</td>
                    </tr>
                    <tr>
                        <td>Institute Name</td>
                        <td>
                            <input type="text" th:field="*{name}"/>
                        </td>
                        <td>Phone</td>
                        <td width="50%"><input type="text" th:field="*{contact.phone}"/></td>                       
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" th:field="*{contact.email}"/></td>
                        <td>City</td>
                        <td><input type="text" th:field="*{contact.permanentAddress.city}" /></td>                       
                    </tr>
                    <tr>                       
                        <td>Country</td>
                        <td>
                            <input type="text" th:field="*{contact.permanentAddress.country}"/>
                        </td>
                        <td>Zip/Pin Code</td>
                        <td><input type="text" th:field="*{contact.permanentAddress.zip}"/></td>
                    </tr>
                    <tr>
                        <td>Address Detail</td>
                        <td colspan="3">
                            <textarea th:field="*{contact.permanentAddress.detail}" placeholder="House No, Street, Landmark" title="description" cols="60" rows="3"></textarea>
                        </td>
                    </tr>               
                    <tr>                    
                        <td colspan="4" align="center">
                            <button >Save</button>
                        </td>                                        
                    </tr>

                </table>
            </form>
</body>
</html>