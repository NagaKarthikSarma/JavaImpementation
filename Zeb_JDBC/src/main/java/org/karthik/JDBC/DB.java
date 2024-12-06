package org.karthik.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) {
//		String url="jdbc:mysql://localhost:3306/karthiksarma?useSSL=false";
//		String uname="root";
//		String pass="D@ngereag1e";
//	  String user="krishna";
//	  String passw="5";
//	// For inserting data we use this
//		String query1 = "insert into login values('"+user+"','"+passw+"')";	
//		Class.forName("com.mysql.cj.jdbc.Driver");//optional for >=jdbc 4.0
//			//automatically loaded by the connector
//			Connection con= DriverManager.getConnection(url,uname,pass);
//			Statement st= con.createStatement();
//		
//		
//			int count=st.executeUpdate(query1);
//		     System.out.println(count+"rows affected");    
	    
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass= "D@ngereag1e";
		Connection con=null;
		//ResultSet rs = null;
		//String query= "insert into student(rollno,Sname,age) values(3,'nks',22)";
		Statement st= null;
		
		PreparedStatement ps=null;
		String query= "insert into student values(?,?,?);";
		String qs="insert into student(rollno,Sname,age) values(7,'nks',22)";
		
	
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,pass);
		//st= con.createStatement();
//		
 ps=con.prepareStatement(qs);
//		ps.setInt(1, 5);
//		ps.setString(2, "NKSB");
//		ps.setInt(3, 22);
		int resultSet = ps.executeUpdate(qs);
		
		System.out.println(resultSet);

		

	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
