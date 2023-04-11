package java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexSavlet
 */
@WebServlet("/IndexSavlet")
public class IndexSavlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public IndexSavlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
        out.println("<h1>addition is = "+(no1+no2));
				
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("firstname");
		out.println("<h1>my first name is.."+firstname);
		
		String lastname = request.getParameter("lastname");
		out.println("<h1>last name is.."+lastname);
	}

}
