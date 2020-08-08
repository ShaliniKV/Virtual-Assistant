package com.vmedico.DoctorDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;
import com.vmedico.DoctorController.AddClinic;

public class AddClinicDB extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				System.out.println("DoPost method called");
				Connection con=DBConnection.initializeDatabase();
				System.out.println("AFter connection : "+con);
				Statement smt = con.createStatement();
				String clinicname=request.getParameter("clinicname");
				String name=request.getParameter("name");
				String email=request.getParameter("email");
				String address=request.getParameter("address");
				String mobile=request.getParameter("mobile");
				System.out.print(clinicname+" "+email+" "+address+" "+mobile);
				AddClinic addclinicObj=new AddClinic(clinicname,email,address,mobile,name);
				addclinicObj.redirecting_method(smt, response);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


