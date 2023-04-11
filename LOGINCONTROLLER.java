package adv.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LOGINCONTROLLER")
public class LOGINCONTROLLER extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LOGINCONTROLLER() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("Username");
		String password = request.getParameter("password");
		
		
		if(username.equals(password))
		{
			request.setAttribute("username", username);
			request.getRequestDispatcher("welcome_.jsp").forward(request, response);
		}
	
		else
		{
			response.sendRedirect("error_.jsp?error=invalid username and password");
		}
	
	}
}
