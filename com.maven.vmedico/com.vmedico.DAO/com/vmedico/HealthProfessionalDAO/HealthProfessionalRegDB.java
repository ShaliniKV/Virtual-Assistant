package com.vmedico.HealthProfessionalDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;
import com.vmedico.HealthProfessionalController.HealthProfessionalReg;

public class HealthProfessionalRegDB extends HttpServlet {
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
				String speciality=request.getParameter("speciality");
				String experience=request.getParameter("experience");
				int exper_val=Integer.parseInt(experience);
				System.out.print(name+" "+email+" "+address+" "+city+" "+mobile+" "+speciality+" "+experience);
				HealthProfessionalReg hpregObj=new HealthProfessionalReg(name,email,address,city,mobile,speciality,exper_val);
				hpregObj.redirecting_method(smt, response);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


