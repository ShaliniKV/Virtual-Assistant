package com.vmedico.PatientController;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ag.web.com.maven.vmedico.DBConnection;

public class DoctorDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String page="doctor_details.jsp";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("Do Get Called");
			String requestSource=request.getParameter("doctor");
			System.out.println(requestSource);
			Connection con = null;
			try {con = DBConnection.initializeDatabase();}
			catch (ClassNotFoundException e1) {e1.printStackTrace();}
			catch (SQLException e1) {e1.printStackTrace();}
			response.setContentType("text/html");
			List dataList= new ArrayList(); 
			String sql=null;
			String location=SpecialitySelection2.location(),speciality=DoctorSelection.speciality();
			try {
				sql = "select * from doctorreg  where Name='"+requestSource+"' and City='"+location+"' and Speciality='"+speciality+"'";
				Statement smt = con.createStatement();
				ResultSet rs=smt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				while (rs.next ()){
					  dataList.add(rsmd.getColumnName(1));dataList.add(rs.getString(1));
					  dataList.add(rsmd.getColumnName(2));dataList.add(rs.getString(2));
					  dataList.add(rsmd.getColumnName(3));dataList.add(rs.getString(3));
					  dataList.add(rsmd.getColumnName(4));dataList.add(rs.getString(4));
					  dataList.add(rsmd.getColumnName(5));dataList.add(rs.getString(5));
					  dataList.add(rsmd.getColumnName(6));dataList.add(rs.getString(6));
					  dataList.add(rsmd.getColumnName(7));dataList.add(rs.getString(7));
					  System.out.println(dataList);
					  }
				
				rs.close ();
				smt.close ();
				}
			catch(Exception e){e.printStackTrace();}

			request.setAttribute("data",dataList);
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			if (dispatcher != null){dispatcher.forward(request, response); } 
			
		}
		catch(Exception e) {
			e.printStackTrace();}
		}
}



