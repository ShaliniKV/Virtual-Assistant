package com.ag.web.com.maven.vmedico;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;	
public class LoginDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("DoPost method called");
			Connection con=DBConnection.initializeDatabase();
			System.out.println("AFter connection : "+con);
			Statement smt = con.createStatement();
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			String role=request.getParameter("role");
			LoginCheck logincheckObj=new LoginCheck(user,pass,role);
			logincheckObj.redirecting_method(smt, response);
			System.out.print(user+" "+pass+" "+role);
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
