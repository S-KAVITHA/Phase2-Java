package advanced.java.program;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;





/**
 * Servlet Filter implementation class Logincheck
 */
@WebFilter("/Logincheck")
public class Logincheck implements Filter {

    /**
     * Default constructor. 
     */
    public Logincheck() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		

        String userId = request.getParameter("name");
        String profile = request.getParameter("profile");
    
        String valuetocheck = null;
        
        if (userId != null) {
        	 valuetocheck = userId;
        }else if (profile != null) {
        	 valuetocheck = profile;
        }
        
             
      	if (valuetocheck.equals("admin") || valuetocheck.equals("admin123"))  {
        	response.getWriter().write("Passing through LoginFilter...............");
            chain.doFilter(request, response);
    }else           
        response.getWriter().write("You are the wrong user ");
        
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
