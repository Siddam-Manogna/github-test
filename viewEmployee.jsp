<%@page import="com.mydrv.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Employee Details</h1>
<font face="ALGERIAN">

<%
/* application
config
out
request
response
session
exception
 */

Employee employee=(Employee)session.getAttribute("employee");
out.print(employee.getEmpName());
out.print(employee.getEmpId());
out.print(employee.getEmpAge());
out.print(employee.getEmpAddress());
%>

</font>
</body>
</html>





