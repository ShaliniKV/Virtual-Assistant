package com.vmedico.DoctorController;
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
import com.ag.web.com.maven.vmedico.LoginCheck;

public class DoctorProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String page="doctor_profile.jsp";
	String username=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("Get method called");
			Connection con = null;
			try {con = DBConnection.initializeDatabase();}
			catch (ClassNotFoundException e1) {e1.printStackTrace();}
			catch (SQLException e1) {e1.printStackTrace();}
			response.setContentType("text/html");
			List dataList= new ArrayList(); 
			String sql=null,sql1=null;
			username=LoginCheck.username();
			System.out.println(username);
			try {
				Statement smt = con.createStatement();
				sql = "select * from doctorreg  where Email='"+username+"'";
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
					  if(rs.getString(8).equals("Yes")) {
						  sql1="select * from addclinic  where Name='"+rs.getString(1)+"'";
						  ResultSet rs1=smt.executeQuery(sql1);
						  ResultSetMetaData rsmd1=rs1.getMetaData();
						  while (rs1.next ()){
							  dataList.add(rsmd1.getColumnName(1));dataList.add(rs1.getString(1));
							  dataList.add(rsmd1.getColumnName(2));dataList.add(rs1.getString(2));
							  dataList.add(rsmd1.getColumnName(3));dataList.add(rs1.getString(3));
							  dataList.add(rsmd1.getColumnName(4));dataList.add(rs1.getString(4));
							 
						  }
						  rs1.close();
					  }
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



