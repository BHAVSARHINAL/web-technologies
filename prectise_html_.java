package java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prectise_html_")
public class prectise_html_ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public prectise_html_() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		doPost(request,response);
		
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h1>hello</h1>");
			out.print("<br><b>hiii</b>");
			out.print("<br><u>underline</u>");
			out.print("<br><i>italic</i>");
			out.print("<br><i style=color:yellow>italic...</i>");
			//out.print("<br><b ");
			out.print("<br><i style:color :blue>italic...</i>");
		
	}

}
