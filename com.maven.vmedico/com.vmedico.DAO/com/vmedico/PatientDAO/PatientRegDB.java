package com.vmedico.PatientDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;
import com.vmedico.PatientController.PatientReg;

public class PatientRegDB extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				System.out.println("DoPost method called");
				Connection con=DBConnection.initializeDatabase();
				System.out.println("AFter connection : "+con);
				Statement smt = con.createStatement();
				String name=request.getParameter("name");
				String email=request.getParameter("email");
				String address=request.getParameter("address");
				String city=request.getParameter("city");
				String mobile=request.getParameter("mobile");
				String dob=request.getParameter("DOB");
				System.out.print(name+" "+email+" "+address+" "+city+" "+mobile+" "+dob);
				PatientReg patientregObj=new PatientReg(name,email,address,city,mobile,dob);
				patientregObj.redirecting_method(smt, response);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


