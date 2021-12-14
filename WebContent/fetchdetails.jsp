<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<br><br>
    <jsp:useBean id="stu" class="advanced.java.program.Student"/>
	<jsp:setProperty property="*" name="stu"/>  
	  
    <h3>Student Information </h3><br>  
	Student Name : <jsp:getProperty property="stuname" name="stu"/><br>  
	Student Age : <jsp:getProperty property="stuage" name="stu"/><br>  
	Student Email : <jsp:getProperty property="stuemail" name="stu" /><br>  
	Student Department : <jsp:getProperty property="studept" name="stu" /><br>  
	Student Course : <jsp:getProperty property="stucourse" name="stu" /><br>  
	Student Id : <jsp:getProperty property="stuid" name="stu" /><br>  
	 <br> 

<a href="https://www.google.com">Google page</a><br><br> 

<a href="forward.jsp">Home page</a><br>

<br> <br> <br> 
 
<jsp:text>
        Student registration done successfully!!! 
</jsp:text>


</body>
</html>