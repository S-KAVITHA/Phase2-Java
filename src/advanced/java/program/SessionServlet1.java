package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet1
 */
@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();

		      String name = request.getParameter("username");
		      String password = request.getParameter("password");
		      int age= Integer.parseInt(request.getParameter("age"));
		      String email = request.getParameter("email");
		      String country = request.getParameter("country");
		 
		      
		      pwriter.print("Hello "+name+"<br/>");
		      pwriter.print("Your Password is: "+password+"<br/>");
		      pwriter.print("Your age is: "+age+"<br/>");
		      pwriter.print("Your email is: "+email+"<br/>");
		      pwriter.print("Your country is: "+country+"<br/>");
		      
		      
		      HttpSession session=request.getSession(); 
		      
		      session.setAttribute("uname",name);
		      session.setAttribute("upass",password);
		      session.setAttribute("age",age);
		      session.setAttribute("email",email);
		      session.setAttribute("country",country);
		      session.setMaxInactiveInterval(2000); 
		      
		      pwriter.print("<a href='Register1'>view details</a>");
		      pwriter.close();
		    }catch(Exception exp){
		       System.out.println(exp);
		     }
	}

}
