package com.vmedico.ChemistController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ChemistMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Menu method called");
		 String requestSource=request.getParameter("menu");
		 System.out.println(requestSource);
		     if(requestSource.equals("logout")){
		        response.sendRedirect("login.jsp");
		    }
		    else if(requestSource.equals("profile")) {
		    	 ChemistProfile cheprobj=new ChemistProfile();
		    	 cheprobj.doGet(request, response);
		     }
		   
	}
	
}

	
