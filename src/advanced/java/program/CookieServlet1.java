package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet1
 */
@WebServlet("/CookieServlet1")
public class CookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		try
		{  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String uname=request.getParameter("username");  
	    String password=request.getParameter("password");  
	    out.print("Welcome "+ uname);  
	  
	    Cookie ck = new Cookie("uname",uname);	//creating cookie object  
	    response.addCookie(ck);	//adding cookie in the response  
	    
	    
	    Cookie ck1 = new Cookie("password",password);	//creating cookie object  
	    response.addCookie(ck1);	//adding cookie in the response  
	    
	    
	  
	    //creating submit button  
	    out.print("<form action='Elogin1'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
	    out.close();  
	  
	        }catch(Exception e){System.out.println(e);} 
	}

}
