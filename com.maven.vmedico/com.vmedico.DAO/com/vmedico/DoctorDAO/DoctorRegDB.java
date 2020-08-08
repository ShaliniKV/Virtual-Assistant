package com.vmedico.DoctorDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;
import com.vmedico.DoctorController.DoctorReg;

public class DoctorRegDB extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				System.out.println("DoPost method called");
				Connection con=DBConnection.initializeDatabase();
				System.out.println("AFter connection : "+con);
				Statement smt = con.createStatement();
				String name=request.getParameter("name");
				String hospitalname=request.getParameter("hospital_name");
				String email=request.getParameter("email");
				String address=request.getParameter("address");
				String city=request.getParameter("city");
				String mobile=request.getParameter("mobile");
				String speciality=request.getParameter("speciality");
				String experience=request.getParameter("experience");
				String addclinic=request.getParameter("addclinic");
				int exper_val=Integer.parseInt(experience);
				System.out.print(name+" "+email+" "+address+" "+city+" "+mobile+" "+speciality+" "+experience+" "+addclinic+" "+hospitalname);
				DoctorReg doctorregObj=new DoctorReg(name,email,address,city,mobile,speciality,exper_val,addclinic,hospitalname);
				doctorregObj.redirecting_method(smt, response);
				//System.out.print(fname+" "+lname+" "+email+" "+pass+" "+cpass+" "+role);
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}


