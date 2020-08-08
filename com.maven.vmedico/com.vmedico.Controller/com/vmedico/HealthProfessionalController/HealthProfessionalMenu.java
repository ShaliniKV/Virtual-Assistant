package com.vmedico.HealthProfessionalController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HealthProfessionalMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Menu method called");
		 String requestSource=request.getParameter("menu");
		 System.out.println(requestSource);
		     if(requestSource.equals("logout")){
		        response.sendRedirect("login.jsp");
		    }
		    else if(requestSource.equals("profile")) {
		    	 HealthProfessionalProfile hpprobj=new HealthProfessionalProfile();
		    	 hpprobj.doGet(request, response);
		     }
		   
	}
	
}

	
