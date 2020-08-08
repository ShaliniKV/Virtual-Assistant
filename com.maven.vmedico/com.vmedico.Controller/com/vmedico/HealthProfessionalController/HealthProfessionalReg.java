package com.vmedico.HealthProfessionalController;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public class HealthProfessionalReg {
	String Name,Email,Address,City,Mobile,Speciality;
	int Experience;
	public HealthProfessionalReg(String name, String email, String address, String city, String mobile, String speciality,int experience) {
		Name=name;
		Email=email;
		Address=address;
		City=city;
		Mobile=mobile;
		Speciality=speciality;
		Experience=experience;
		
	}

	public void redirecting_method(Statement smt, HttpServletResponse response) throws SQLException, IOException {
		String sql = "INSERT INTO hpreg VALUES ('"+Name+"','"+Email+"','"+Address+"','"+City+"','"+Mobile+"','"+Speciality+"','"+Experience+"')";
		smt.executeUpdate(sql);
		System.out.println("\nAfter Insertion\n"+Name+" "+Email+" "+Address+" "+City+" "+Mobile+" "+Speciality+" "+Experience);
		response.sendRedirect("login.jsp");
	
	}

}
