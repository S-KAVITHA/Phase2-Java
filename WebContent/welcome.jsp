<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- This is JSP ccmments using JSP COmment tag--%>
	<%  
	String name=request.getParameter("uname");  
	out.print("welcome "+name);  
	%>  
	<br><br><br>
	
	Expression Tag:::: Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<%= "Welcome "+request.getParameter("uname") %>  
	<br><br><br>
	
	
	 <!-- method declared inside declarative tag and value printed in expression and scriptlet tag  -->  
	Declaration Tag::: 
	<%! int data=50;
	
	int factorial(int n ){
			if (n == 1) {
           		 return n;
        	}
        	else {
           		 return n * factorial(n - 1);
        	}
    }
	
	%> 
	
	
	<%= "Factorial is:"+factorial(6) %>
	<br><br><br> 
	 
	 <% out.println("The factorial is : " + factorial(5)); %>
	 <br><br><br>
	 
    <%= "Value of the variable is:"+ data %>  
<br><br><br>
    
     
   <!-- method declared inside declarative tag and value printed in expression tag  -->  
    <%!   
		int cube(int n){  
			return n*n*n;  
		}  
	%>  
	<%= "Cube of 3 is:"+cube(3) %> 


    <!-- We are on this Page  -->
    
    
</body>
</html>