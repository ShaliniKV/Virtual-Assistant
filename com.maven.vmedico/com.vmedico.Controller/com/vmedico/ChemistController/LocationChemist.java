package com.vmedico.ChemistController;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.ag.web.com.maven.vmedico.DBConnection;
public class LocationChemist extends HttpServlet{
	private static final long serialVersionUID = 1L;
	String page="loc_chemist.jsp";
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		System.out.println("Do get method");
		Connection con = null;
		try {con = DBConnection.initializeDatabase();}
		catch (ClassNotFoundException e1) {e1.printStackTrace();}
		catch (SQLException e1) {e1.printStackTrace();}

		response.setContentType("text/html");
		List dataList= new ArrayList(); 
		try {
		  String sql = "select City from chemistreg  group by City order by City asc";
		  Statement smt = con.createStatement();
		  ResultSet rs=smt.executeQuery(sql);
		  while (rs.next ()){
			  dataList.add(rs.getString(1));}
		  rs.close ();
		  smt.close ();}
		catch(Exception e){e.printStackTrace();}

	  request.setAttribute("data",dataList);
	  RequestDispatcher dispatcher = request.getRequestDispatcher(page);
	  if (dispatcher != null){dispatcher.forward(request, response); } 
	}
	
	
}
	 
