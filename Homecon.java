package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.HomeDAO;
import com.model.personmodel;


@WebServlet("/Homecon")
public class Homecon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public Homecon() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		if(action.equals("showuser"))
		{
			int userid = Integer.parseInt(request.getParameter("userid"));
			
			personmodel model = new HomeDAO().conformlogin(userid);
					request.setAttribute("model",model);
					request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

}
