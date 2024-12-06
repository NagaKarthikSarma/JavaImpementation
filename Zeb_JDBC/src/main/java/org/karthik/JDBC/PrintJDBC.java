package org.karthik.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintJDBC {

	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="D@ngereag1e";
		String query="select * from student";
		Connection con =null;
	    ResultSet rs =null;
	    Statement st=null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	    	con=DriverManager.getConnection(url,uname,pass);
	    	st= con.createStatement();
	   rs=st.executeQuery(query);
	    	
	    while(rs.next()) {
	    	
	    	System.out.println(rs.getInt("rollno")+"---"+rs.getString("sname")+"----"+rs.getInt("age"));
	    }
	    	
	    }
		catch(SQLException | ClassNotFoundException e){
		  
			
		  
		}
	    
		
		
		

	}

}
