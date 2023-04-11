package form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;


@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals(password))
			
		{
			request.setAttribute("username", username);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else
		{
			response.sendRedirect("error_.jsp?error=Invalid usename and password");
		}
		
	}

}
