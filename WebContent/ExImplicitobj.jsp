<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- config object --%>

<strong>Config example - servlet name: </strong>
<%=config.getServletName()%><br><br>
 
<strong>Config example - ServletContext: </strong>
  <%=  config.getServletContext()  %> <br><br>
  
  
  <strong>Config example - Init Param name: </strong>
  <%=  config.getInitParameterNames()  %> <br><br>
   
  <% pageContext.setAttribute("Test", "Test Value"); %>
<strong>PageContext example - class name: </strong><%=pageContext.getClass().getName() %><br><br>


 
 <strong>PageContext example - Page name: </strong>
 <%=pageContext.getPage() %><br><br>
 
 
  
 <strong>PageContext example - Servlet session name: </strong>
 <%=pageContext.getSession() %><br><br>
 
 
  <strong>PageContext example - Servlet response name: </strong>
 <%=pageContext.getResponse() %><br><br>
 
 
  <strong>PageContext example - Servlet request name: </strong>
 <%=pageContext.getRequest() %><br><br>
 
 
 
 <strong>Session creation time: </strong>
 <%=session.getCreationTime() %><br><br>
 
 
  <strong>Session last accessed time: </strong>
 <%=session.getLastAccessedTime() %><br><br>
 
 
  <strong>Session getServletContext: </strong>
 <%=session.getServletContext() %><br><br>
 
 
  <strong>Session getMaxInactiveInterval: </strong>
 <%=session.getMaxInactiveInterval() %><br><br>
  
 
  <strong>PageContext example - Servlet EL Content: </strong>
 <%=pageContext.getELContext() %><br><br>
 
 
  <%  out.print(" <strong>Welcome  "+request.getParameter("username") +" !!!</strong>" );  %>
  <br><br><br>
  
   <%  out.print("<strong>Password :  "+request.getParameter("password")+"</strong>" );  %>
 <% out.newLine();%>

   
<%String driver=config.getInitParameter("dname");  
out.print("<br/>");
out.print("<strong> Driver name is="+driver +"</strong>");  
out.print("<br/>");

%>  
   
</body>
</html>