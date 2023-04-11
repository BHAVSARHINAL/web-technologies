package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.registrationDAO;
import com.model.personmodel;

@WebServlet("/regicon")
public class regicon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public regicon() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		personmodel pmodel = new personmodel();
		pmodel.setName(request.getParameter("name"));
		pmodel.setEmail(request.getParameter("email"));
		pmodel.setPassword(request.getParameter("password"));
		
		
		int x=new registrationDAO().doregistration(pmodel);
		
		
		if(x>0)
		{
			request.setAttribute("msg","record inserted");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg","record not inserted");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
			
		}
	}
}
