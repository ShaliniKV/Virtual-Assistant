package com.vmedico.ChemistController;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class ChemistReg {
	String LabName,Email,Address,City,Mobile,ChemistName,ChemistEmail;
	public ChemistReg(String labname,String email,String address,String city,String mobile,String chemistname,String chemistemail){
		LabName=labname;
		Email=email;
		Address=address;
		City=city;
		Mobile=mobile;
		ChemistName=chemistname;
		ChemistEmail=chemistemail;
	}
	public void redirecting_method(Statement smt,HttpServletResponse response) throws IOException, SQLException {
		String sql = "INSERT INTO chemistreg VALUES ('"+LabName+"','"+ChemistName+"','"+Email+"','"+Address+"','"+City+"','"+Mobile+"')";
		System.out.println("\nAfter Insertion\n"+LabName+" "+Email+" "+Address+" "+City+" "+Mobile+" "+ChemistName);
		smt.executeUpdate(sql);
		try {
			response.sendRedirect("login.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
