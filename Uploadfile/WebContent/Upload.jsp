<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body><!-- enctype="multipart/form-data" -->
<center>
		<h1>File Upload to Database Demo</h1>
		<form action="UploadExcelAction" method="post" enctype="multipart/form-data">
			<table border="0">
				<tr>
					<td>First Name: </td>
					<td><input type="text" name="firstName" size="50"/></td>
				</tr>
				
				<tr>
					<td>Portrait Photo: </td>
					<td><input type="file" name="excels" size="50"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>