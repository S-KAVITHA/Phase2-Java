<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="sem" class="advanced.java.program.Semester" scope="session"></jsp:useBean>
        Semester No:    <jsp:getProperty name="sem" property="semNo" />  <br>
        Marks:    <jsp:getProperty name="sem" property="marks" />  <br>
        
</body>
</html>