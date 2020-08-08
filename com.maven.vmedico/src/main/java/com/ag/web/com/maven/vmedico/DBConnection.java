package com.ag.web.com.maven.vmedico;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
public class DBConnection {
	public static Connection initializeDatabase() 
	        throws SQLException, ClassNotFoundException 
	    { 
	        
	        String dbDriver = "com.mysql.jdbc.Driver"; 
	        String dbURL = "jdbc:mysql://localhost:3306/VMedico";
	        String dbUsername = "root"; 
	        String dbPassword = "root"; 
	  
	        Class.forName(dbDriver); 
	        Connection con=null;
	       try {
	        con = DriverManager.getConnection(dbURL,dbUsername,dbPassword); }
	        catch(SQLException e) {System.out.println(e);}
	        if (con != null) {
	            System.out.println("Connected to database!");
	        } else {
	            System.out.println("Failed to make connection!");
	       }

	        return con; 
	    } 
}

