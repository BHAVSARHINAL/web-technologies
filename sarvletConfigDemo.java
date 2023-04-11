package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@WebServlet("/sarvletConfigDemo")*/
public class sarvletConfigDemo extends HttpServlet {
	
	ServletConfig config = null;
	
	
	private static final long serialVersionUID = 1L;
    
   
    
        public sarvletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	this.config=config;
    }
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String username =config.getInitParameter("username");
		String password =config.getInitParameter("password");

		out.println("<h1>username is"+username);
		out.println("<h1>password is"+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
