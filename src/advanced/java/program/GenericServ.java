package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericServ")

public class GenericServ extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	 
		  PrintWriter out = response.getWriter();
	      String name= request.getParameter("name");
	      String address= request.getParameter("address");

	      out.print("You Informationn :");
	      out.println("Name: "+name);
	      out.println("Address: " +address);
	      out.close();		
	}
}
