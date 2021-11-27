package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class OnServletConfig extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
    	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		ServletConfig conf=getServletConfig(); //Step 1: create the object of servletconfig

		// rertirve the values from the web.xml
		String s1= conf.getInitParameter("n1");
		int num1 = Integer.parseInt(s1);
		String s2=conf.getInitParameter("n2");
		int num2 = Integer.parseInt(s2);

		pw.println("n1 value is " +s1+ " and n2 is " +s2);
		
		pw.println("total is " + (num1 + num2));
		
		pw.println("Servlet Name" + conf.getServletName());
		pw.println("Servlet Name" + conf.hashCode());

	   pw.close();	
	}
}
