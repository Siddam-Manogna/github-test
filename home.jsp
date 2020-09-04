<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

<title>Home</title>
</head>
<body>
<h1>
Hello User !  
</h1>

<form action="display">

Student Name: <input type="text" name="name">
<br>
Student Id: <input type="text" name="studentId">
<br>
Student Address: <input type="text" name="address">
<br>
Student Sem: <input type="text" name="sem">
<br>

<input type="submit">
</form>


</body>
</html>