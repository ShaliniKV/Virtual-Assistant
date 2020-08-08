package com.ag.web.com.maven.vmedico;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck {
	String username,password,role;
	int key=0;
	static String name=null;
	LoginCheck(String user,String pass,String role){
		username=user;
		password=pass;
		this.role=role;
	}
	void redirecting_method(Statement smt,HttpServletResponse response) throws IOException, SQLException {
		ResultSet rs=smt.executeQuery("select * from signup");
		
		while(rs.next()){
			String s1=rs.getString(3);
			String s2=rs.getString(4);
			String s3=rs.getString(6);
			System.out.println(s1+" "+s2+" "+s3);
			if(!(s1.equals(username) && s2.equals(password) && s3.equals(role))) {key=0;}
			else {key=1;break;}
		}
		
		System.out.println("Key "+key);
		
		if(key==1) {
			String sql = "INSERT INTO login VALUES ('"+username+"','"+password+"','"+role+"')";
			name=username;
			smt.executeUpdate(sql);
		if(role.equals("Doctor")) {
			response.sendRedirect("doctor_menu.jsp");
		}
		else if(role.equals("Chemist")) {
			response.sendRedirect("chemist_menu.jsp");
		}
		else if(role.equals("Health Professional")) {
			response.sendRedirect("healthprofessional_menu.jsp");
		}
		else if(role.equals("Patient")) {
			response.sendRedirect("patient_menu.jsp");
		}
		}
		else {
		response.sendRedirect("error.jsp");
	}
	}
	public static String username() {
		return(name);
	}
	
	
}

