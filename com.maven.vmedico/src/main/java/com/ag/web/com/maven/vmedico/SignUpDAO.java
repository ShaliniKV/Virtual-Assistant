package com.ag.web.com.maven.vmedico;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpDAO extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				System.out.println("DoPost method called");
				Connection con=DBConnection.initializeDatabase();
				System.out.println("AFter connection : "+con);
				Statement smt = con.createStatement();
				String fname=request.getParameter("firstname");
				String lname=request.getParameter("lastname");
				String email=request.getParameter("email");
				String pass=request.getParameter("password");
				String cpass=request.getParameter("confirm_password");
				String role=request.getParameter("role");
				System.out.print(fname+" "+lname+" "+email+" "+pass+" "+cpass+" "+role);
				SignUpCheck signupcheckObj=new SignUpCheck(fname,lname,email,pass,cpass,role);
				signupcheckObj.redirecting_method(smt, response);
				//System.out.print(fname+" "+lname+" "+email+" "+pass+" "+cpass+" "+role);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


