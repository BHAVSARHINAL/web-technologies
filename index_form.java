package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index_form")
public class index_form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public index_form() {
            }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	   PrintWriter out = response.getWriter();
	   
//	   int no1 = Integer.parseInt(request.getParameter("no1"));
//	   int no2=Integer.parseInt(request.getParameter("no2"));
//		
//		out.println("addition is = "+(no1+no2));
//		
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String firstname = request.getParameter("firstname");
		out.println("<h1>first Name</h1>"+firstname);
		
		
       String lastname = request.getParameter("lastname");	
		out.println("<h1>last Name</h1>"+lastname);
			
		int no1 = Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
			
			out.println("addition is = "+(no1+no2));
			
			
	}

}
