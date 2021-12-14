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
        <jsp:setProperty property="semNo" name="sem" value="1"/>
        <jsp:setProperty property="marks" name="sem" value="96"/>
        
        <jsp:setProperty property="semNo" name="sem" value="2"/>
        <jsp:setProperty property="marks" name="sem" value="94"/>
        
        <jsp:setProperty property="semNo" name="sem" value="3"/>
        <jsp:setProperty property="marks" name="sem" value="92"/>
        
        <jsp:setProperty property="semNo" name="sem" value="4"/>
        <jsp:setProperty property="marks" name="sem" value="97"/>
        
        <jsp:setProperty property="semNo" name="sem" value="5"/>
        <jsp:setProperty property="marks" name="sem" value="98"/>
   
   
   
   <c:forEach var="i" begin="0" end="5" step="1">
 <tr><td><jsp:getProperty name="sem[${i}]" property="semNo" value="98" /></td><td><jsp:getProperty name="bean[${i}]" property="name" /></td></tr>
 </c:forEach>
  
 
   <a href="SemesterFetch.jsp">Access bean properties from another page</a><br>
       
</body>
</html>