package com.vmedico.PatientController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vmedico.ChemistController.LocationChemist;
import com.vmedico.DoctorController.LocationDoctor;
import com.vmedico.HealthProfessionalController.LocationHealthProfessional;

public class PatientMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Menu method called");
		 String requestSource=request.getParameter("menu");
		 System.out.println(requestSource);
		     if(requestSource.equals("logout")){
		        response.sendRedirect("login.jsp");
		    }
		     else if(requestSource.equals("healthcenter")) {
		    	 LocationHealthProfessional hpobj=new  LocationHealthProfessional();
		    	 hpobj.doGet(request, response);
		     }
		     else if(requestSource.equals("labs")) {
		    	 LocationChemist chemistobj=new  LocationChemist();
		    	chemistobj.doGet(request, response);
		     }
		     else if(requestSource.equals("hospitals")) {
		    	 LocationDoctor doctorobj=new  LocationDoctor();
		    	doctorobj.doGet(request, response);
		     }
		     else if(requestSource.equals("profile")) {
		    	 PatientProfile patprobj=new PatientProfile();
		    	 patprobj.doGet(request, response);
		     }
		   
	}
	
}

	
