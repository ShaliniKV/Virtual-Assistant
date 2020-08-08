package com.vmedico.DoctorController;
import java.sql.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public class DoctorReg {
	String Name,Email,Address,City,Mobile,Speciality,AddClinic,HospitalName;
	int Experience,id=1;
	
	public DoctorReg(String name, String email, String address, String city, String mobile, String speciality,
			int experience,String addclinic,String hospitalname) {
		Name=name;
		Email=email;
		Address=address;
		City=city;
		Mobile=mobile;
		Speciality=speciality;
		Experience=experience;
		AddClinic=addclinic;
		HospitalName=hospitalname;
	}

	public void redirecting_method(Statement smt, HttpServletResponse response) throws SQLException, IOException {
		
		String sql = "INSERT INTO doctorreg VALUES ('"+Name+"','"+Email+"','"+Address+"','"+City+"','"+Mobile+"','"+Speciality+"','"+Experience+"','"+AddClinic+"')";
		smt.executeUpdate(sql);
		System.out.println("\nAfter Insertion\n"+Name+" "+Email+" "+Address+" "+City+" "+Mobile+" "+Speciality+" "+Experience+" "+AddClinic);
		if(AddClinic.equals("Yes")) {response.sendRedirect("addclinic.jsp");}
		else {response.sendRedirect("login.jsp");}
		
	
	}

}
