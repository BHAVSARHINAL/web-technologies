package java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo_dopost
 */
@WebServlet("demo_dopost")
public class demo_dopost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public demo_dopost() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("first name");
		out.println("<h1>FIRST NAME"+firstname);
		
		String lastname = request.getParameter("lastname");
		out.println("<h1>LAST NAME"+lastname);
	}

}
