package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DEMOSERVLET1")
public class DEMOSERVLET1 extends HttpServlet {
	ServletConfig config = null;
	ServletContext context = null;
	
	private static final long serialVersionUID = 1L;
       
   
    public DEMOSERVLET1() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	this.config=config;
    	context = config.getServletContext();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		String email = config.getInitParameter("email");
		
		out.println("<h1>username.."+username);
		out.println("<h1>password.."+password);
		out.println("<h1>email.."+email);

		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		String email1 = context.getInitParameter("email1");
		
		out.println("<h1>context username.."+user);
		out.println("<h1>context password.."+pass);
		out.println("<h1>context email.."+email1);
			}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
