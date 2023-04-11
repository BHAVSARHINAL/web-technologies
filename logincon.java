package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.mbeans.UserMBean;

import com.DAO.loginDAO;
import com.model.personmodel;

@WebServlet("/logincon")
public class logincon extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public logincon() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		personmodel smodel = new  personmodel();
		
		smodel.setName(request.getParameter("name"));
		smodel.setPassword(request.getParameter("password"));
		
		personmodel model = new loginDAO().getmodel(smodel);
		if(model!=null)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("model", model);
			response.sendRedirect("Homecon?action=showuser&userid="+model.getUserid());
		}
	}
	

}
