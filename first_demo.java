package java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first_demo")
public class first_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public first_demo() {
      
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>hello world...</h1>");
		
		out.print("<br><b>this is bold </b>");
		
		out.print("<br><i style=color:blue>italic...</i>");
		out.print("<br><u>underline</u>");
		out.print("<br><del>delete</del>");
		out.print("<br><hr>line</hr>");
		out.print("<br><li></li>");
		out.print("<br><b>H<sub>2</sub>O</b>");
		out.print("<br><hr></hr>");
		out.print("<br><b>x<sup>2</sup>");
		out.print("<br><img src = https://media.istockphoto.com/id/1146517111/photo/taj-mahal-mausoleum-in-agra.jpg?s=612x612&w=0&k=20&c=vcIjhwUrNyjoKbGbAQ5sOcEzDUgOfCsm9ySmJ8gNeRk= height = 200px,width = 100px");
        out.print("<br><h1>THIS IS TAJ MAHEL</h1>");
		out.print("<br><h1 style=\"background-color:powderblue;\">This is a heading</h1>\r\n" + 
				"");
		out.print("<br><h1 style = \"background-color:tomato\">heading</h1>");
		out.print("<br><h2 style=\"text-align:center\">Centered Heading</h2>");
		out.print("<br><h1 style = \"text-align:center\">TEXT CENTER</h1>");
		out.print("<br><h1><mark>hello</mark></h1>");
		
		out.print("<br><h1 style=color:green >GREEN COLOR</h1>");
		out.print("<br><h1 style=\"border:2px solid Tomato;\">Hello World</h1>");
		out.print("<br><h1 style = \"border:3px solid green; \">hello earth</h1>");
		out.print("<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a>");
		out.print("<br><a href=\"https://www.indianarmy.nic.in/\">www.indianarmy.nic.in</a>" );
	}

}
