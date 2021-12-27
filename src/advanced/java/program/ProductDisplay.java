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
 * Servlet implementation class ProductDisplay
 */
@WebServlet("/ProductDisplay")
public class ProductDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDisplay() {
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
		
	/*	response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		
	      PrintWriter out = response.getWriter();
	     	      
	     out.println(session.getAttribute("productid"));
	     out.println(session.getAttribute("productdesc"));
	     out.println(session.getAttribute("price"));
	     out.println(session.getAttribute("Expiry_Date"));
	      
	      */
	      
		try {
			
		response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();
	     
	      HttpSession session=request.getSession(false);
	      
	      String myName=(String)session.getAttribute("productid");
	      String myPass=(String)session.getAttribute("productdesc");
	      int age= (Integer)session.getAttribute("price");
	      String email=(String)session.getAttribute("Expiry_Date");
	     
	     
	      
	      pwriter.print("<br>");
	      pwriter.print("session creation time      : " + session.getCreationTime());
	      pwriter.print("<br>");
	      pwriter.print("session last accessed time :  " +session.getLastAccessedTime());
	      pwriter.print("<br>");
	      pwriter.print("session max interval time  : " +session.getMaxInactiveInterval());
	      pwriter.print("<br>");
	      pwriter.print("session servelt context    :" +session.getServletContext());
	      
	      session.invalidate();
	      pwriter.print("<br>");
	      
	      pwriter.print("Welcome to Servlet2!!!!");
	      pwriter.print("<br>");
	      
	      pwriter.print("Name     : "+myName);
	      pwriter.print("<br>");
	      
	      pwriter.print(" Password: "+myPass);
	      pwriter.print("<br>");
	      
	      pwriter.print(" Age     : "+age);
	      pwriter.print("<br>");
	      
	      pwriter.print(" email   : "+email);
	      pwriter.print("<br>");
	      
	      
	  
	      pwriter.print("<br>");
	      
	      
	      pwriter.close();
	  }catch(Exception exp){
	      System.out.println(exp);
	   }
	  
	}

}
