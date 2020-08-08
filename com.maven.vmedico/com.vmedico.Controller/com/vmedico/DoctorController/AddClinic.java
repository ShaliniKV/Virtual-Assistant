package com.vmedico.DoctorController;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletResponse;

public class AddClinic {
	String ClinicName,Email,Address,Mobile,Name;
	public AddClinic(String clinicname, String email, String address, String mobile,String name) {
		ClinicName=clinicname;
		Email=email;
		Address=address;
		Mobile=mobile;
		Name=name;
	}

	public void redirecting_method(Statement smt, HttpServletResponse response) throws SQLException, IOException {
		String sql = "INSERT INTO addclinic VALUES ('"+ClinicName+"','"+Email+"','"+Address+"','"+Mobile+"','"+Name+"')";
		smt.executeUpdate(sql);
		System.out.println("\nAfter Insertion\n"+ClinicName+" "+Email+" "+Address+" "+Mobile+" "+Name);
		response.sendRedirect("login.jsp");
	}

}
