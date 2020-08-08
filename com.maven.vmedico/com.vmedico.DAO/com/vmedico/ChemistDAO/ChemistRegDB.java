package com.vmedico.ChemistDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;
import com.vmedico.ChemistController.ChemistReg;

public class ChemistRegDB extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				System.out.println("DoPost method called");
				Connection con=DBConnection.initializeDatabase();
				System.out.println("AFter connection : "+con);
				Statement smt = con.createStatement();
				String labname=request.getParameter("labname");
				String chemistname=request.getParameter("chemistname");
				String email=request.getParameter("email");
				String chemistemail=request.getParameter("chemistemail");
				String address=request.getParameter("address");
				String city=request.getParameter("city");
				String mobile=request.getParameter("mobile");
				System.out.print(labname+" "+email+" "+address+" "+city+" "+mobile+" "+chemistname+" "+chemistemail);
				ChemistReg chemistregObj=new ChemistReg(labname,email,address,city,mobile,chemistname,chemistemail);
				chemistregObj.redirecting_method(smt, response);
				//System.out.print(labname+" "+email+" "+address+" "+city+" "+mobile);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


