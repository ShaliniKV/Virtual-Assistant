package com.ag.web.com.maven.vmedico;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class SignUpCheck {
	String FirstName,LastName,Email,Password,ConfirmPassword,Role;
	int key=0;
	SignUpCheck(String fname,String lname,String email,String pass,String cpass,String role){
		FirstName=fname;
		LastName=lname;
		Email=email;
		Password=pass;
		ConfirmPassword=cpass;
		Role=role;
	}
	void redirecting_method(Statement smt,HttpServletResponse response) throws IOException, SQLException {
		try {
		ResultSet rs=smt.executeQuery("select * from signup");
		
		while(rs.next()){
			String s1=rs.getString(3);
			String s2=rs.getString(4);
			String s3=rs.getString(6);
			System.out.println(s1+" "+s2+" "+s3);
			if(!(s1.equals(Email) && s2.equals(Password) && s3.equals(Role))) {key=0;}
			else {key=1;break;}
		}
		
		System.out.println("Key "+key);
		
		if(key==0) {
		String sql = "INSERT INTO signup VALUES ('"+FirstName+"','"+LastName+"','"+Email+"','"+Password+"','"+ConfirmPassword+"','"+Role+"')";
		smt.executeUpdate(sql);
		System.out.println("\nAfter Insertion\n"+FirstName+" "+LastName+" "+Email+" "+Password+" "+ConfirmPassword+" "+Role);
		if(Role.equals("Chemist")) {response.sendRedirect("chemist_reg.jsp");}
		else if(Role.equals("Doctor")) {response.sendRedirect("doctor_reg.jsp");}
		else if(Role.equals("Health Professional")){response.sendRedirect("healthprofessional_reg.jsp");}
		else if(Role.equals("Patient")) {response.sendRedirect("patient_reg.jsp");}
		}
		else {
			response.sendRedirect("part.jsp");
		}
		}
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
	}
}

