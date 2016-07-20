<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC - Model Attribute</title>
</head>
<body>
	<center>
		<h1>${headerMessage}</h1>
		<table>
			<tr>
				<td>Student Name</td>
				<td>${student1.studentName}</td>
			</tr>
			<tr>
				<td>Student ID</td>
				<td>${student1.studentID}</td>
			</tr>
		</table>
	</center>
</body>
</html>