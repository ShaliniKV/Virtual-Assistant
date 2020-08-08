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

public class SpecialitySelection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String page="speciality.jsp";
	static String location=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("Do Post Called");
			String requestSource=request.getParameter("location");
			System.out.println(requestSource);
			location=requestSource;
			Connection con = null;
			try {con = DBConnection.initializeDatabase();}
			catch (ClassNotFoundException e1) {e1.printStackTrace();}
			catch (SQLException e1) {e1.printStackTrace();}

			response.setContentType("text/html");
			List dataList= new ArrayList(); 
			String sql=null;
			try {
				sql = "select Speciality from hpreg  where City='"+requestSource+"' order by Speciality asc";
			
				Statement smt = con.createStatement();
				ResultSet rs=smt.executeQuery(sql);
				while (rs.next ()){
				  dataList.add(rs.getString(1));
				  //System.out.println(dataList);
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
	public static String location() {
		return(location);
	}
}



