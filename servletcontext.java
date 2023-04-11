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


@WebServlet("/servletcontext")
public class servletcontext extends HttpServlet {
	ServletContext context = null;
	private static final long serialVersionUID = 1L;
       
       public servletcontext() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException {
	
      context=config.getServletContext();
}      
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String user = context.getInitParameter("username");
			String password = context.getInitParameter("password");
			out.println("<h1>context user is ..."+user);
			out.println("<h1>context user is ..."+password);
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
