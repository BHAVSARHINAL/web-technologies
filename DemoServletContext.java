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


@WebServlet("/DemoServletContext")
public class DemoServletContext extends HttpServlet {
	
	ServletContext context = null;
	private static final long serialVersionUID = 1L;
       
    
    public DemoServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		context = config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		String email1 = context.getInitParameter("email1");
		
		out.println("<h1>context username.."+user);
		out.println("<h1>context password.."+pass);
		out.println("<h1>context email.."+email1);

	}
	
}

