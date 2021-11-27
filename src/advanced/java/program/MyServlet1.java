package advanced.java.program;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


@SuppressWarnings("unused")
public class MyServlet1 extends HttpServlet {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response){
     try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();

      String name = request.getParameter("userName");
      String password = request.getParameter("userPassword");
      
      pwriter.print("Hello "+name);
      pwriter.print("Your Password is: "+password);
      
      HttpSession session=request.getSession(); 
      
      session.setAttribute("uname",name);
      session.setAttribute("upass",password);
      session.setMaxInactiveInterval(2000); 
      
      pwriter.print("<a href='welcome'>view details</a>");
      pwriter.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}