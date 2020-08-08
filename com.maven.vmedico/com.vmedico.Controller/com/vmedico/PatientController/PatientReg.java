package com.vmedico.PatientController;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public class PatientReg {
	String Name,Email,Address,City,Mobile,DOB;
	public PatientReg(String name, String email, String address, String city, String mobile, String dob) {
		Name=name;
		Email=email;
		Address=address;
		City=city;
		Mobile=mobile;
		DOB=dob;
	}

	public void redirecting_method(Statement smt, HttpServletResponse response) throws SQLException, IOException {
		String sql = "INSERT INTO patientreg VALUES ('"+Name+"','"+Email+"','"+Address+"','"+City+"','"+Mobile+"','"+DOB+"')";
		smt.executeUpdate(sql);
		System.out.println("\nAfter Insertion\n"+Name+" "+Email+" "+Address+" "+City+" "+Mobile+" "+DOB);
		response.sendRedirect("login.jsp");
	
	}

}
